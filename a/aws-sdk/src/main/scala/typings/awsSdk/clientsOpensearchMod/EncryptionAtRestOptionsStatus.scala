package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionAtRestOptionsStatus extends StObject {
  
  /**
    * Encryption at rest options for the specified domain.
    */
  var Options: EncryptionAtRestOptions
  
  /**
    * The status of the encryption at rest options for the specified domain.
    */
  var Status: OptionStatus
}
object EncryptionAtRestOptionsStatus {
  
  inline def apply(Options: EncryptionAtRestOptions, Status: OptionStatus): EncryptionAtRestOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAtRestOptionsStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionAtRestOptionsStatus] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: EncryptionAtRestOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
