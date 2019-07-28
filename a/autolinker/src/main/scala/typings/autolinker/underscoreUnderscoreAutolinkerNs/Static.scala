package typings.autolinker.underscoreUnderscoreAutolinkerNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends Instantiable0[typings.autolinker.underscoreUnderscoreAutolinkerNs.Autolinker]
     with Instantiable1[
      /* cfg */ ConfigOptions, 
      typings.autolinker.underscoreUnderscoreAutolinkerNs.Autolinker
    ] {
  /**
    * Automatically links URLs, Email addresses, Phone Numbers, Twitter handles, and Hashtags found in the given chunk of HTML. Does not link URLs found within HTML tags.
    */
  def link(textOrHtml: String): String = js.native
  def link(textOrHtml: String, options: ConfigOptions): String = js.native
}

