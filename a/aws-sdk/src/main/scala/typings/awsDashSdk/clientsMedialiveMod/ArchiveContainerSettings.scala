package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveContainerSettings extends js.Object {
  var M2tsSettings: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.M2tsSettings] = js.undefined
}

object ArchiveContainerSettings {
  @scala.inline
  def apply(M2tsSettings: M2tsSettings = null): ArchiveContainerSettings = {
    val __obj = js.Dynamic.literal()
    if (M2tsSettings != null) __obj.updateDynamic("M2tsSettings")(M2tsSettings)
    __obj.asInstanceOf[ArchiveContainerSettings]
  }
}

