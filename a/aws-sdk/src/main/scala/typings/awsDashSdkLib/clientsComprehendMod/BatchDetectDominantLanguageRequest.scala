package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetectDominantLanguageRequest extends js.Object {
  /**
    * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document should contain at least 20 characters and must contain fewer than 5,000 bytes of UTF-8 encoded characters.
    */
  var TextList: StringList
}

object BatchDetectDominantLanguageRequest {
  @scala.inline
  def apply(TextList: StringList): BatchDetectDominantLanguageRequest = {
    val __obj = js.Dynamic.literal(TextList = TextList)
  
    __obj.asInstanceOf[BatchDetectDominantLanguageRequest]
  }
}

