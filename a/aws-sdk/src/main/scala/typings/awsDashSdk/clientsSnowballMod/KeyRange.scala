package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyRange extends js.Object {
  /**
    * The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
    */
  var BeginMarker: js.UndefOr[String] = js.native
  /**
    * The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
    */
  var EndMarker: js.UndefOr[String] = js.native
}

object KeyRange {
  @scala.inline
  def apply(BeginMarker: String = null, EndMarker: String = null): KeyRange = {
    val __obj = js.Dynamic.literal()
    if (BeginMarker != null) __obj.updateDynamic("BeginMarker")(BeginMarker.asInstanceOf[js.Any])
    if (EndMarker != null) __obj.updateDynamic("EndMarker")(EndMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyRange]
  }
}

