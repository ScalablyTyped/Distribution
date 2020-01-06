package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lexicon extends js.Object {
  /**
    * Lexicon content in string format. The content of a lexicon must be in PLS format.
    */
  var Content: js.UndefOr[LexiconContent] = js.native
  /**
    * Name of the lexicon.
    */
  var Name: js.UndefOr[LexiconName] = js.native
}

object Lexicon {
  @scala.inline
  def apply(Content: LexiconContent = null, Name: LexiconName = null): Lexicon = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lexicon]
  }
}

