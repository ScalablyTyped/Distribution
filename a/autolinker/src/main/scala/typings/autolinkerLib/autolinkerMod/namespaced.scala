package typings
package autolinkerLib.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("autolinker", JSImport.Namespace)
@js.native
class namespaced ()
  extends autolinkerLib.underscoreUnderscoreAutolinkerNs.Autolinker {
  def this(cfg: autolinkerLib.underscoreUnderscoreAutolinkerNs.ConfigOptions) = this()
  /* CompleteClass */
  override def getTagBuilder(): js.Any = js.native
  /**
    * Automatically links URLs, Email addresses, Phone numbers, Twitter handles, and Hashtags found in the given chunk of HTML. Does not link URLs found within HTML tags.
    */
  /* CompleteClass */
  override def link(textOrHtml: java.lang.String): java.lang.String = js.native
  /**
    * Parses the input textOrHtml looking for URLs, email addresses, phone numbers, username handles, and hashtags (depending on the configuration of the Autolinker instance), and returns an array of Autolinker.match.Match objects describing those matches.
    */
  /* CompleteClass */
  override def parse(textOrHtml: java.lang.String): js.Array[_] = js.native
}

