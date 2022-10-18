package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobAttributeValue extends StObject {
  
  var Value: js.UndefOr[_Blob] = js.undefined
}
object BlobAttributeValue {
  
  inline def apply(): BlobAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobAttributeValue]
  }
  
  extension [Self <: BlobAttributeValue](x: Self) {
    
    inline def setValue(value: _Blob): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
