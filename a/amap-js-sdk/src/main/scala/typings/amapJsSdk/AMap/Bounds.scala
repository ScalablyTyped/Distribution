package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 地物对象的经纬度矩形范围
  */
@js.native
trait Bounds extends js.Object {
  
  /**
    * 判断指定点坐标是否在矩形范围内
    * @param point 指定点
    */
  def contains(point: LngLat): Boolean = js.native
  
  /**
    * 获取当前Bounds的中心点经纬度坐标
    */
  def getCenter(): LngLat = js.native
  
  /**
    * 获取东北角坐标
    */
  def getNorthEast(): LngLat = js.native
  
  /**
    * 获取西南角坐标
    */
  def getSouthWest(): LngLat = js.native
}
object Bounds {
  
  @scala.inline
  def apply(
    contains: LngLat => Boolean,
    getCenter: () => LngLat,
    getNorthEast: () => LngLat,
    getSouthWest: () => LngLat
  ): Bounds = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getCenter = js.Any.fromFunction0(getCenter), getNorthEast = js.Any.fromFunction0(getNorthEast), getSouthWest = js.Any.fromFunction0(getSouthWest))
    __obj.asInstanceOf[Bounds]
  }
  
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
    
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
    def setContains(value: LngLat => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCenter(value: () => LngLat): Self = this.set("getCenter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNorthEast(value: () => LngLat): Self = this.set("getNorthEast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSouthWest(value: () => LngLat): Self = this.set("getSouthWest", js.Any.fromFunction0(value))
  }
}
