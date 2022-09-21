package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IFormController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * see http://docs.angular-formly.com/docs/custom-templates#templates-scope
  */
trait ITemplateScope extends StObject {
  
  //Shortcut to options.formControl
  var fc: IFormController | js.Array[IFormController]
  
  //all the fields for the form
  var fields: IFieldArray
  
  //the form controller the field is in
  var form: Any
  
  //The object passed as options.formState to the formly-form directive. Use this to share state between fields.
  var formState: js.Object
  
  //The id of the field. You shouldn't have to use this.
  var id: String
  
  //The index of the field the form is on (in ng-repeat)
  var index: Double
  
  //the model of the form (or the model specified by the field if it was specified).
  var model: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var options: ITemplateScopeOptions
  
  //Shortcut to options.validation.errorExistsAndShouldBeVisible
  var showError: Boolean
  
  //Shortcut to options.templateOptions
  var to: ITemplateOptions
}
object ITemplateScope {
  
  inline def apply(
    fc: IFormController | js.Array[IFormController],
    fields: IFieldArray,
    form: Any,
    formState: js.Object,
    id: String,
    index: Double,
    options: ITemplateScopeOptions,
    showError: Boolean,
    to: ITemplateOptions
  ): ITemplateScope = {
    val __obj = js.Dynamic.literal(fc = fc.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], formState = formState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], showError = showError.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemplateScope]
  }
  
  extension [Self <: ITemplateScope](x: Self) {
    
    inline def setFc(value: IFormController | js.Array[IFormController]): Self = StObject.set(x, "fc", value.asInstanceOf[js.Any])
    
    inline def setFcVarargs(value: IFormController*): Self = StObject.set(x, "fc", js.Array(value*))
    
    inline def setFields(value: IFieldArray): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: (IFieldConfigurationObject | IFieldGroup)*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setForm(value: Any): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormState(value: js.Object): Self = StObject.set(x, "formState", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setModel(value: StringDictionary[Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setOptions(value: ITemplateScopeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setShowError(value: Boolean): Self = StObject.set(x, "showError", value.asInstanceOf[js.Any])
    
    inline def setTo(value: ITemplateOptions): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
