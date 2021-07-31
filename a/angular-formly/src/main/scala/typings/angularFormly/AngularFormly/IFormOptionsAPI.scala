package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFormOptionsAPI extends StObject {
  
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var fieldTransform: js.UndefOr[js.Function | js.Array[js.Function]] = js.undefined
  
  var formState: js.UndefOr[js.Object] = js.undefined
  
  var removeChromeAutoComplete: js.UndefOr[Boolean] = js.undefined
  
  var resetModel: js.UndefOr[js.Function] = js.undefined
  
  var templateManipulators: js.UndefOr[ITemplateManipulators] = js.undefined
  
  var updateInitialValue: js.UndefOr[js.Function] = js.undefined
  
  var wrapper: js.UndefOr[String | js.Array[String]] = js.undefined
}
object IFormOptionsAPI {
  
  @scala.inline
  def apply(): IFormOptionsAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormOptionsAPI]
  }
  
  @scala.inline
  implicit class IFormOptionsAPIMutableBuilder[Self <: IFormOptionsAPI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFieldTransform(value: js.Function | js.Array[js.Function]): Self = StObject.set(x, "fieldTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformUndefined: Self = StObject.set(x, "fieldTransform", js.undefined)
    
    @scala.inline
    def setFieldTransformVarargs(value: js.Function*): Self = StObject.set(x, "fieldTransform", js.Array(value :_*))
    
    @scala.inline
    def setFormState(value: js.Object): Self = StObject.set(x, "formState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormStateUndefined: Self = StObject.set(x, "formState", js.undefined)
    
    @scala.inline
    def setRemoveChromeAutoComplete(value: Boolean): Self = StObject.set(x, "removeChromeAutoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveChromeAutoCompleteUndefined: Self = StObject.set(x, "removeChromeAutoComplete", js.undefined)
    
    @scala.inline
    def setResetModel(value: js.Function): Self = StObject.set(x, "resetModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetModelUndefined: Self = StObject.set(x, "resetModel", js.undefined)
    
    @scala.inline
    def setTemplateManipulators(value: ITemplateManipulators): Self = StObject.set(x, "templateManipulators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateManipulatorsUndefined: Self = StObject.set(x, "templateManipulators", js.undefined)
    
    @scala.inline
    def setUpdateInitialValue(value: js.Function): Self = StObject.set(x, "updateInitialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateInitialValueUndefined: Self = StObject.set(x, "updateInitialValue", js.undefined)
    
    @scala.inline
    def setWrapper(value: String | js.Array[String]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    
    @scala.inline
    def setWrapperVarargs(value: String*): Self = StObject.set(x, "wrapper", js.Array(value :_*))
  }
}
