package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutFileEntry extends js.Object {
  /**
    * The content of the file, if a source file is not specified.
    */
  var fileContent: js.UndefOr[FileContent] = js.undefined
  /**
    * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
  /**
    * The full path to the file in the repository, including the name of the file.
    */
  var filePath: Path
  /**
    * The name and full path of the file that contains the changes you want to make as part of the commit, if you are not providing the file content directly.
    */
  var sourceFile: js.UndefOr[SourceFileSpecifier] = js.undefined
}

object PutFileEntry {
  @scala.inline
  def apply(
    filePath: Path,
    fileContent: FileContent = null,
    fileMode: FileModeTypeEnum = null,
    sourceFile: SourceFileSpecifier = null
  ): PutFileEntry = {
    val __obj = js.Dynamic.literal(filePath = filePath)
    if (fileContent != null) __obj.updateDynamic("fileContent")(fileContent.asInstanceOf[js.Any])
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile)
    __obj.asInstanceOf[PutFileEntry]
  }
}

