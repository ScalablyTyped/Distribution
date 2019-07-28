package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerSettings extends js.Object {
  /**
    * Container for this output. Some containers require a container settings object. If not specified, the default object will be created.
    */
  var Container: js.UndefOr[ContainerType] = js.undefined
  /**
    * Settings for F4v container
    */
  var F4vSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.F4vSettings] = js.undefined
  /**
    * MPEG-2 TS container settings. These apply to outputs in a File output group when the output's container (ContainerType) is MPEG-2 Transport Stream (M2TS). In these assets, data is organized by the program map table (PMT). Each transport stream program contains subsets of data, including audio, video, and metadata. Each of these subsets of data has a numerical label called a packet identifier (PID). Each transport stream program corresponds to one MediaConvert output. The PMT lists the types of data in a program along with their PID. Downstream systems and players use the program map table to look up the PID for each type of data it accesses and then uses the PIDs to locate specific data within the asset.
    */
  var M2tsSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.M2tsSettings] = js.undefined
  /**
    * Settings for TS segments in HLS
    */
  var M3u8Settings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.M3u8Settings] = js.undefined
  /**
    * Settings for MOV Container.
    */
  var MovSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.MovSettings] = js.undefined
  /**
    * Settings for MP4 container. You can create audio-only AAC outputs with this container.
    */
  var Mp4Settings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Mp4Settings] = js.undefined
}

object ContainerSettings {
  @scala.inline
  def apply(
    Container: ContainerType = null,
    F4vSettings: F4vSettings = null,
    M2tsSettings: M2tsSettings = null,
    M3u8Settings: M3u8Settings = null,
    MovSettings: MovSettings = null,
    Mp4Settings: Mp4Settings = null
  ): ContainerSettings = {
    val __obj = js.Dynamic.literal()
    if (Container != null) __obj.updateDynamic("Container")(Container.asInstanceOf[js.Any])
    if (F4vSettings != null) __obj.updateDynamic("F4vSettings")(F4vSettings)
    if (M2tsSettings != null) __obj.updateDynamic("M2tsSettings")(M2tsSettings)
    if (M3u8Settings != null) __obj.updateDynamic("M3u8Settings")(M3u8Settings)
    if (MovSettings != null) __obj.updateDynamic("MovSettings")(MovSettings)
    if (Mp4Settings != null) __obj.updateDynamic("Mp4Settings")(Mp4Settings)
    __obj.asInstanceOf[ContainerSettings]
  }
}

