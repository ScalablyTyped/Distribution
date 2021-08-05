package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalBooleanValueBlockParams
  extends StObject
     with LocalBaseBlockParams {
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  
  var value: js.UndefOr[scala.Boolean] = js.undefined
  
  var valueHex: js.UndefOr[ArrayBuffer] = js.undefined
}
object LocalBooleanValueBlockParams {
  
  inline def apply(): LocalBooleanValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBooleanValueBlockParams]
  }
  
  extension [Self <: LocalBooleanValueBlockParams](x: Self) {
    
    inline def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    inline def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    inline def setValue(value: scala.Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueHex(value: ArrayBuffer): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
