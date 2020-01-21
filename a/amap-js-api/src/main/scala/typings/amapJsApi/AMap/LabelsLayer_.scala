package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.LabelsLayer.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.LabelsLayer")
@js.native
/**
  * 标注图层
  * @param options 选项
  */
class LabelsLayer_ () extends Layer {
  def this(options: Options) = this()
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

