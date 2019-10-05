package typings.angularDashFormly.AngularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormlyConfigExtras extends js.Object {
  var apiCheckInstance: js.Any
  var defaultHideDirective: String
  var disableNgModelAttrsManipulator: Boolean
  var errorExistsAndShouldBeVisibleExpression: js.Any
  var explicitAsync: Boolean
  var fieldTransform: js.Function | js.Array[js.Function]
  var getFieldId: js.Function
  var ngModelAttrsManipulatorPreferUnbound: Boolean
  var removeChromeAutoComplete: Boolean
}

object IFormlyConfigExtras {
  @scala.inline
  def apply(
    apiCheckInstance: js.Any,
    defaultHideDirective: String,
    disableNgModelAttrsManipulator: Boolean,
    errorExistsAndShouldBeVisibleExpression: js.Any,
    explicitAsync: Boolean,
    fieldTransform: js.Function | js.Array[js.Function],
    getFieldId: js.Function,
    ngModelAttrsManipulatorPreferUnbound: Boolean,
    removeChromeAutoComplete: Boolean
  ): IFormlyConfigExtras = {
    val __obj = js.Dynamic.literal(apiCheckInstance = apiCheckInstance, defaultHideDirective = defaultHideDirective, disableNgModelAttrsManipulator = disableNgModelAttrsManipulator, errorExistsAndShouldBeVisibleExpression = errorExistsAndShouldBeVisibleExpression, explicitAsync = explicitAsync, fieldTransform = fieldTransform.asInstanceOf[js.Any], getFieldId = getFieldId, ngModelAttrsManipulatorPreferUnbound = ngModelAttrsManipulatorPreferUnbound, removeChromeAutoComplete = removeChromeAutoComplete)
  
    __obj.asInstanceOf[IFormlyConfigExtras]
  }
}

