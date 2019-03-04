package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplateScopeOptions extends js.Object {
  var formControl: angularLib.angularMod.angularNs.IFormController | js.Array[angularLib.angularMod.angularNs.IFormController]
  var templateOptions: ITemplateOptions
  var validation: js.Object
}

object ITemplateScopeOptions {
  @scala.inline
  def apply(
    formControl: angularLib.angularMod.angularNs.IFormController | js.Array[angularLib.angularMod.angularNs.IFormController],
    templateOptions: ITemplateOptions,
    validation: js.Object
  ): ITemplateScopeOptions = {
    val __obj = js.Dynamic.literal(formControl = formControl.asInstanceOf[js.Any], templateOptions = templateOptions, validation = validation)
  
    __obj.asInstanceOf[ITemplateScopeOptions]
  }
}

