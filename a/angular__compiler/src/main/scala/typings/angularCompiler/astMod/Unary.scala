package typings.angularCompiler.astMod

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
@JSImport("@angular/compiler/src/expression_parser/ast", "Unary")
@js.native
object Unary extends js.Object {
  
  /**
    * Creates a unary minus expression "-x", represented as `Binary` using "0 - x".
    */
  def createMinus(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expr: AST): Unary = js.native
  
  /**
    * Creates a unary plus expression "+x", represented as `Binary` using "x - 0".
    */
  def createPlus(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expr: AST): Unary = js.native
}
