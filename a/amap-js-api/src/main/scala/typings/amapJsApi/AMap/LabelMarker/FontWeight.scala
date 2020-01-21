package typings.amapJsApi.AMap.LabelMarker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApi.amapJsApiStrings.normal
  - typings.amapJsApi.amapJsApiStrings.thin
  - typings.amapJsApi.amapJsApiStrings.bold
*/
trait FontWeight extends js.Object

object FontWeight {
  @scala.inline
  def bold: typings.amapJsApi.amapJsApiStrings.bold = this.cast("bold")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.amapJsApi.amapJsApiStrings.normal = this.cast("normal")
  @scala.inline
  def thin: typings.amapJsApi.amapJsApiStrings.thin = this.cast("thin")
}

