package typings.angularDashFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.IFormController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * see http://docs.angular-formly.com/docs/custom-templates#templates-scope
	 */
trait ITemplateScope extends js.Object {
  //Shortcut to options.formControl
  var fc: IFormController | js.Array[IFormController]
  //all the fields for the form
  var fields: IFieldArray
  //the form controller the field is in
  var form: js.Any
  //The object passed as options.formState to the formly-form directive. Use this to share state between fields.
  var formState: js.Object
  //The id of the field. You shouldn't have to use this.
  var id: String
  //The index of the field the form is on (in ng-repeat)
  var index: Double
  //the model of the form (or the model specified by the field if it was specified).
  var model: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var options: ITemplateScopeOptions
  //Shortcut to options.validation.errorExistsAndShouldBeVisible
  var showError: Boolean
  //Shortcut to options.templateOptions
  var to: ITemplateOptions
}

object ITemplateScope {
  @scala.inline
  def apply(
    fc: IFormController | js.Array[IFormController],
    fields: IFieldArray,
    form: js.Any,
    formState: js.Object,
    id: String,
    index: Double,
    options: ITemplateScopeOptions,
    showError: Boolean,
    to: ITemplateOptions,
    model: StringDictionary[js.Any] = null
  ): ITemplateScope = {
    val __obj = js.Dynamic.literal(fc = fc.asInstanceOf[js.Any], fields = fields, form = form, formState = formState, id = id, index = index, options = options, showError = showError, to = to)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[ITemplateScope]
  }
}

