package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1Result extends StObject {
  
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
  implicit class DialogflowV1ResultMutableBuilder[Self <: DialogflowV1Result] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIncomplete(value: Boolean): Self = StObject.set(x, "actionIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIncompleteUndefined: Self = StObject.set(x, "actionIncomplete", js.undefined)
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setContexts(value: js.Array[DialogflowV1Context]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: DialogflowV1Context*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setFulfillment(value: DialogflowV1Fulfillment): Self = StObject.set(x, "fulfillment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentUndefined: Self = StObject.set(x, "fulfillment", js.undefined)
    
    @scala.inline
    def setMetadata(value: DialogflowV1Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setParameters(value: DialogflowV1Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setResolvedQuery(value: String): Self = StObject.set(x, "resolvedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedQueryUndefined: Self = StObject.set(x, "resolvedQuery", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSpeech(value: String): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechUndefined: Self = StObject.set(x, "speech", js.undefined)
  }
}
