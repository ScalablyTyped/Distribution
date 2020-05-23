package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon_ extends EventEmitter {
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

