package typings.agGrid.originalColumnGroupChildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalColumnGroupChild extends js.Object {
  
  def getColumnGroupShow(): String = js.native
  
  def getId(): String = js.native
  
  def isVisible(): Boolean = js.native
}
object OriginalColumnGroupChild {
  
  @scala.inline
  def apply(getColumnGroupShow: () => String, getId: () => String, isVisible: () => Boolean): OriginalColumnGroupChild = {
    val __obj = js.Dynamic.literal(getColumnGroupShow = js.Any.fromFunction0(getColumnGroupShow), getId = js.Any.fromFunction0(getId), isVisible = js.Any.fromFunction0(isVisible))
    __obj.asInstanceOf[OriginalColumnGroupChild]
  }
  
  @scala.inline
  implicit class OriginalColumnGroupChildOps[Self <: OriginalColumnGroupChild] (val x: Self) extends AnyVal {
    
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
    def setGetColumnGroupShow(value: () => String): Self = this.set("getColumnGroupShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
  }
}
