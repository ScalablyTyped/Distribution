package typings.angularCompiler.publicApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "Unary")
@js.native
/**
  * During the deprecation period this constructor is private, to avoid consumers from creating
  * a `Unary` with the fallback properties for `Binary`.
  */
/* private */ class Unary ()
  extends typings.angularCompiler.srcCompilerMod.Unary
/* static members */
object Unary {
  
  @JSImport("@angular/compiler/public_api", "Unary")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a unary minus expression "-x", represented as `Binary` using "0 - x".
    */
  inline def createMinus(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    expr: typings.angularCompiler.astMod.AST
  ): typings.angularCompiler.astMod.Unary = (^.asInstanceOf[js.Dynamic].applyDynamic("createMinus")(span.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.astMod.Unary]
  
  /**
    * Creates a unary plus expression "+x", represented as `Binary` using "x - 0".
    */
  inline def createPlus(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    expr: typings.angularCompiler.astMod.AST
  ): typings.angularCompiler.astMod.Unary = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlus")(span.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.astMod.Unary]
}
