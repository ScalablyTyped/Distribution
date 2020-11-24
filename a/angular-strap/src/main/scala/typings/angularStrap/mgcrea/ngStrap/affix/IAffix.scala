package typings.angularStrap.mgcrea.ngStrap.affix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAffix extends js.Object {
  
  def checkPosition(): Unit = js.native
  
  def checkPositionWithEventLoop(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def init(): Unit = js.native
}
object IAffix {
  
  @scala.inline
  def apply(
    checkPosition: () => Unit,
    checkPositionWithEventLoop: () => Unit,
    destroy: () => Unit,
    init: () => Unit
  ): IAffix = {
    val __obj = js.Dynamic.literal(checkPosition = js.Any.fromFunction0(checkPosition), checkPositionWithEventLoop = js.Any.fromFunction0(checkPositionWithEventLoop), destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[IAffix]
  }
  
  @scala.inline
  implicit class IAffixOps[Self <: IAffix] (val x: Self) extends AnyVal {
    
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
    def setCheckPosition(value: () => Unit): Self = this.set("checkPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckPositionWithEventLoop(value: () => Unit): Self = this.set("checkPositionWithEventLoop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
  }
}
