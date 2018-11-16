package typings
package autolinkerLib.underscoreUnderscoreAutolinkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends ScalablyTyped.runtime.Instantiable0[Autolinker]
     with ScalablyTyped.runtime.Instantiable1[/* cfg */ ConfigOptions, Autolinker] {
  /**
       * Automatically links URLs, Email addresses, Phone Numbers, Twitter handles, and Hashtags found in the given chunk of HTML. Does not link URLs found within HTML tags.
       */
  def link(textOrHtml: java.lang.String): java.lang.String = js.native
  /**
       * Automatically links URLs, Email addresses, Phone Numbers, Twitter handles, and Hashtags found in the given chunk of HTML. Does not link URLs found within HTML tags.
       */
  def link(textOrHtml: java.lang.String, options: ConfigOptions): java.lang.String = js.native
}

