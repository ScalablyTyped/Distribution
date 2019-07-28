package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OTAUpdateFile extends js.Object {
  /**
    * A list of name/attribute pairs.
    */
  var attributes: js.UndefOr[AttributesMap] = js.undefined
  /**
    * The code signing method of the file.
    */
  var codeSigning: js.UndefOr[CodeSigning] = js.undefined
  /**
    * The location of the updated firmware.
    */
  var fileLocation: js.UndefOr[FileLocation] = js.undefined
  /**
    * The name of the file.
    */
  var fileName: js.UndefOr[FileName] = js.undefined
  /**
    * The file version.
    */
  var fileVersion: js.UndefOr[OTAUpdateFileVersion] = js.undefined
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
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (codeSigning != null) __obj.updateDynamic("codeSigning")(codeSigning)
    if (fileLocation != null) __obj.updateDynamic("fileLocation")(fileLocation)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (fileVersion != null) __obj.updateDynamic("fileVersion")(fileVersion)
    __obj.asInstanceOf[OTAUpdateFile]
  }
}

