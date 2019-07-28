package typings.autolinker

import typings.autolinker.underscoreUnderscoreAutolinkerNs.ConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Autolinker")
@js.native
class Autolinker ()
  extends typings.autolinker.underscoreUnderscoreAutolinkerNs.Autolinker {
  def this(cfg: ConfigOptions) = this()
  /* CompleteClass */
  override def getTagBuilder(): js.Any = js.native
  /**
    * Automatically links URLs, Email addresses, Phone numbers, Twitter handles, and Hashtags found in the given chunk of HTML. Does not link URLs found within HTML tags.
    */
  /* CompleteClass */
  override def link(textOrHtml: String): String = js.native
  /**
    * Parses the input textOrHtml looking for URLs, email addresses, phone numbers, username handles, and hashtags (depending on the configuration of the Autolinker instance), and returns an array of Autolinker.match.Match objects describing those matches.
    */
  /* CompleteClass */
  override def parse(textOrHtml: String): js.Array[_] = js.native
}

