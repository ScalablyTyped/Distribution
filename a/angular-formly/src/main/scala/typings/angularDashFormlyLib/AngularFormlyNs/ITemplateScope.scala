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

