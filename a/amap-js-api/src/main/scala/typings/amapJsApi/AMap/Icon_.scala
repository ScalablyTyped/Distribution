package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.Icon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Icon")
@js.native
/**
  * 点标记的图标
  * @param options 选项
  */
class Icon_ () extends EventEmitter {
  def this(options: Options) = this()
  /**
    * 获取图标图片大小
    */
  def getImageSize(): Size = js.native
  /**
    * 设置图标图片大小
    * @param size 大小
    */
  def setImageSize(size: SizeValue): Unit = js.native
}

