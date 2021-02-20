package typings.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayBounds extends StObject {
  
  var bounds: js.Array[LngLat] = js.native
  
  /**
    * 判断传入的点是否在ArrayBounds内
    * @param point 目标点
    */
  def contains(point: LocationValue): Boolean = js.native
  
  def getCenter(): LngLat = js.native
  
  // internal
  def toBounds(): Bounds = js.native
}
object ArrayBounds {
  
  @scala.inline
  def apply(
    bounds: js.Array[LngLat],
    contains: LocationValue => Boolean,
    getCenter: () => LngLat,
    toBounds: () => Bounds
  ): ArrayBounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), getCenter = js.Any.fromFunction0(getCenter), toBounds = js.Any.fromFunction0(toBounds))
    __obj.asInstanceOf[ArrayBounds]
  }
  
  @scala.inline
  implicit class ArrayBoundsMutableBuilder[Self <: ArrayBounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: js.Array[LngLat]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsVarargs(value: LngLat*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    @scala.inline
    def setContains(value: LocationValue => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCenter(value: () => LngLat): Self = StObject.set(x, "getCenter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToBounds(value: () => Bounds): Self = StObject.set(x, "toBounds", js.Any.fromFunction0(value))
  }
}
