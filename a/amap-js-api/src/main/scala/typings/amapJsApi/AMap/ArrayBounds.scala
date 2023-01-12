package typings.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayBounds extends StObject {
  
  var bounds: js.Array[LngLat]
  
  /**
    * 判断传入的点是否在ArrayBounds内
    * @param point 目标点
    */
  def contains(point: LocationValue): Boolean
  
  def getCenter(): LngLat
  
  // internal
  def toBounds(): Bounds
}
object ArrayBounds {
  
  inline def apply(
    bounds: js.Array[LngLat],
    contains: LocationValue => Boolean,
    getCenter: () => LngLat,
    toBounds: () => Bounds
  ): ArrayBounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), getCenter = js.Any.fromFunction0(getCenter), toBounds = js.Any.fromFunction0(toBounds))
    __obj.asInstanceOf[ArrayBounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayBounds] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: js.Array[LngLat]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsVarargs(value: LngLat*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setContains(value: LocationValue => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setGetCenter(value: () => LngLat): Self = StObject.set(x, "getCenter", js.Any.fromFunction0(value))
    
    inline def setToBounds(value: () => Bounds): Self = StObject.set(x, "toBounds", js.Any.fromFunction0(value))
  }
}
