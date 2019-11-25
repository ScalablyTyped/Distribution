package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.LexSlotResolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalValue extends js.Object {
  var originalValue: String
  // The following line only works in TypeScript Version: 3.0, The array should have at least 1 and no more than 5 items
  // resolutions: [LexSlotResolution, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?];
  var resolutions: js.Array[LexSlotResolution]
}

object Anon_OriginalValue {
  @scala.inline
  def apply(originalValue: String, resolutions: js.Array[LexSlotResolution]): Anon_OriginalValue = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_OriginalValue]
  }
}

