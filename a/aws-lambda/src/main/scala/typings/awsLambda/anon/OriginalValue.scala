package typings.awsLambda.anon

import typings.awsLambda.lexMod.LexSlotResolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalValue extends js.Object {
  var originalValue: String
  // The following line only works in TypeScript Version: 3.0, The array should have at least 1 and no more than 5 items
  // resolutions: [LexSlotResolution, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?];
  var resolutions: js.Array[LexSlotResolution]
}

object OriginalValue {
  @scala.inline
  def apply(originalValue: String, resolutions: js.Array[LexSlotResolution]): OriginalValue = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalValue]
  }
}

