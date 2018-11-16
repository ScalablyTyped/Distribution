package typings
package atAngularCompilerLib.srcRender3R3UnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Node extends js.Object {
  var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan
  def visit[Result](visitor: Visitor[Result]): Result
}

