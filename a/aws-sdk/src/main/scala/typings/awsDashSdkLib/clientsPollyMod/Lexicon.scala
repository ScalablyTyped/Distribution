package typings
package awsDashSdkLib.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lexicon extends js.Object {
  /**
    * Lexicon content in string format. The content of a lexicon must be in PLS format.
    */
  var Content: js.UndefOr[LexiconContent] = js.undefined
  /**
    * Name of the lexicon.
    */
  var Name: js.UndefOr[LexiconName] = js.undefined
}

object Lexicon {
  @scala.inline
  def apply(Content: LexiconContent = null, Name: LexiconName = null): Lexicon = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Lexicon]
  }
}

