package typings.angularCompiler.mlParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexerRange extends js.Object {
  var endPos: Double
  var startCol: Double
  var startLine: Double
  var startPos: Double
}

object LexerRange {
  @scala.inline
  def apply(endPos: Double, startCol: Double, startLine: Double, startPos: Double): LexerRange = {
    val __obj = js.Dynamic.literal(endPos = endPos.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any], startPos = startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexerRange]
  }
}

