package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "Expression")
@js.native
abstract class Expression ()
  extends typings.angularCompiler.srcCompilerMod.Expression {
  def this(`type`: typings.angularCompiler.outputAstMod.Type) = this()
  def this(
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(`type`: Null, sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan) = this()
  def this(
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

