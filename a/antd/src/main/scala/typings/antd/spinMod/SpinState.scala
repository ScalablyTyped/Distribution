package typings.antd.spinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinState extends js.Object {
  
  var notCssAnimationSupported: js.UndefOr[Boolean] = js.native
  
  var spinning: js.UndefOr[Boolean] = js.native
}
object SpinState {
  
  @scala.inline
  def apply(): SpinState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinState]
  }
  
  @scala.inline
  implicit class SpinStateOps[Self <: SpinState] (val x: Self) extends AnyVal {
    
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
    def setNotCssAnimationSupported(value: Boolean): Self = this.set("notCssAnimationSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotCssAnimationSupported: Self = this.set("notCssAnimationSupported", js.undefined)
    
    @scala.inline
    def setSpinning(value: Boolean): Self = this.set("spinning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpinning: Self = this.set("spinning", js.undefined)
  }
}
