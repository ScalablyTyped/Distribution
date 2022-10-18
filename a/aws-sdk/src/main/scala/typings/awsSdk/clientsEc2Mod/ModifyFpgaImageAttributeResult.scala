package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyFpgaImageAttributeResult extends StObject {
  
  /**
    * Information about the attribute.
    */
  var FpgaImageAttribute: js.UndefOr[typings.awsSdk.clientsEc2Mod.FpgaImageAttribute] = js.undefined
}
object ModifyFpgaImageAttributeResult {
  
  inline def apply(): ModifyFpgaImageAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyFpgaImageAttributeResult]
  }
  
  extension [Self <: ModifyFpgaImageAttributeResult](x: Self) {
    
    inline def setFpgaImageAttribute(value: FpgaImageAttribute): Self = StObject.set(x, "FpgaImageAttribute", value.asInstanceOf[js.Any])
    
    inline def setFpgaImageAttributeUndefined: Self = StObject.set(x, "FpgaImageAttribute", js.undefined)
  }
}
