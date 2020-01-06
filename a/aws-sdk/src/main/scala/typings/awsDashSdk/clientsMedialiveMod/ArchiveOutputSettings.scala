package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveOutputSettings extends js.Object {
  /**
    * Settings specific to the container type of the file.
    */
  var ContainerSettings: ArchiveContainerSettings = js.native
  /**
    * Output file extension. If excluded, this will be auto-selected from the container type.
    */
  var Extension: js.UndefOr[__string] = js.native
  /**
    * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
    */
  var NameModifier: js.UndefOr[__string] = js.native
}

object ArchiveOutputSettings {
  @scala.inline
  def apply(
    ContainerSettings: ArchiveContainerSettings,
    Extension: __string = null,
    NameModifier: __string = null
  ): ArchiveOutputSettings = {
    val __obj = js.Dynamic.literal(ContainerSettings = ContainerSettings.asInstanceOf[js.Any])
    if (Extension != null) __obj.updateDynamic("Extension")(Extension.asInstanceOf[js.Any])
    if (NameModifier != null) __obj.updateDynamic("NameModifier")(NameModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveOutputSettings]
  }
}

