package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OriginalValue extends js.Object {
  var originalValue: java.lang.String
  // The following line only works in TypeScript Version: 3.0, The array should have at least 1 and no more than 5 items
  // resolutions: [LexSlotResolution, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?];
  var resolutions: js.Array[awsDashLambdaLib.awsDashLambdaMod.LexSlotResolution]
}

object Anon_OriginalValue {
  @scala.inline
  def apply(
    originalValue: java.lang.String,
    resolutions: js.Array[awsDashLambdaLib.awsDashLambdaMod.LexSlotResolution]
  ): Anon_OriginalValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("originalValue")(originalValue)
    __obj.updateDynamic("resolutions")(resolutions)
    __obj.asInstanceOf[Anon_OriginalValue]
  }
}

