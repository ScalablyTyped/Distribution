package typings.angularCompilerCli.symbolsMod

import typings.angularCompilerCli.srcTypescriptMod.SymbolWithValueDeclaration
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassSymbol extends StObject {
  
  /** The position for the variable declaration for the class instance. */
  var tcbLocation: TcbLocation
  
  /** The `ts.Symbol` for class. */
  var tsSymbol: SymbolWithValueDeclaration
  
  /** The `ts.Type` of class. */
  var tsType: Type
}
object ClassSymbol {
  
  inline def apply(tcbLocation: TcbLocation, tsSymbol: SymbolWithValueDeclaration, tsType: Type): ClassSymbol = {
    val __obj = js.Dynamic.literal(tcbLocation = tcbLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSymbol]
  }
  
  extension [Self <: ClassSymbol](x: Self) {
    
    inline def setTcbLocation(value: TcbLocation): Self = StObject.set(x, "tcbLocation", value.asInstanceOf[js.Any])
    
    inline def setTsSymbol(value: SymbolWithValueDeclaration): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    
    inline def setTsType(value: Type): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
  }
}
