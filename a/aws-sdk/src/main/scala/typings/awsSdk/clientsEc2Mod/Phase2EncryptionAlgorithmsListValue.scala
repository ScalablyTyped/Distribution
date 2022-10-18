package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase2EncryptionAlgorithmsListValue extends StObject {
  
  /**
    * The encryption algorithm.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object Phase2EncryptionAlgorithmsListValue {
  
  inline def apply(): Phase2EncryptionAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase2EncryptionAlgorithmsListValue]
  }
  
  extension [Self <: Phase2EncryptionAlgorithmsListValue](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
