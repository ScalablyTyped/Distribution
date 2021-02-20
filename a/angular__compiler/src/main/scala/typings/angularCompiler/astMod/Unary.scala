package typings.angularCompiler.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/expression_parser/ast", "Unary")
@js.native
/**
  * During the deprecation period this constructor is private, to avoid consumers from creating
  * a `Unary` with the fallback properties for `Binary`.
  */
class Unary protected () extends Binary {
  
  var expr: AST = js.native
  
  var operator: String = js.native
}
/* static members */
object Unary {
  
  /**
    * Creates a unary minus expression "-x", represented as `Binary` using "0 - x".
    */
  @JSImport("@angular/compiler/src/expression_parser/ast", "Unary.createMinus")
  @js.native
  def createMinus(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expr: AST): Unary = js.native
  
  /**
    * Creates a unary plus expression "+x", represented as `Binary` using "x - 0".
    */
  @JSImport("@angular/compiler/src/expression_parser/ast", "Unary.createPlus")
  @js.native
  def createPlus(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expr: AST): Unary = js.native
}
