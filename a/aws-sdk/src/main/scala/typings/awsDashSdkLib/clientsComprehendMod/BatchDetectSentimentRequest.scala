package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetectSentimentRequest extends js.Object {
  /**
    * The language of the input documents. You can specify English ("en") or Spanish ("es"). All documents must be in the same language.
    */
  var LanguageCode: awsDashSdkLib.clientsComprehendMod.LanguageCode
  /**
    * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var TextList: StringList
}

object BatchDetectSentimentRequest {
  @scala.inline
  def apply(LanguageCode: LanguageCode, TextList: StringList): BatchDetectSentimentRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], TextList = TextList)
  
    __obj.asInstanceOf[BatchDetectSentimentRequest]
  }
}

