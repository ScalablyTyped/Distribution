package typings.antd.anon

import typings.react.mod.ForwardRefExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Warning extends js.Object {
  
  var error: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
  
  var info: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
  
  var success: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
  
  var warning: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
}
object Warning {
  
  @scala.inline
  def apply(
    error: ForwardRefExoticComponent[PickAntdIconPropschildren],
    info: ForwardRefExoticComponent[PickAntdIconPropschildren],
    success: ForwardRefExoticComponent[PickAntdIconPropschildren],
    warning: ForwardRefExoticComponent[PickAntdIconPropschildren]
  ): Warning = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Warning]
  }
  
  @scala.inline
  implicit class WarningOps[Self <: Warning] (val x: Self) extends AnyVal {
    
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
    def setError(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
}
