package typings.angularCompilerCli.symbolsMod

import typings.angularCompilerCli.symbolsMod.SymbolKind.Expression
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionSymbol
  extends StObject
     with Symbol {
  
  var kind: Expression
  
  /** The position of the most relevant part of the expression. */
  var tcbLocation: TcbLocation
  
  /**
    * The `ts.Symbol` of the entity. This could be `null`, for example `AST` expression
    * `{{foo.bar + foo.baz}}` does not have a `ts.Symbol` but `foo.bar` and `foo.baz` both do.
    */
  var tsSymbol: typings.typescript.mod.Symbol | Null
  
  /** The `ts.Type` of the expression AST. */
  var tsType: Type
}
object ExpressionSymbol {
  
  inline def apply(kind: Expression, tcbLocation: TcbLocation, tsType: Type): ExpressionSymbol = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[ExpressionSymbol]
  }
  
  extension [Self <: ExpressionSymbol](x: Self) {
    
    inline def setKind(value: Expression): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTcbLocation(value: TcbLocation): Self = StObject.set(x, "tcbLocation", value.asInstanceOf[js.Any])
    
    inline def setTsSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    
    inline def setTsSymbolNull: Self = StObject.set(x, "tsSymbol", null)
    
    inline def setTsType(value: Type): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
  }
}
