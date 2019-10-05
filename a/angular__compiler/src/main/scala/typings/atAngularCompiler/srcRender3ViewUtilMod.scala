package typings.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.atAngularCompilerStrings.DOLLARimplicit
import typings.atAngularCompiler.atAngularCompilerStrings._r
import typings.atAngularCompiler.atAngularCompilerStrings._t
import typings.atAngularCompiler.atAngularCompilerStrings.ctx
import typings.atAngularCompiler.atAngularCompilerStrings.ngNonBindable
import typings.atAngularCompiler.atAngularCompilerStrings.rf
import typings.atAngularCompiler.srcConstantUnderscorePoolMod.ConstantPool
import typings.atAngularCompiler.srcExpressionUnderscoreParserAstMod.Interpolation
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ExternalReference
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.LiteralMapExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.ReadVarExpr
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import typings.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Element
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Node
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Template
import typings.atAngularCompiler.srcRender3R3UnderscoreAstMod.Visitor
import typings.atAngularCompiler.srcRender3ViewApiMod.R3QueryMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/view/util", JSImport.Namespace)
@js.native
object srcRender3ViewUtilMod extends js.Object {
  @js.native
  class DefinitionMap () extends js.Object {
    var values: js.Array[Anon_Key] = js.native
    def set(key: String): Unit = js.native
    def set(key: String, value: Expression): Unit = js.native
    def toLiteralMap(): LiteralMapExpr = js.native
  }
  
  val CONTEXT_NAME: ctx = js.native
  val IMPLICIT_REFERENCE: DOLLARimplicit = js.native
  val NON_BINDABLE_ATTR: ngNonBindable = js.native
  val REFERENCE_PREFIX: _r = js.native
  val RENDER_FLAGS: rf = js.native
  val TEMPORARY_NAME: _t = js.native
  def asLiteral(value: js.Any): Expression = js.native
  def chainedInstruction(reference: ExternalReference, calls: js.Array[js.Array[Expression]]): Expression = js.native
  def chainedInstruction(reference: ExternalReference, calls: js.Array[js.Array[Expression]], span: ParseSourceSpan): Expression = js.native
  def conditionallyCreateMapObjectLiteral(keys: StringDictionary[String | js.Array[String]]): Expression | Null = js.native
  def conditionallyCreateMapObjectLiteral(keys: StringDictionary[String | js.Array[String]], keepDeclared: Boolean): Expression | Null = js.native
  def getAttrsForDirectiveMatching(elOrTpl: Element): StringDictionary[String] = js.native
  def getAttrsForDirectiveMatching(elOrTpl: Template): StringDictionary[String] = js.native
  def getInterpolationArgsLength(interpolation: Interpolation): Double = js.native
  def getQueryPredicate(query: R3QueryMetadata, constantPool: ConstantPool): Expression = js.native
  def invalid[T](`this`: Visitor[_], arg: Expression): scala.Nothing = js.native
  def invalid[T](`this`: Visitor[_], arg: Statement): scala.Nothing = js.native
  def invalid[T](`this`: Visitor[_], arg: Node): scala.Nothing = js.native
  def noop(): Unit = js.native
  def temporaryAllocator(statements: js.Array[Statement], name: String): js.Function0[ReadVarExpr] = js.native
  def trimTrailingNulls(parameters: js.Array[Expression]): js.Array[Expression] = js.native
  def unsupported(`this`: js.Function, feature: String): scala.Nothing = js.native
  def unsupported(`this`: Unit, feature: String): scala.Nothing = js.native
}

