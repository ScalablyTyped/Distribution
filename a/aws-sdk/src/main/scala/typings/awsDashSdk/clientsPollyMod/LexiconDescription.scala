package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexiconDescription extends js.Object {
  /**
    * Provides lexicon metadata.
    */
  var Attributes: js.UndefOr[LexiconAttributes] = js.undefined
  /**
    * Name of the lexicon.
    */
  var Name: js.UndefOr[LexiconName] = js.undefined
}

object LexiconDescription {
  @scala.inline
  def apply(Attributes: LexiconAttributes = null, Name: LexiconName = null): LexiconDescription = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[LexiconDescription]
  }
}

