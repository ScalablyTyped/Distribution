package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgeRange extends js.Object {
  /**
    * The highest estimated age.
    */
  var High: js.UndefOr[UInteger] = js.native
  /**
    * The lowest estimated age.
    */
  var Low: js.UndefOr[UInteger] = js.native
}

object AgeRange {
  @scala.inline
  def apply(High: Int | Double = null, Low: Int | Double = null): AgeRange = {
    val __obj = js.Dynamic.literal()
    if (High != null) __obj.updateDynamic("High")(High.asInstanceOf[js.Any])
    if (Low != null) __obj.updateDynamic("Low")(Low.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgeRange]
  }
}

