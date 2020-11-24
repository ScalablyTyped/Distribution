package typings.antDesignReactNative.stepsItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderIconParams extends js.Object {
  
  var error: Boolean = js.native
  
  var starting: Boolean = js.native
  
  var waiting: Boolean = js.native
}
object RenderIconParams {
  
  @scala.inline
  def apply(error: Boolean, starting: Boolean, waiting: Boolean): RenderIconParams = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], starting = starting.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderIconParams]
  }
  
  @scala.inline
  implicit class RenderIconParamsOps[Self <: RenderIconParams] (val x: Self) extends AnyVal {
    
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
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarting(value: Boolean): Self = this.set("starting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaiting(value: Boolean): Self = this.set("waiting", value.asInstanceOf[js.Any])
  }
}
