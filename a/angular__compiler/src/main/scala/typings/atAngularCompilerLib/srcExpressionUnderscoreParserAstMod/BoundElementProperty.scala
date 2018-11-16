package typings
package atAngularCompilerLib.srcExpressionUnderscoreParserAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "BoundElementProperty")
@js.native
class BoundElementProperty protected () extends js.Object {
  def this(name: java.lang.String, `type`: BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: AST, unit: java.lang.String, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  def this(name: java.lang.String, `type`: BindingType, securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext, value: AST, unit: scala.Null, sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan) = this()
  var name: java.lang.String = js.native
  var securityContext: atAngularCompilerLib.srcCoreMod.SecurityContext = js.native
  var sourceSpan: atAngularCompilerLib.srcParseUnderscoreUtilMod.ParseSourceSpan = js.native
  var `type`: BindingType = js.native
  var unit: java.lang.String | scala.Null = js.native
  var value: AST = js.native
}

