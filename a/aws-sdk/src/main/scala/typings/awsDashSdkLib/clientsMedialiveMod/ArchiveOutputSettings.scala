package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveOutputSettings extends js.Object {
  /**
    * Settings specific to the container type of the file.
    */
  var ContainerSettings: ArchiveContainerSettings
  /**
    * Output file extension. If excluded, this will be auto-selected from the container type.
    */
  var Extension: js.UndefOr[__string] = js.undefined
  /**
    * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
    */
  var NameModifier: js.UndefOr[__string] = js.undefined
}

object ArchiveOutputSettings {
  @scala.inline
  def apply(
    ContainerSettings: ArchiveContainerSettings,
    Extension: __string = null,
    NameModifier: __string = null
  ): ArchiveOutputSettings = {
    val __obj = js.Dynamic.literal(ContainerSettings = ContainerSettings)
    if (Extension != null) __obj.updateDynamic("Extension")(Extension)
    if (NameModifier != null) __obj.updateDynamic("NameModifier")(NameModifier)
    __obj.asInstanceOf[ArchiveOutputSettings]
  }
}

