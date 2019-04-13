package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSourceSettings extends js.Object {
  /**
    * Settings for ancillary captions source.
    */
  var AncillarySourceSettings: js.UndefOr[AncillarySourceSettings] = js.undefined
  /**
    * DVB Sub Source Settings
    */
  var DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings] = js.undefined
  /**
    * Settings for embedded captions Source
    */
  var EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings] = js.undefined
  /**
    * Settings for File-based Captions in Source
    */
  var FileSourceSettings: js.UndefOr[FileSourceSettings] = js.undefined
  /**
    * Use Source (SourceType) to identify the format of your input captions.  The service cannot auto-detect caption format.
    */
  var SourceType: js.UndefOr[CaptionSourceType] = js.undefined
  /**
    * Settings specific to Teletext caption sources, including Page number.
    */
  var TeletextSourceSettings: js.UndefOr[TeletextSourceSettings] = js.undefined
  /**
    * Settings specific to caption sources that are specfied by track number. Sources include IMSC in IMF.
    */
  var TrackSourceSettings: js.UndefOr[TrackSourceSettings] = js.undefined
}

object CaptionSourceSettings {
  @scala.inline
  def apply(
    AncillarySourceSettings: AncillarySourceSettings = null,
    DvbSubSourceSettings: DvbSubSourceSettings = null,
    EmbeddedSourceSettings: EmbeddedSourceSettings = null,
    FileSourceSettings: FileSourceSettings = null,
    SourceType: CaptionSourceType = null,
    TeletextSourceSettings: TeletextSourceSettings = null,
    TrackSourceSettings: TrackSourceSettings = null
  ): CaptionSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (AncillarySourceSettings != null) __obj.updateDynamic("AncillarySourceSettings")(AncillarySourceSettings)
    if (DvbSubSourceSettings != null) __obj.updateDynamic("DvbSubSourceSettings")(DvbSubSourceSettings)
    if (EmbeddedSourceSettings != null) __obj.updateDynamic("EmbeddedSourceSettings")(EmbeddedSourceSettings)
    if (FileSourceSettings != null) __obj.updateDynamic("FileSourceSettings")(FileSourceSettings)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (TeletextSourceSettings != null) __obj.updateDynamic("TeletextSourceSettings")(TeletextSourceSettings)
    if (TrackSourceSettings != null) __obj.updateDynamic("TrackSourceSettings")(TrackSourceSettings)
    __obj.asInstanceOf[CaptionSourceSettings]
  }
}

