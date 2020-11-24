package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableMask extends js.Object {
  
  var enableMask: js.UndefOr[Boolean] = js.native
  
  var enableStack: js.UndefOr[Boolean] = js.native
}
object EnableMask {
  
  @scala.inline
  def apply(): EnableMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableMask]
  }
  
  @scala.inline
  implicit class EnableMaskOps[Self <: EnableMask] (val x: Self) extends AnyVal {
    
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
    def setEnableMask(value: Boolean): Self = this.set("enableMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMask: Self = this.set("enableMask", js.undefined)
    
    @scala.inline
    def setEnableStack(value: Boolean): Self = this.set("enableStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableStack: Self = this.set("enableStack", js.undefined)
  }
}
