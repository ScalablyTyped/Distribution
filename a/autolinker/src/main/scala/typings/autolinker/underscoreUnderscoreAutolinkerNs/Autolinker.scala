package typings.autolinker.underscoreUnderscoreAutolinkerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autolinker extends js.Object {
  def getTagBuilder(): js.Any
  /**
    * Automatically links URLs, Email addresses, Phone numbers, Twitter handles, and Hashtags found in the given chunk of HTML. Does not link URLs found within HTML tags.
    */
  def link(textOrHtml: String): String
  /**
    * Parses the input textOrHtml looking for URLs, email addresses, phone numbers, username handles, and hashtags (depending on the configuration of the Autolinker instance), and returns an array of Autolinker.match.Match objects describing those matches.
    */
  def parse(textOrHtml: String): js.Array[_]
}

object Autolinker {
  @scala.inline
  def apply(getTagBuilder: () => js.Any, link: String => String, parse: String => js.Array[_]): Autolinker = {
    val __obj = js.Dynamic.literal(getTagBuilder = js.Any.fromFunction0(getTagBuilder), link = js.Any.fromFunction1(link), parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[Autolinker]
  }
}

