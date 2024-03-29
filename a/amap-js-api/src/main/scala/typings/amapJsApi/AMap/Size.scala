package typings.amapJsApi.AMap

import typings.amapJsApi.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  // internal
  def contains(size: X): Boolean
  
  /**
    * 获得高度
    */
  def getHeight(): Double
  
  /**
    * 获得宽度
    */
  def getWidth(): Double
}
object Size {
  
  inline def apply(contains: X => Boolean, getHeight: () => Double, getWidth: () => Double): Size = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth))
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    inline def setContains(value: X => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
  }
}
