package typings.amapJsApi.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bounds extends StObject {
  
  /**
    * 指定点坐标是否在矩形范围内
    * @param point 制定坐标
    */
  def contains(point: LocationValue): Boolean = js.native
  
  /**
    * 获取当前Bounds的中心点经纬度坐标
    */
  def getCenter(): LngLat = js.native
  
  /**
    * 获取东北角坐标
    */
  def getNorthEast(): LngLat = js.native
  
  /**
    * 获取西北角坐标
    */
  def getNorthWest(): LngLat = js.native
  
  /**
    * 获取东南角坐标
    */
  def getSouthEast(): LngLat = js.native
  
  /**
    * 获取西南角坐标
    */
  def getSouthWest(): LngLat = js.native
}
object Bounds {
  
  @scala.inline
  def apply(
    contains: LocationValue => Boolean,
    getCenter: () => LngLat,
    getNorthEast: () => LngLat,
    getNorthWest: () => LngLat,
    getSouthEast: () => LngLat,
    getSouthWest: () => LngLat
  ): Bounds = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getCenter = js.Any.fromFunction0(getCenter), getNorthEast = js.Any.fromFunction0(getNorthEast), getNorthWest = js.Any.fromFunction0(getNorthWest), getSouthEast = js.Any.fromFunction0(getSouthEast), getSouthWest = js.Any.fromFunction0(getSouthWest))
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: LocationValue => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCenter(value: () => LngLat): Self = StObject.set(x, "getCenter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNorthEast(value: () => LngLat): Self = StObject.set(x, "getNorthEast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNorthWest(value: () => LngLat): Self = StObject.set(x, "getNorthWest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSouthEast(value: () => LngLat): Self = StObject.set(x, "getSouthEast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSouthWest(value: () => LngLat): Self = StObject.set(x, "getSouthWest", js.Any.fromFunction0(value))
  }
}
