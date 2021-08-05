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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewUtilMod {
  
  @JSImport("@angular/compiler/src/render3/view/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/render3/view/util", "CONTEXT_NAME")
  @js.native
  val CONTEXT_NAME: /* "ctx" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/util", "DefinitionMap")
  @js.native
  class DefinitionMap () extends StObject {
    
    def set(key: String): Unit = js.native
    def set(key: String, value: Expression): Unit = js.native
    
    def toLiteralMap(): LiteralMapExpr = js.native
    
    var values: js.Array[Key] = js.native
  }
  
  @JSImport("@angular/compiler/src/render3/view/util", "IMPLICIT_REFERENCE")
  @js.native
  val IMPLICIT_REFERENCE: /* "$implicit" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/util", "NON_BINDABLE_ATTR")
  @js.native
  val NON_BINDABLE_ATTR: /* "ngNonBindable" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/util", "REFERENCE_PREFIX")
  @js.native
  val REFERENCE_PREFIX: /* "_r" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/util", "RENDER_FLAGS")
  @js.native
  val RENDER_FLAGS: /* "rf" */ String = js.native
  
  @JSImport("@angular/compiler/src/render3/view/util", "TEMPORARY_NAME")
  @js.native
  val TEMPORARY_NAME: /* "_t" */ String = js.native
  
  inline def asLiteral(value: js.Any): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("asLiteral")(value.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def chainedInstruction(reference: ExternalReference, calls: js.Array[js.Array[Expression]]): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("chainedInstruction")(reference.asInstanceOf[js.Any], calls.asInstanceOf[js.Any])).asInstanceOf[Expression]
  inline def chainedInstruction(reference: ExternalReference, calls: js.Array[js.Array[Expression]], span: ParseSourceSpan): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("chainedInstruction")(reference.asInstanceOf[js.Any], calls.asInstanceOf[js.Any], span.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  inline def conditionallyCreateMapObjectLiteral(keys: StringDictionary[String | js.Array[String]]): Expression | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("conditionallyCreateMapObjectLiteral")(keys.asInstanceOf[js.Any]).asInstanceOf[Expression | Null]
  inline def conditionallyCreateMapObjectLiteral(keys: StringDictionary[String | js.Array[String]], keepDeclared: Boolean): Expression | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("conditionallyCreateMapObjectLiteral")(keys.asInstanceOf[js.Any], keepDeclared.asInstanceOf[js.Any])).asInstanceOf[Expression | Null]
  
  inline def getAttrsForDirectiveMatching(elOrTpl: Element): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttrsForDirectiveMatching")(elOrTpl.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  inline def getAttrsForDirectiveMatching(elOrTpl: Template): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttrsForDirectiveMatching")(elOrTpl.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  
  inline def getInterpolationArgsLength(interpolation: Interpolation): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getInterpolationArgsLength")(interpolation.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getQueryPredicate(query: R3QueryMetadata, constantPool: ConstantPool): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueryPredicate")(query.asInstanceOf[js.Any], constantPool.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  inline def invalid[T](arg: Expression): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(arg.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  inline def invalid[T](arg: Statement): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(arg.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  inline def invalid[T](arg: Node): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(arg.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def temporaryAllocator(statements: js.Array[Statement], name: String): js.Function0[ReadVarExpr] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryAllocator")(statements.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Function0[ReadVarExpr]]
  
  inline def trimTrailingNulls(parameters: js.Array[Expression]): js.Array[Expression] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimTrailingNulls")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Array[Expression]]
  
  inline def unsupported(feature: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("unsupported")(feature.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
}
