package typings.angularDashFormly.AngularFormlyNs

import typings.angular.angularMod.IFormController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplateScopeOptions extends js.Object {
  var formControl: IFormController | js.Array[IFormController]
  var templateOptions: ITemplateOptions
  var validation: js.Object
}

object ITemplateScopeOptions {
  @scala.inline
  def apply(
    formControl: IFormController | js.Array[IFormController],
    templateOptions: ITemplateOptions,
    validation: js.Object
  ): ITemplateScopeOptions = {
    val __obj = js.Dynamic.literal(formControl = formControl.asInstanceOf[js.Any], templateOptions = templateOptions, validation = validation)
  
    __obj.asInstanceOf[ITemplateScopeOptions]
  }
}

