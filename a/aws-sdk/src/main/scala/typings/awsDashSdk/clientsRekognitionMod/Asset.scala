package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asset extends js.Object {
  var GroundTruthManifest: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.GroundTruthManifest] = js.native
}

object Asset {
  @scala.inline
  def apply(GroundTruthManifest: GroundTruthManifest = null): Asset = {
    val __obj = js.Dynamic.literal()
    if (GroundTruthManifest != null) __obj.updateDynamic("GroundTruthManifest")(GroundTruthManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
}

