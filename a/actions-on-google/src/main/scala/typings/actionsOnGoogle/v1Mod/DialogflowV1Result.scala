package typings.actionsOnGoogle.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1Result extends js.Object {
  
  var action: js.UndefOr[String] = js.native
  
  var actionIncomplete: js.UndefOr[Boolean] = js.native
  
  var contexts: js.UndefOr[js.Array[DialogflowV1Context]] = js.native
  
  var fulfillment: js.UndefOr[DialogflowV1Fulfillment] = js.native
  
  var metadata: js.UndefOr[DialogflowV1Metadata] = js.native
  
  var parameters: js.UndefOr[DialogflowV1Parameters] = js.native
  
  var resolvedQuery: js.UndefOr[String] = js.native
  
  var score: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var speech: js.UndefOr[String] = js.native
}
object DialogflowV1Result {
  
  @scala.inline
  def apply(): DialogflowV1Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Result]
  }
  
  @scala.inline
  implicit class DialogflowV1ResultOps[Self <: DialogflowV1Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setActionIncomplete(value: Boolean): Self = this.set("actionIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionIncomplete: Self = this.set("actionIncomplete", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: DialogflowV1Context*): Self = this.set("contexts", js.Array(value :_*))
    
    @scala.inline
    def setContexts(value: js.Array[DialogflowV1Context]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    
    @scala.inline
    def setFulfillment(value: DialogflowV1Fulfillment): Self = this.set("fulfillment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillment: Self = this.set("fulfillment", js.undefined)
    
    @scala.inline
    def setMetadata(value: DialogflowV1Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setParameters(value: DialogflowV1Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setResolvedQuery(value: String): Self = this.set("resolvedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvedQuery: Self = this.set("resolvedQuery", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSpeech(value: String): Self = this.set("speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeech: Self = this.set("speech", js.undefined)
  }
}
