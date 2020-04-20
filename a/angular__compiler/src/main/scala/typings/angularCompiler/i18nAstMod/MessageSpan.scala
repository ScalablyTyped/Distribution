package typings.angularCompiler.i18nAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageSpan extends js.Object {
  var endCol: Double
  var endLine: Double
  var filePath: String
  var startCol: Double
  var startLine: Double
}

object MessageSpan {
  @scala.inline
  def apply(endCol: Double, endLine: Double, filePath: String, startCol: Double, startLine: Double): MessageSpan = {
    val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSpan]
  }
}

