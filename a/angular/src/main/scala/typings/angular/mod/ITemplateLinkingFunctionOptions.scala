package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.anon.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITemplateLinkingFunctionOptions extends StObject {
  
  var futureParentElement: js.UndefOr[JQuery] = js.undefined
  
  var parentBoundTranscludeFn: js.UndefOr[ITranscludeFunction] = js.undefined
  
  var transcludeControllers: js.UndefOr[StringDictionary[Instance]] = js.undefined
}
object ITemplateLinkingFunctionOptions {
  
  inline def apply(): ITemplateLinkingFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateLinkingFunctionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITemplateLinkingFunctionOptions] (val x: Self) extends AnyVal {
    
    inline def setFutureParentElement(value: JQuery): Self = StObject.set(x, "futureParentElement", value.asInstanceOf[js.Any])
    
    inline def setFutureParentElementUndefined: Self = StObject.set(x, "futureParentElement", js.undefined)
    
    inline def setParentBoundTranscludeFn(value: ITranscludeFunction): Self = StObject.set(x, "parentBoundTranscludeFn", value.asInstanceOf[js.Any])
    
    inline def setParentBoundTranscludeFnUndefined: Self = StObject.set(x, "parentBoundTranscludeFn", js.undefined)
    
    inline def setTranscludeControllers(value: StringDictionary[Instance]): Self = StObject.set(x, "transcludeControllers", value.asInstanceOf[js.Any])
    
    inline def setTranscludeControllersUndefined: Self = StObject.set(x, "transcludeControllers", js.undefined)
  }
}
