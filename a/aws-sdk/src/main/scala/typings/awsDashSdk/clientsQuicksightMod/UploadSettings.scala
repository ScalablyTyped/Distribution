package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSettings extends js.Object {
  /**
    * Whether the file has a header row, or the files each have a header row.
    */
  var ContainsHeader: js.UndefOr[Boolean] = js.native
  /**
    * The delimiter between values in the file.
    */
  var Delimiter: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Delimiter] = js.native
  /**
    * File format.
    */
  var Format: js.UndefOr[FileFormat] = js.native
  /**
    * A row number to start reading data from.
    */
  var StartFromRow: js.UndefOr[PositiveInteger] = js.native
  /**
    * Text qualifier.
    */
  var TextQualifier: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.TextQualifier] = js.native
}

object UploadSettings {
  @scala.inline
  def apply(
    ContainsHeader: js.UndefOr[scala.Boolean] = js.undefined,
    Delimiter: Delimiter = null,
    Format: FileFormat = null,
    StartFromRow: Int | scala.Double = null,
    TextQualifier: TextQualifier = null
  ): UploadSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ContainsHeader)) __obj.updateDynamic("ContainsHeader")(ContainsHeader.asInstanceOf[js.Any])
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (StartFromRow != null) __obj.updateDynamic("StartFromRow")(StartFromRow.asInstanceOf[js.Any])
    if (TextQualifier != null) __obj.updateDynamic("TextQualifier")(TextQualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadSettings]
  }
}

