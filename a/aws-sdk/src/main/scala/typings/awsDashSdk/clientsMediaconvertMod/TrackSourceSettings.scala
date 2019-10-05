package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackSourceSettings extends js.Object {
  /**
    * Use this setting to select a single captions track from a source. Track numbers correspond to the order in the captions source file. For IMF sources, track numbering is based on the order that the captions appear in the CPL. For example, use 1 to select the captions asset that is listed first in the CPL. To include more than one captions track in your job outputs, create multiple input captions selectors. Specify one track per selector.
    */
  var TrackNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined
}

object TrackSourceSettings {
  @scala.inline
  def apply(TrackNumber: Int | Double = null): TrackSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (TrackNumber != null) __obj.updateDynamic("TrackNumber")(TrackNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackSourceSettings]
  }
}

