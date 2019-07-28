package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ReadVarExpr")
@js.native
class ReadVarExpr protected () extends Expression {
  def this(name: String) = this()
  def this(name: BuiltinVar) = this()
  def this(name: String, `type`: Type) = this()
  def this(name: BuiltinVar, `type`: Type) = this()
  def this(name: String, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(name: BuiltinVar, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(name: BuiltinVar, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  var builtin: BuiltinVar | Null = js.native
  var name: String | Null = js.native
  def set(value: Expression): WriteVarExpr = js.native
}

