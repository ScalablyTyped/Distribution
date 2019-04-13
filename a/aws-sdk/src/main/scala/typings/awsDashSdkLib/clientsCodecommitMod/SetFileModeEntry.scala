package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetFileModeEntry extends js.Object {
  /**
    * The file mode for the file.
    */
  var fileMode: FileModeTypeEnum
  /**
    * The full path to the file, including the name of the file.
    */
  var filePath: Path
}

object SetFileModeEntry {
  @scala.inline
  def apply(fileMode: FileModeTypeEnum, filePath: Path): SetFileModeEntry = {
    val __obj = js.Dynamic.literal(fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath)
  
    __obj.asInstanceOf[SetFileModeEntry]
  }
}

