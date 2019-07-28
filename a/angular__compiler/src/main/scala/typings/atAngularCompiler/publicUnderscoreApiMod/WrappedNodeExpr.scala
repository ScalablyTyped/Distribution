package typings.atAngularCompiler.publicUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "WrappedNodeExpr")
@js.native
class WrappedNodeExpr[T] protected ()
  extends typings.atAngularCompiler.srcCompilerMod.WrappedNodeExpr[T] {
  def this(node: T) = this()
  def this(node: T, `type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type) = this()
  def this(
    node: T,
    `type`: Null,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
  def this(
    node: T,
    `type`: typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Type,
    sourceSpan: typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
  ) = this()
}

