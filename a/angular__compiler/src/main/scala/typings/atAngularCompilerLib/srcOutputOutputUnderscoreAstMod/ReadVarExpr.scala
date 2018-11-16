package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ReadVarExpr")
@js.native
class ReadVarExpr protected () extends Expression {
  def this(name: BuiltinVar) = this()
  def this(name: java.lang.String) = this()
  def this(name: BuiltinVar, `type`: Type) = this()
  def this(name: java.lang.String, `type`: Type) = this()
  def this(name: BuiltinVar, `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: BuiltinVar, `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: Type, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var builtin: BuiltinVar | scala.Null = js.native
  var name: java.lang.String | scala.Null = js.native
  def set(value: Expression): WriteVarExpr = js.native
}

