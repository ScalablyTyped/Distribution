package typings.amapJsApi.AMap

import typings.amapJsApi.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends js.Object {
  
  // internal
  def contains(size: X): Boolean = js.native
  
  /**
    * 获得高度
    */
  def getHeight(): Double = js.native
  
  /**
    * 获得宽度
    */
  def getWidth(): Double = js.native
}
object Size {
  
  @scala.inline
  def apply(contains: X => Boolean, getHeight: () => Double, getWidth: () => Double): Size = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth))
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeOps[Self <: Size] (val x: Self) extends AnyVal {
    
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
    def setContains(value: X => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = this.set("getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
  }
}
