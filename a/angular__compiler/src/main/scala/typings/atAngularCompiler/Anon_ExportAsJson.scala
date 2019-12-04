package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExportAsJson extends js.Object {
  var exportAs: js.Array[Anon_ExportAs]
  var json: String
}

object Anon_ExportAsJson {
  @scala.inline
  def apply(exportAs: js.Array[Anon_ExportAs], json: String): Anon_ExportAsJson = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ExportAsJson]
  }
}

