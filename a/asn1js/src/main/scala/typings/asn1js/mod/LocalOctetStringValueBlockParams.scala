package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.LocalBaseBlockParams because Already inherited
- typings.asn1js.mod.LocalHexBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined isHexOnly, valueHex */ trait LocalOctetStringValueBlockParams
  extends StObject
     with LocalConstructedValueBlockParams {
  
  var isConstructed: js.UndefOr[scala.Boolean] = js.undefined
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  
  var valueHex: js.UndefOr[ArrayBuffer] = js.undefined
}
object LocalOctetStringValueBlockParams {
  
  inline def apply(): LocalOctetStringValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalOctetStringValueBlockParams]
  }
  
  extension [Self <: LocalOctetStringValueBlockParams](x: Self) {
    
    inline def setIsConstructed(value: scala.Boolean): Self = StObject.set(x, "isConstructed", value.asInstanceOf[js.Any])
    
    inline def setIsConstructedUndefined: Self = StObject.set(x, "isConstructed", js.undefined)
    
    inline def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    inline def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    inline def setValueHex(value: ArrayBuffer): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
  }
}
