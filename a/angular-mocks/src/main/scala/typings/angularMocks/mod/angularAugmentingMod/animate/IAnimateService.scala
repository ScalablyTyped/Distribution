package typings.angularMocks.mod.angularAugmentingMod.animate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimateService extends js.Object {
  
  /**
    * This method will close all pending animations (both Javascript and CSS) and it will also flush any remaining
    * animation frames and/or callbacks.
    */
  def closeAndFlush(): Unit = js.native
  
  /**
    * This method is used to flush the pending callbacks and animation frames to either start
    * an animation or conclude an animation. Note that this will not actually close an
    * actively running animation (see `closeAndFlush()`} for that).
    */
  def flush(): Unit = js.native
}
object IAnimateService {
  
  @scala.inline
  def apply(closeAndFlush: () => Unit, flush: () => Unit): IAnimateService = {
    val __obj = js.Dynamic.literal(closeAndFlush = js.Any.fromFunction0(closeAndFlush), flush = js.Any.fromFunction0(flush))
    __obj.asInstanceOf[IAnimateService]
  }
  
  @scala.inline
  implicit class IAnimateServiceOps[Self <: IAnimateService] (val x: Self) extends AnyVal {
    
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
    def setCloseAndFlush(value: () => Unit): Self = this.set("closeAndFlush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
  }
}
