package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailSettings extends js.Object {
  var Scte35SpliceInsert: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Scte35SpliceInsert] = js.native
  var Scte35TimeSignalApos: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Scte35TimeSignalApos] = js.native
}

object AvailSettings {
  @scala.inline
  def apply(Scte35SpliceInsert: Scte35SpliceInsert = null, Scte35TimeSignalApos: Scte35TimeSignalApos = null): AvailSettings = {
    val __obj = js.Dynamic.literal()
    if (Scte35SpliceInsert != null) __obj.updateDynamic("Scte35SpliceInsert")(Scte35SpliceInsert.asInstanceOf[js.Any])
    if (Scte35TimeSignalApos != null) __obj.updateDynamic("Scte35TimeSignalApos")(Scte35TimeSignalApos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailSettings]
  }
}

