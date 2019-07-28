package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashPackage extends js.Object {
  /**
    * A list of DASH manifest configurations.
    */
  var DashManifests: __listOfDashManifest
  var Encryption: js.UndefOr[DashEncryption] = js.undefined
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
}

object DashPackage {
  @scala.inline
  def apply(
    DashManifests: __listOfDashManifest,
    Encryption: DashEncryption = null,
    SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
  ): DashPackage = {
    val __obj = js.Dynamic.literal(DashManifests = DashManifests)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (!js.isUndefined(SegmentDurationSeconds)) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds)
    __obj.asInstanceOf[DashPackage]
  }
}

