package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DominantLanguage extends js.Object {
  /**
    * The RFC 5646 language code for the dominant language. For more information about RFC 5646, see Tags for Identifying Languages on the IETF Tools web site.
    */
  var LanguageCode: js.UndefOr[String] = js.undefined
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.undefined
}

object DominantLanguage {
  @scala.inline
  def apply(LanguageCode: String = null, Score: js.UndefOr[Float] = js.undefined): DominantLanguage = {
    val __obj = js.Dynamic.literal()
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode)
    if (!js.isUndefined(Score)) __obj.updateDynamic("Score")(Score)
    __obj.asInstanceOf[DominantLanguage]
  }
}

