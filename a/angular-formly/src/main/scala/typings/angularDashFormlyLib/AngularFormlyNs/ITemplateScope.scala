package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/custom-templates#templates-scope
	 */
trait ITemplateScope extends js.Object {
  //Shortcut to options.formControl
  var fc: angularLib.angularMod.angularNs.IFormController | js.Array[angularLib.angularMod.angularNs.IFormController]
  //all the fields for the form
  var fields: IFieldArray
  //the form controller the field is in
  var form: js.Any
  //The object passed as options.formState to the formly-form directive. Use this to share state between fields.
  var formState: js.Object
  //The id of the field. You shouldn't have to use this.
  var id: java.lang.String
  //The index of the field the form is on (in ng-repeat)
  var index: scala.Double
  //the model of the form (or the model specified by the field if it was specified).
  var model: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var options: ITemplateScopeOptions
  //Shortcut to options.validation.errorExistsAndShouldBeVisible
  var showError: scala.Boolean
  //Shortcut to options.templateOptions
  var to: ITemplateOptions
}

object ITemplateScope {
  @scala.inline
  def apply(
    fc: angularLib.angularMod.angularNs.IFormController | js.Array[angularLib.angularMod.angularNs.IFormController],
    fields: IFieldArray,
    form: js.Any,
    formState: js.Object,
    id: java.lang.String,
    index: scala.Double,
    options: ITemplateScopeOptions,
    showError: scala.Boolean,
    to: ITemplateOptions,
    model: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ITemplateScope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fc")(fc.asInstanceOf[js.Any])
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("form")(form)
    __obj.updateDynamic("formState")(formState)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("showError")(showError)
    __obj.updateDynamic("to")(to)
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemplateScope]
  }
}

