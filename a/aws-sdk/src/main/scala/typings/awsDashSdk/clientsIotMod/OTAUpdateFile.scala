package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OTAUpdateFile extends js.Object {
  /**
    * A list of name/attribute pairs.
    */
  var attributes: js.UndefOr[AttributesMap] = js.native
  /**
    * The code signing method of the file.
    */
  var codeSigning: js.UndefOr[CodeSigning] = js.native
  /**
    * The location of the updated firmware.
    */
  var fileLocation: js.UndefOr[FileLocation] = js.native
  /**
    * The name of the file.
    */
  var fileName: js.UndefOr[FileName] = js.native
  /**
    * The file version.
    */
  var fileVersion: js.UndefOr[OTAUpdateFileVersion] = js.native
}

object OTAUpdateFile {
  @scala.inline
  def apply(
    attributes: AttributesMap = null,
    codeSigning: CodeSigning = null,
    fileLocation: FileLocation = null,
    fileName: FileName = null,
    fileVersion: OTAUpdateFileVersion = null
  ): OTAUpdateFile = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (codeSigning != null) __obj.updateDynamic("codeSigning")(codeSigning.asInstanceOf[js.Any])
    if (fileLocation != null) __obj.updateDynamic("fileLocation")(fileLocation.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (fileVersion != null) __obj.updateDynamic("fileVersion")(fileVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[OTAUpdateFile]
  }
}

