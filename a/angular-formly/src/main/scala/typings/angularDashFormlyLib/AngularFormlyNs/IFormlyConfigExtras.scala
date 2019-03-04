package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormlyConfigExtras extends js.Object {
  var apiCheckInstance: js.Any
  var defaultHideDirective: java.lang.String
  var disableNgModelAttrsManipulator: scala.Boolean
  var errorExistsAndShouldBeVisibleExpression: js.Any
  var explicitAsync: scala.Boolean
  var fieldTransform: angularLib.angularMod.Global.Function | js.Array[angularLib.angularMod.Global.Function]
  var getFieldId: angularLib.angularMod.Global.Function
  var ngModelAttrsManipulatorPreferUnbound: scala.Boolean
  var removeChromeAutoComplete: scala.Boolean
}

object IFormlyConfigExtras {
  @scala.inline
  def apply(
    apiCheckInstance: js.Any,
    defaultHideDirective: java.lang.String,
    disableNgModelAttrsManipulator: scala.Boolean,
    errorExistsAndShouldBeVisibleExpression: js.Any,
    explicitAsync: scala.Boolean,
    fieldTransform: angularLib.angularMod.Global.Function | js.Array[angularLib.angularMod.Global.Function],
    getFieldId: angularLib.angularMod.Global.Function,
    ngModelAttrsManipulatorPreferUnbound: scala.Boolean,
    removeChromeAutoComplete: scala.Boolean
  ): IFormlyConfigExtras = {
    val __obj = js.Dynamic.literal(apiCheckInstance = apiCheckInstance, defaultHideDirective = defaultHideDirective, disableNgModelAttrsManipulator = disableNgModelAttrsManipulator, errorExistsAndShouldBeVisibleExpression = errorExistsAndShouldBeVisibleExpression, explicitAsync = explicitAsync, fieldTransform = fieldTransform.asInstanceOf[js.Any], getFieldId = getFieldId, ngModelAttrsManipulatorPreferUnbound = ngModelAttrsManipulatorPreferUnbound, removeChromeAutoComplete = removeChromeAutoComplete)
  
    __obj.asInstanceOf[IFormlyConfigExtras]
  }
}

