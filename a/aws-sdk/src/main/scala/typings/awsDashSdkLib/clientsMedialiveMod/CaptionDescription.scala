package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionDescription extends js.Object {
  /**
    * Specifies which input caption selector to use as a caption source when generating output captions. This field should match a captionSelector name.
    */
  var CaptionSelectorName: __string
  /**
    * Additional settings for captions destination that depend on the destination type.
    */
  var DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined
  /**
    * ISO 639-2 three-digit code: http://www.loc.gov/standards/iso639-2/
    */
  var LanguageCode: js.UndefOr[__string] = js.undefined
  /**
    * Human readable information to indicate captions available for players (eg. English, or Spanish).
    */
  var LanguageDescription: js.UndefOr[__string] = js.undefined
  /**
    * Name of the caption description.  Used to associate a caption description with an output.  Names must be unique within an event.
    */
  var Name: __string
}

object CaptionDescription {
  @scala.inline
  def apply(
    CaptionSelectorName: __string,
    Name: __string,
    DestinationSettings: CaptionDestinationSettings = null,
    LanguageCode: __string = null,
    LanguageDescription: __string = null
  ): CaptionDescription = {
    val __obj = js.Dynamic.literal(CaptionSelectorName = CaptionSelectorName, Name = Name)
    if (DestinationSettings != null) __obj.updateDynamic("DestinationSettings")(DestinationSettings)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode)
    if (LanguageDescription != null) __obj.updateDynamic("LanguageDescription")(LanguageDescription)
    __obj.asInstanceOf[CaptionDescription]
  }
}

