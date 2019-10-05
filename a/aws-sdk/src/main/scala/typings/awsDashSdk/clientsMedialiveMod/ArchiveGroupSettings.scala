package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveGroupSettings extends js.Object {
  /**
    * A directory and base filename where archive files should be written.
    */
  var Destination: OutputLocationRef
  /**
    * Number of seconds to write to archive file before closing and starting a new one.
    */
  var RolloverInterval: js.UndefOr[__integerMin1] = js.undefined
}

object ArchiveGroupSettings {
  @scala.inline
  def apply(Destination: OutputLocationRef, RolloverInterval: Int | Double = null): ArchiveGroupSettings = {
    val __obj = js.Dynamic.literal(Destination = Destination)
    if (RolloverInterval != null) __obj.updateDynamic("RolloverInterval")(RolloverInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveGroupSettings]
  }
}

