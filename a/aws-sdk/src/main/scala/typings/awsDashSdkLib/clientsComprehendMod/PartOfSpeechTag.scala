package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartOfSpeechTag extends js.Object {
  /**
    * The confidence that Amazon Comprehend has that the part of speech was correctly identified.
    */
  var Score: js.UndefOr[Float] = js.undefined
  /**
    * Identifies the part of speech that the token represents.
    */
  var Tag: js.UndefOr[PartOfSpeechTagType] = js.undefined
}

object PartOfSpeechTag {
  @scala.inline
  def apply(Score: js.UndefOr[Float] = js.undefined, Tag: PartOfSpeechTagType = null): PartOfSpeechTag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Score)) __obj.updateDynamic("Score")(Score)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartOfSpeechTag]
  }
}

