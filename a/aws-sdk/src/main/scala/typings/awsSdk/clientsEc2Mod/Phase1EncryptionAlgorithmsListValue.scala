package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phase1EncryptionAlgorithmsListValue extends StObject {
  
  /**
    * The value for the encryption algorithm.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object Phase1EncryptionAlgorithmsListValue {
  
  inline def apply(): Phase1EncryptionAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Phase1EncryptionAlgorithmsListValue]
  }
  
  extension [Self <: Phase1EncryptionAlgorithmsListValue](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
