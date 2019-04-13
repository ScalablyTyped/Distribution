package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectDominantLanguageResponse extends js.Object {
  /**
    * The languages that Amazon Comprehend detected in the input text. For each language, the response returns the RFC 5646 language code and the level of confidence that Amazon Comprehend has in the accuracy of its inference. For more information about RFC 5646, see Tags for Identifying Languages on the IETF Tools web site.
    */
  var Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined
}

object DetectDominantLanguageResponse {
  @scala.inline
  def apply(Languages: ListOfDominantLanguages = null): DetectDominantLanguageResponse = {
    val __obj = js.Dynamic.literal()
    if (Languages != null) __obj.updateDynamic("Languages")(Languages)
    __obj.asInstanceOf[DetectDominantLanguageResponse]
  }
}

