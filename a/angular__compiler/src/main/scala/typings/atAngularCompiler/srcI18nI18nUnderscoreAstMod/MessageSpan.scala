package typings.atAngularCompiler.srcI18nI18nUnderscoreAstMod

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
    val __obj = js.Dynamic.literal(endCol = endCol, endLine = endLine, filePath = filePath, startCol = startCol, startLine = startLine)
  
    __obj.asInstanceOf[MessageSpan]
  }
}

