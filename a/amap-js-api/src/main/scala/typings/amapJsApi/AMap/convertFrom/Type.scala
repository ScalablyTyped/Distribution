package typings.amapJsApi.AMap.convertFrom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApi.amapJsApiStrings.gps
  - typings.amapJsApi.amapJsApiStrings.baidu
  - typings.amapJsApi.amapJsApiStrings.mapbar
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def baidu: typings.amapJsApi.amapJsApiStrings.baidu = this.cast("baidu")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gps: typings.amapJsApi.amapJsApiStrings.gps = this.cast("gps")
  @scala.inline
  def mapbar: typings.amapJsApi.amapJsApiStrings.mapbar = this.cast("mapbar")
}

