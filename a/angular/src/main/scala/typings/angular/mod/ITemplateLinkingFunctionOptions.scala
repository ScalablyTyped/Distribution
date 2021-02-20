package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.anon.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITemplateLinkingFunctionOptions extends StObject {
  
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
  implicit class ITemplateLinkingFunctionOptionsMutableBuilder[Self <: ITemplateLinkingFunctionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFutureParentElement(value: JQuery): Self = StObject.set(x, "futureParentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFutureParentElementUndefined: Self = StObject.set(x, "futureParentElement", js.undefined)
    
    @scala.inline
    def setParentBoundTranscludeFn(value: ITranscludeFunction): Self = StObject.set(x, "parentBoundTranscludeFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentBoundTranscludeFnUndefined: Self = StObject.set(x, "parentBoundTranscludeFn", js.undefined)
    
    @scala.inline
    def setTranscludeControllers(value: StringDictionary[Instance]): Self = StObject.set(x, "transcludeControllers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscludeControllersUndefined: Self = StObject.set(x, "transcludeControllers", js.undefined)
  }
}
