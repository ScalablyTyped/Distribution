package typings.angularCompiler.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "ReadPropExpr")
@js.native
class ReadPropExpr protected ()
  extends typings.angularCompiler.outputAstMod.ReadPropExpr {
  def this(receiver: typings.angularCompiler.outputAstMod.Expression, name: String) = this()
  def this(
    receiver: typings.angularCompiler.outputAstMod.Expression,
    name: String,
    `type`: typings.angularCompiler.outputAstMod.Type
  ) = this()
  def this(
    receiver: typings.angularCompiler.outputAstMod.Expression,
    name: String,
    `type`: js.UndefOr[scala.Nothing],
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    receiver: typings.angularCompiler.outputAstMod.Expression,
    name: String,
    `type`: Null,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
  def this(
    receiver: typings.angularCompiler.outputAstMod.Expression,
    name: String,
    `type`: typings.angularCompiler.outputAstMod.Type,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

