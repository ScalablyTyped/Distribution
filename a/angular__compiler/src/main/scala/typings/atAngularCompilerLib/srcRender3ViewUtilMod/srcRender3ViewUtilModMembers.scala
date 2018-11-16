package typings
package atAngularCompilerLib.srcRender3ViewUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/util", JSImport.Namespace)
@js.native
object srcRender3ViewUtilModMembers extends js.Object {
  val CONTEXT_NAME: /* ctx */ java.lang.String = js.native
  val IMPLICIT_REFERENCE: /* $implicit */ java.lang.String = js.native
  val NON_BINDABLE_ATTR: /* ngNonBindable */ java.lang.String = js.native
  val REFERENCE_PREFIX: /* _r */ java.lang.String = js.native
  val RENDER_FLAGS: /* rf */ java.lang.String = js.native
  val TEMPORARY_NAME: /* _t */ java.lang.String = js.native
  def asLiteral(value: js.Any): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def conditionallyCreateMapObjectLiteral(
    keys: ScalablyTyped.runtime.StringDictionary[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])]
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null = js.native
  def getAttrsForDirectiveMatching(elOrTpl: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Element): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def getAttrsForDirectiveMatching(elOrTpl: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Template): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def getQueryPredicate(
    query: atAngularCompilerLib.srcRender3ViewApiMod.R3QueryMetadata,
    constantPool: atAngularCompilerLib.srcConstantUnderscorePoolMod.ConstantPool
  ): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def invalid[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression): scala.Nothing = js.native
  def invalid[T](arg: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement): scala.Nothing = js.native
  def invalid[T](arg: atAngularCompilerLib.srcRender3R3UnderscoreAstMod.Node): scala.Nothing = js.native
  def mapToExpression(map: ScalablyTyped.runtime.StringDictionary[js.Any]): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def mapToExpression(map: ScalablyTyped.runtime.StringDictionary[js.Any], quoted: scala.Boolean): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = js.native
  def noop(): scala.Unit = js.native
  def temporaryAllocator(
    statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    name: java.lang.String
  ): js.Function0[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.ReadVarExpr] = js.native
  def trimTrailingNulls(parameters: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression]): js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression] = js.native
  def unsupported(feature: java.lang.String): scala.Nothing = js.native
}

