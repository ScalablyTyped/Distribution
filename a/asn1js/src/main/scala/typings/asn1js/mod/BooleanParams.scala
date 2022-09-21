package typings.asn1js.mod

import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.LocalBooleanValueBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined isHexOnly, valueHex, value */ trait BooleanParams
  extends StObject
     with BaseBlockParams {
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  
  var value: js.UndefOr[scala.Boolean] = js.undefined
  
  var valueHex: js.UndefOr[BufferSource] = js.undefined
}
object BooleanParams {
  
  inline def apply(): BooleanParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BooleanParams]
  }
  
  extension [Self <: BooleanParams](x: Self) {
    
    inline def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    inline def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    inline def setValue(value: scala.Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueHex(value: BufferSource): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
