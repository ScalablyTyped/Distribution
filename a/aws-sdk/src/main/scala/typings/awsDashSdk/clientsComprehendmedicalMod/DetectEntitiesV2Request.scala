package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectEntitiesV2Request extends js.Object {
  /**
    * A UTF-8 string containing the clinical content being examined for entities. Each string must contain fewer than 20,000 bytes of characters.
    */
  var Text: BoundedLengthString
}

object DetectEntitiesV2Request {
  @scala.inline
  def apply(Text: BoundedLengthString): DetectEntitiesV2Request = {
    val __obj = js.Dynamic.literal(Text = Text)
  
    __obj.asInstanceOf[DetectEntitiesV2Request]
  }
}

