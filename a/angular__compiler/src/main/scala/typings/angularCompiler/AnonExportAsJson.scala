package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExportAsJson extends js.Object {
  var exportAs: js.Array[AnonExportAs]
  var json: String
}

object AnonExportAsJson {
  @scala.inline
  def apply(exportAs: js.Array[AnonExportAs], json: String): AnonExportAsJson = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExportAsJson]
  }
}

