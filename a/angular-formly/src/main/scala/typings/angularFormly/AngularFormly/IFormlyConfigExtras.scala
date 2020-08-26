package typings.angularFormly.AngularFormly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormlyConfigExtras extends js.Object {
  var apiCheckInstance: js.Any = js.native
  var defaultHideDirective: String = js.native
  var disableNgModelAttrsManipulator: Boolean = js.native
  var errorExistsAndShouldBeVisibleExpression: js.Any = js.native
  var explicitAsync: Boolean = js.native
  var fieldTransform: js.Function | js.Array[js.Function] = js.native
  var getFieldId: js.Function = js.native
  var ngModelAttrsManipulatorPreferUnbound: Boolean = js.native
  var removeChromeAutoComplete: Boolean = js.native
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
    val __obj = js.Dynamic.literal(apiCheckInstance = apiCheckInstance.asInstanceOf[js.Any], defaultHideDirective = defaultHideDirective.asInstanceOf[js.Any], disableNgModelAttrsManipulator = disableNgModelAttrsManipulator.asInstanceOf[js.Any], errorExistsAndShouldBeVisibleExpression = errorExistsAndShouldBeVisibleExpression.asInstanceOf[js.Any], explicitAsync = explicitAsync.asInstanceOf[js.Any], fieldTransform = fieldTransform.asInstanceOf[js.Any], getFieldId = getFieldId.asInstanceOf[js.Any], ngModelAttrsManipulatorPreferUnbound = ngModelAttrsManipulatorPreferUnbound.asInstanceOf[js.Any], removeChromeAutoComplete = removeChromeAutoComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormlyConfigExtras]
  }
  @scala.inline
  implicit class IFormlyConfigExtrasOps[Self <: IFormlyConfigExtras] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiCheckInstance(value: js.Any): Self = this.set("apiCheckInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultHideDirective(value: String): Self = this.set("defaultHideDirective", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableNgModelAttrsManipulator(value: Boolean): Self = this.set("disableNgModelAttrsManipulator", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorExistsAndShouldBeVisibleExpression(value: js.Any): Self = this.set("errorExistsAndShouldBeVisibleExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setExplicitAsync(value: Boolean): Self = this.set("explicitAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldTransformVarargs(value: js.Function*): Self = this.set("fieldTransform", js.Array(value :_*))
    @scala.inline
    def setFieldTransform(value: js.Function | js.Array[js.Function]): Self = this.set("fieldTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFieldId(value: js.Function): Self = this.set("getFieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNgModelAttrsManipulatorPreferUnbound(value: Boolean): Self = this.set("ngModelAttrsManipulatorPreferUnbound", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveChromeAutoComplete(value: Boolean): Self = this.set("removeChromeAutoComplete", value.asInstanceOf[js.Any])
  }
  
}

