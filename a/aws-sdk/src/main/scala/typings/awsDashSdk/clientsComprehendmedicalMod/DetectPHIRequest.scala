package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectPHIRequest extends js.Object {
  /**
    *  A UTF-8 text string containing the clinical content being examined for PHI entities. Each string must contain fewer than 20,000 bytes of characters. 
    */
  var Text: BoundedLengthString
}

object DetectPHIRequest {
  @scala.inline
  def apply(Text: BoundedLengthString): DetectPHIRequest = {
    val __obj = js.Dynamic.literal(Text = Text)
  
    __obj.asInstanceOf[DetectPHIRequest]
  }
}

