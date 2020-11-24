package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelMarker_[ExtraData] extends Overlay[ExtraData] {
  
   // should be void
  // internal
  def getBounds(): Bounds = js.native
  
  /**
    * 获取透明度
    */
  def getOpacity(): Double = js.native
  
  /**
    * 获取标注位置
    */
  def getPosition(): js.Tuple2[Double | String, Double | String] = js.native
  
  /**
    * 获取显示级别范围
    */
  def getZooms(): js.Tuple2[Double, Double] = js.native
  
  /**
    * 设置透明度
    * @param opacity 透明度
    */
  def setOpacity(opacity: Double): Unit = js.native
  
  /**
    * 设置标注位置
    * @param position 标注位置
    */
  def setPosition(position: js.Tuple2[Double, Double]): Unit = js.native
  
  /**
    * 设置显示级别范围
    * @param zooms 显示级别范围
    */
  def setZooms(zooms: js.Tuple2[Double, Double]): Unit = js.native
}
