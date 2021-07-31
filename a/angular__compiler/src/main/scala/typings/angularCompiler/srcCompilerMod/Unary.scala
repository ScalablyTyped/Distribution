package typings.angularCompiler.srcCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/compiler", "Unary")
@js.native
/**
  * During the deprecation period this constructor is private, to avoid consumers from creating
  * a `Unary` with the fallback properties for `Binary`.
  */
class Unary protected ()
  extends typings.angularCompiler.astMod.Unary
/* static members */
object Unary {
  
  @JSImport("@angular/compiler/src/compiler", "Unary")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a unary minus expression "-x", represented as `Binary` using "0 - x".
    */
  @scala.inline
  def createMinus(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    expr: typings.angularCompiler.astMod.AST
  ): typings.angularCompiler.astMod.Unary = (^.asInstanceOf[js.Dynamic].applyDynamic("createMinus")(span.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.astMod.Unary]
  
  /**
    * Creates a unary plus expression "+x", represented as `Binary` using "x - 0".
    */
  @scala.inline
  def createPlus(
    span: typings.angularCompiler.astMod.ParseSpan,
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    expr: typings.angularCompiler.astMod.AST
  ): typings.angularCompiler.astMod.Unary = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlus")(span.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[typings.angularCompiler.astMod.Unary]
}
