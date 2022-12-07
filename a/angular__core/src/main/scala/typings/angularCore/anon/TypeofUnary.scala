package typings.angularCore.anon

import org.scalablytyped.runtime.Instantiable0
import typings.angularCompiler.mod.AST
import typings.angularCompiler.mod.AbsoluteSourceSpan
import typings.angularCompiler.mod.ParseSpan
import typings.angularCompiler.mod.Unary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofUnary
  extends StObject
     with Instantiable0[Unary] {
  
  /**
    * Creates a unary minus expression "-x", represented as `Binary` using "0 - x".
    */
  def createMinus(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expr: AST): Unary = js.native
  
  /**
    * Creates a unary plus expression "+x", represented as `Binary` using "x - 0".
    */
  def createPlus(span: ParseSpan, sourceSpan: AbsoluteSourceSpan, expr: AST): Unary = js.native
}
