package typings.antDesignReactNative.checkboxPropsTypeMod

import typings.antDesignReactNative.anon.Checked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChangeParams extends js.Object {
  
  var target: Checked = js.native
}
object OnChangeParams {
  
  @scala.inline
  def apply(target: Checked): OnChangeParams = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeParams]
  }
  
  @scala.inline
  implicit class OnChangeParamsOps[Self <: OnChangeParams] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: Checked): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
