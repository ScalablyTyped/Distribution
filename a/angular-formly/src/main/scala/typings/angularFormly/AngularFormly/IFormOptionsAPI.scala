package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFormOptionsAPI extends StObject {
  
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var fieldTransform: js.UndefOr[js.Function | js.Array[js.Function]] = js.undefined
  
  var formState: js.UndefOr[js.Object] = js.undefined
  
  var removeChromeAutoComplete: js.UndefOr[Boolean] = js.undefined
  
  var resetModel: js.UndefOr[js.Function] = js.undefined
  
  var templateManipulators: js.UndefOr[ITemplateManipulators] = js.undefined
  
  var updateInitialValue: js.UndefOr[js.Function] = js.undefined
  
  var wrapper: js.UndefOr[String | js.Array[String]] = js.undefined
}
object IFormOptionsAPI {
  
  inline def apply(): IFormOptionsAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormOptionsAPI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFormOptionsAPI] (val x: Self) extends AnyVal {
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFieldTransform(value: js.Function | js.Array[js.Function]): Self = StObject.set(x, "fieldTransform", value.asInstanceOf[js.Any])
    
    inline def setFieldTransformUndefined: Self = StObject.set(x, "fieldTransform", js.undefined)
    
    inline def setFieldTransformVarargs(value: js.Function*): Self = StObject.set(x, "fieldTransform", js.Array(value*))
    
    inline def setFormState(value: js.Object): Self = StObject.set(x, "formState", value.asInstanceOf[js.Any])
    
    inline def setFormStateUndefined: Self = StObject.set(x, "formState", js.undefined)
    
    inline def setRemoveChromeAutoComplete(value: Boolean): Self = StObject.set(x, "removeChromeAutoComplete", value.asInstanceOf[js.Any])
    
    inline def setRemoveChromeAutoCompleteUndefined: Self = StObject.set(x, "removeChromeAutoComplete", js.undefined)
    
    inline def setResetModel(value: js.Function): Self = StObject.set(x, "resetModel", value.asInstanceOf[js.Any])
    
    inline def setResetModelUndefined: Self = StObject.set(x, "resetModel", js.undefined)
    
    inline def setTemplateManipulators(value: ITemplateManipulators): Self = StObject.set(x, "templateManipulators", value.asInstanceOf[js.Any])
    
    inline def setTemplateManipulatorsUndefined: Self = StObject.set(x, "templateManipulators", js.undefined)
    
    inline def setUpdateInitialValue(value: js.Function): Self = StObject.set(x, "updateInitialValue", value.asInstanceOf[js.Any])
    
    inline def setUpdateInitialValueUndefined: Self = StObject.set(x, "updateInitialValue", js.undefined)
    
    inline def setWrapper(value: String | js.Array[String]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    
    inline def setWrapperVarargs(value: String*): Self = StObject.set(x, "wrapper", js.Array(value*))
  }
}
