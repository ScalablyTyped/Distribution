package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetectEntitiesRequest extends js.Object {
  /**
    * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend: German ("de"), English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or Portuguese ("pt"). All documents must be in the same language.
    */
  var LanguageCode: awsDashSdkLib.clientsComprehendMod.LanguageCode
  /**
    * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document must contain fewer than 5,000 bytes of UTF-8 encoded characters.
    */
  var TextList: StringList
}

object BatchDetectEntitiesRequest {
  @scala.inline
  def apply(LanguageCode: LanguageCode, TextList: StringList): BatchDetectEntitiesRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], TextList = TextList)
  
    __obj.asInstanceOf[BatchDetectEntitiesRequest]
  }
}

