package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJson extends js.Object {
  var exportAs: js.Array[AnonExportAs]
  var json: String
}

object AnonJson {
  @scala.inline
  def apply(exportAs: js.Array[AnonExportAs], json: String): AnonJson = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJson]
  }
}

