package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/output/output_ast", "ExternalExpr")
@js.native
class ExternalExpr protected () extends Expression {
  def this(value: ExternalReference) = this()
  def this(value: ExternalReference, `type`: Type) = this()
  def this(value: ExternalReference, `type`: Type, typeParams: js.Array[Type]) = this()
  def this(value: ExternalReference, `type`: scala.Null, typeParams: js.Array[Type]) = this()
  def this(value: ExternalReference, `type`: Type, typeParams: js.Array[Type], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(value: ExternalReference, `type`: Type, typeParams: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(value: ExternalReference, `type`: scala.Null, typeParams: js.Array[Type], sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(value: ExternalReference, `type`: scala.Null, typeParams: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var typeParams: js.Array[Type] | scala.Null = js.native
  var value: ExternalReference = js.native
}

