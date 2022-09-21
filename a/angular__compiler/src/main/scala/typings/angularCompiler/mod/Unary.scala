package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "Unary")
@js.native
/**
  * During the deprecation period this constructor is private, to avoid consumers from creating
  * a `Unary` with the fallback properties for `Binary`.
  */
/* private */ open class Unary () extends Binary {
  
  var expr: AST = js.native
  
  var operator: String = js.native
}
/* static members */
object Unary {
  
  @JSImport("@angular/compiler", "Unary")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a unary minus expression "-x", represented as `Binary` using "0 - x".
    */
  inline def createMinus(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expr: AST): Unary = (^.asInstanceOf[js.Dynamic].applyDynamic("createMinus")(span.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[Unary]
  
  /**
    * Creates a unary plus expression "+x", represented as `Binary` using "x - 0".
    */
  inline def createPlus(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expr: AST): Unary = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlus")(span.asInstanceOf[js.Any], sourceSpan.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[Unary]
}
