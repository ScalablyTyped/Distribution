package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailSettings extends js.Object {
  var Scte35SpliceInsert: js.UndefOr[Scte35SpliceInsert] = js.undefined
  var Scte35TimeSignalApos: js.UndefOr[Scte35TimeSignalApos] = js.undefined
}

object AvailSettings {
  @scala.inline
  def apply(Scte35SpliceInsert: Scte35SpliceInsert = null, Scte35TimeSignalApos: Scte35TimeSignalApos = null): AvailSettings = {
    val __obj = js.Dynamic.literal()
    if (Scte35SpliceInsert != null) __obj.updateDynamic("Scte35SpliceInsert")(Scte35SpliceInsert)
    if (Scte35TimeSignalApos != null) __obj.updateDynamic("Scte35TimeSignalApos")(Scte35TimeSignalApos)
    __obj.asInstanceOf[AvailSettings]
  }
}

