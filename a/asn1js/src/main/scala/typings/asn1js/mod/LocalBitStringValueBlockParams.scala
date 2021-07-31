package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.LocalBaseBlockParams because Already inherited
- typings.asn1js.mod.LocalHexBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined isHexOnly, valueHex */ trait LocalBitStringValueBlockParams
  extends StObject
     with LocalConstructedValueBlockParams {
  
  var isConstructed: js.UndefOr[scala.Boolean] = js.undefined
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  
  var unusedBits: js.UndefOr[Double] = js.undefined
  
  var valueHex: js.UndefOr[ArrayBuffer] = js.undefined
}
object LocalBitStringValueBlockParams {
  
  @scala.inline
  def apply(): LocalBitStringValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBitStringValueBlockParams]
  }
  
  @scala.inline
  implicit class LocalBitStringValueBlockParamsMutableBuilder[Self <: LocalBitStringValueBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsConstructed(value: scala.Boolean): Self = StObject.set(x, "isConstructed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConstructedUndefined: Self = StObject.set(x, "isConstructed", js.undefined)
    
    @scala.inline
    def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    @scala.inline
    def setUnusedBits(value: Double): Self = StObject.set(x, "unusedBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedBitsUndefined: Self = StObject.set(x, "unusedBits", js.undefined)
    
    @scala.inline
    def setValueHex(value: ArrayBuffer): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
  }
}
