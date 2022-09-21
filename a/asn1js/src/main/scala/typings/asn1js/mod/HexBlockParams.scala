package typings.asn1js.mod

import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<asn1js.asn1js.IHexBlock> */
trait HexBlockParams extends StObject {
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  
  var valueHex: js.UndefOr[BufferSource] = js.undefined
}
object HexBlockParams {
  
  inline def apply(): HexBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HexBlockParams]
  }
  
  extension [Self <: HexBlockParams](x: Self) {
    
    inline def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    inline def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    inline def setValueHex(value: BufferSource): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
  }
}
