package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<asn1js.asn1js.IHexBlock, 'valueHex'> */
trait HexBlockJson extends StObject {
  
  var isHexOnly: scala.Boolean
  
  var valueHex: String
}
object HexBlockJson {
  
  inline def apply(isHexOnly: scala.Boolean, valueHex: String): HexBlockJson = {
    val __obj = js.Dynamic.literal(isHexOnly = isHexOnly.asInstanceOf[js.Any], valueHex = valueHex.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexBlockJson]
  }
  
  extension [Self <: HexBlockJson](x: Self) {
    
    inline def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    inline def setValueHex(value: String): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
  }
}
