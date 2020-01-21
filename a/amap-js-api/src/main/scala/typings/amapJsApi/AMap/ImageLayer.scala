package typings.amapJsApi.AMap

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 图片图层
  */
@JSGlobal("AMap.ImageLayer")
@js.native
class ImageLayer () extends MediaLayer[HTMLImageElement] {
  /**
    * 返回Image的Url
    */
  def getImageUrl(): js.UndefOr[String] = js.native
  /**
    * 修改Image的Url
    * @param url url
    */
  def setImageUrl(url: String): Unit = js.native
}

