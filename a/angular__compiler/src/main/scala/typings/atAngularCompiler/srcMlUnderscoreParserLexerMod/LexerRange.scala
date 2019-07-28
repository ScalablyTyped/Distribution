package typings.atAngularCompiler.srcMlUnderscoreParserLexerMod

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
    val __obj = js.Dynamic.literal(endPos = endPos, startCol = startCol, startLine = startLine, startPos = startPos)
  
    __obj.asInstanceOf[LexerRange]
  }
}

