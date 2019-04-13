package typings
package awsDashSdkLib.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectEntitiesRequest extends js.Object {
  /**
    *  A UTF-8 text string containing the clinical content being examined for entities. Each string must contain fewer than 20,000 bytes of characters.
    */
  var Text: BoundedLengthString
}

object DetectEntitiesRequest {
  @scala.inline
  def apply(Text: BoundedLengthString): DetectEntitiesRequest = {
    val __obj = js.Dynamic.literal(Text = Text)
  
    __obj.asInstanceOf[DetectEntitiesRequest]
  }
}

