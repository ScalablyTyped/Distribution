package typings.adone

import typings.adone.adoneStrings.RFC1738
import typings.adone.adoneStrings.RFC3986
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var RFC1738: typings.adone.adoneStrings.RFC1738
  var RFC3986: typings.adone.adoneStrings.RFC3986
  var default: String
  var formatters: Anon_RFC1738
}

object Anon_Default {
  @scala.inline
  def apply(RFC1738: RFC1738, RFC3986: RFC3986, default: String, formatters: Anon_RFC1738): Anon_Default = {
    val __obj = js.Dynamic.literal(RFC1738 = RFC1738, RFC3986 = RFC3986, default = default, formatters = formatters)
  
    __obj.asInstanceOf[Anon_Default]
  }
}

