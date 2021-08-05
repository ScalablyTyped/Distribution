package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalHexBlockParams
  extends StObject
     with LocalBaseBlockParams {
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  
  var valueHex: js.UndefOr[ArrayBuffer] = js.undefined
}
object LocalHexBlockParams {
  
  inline def apply(): LocalHexBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalHexBlockParams]
  }
  
  extension [Self <: LocalHexBlockParams](x: Self) {
    
    inline def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    inline def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    inline def setValueHex(value: ArrayBuffer): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
  }
}
