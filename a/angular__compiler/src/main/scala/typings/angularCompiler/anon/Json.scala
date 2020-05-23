package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Json extends js.Object {
  var exportAs: js.Array[ExportAs]
  var json: String
}

object Json {
  @scala.inline
  def apply(exportAs: js.Array[ExportAs], json: String): Json = {
    val __obj = js.Dynamic.literal(exportAs = exportAs.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[Json]
  }
}

