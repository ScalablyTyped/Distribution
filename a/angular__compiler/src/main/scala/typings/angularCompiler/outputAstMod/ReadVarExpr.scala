package typings.angularCompiler.outputAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/output/output_ast", "ReadVarExpr")
@js.native
class ReadVarExpr protected () extends Expression {
  def this(name: String) = this()
  def this(name: BuiltinVar) = this()
  def this(name: String, `type`: Type) = this()
  def this(name: BuiltinVar, `type`: Type) = this()
  def this(name: String, `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(name: String, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(name: String, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  def this(name: BuiltinVar, `type`: js.UndefOr[scala.Nothing], sourceSpan: ParseSourceSpan) = this()
  def this(name: BuiltinVar, `type`: Null, sourceSpan: ParseSourceSpan) = this()
  def this(name: BuiltinVar, `type`: Type, sourceSpan: ParseSourceSpan) = this()
  
  var builtin: BuiltinVar | Null = js.native
  
  var name: String | Null = js.native
  
  def set(value: Expression): WriteVarExpr = js.native
}
