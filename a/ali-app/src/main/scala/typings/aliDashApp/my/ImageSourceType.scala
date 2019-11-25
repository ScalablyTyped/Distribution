package typings.aliDashApp.my

import typings.aliDashApp.aliDashAppStrings.camera_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 图片 https://docs.alipay.com/mini/api/media-image
/* Rewritten from type alias, can be one of: 
  - typings.aliDashApp.aliDashAppStrings.album
  - typings.aliDashApp.aliDashAppStrings.camera_
*/
trait ImageSourceType extends js.Object

object ImageSourceType {
  @scala.inline
  def album: typings.aliDashApp.aliDashAppStrings.album = this.cast("album")
  @scala.inline
  def camera: camera_ = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

