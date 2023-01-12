package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionAlgorithmOptions extends StObject {
  
  /**
    * The set of accepted encryption algorithms that are allowed in a code signing job.
    */
  var allowedValues: EncryptionAlgorithms
  
  /**
    * The default encryption algorithm that is used by a code signing job.
    */
  var defaultValue: EncryptionAlgorithm
}
object EncryptionAlgorithmOptions {
  
  inline def apply(allowedValues: EncryptionAlgorithms, defaultValue: EncryptionAlgorithm): EncryptionAlgorithmOptions = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAlgorithmOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionAlgorithmOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowedValues(value: EncryptionAlgorithms): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesVarargs(value: EncryptionAlgorithm*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setDefaultValue(value: EncryptionAlgorithm): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
  }
}
