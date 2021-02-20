package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地物对象的像素尺寸
  */
@js.native
trait Size extends StObject {
  
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
  def apply(getHeight: () => Double, getWidth: () => Double): Size = {
    val __obj = js.Dynamic.literal(getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth))
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
  }
}
