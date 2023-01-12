package typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsNodeSymbolInfo extends StObject {
  
  /** The position of the most relevant part of the template node. */
  var tcbLocation: TcbLocation
  
  /** The `ts.Symbol` for the template node */
  var tsSymbol: typings.typescript.mod.Symbol | Null
  
  /** The `ts.Type` of the template node. */
  var tsType: Type
}
object TsNodeSymbolInfo {
  
  inline def apply(tcbLocation: TcbLocation, tsType: Type): TsNodeSymbolInfo = {
    val __obj = js.Dynamic.literal(tcbLocation = tcbLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[TsNodeSymbolInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsNodeSymbolInfo] (val x: Self) extends AnyVal {
    
    inline def setTcbLocation(value: TcbLocation): Self = StObject.set(x, "tcbLocation", value.asInstanceOf[js.Any])
    
    inline def setTsSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    
    inline def setTsSymbolNull: Self = StObject.set(x, "tsSymbol", null)
    
    inline def setTsType(value: Type): Self = StObject.set(x, "tsType", value.asInstanceOf[js.Any])
  }
}
