package typings.autolinker.distCommonjsAutolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.autolinker.autolinkerStrings.scheme
  - typings.autolinker.autolinkerStrings.www
  - typings.autolinker.autolinkerStrings.tld
*/
trait UrlMatchTypeOptions extends js.Object

object UrlMatchTypeOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def scheme: typings.autolinker.autolinkerStrings.scheme = this.cast("scheme")
  @scala.inline
  def tld: typings.autolinker.autolinkerStrings.tld = this.cast("tld")
  @scala.inline
  def www: typings.autolinker.autolinkerStrings.www = this.cast("www")
}

