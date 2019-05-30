package typings
package atAngularCompilerLib.srcMlUnderscoreParserLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexerRange extends js.Object {
  var endPos: scala.Double
  var startCol: scala.Double
  var startLine: scala.Double
  var startPos: scala.Double
}

object LexerRange {
  @scala.inline
  def apply(endPos: scala.Double, startCol: scala.Double, startLine: scala.Double, startPos: scala.Double): LexerRange = {
    val __obj = js.Dynamic.literal(endPos = endPos, startCol = startCol, startLine = startLine, startPos = startPos)
  
    __obj.asInstanceOf[LexerRange]
  }
}

