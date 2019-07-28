package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileEntry extends js.Object {
  /**
    * The full path of the file that will be deleted, including the name of the file.
    */
  var filePath: Path
}

object DeleteFileEntry {
  @scala.inline
  def apply(filePath: Path): DeleteFileEntry = {
    val __obj = js.Dynamic.literal(filePath = filePath)
  
    __obj.asInstanceOf[DeleteFileEntry]
  }
}

