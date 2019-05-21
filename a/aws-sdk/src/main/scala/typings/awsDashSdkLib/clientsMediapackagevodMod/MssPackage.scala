package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MssPackage extends js.Object {
  var Encryption: js.UndefOr[MssEncryption] = js.undefined
  /**
    * A list of MSS manifest configurations.
    */
  var MssManifests: __listOfMssManifest
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
}

object MssPackage {
  @scala.inline
  def apply(
    MssManifests: __listOfMssManifest,
    Encryption: MssEncryption = null,
    SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
  ): MssPackage = {
    val __obj = js.Dynamic.literal(MssManifests = MssManifests)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (!js.isUndefined(SegmentDurationSeconds)) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds)
    __obj.asInstanceOf[MssPackage]
  }
}

