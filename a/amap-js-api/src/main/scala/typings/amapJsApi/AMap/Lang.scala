package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApi.amapJsApiStrings.zh_cn
  - typings.amapJsApi.amapJsApiStrings.en
  - typings.amapJsApi.amapJsApiStrings.zh_en
*/
trait Lang extends js.Object

object Lang {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def en: typings.amapJsApi.amapJsApiStrings.en = this.cast("en")
  @scala.inline
  def zh_cn: typings.amapJsApi.amapJsApiStrings.zh_cn = this.cast("zh_cn")
  @scala.inline
  def zh_en: typings.amapJsApi.amapJsApiStrings.zh_en = this.cast("zh_en")
}

