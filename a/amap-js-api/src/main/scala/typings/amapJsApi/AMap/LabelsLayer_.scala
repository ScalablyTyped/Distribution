package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelsLayer_ extends Layer {
  
  def add(labelMarker: js.Array[LabelMarker[_]]): Unit = js.native
  /**
    * 图层中添加LabelMarker
    * @param labelMarker 标注对象
    */
  def add(labelMarker: LabelMarker[_]): Unit = js.native
  
  /**
    * 清空图层
    */
  def clear(): Unit = js.native
  
  /**
    * 图层中移除LabelMarker
    * @param labelMarker 标注对象
    */
  def remove(labelMarker: LabelMarker[_]): Unit = js.native
}
