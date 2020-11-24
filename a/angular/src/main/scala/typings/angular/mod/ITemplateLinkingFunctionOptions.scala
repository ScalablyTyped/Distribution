package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.anon.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITemplateLinkingFunctionOptions extends js.Object {
  
  var futureParentElement: js.UndefOr[JQuery] = js.native
  
  var parentBoundTranscludeFn: js.UndefOr[ITranscludeFunction] = js.native
  
  var transcludeControllers: js.UndefOr[StringDictionary[Instance]] = js.native
}
object ITemplateLinkingFunctionOptions {
  
  @scala.inline
  def apply(): ITemplateLinkingFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateLinkingFunctionOptions]
  }
  
  @scala.inline
  implicit class ITemplateLinkingFunctionOptionsOps[Self <: ITemplateLinkingFunctionOptions] (val x: Self) extends AnyVal {
    
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
    def setFutureParentElement(value: JQuery): Self = this.set("futureParentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFutureParentElement: Self = this.set("futureParentElement", js.undefined)
    
    @scala.inline
    def setParentBoundTranscludeFn(value: ITranscludeFunction): Self = this.set("parentBoundTranscludeFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentBoundTranscludeFn: Self = this.set("parentBoundTranscludeFn", js.undefined)
    
    @scala.inline
    def setTranscludeControllers(value: StringDictionary[Instance]): Self = this.set("transcludeControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscludeControllers: Self = this.set("transcludeControllers", js.undefined)
  }
}
