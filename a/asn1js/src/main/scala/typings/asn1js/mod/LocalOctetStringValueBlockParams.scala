package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod.LocalBaseBlockParams because Already inherited
- typings.asn1js.mod.LocalHexBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined isHexOnly, valueHex */ @js.native
trait LocalOctetStringValueBlockParams extends LocalConstructedValueBlockParams {
  
  var isConstructed: js.UndefOr[scala.Boolean] = js.native
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.native
  
  var valueHex: js.UndefOr[ArrayBuffer] = js.native
}
object LocalOctetStringValueBlockParams {
  
  @scala.inline
  def apply(): LocalOctetStringValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalOctetStringValueBlockParams]
  }
  
  @scala.inline
  implicit class LocalOctetStringValueBlockParamsMutableBuilder[Self <: LocalOctetStringValueBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsConstructed(value: scala.Boolean): Self = StObject.set(x, "isConstructed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConstructedUndefined: Self = StObject.set(x, "isConstructed", js.undefined)
    
    @scala.inline
    def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    @scala.inline
    def setValueHex(value: ArrayBuffer): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
  }
}
