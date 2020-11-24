package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.Key
import typings.angularCompiler.apiMod.R3QueryMetadata
import typings.angularCompiler.astMod.Interpolation
import typings.angularCompiler.constantPoolMod.ConstantPool
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.outputAstMod.LiteralMapExpr
import typings.angularCompiler.outputAstMod.ReadVarExpr
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.r3AstMod.Element
import typings.angularCompiler.r3AstMod.Node
import typings.angularCompiler.r3AstMod.Template
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/view/util", JSImport.Namespace)
@js.native
object viewUtilMod extends js.Object {
  
  val CONTEXT_NAME: /* "ctx" */ String = js.native
  
  val IMPLICIT_REFERENCE: /* "$implicit" */ String = js.native
  
  val NON_BINDABLE_ATTR: /* "ngNonBindable" */ String = js.native
  
  val REFERENCE_PREFIX: /* "_r" */ String = js.native
  
  val RENDER_FLAGS: /* "rf" */ String = js.native
  
  val TEMPORARY_NAME: /* "_t" */ String = js.native
  
  def asLiteral(value: js.Any): Expression = js.native
  
  def chainedInstruction(reference: ExternalReference, calls: js.Array[js.Array[Expression]]): Expression = js.native
  def chainedInstruction(reference: ExternalReference, calls: js.Array[js.Array[Expression]], span: ParseSourceSpan): Expression = js.native
  
  def conditionallyCreateMapObjectLiteral(keys: StringDictionary[String | js.Array[String]]): Expression | Null = js.native
  def conditionallyCreateMapObjectLiteral(keys: StringDictionary[String | js.Array[String]], keepDeclared: Boolean): Expression | Null = js.native
  
  def getAttrsForDirectiveMatching(elOrTpl: Element): StringDictionary[String] = js.native
  def getAttrsForDirectiveMatching(elOrTpl: Template): StringDictionary[String] = js.native
  
  def getInterpolationArgsLength(interpolation: Interpolation): Double = js.native
  
  def getQueryPredicate(query: R3QueryMetadata, constantPool: ConstantPool): Expression = js.native
  
  def invalid[T](arg: Expression): scala.Nothing = js.native
  def invalid[T](arg: Statement): scala.Nothing = js.native
  def invalid[T](arg: Node): scala.Nothing = js.native
  
  def noop(): Unit = js.native
  
  def temporaryAllocator(statements: js.Array[Statement], name: String): js.Function0[ReadVarExpr] = js.native
  
  def trimTrailingNulls(parameters: js.Array[Expression]): js.Array[Expression] = js.native
  
  def unsupported(feature: String): scala.Nothing = js.native
  
  @js.native
  class DefinitionMap () extends js.Object {
    
    def set(key: String): Unit = js.native
    def set(key: String, value: Expression): Unit = js.native
    
    def toLiteralMap(): LiteralMapExpr = js.native
    
    var values: js.Array[Key] = js.native
  }
}
