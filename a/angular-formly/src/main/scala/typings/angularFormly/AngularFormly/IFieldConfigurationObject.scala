package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldConfigurationObject
  extends StObject
     with IFieldObject {
  
  /**
    * By default, the model passed to the formly-field directive is the same as the model passed to the
    * formly-form. However, if the field has a model specified, then it is used for that field (and that
    * field only). In addition, a deep watch is added to the formly-field directive's scope to run the
    * expressionProperties when the specified model changes.
    *
    * Note, the formly-form directive will allow you to specify a string which is an (almost) formly
    * expression which allows you to define the model as relative to the scope of the form.
    *
    * see http://docs.angular-formly.com/docs/field-configuration-object#model-object--string
    */
  var model: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
}
object IFieldConfigurationObject {
  
  inline def apply(value: js.UndefOr[js.Function0[js.Any]] & (js.UndefOr[js.Function1[/* val */ js.Any, Unit]])): IFieldConfigurationObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldConfigurationObject]
  }
  
  extension [Self <: IFieldConfigurationObject](x: Self) {
    
    inline def setModel(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
