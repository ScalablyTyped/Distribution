package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait F4vSettings extends js.Object {
  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  var MoovPlacement: js.UndefOr[F4vMoovPlacement] = js.undefined
}

object F4vSettings {
  @scala.inline
  def apply(MoovPlacement: F4vMoovPlacement = null): F4vSettings = {
    val __obj = js.Dynamic.literal()
    if (MoovPlacement != null) __obj.updateDynamic("MoovPlacement")(MoovPlacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[F4vSettings]
  }
}

