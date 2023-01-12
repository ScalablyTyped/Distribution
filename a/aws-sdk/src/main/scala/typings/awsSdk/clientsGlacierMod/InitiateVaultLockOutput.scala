package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitiateVaultLockOutput extends StObject {
  
  /**
    * The lock ID, which is used to complete the vault locking process.
    */
  var lockId: js.UndefOr[String] = js.undefined
}
object InitiateVaultLockOutput {
  
  inline def apply(): InitiateVaultLockOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitiateVaultLockOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitiateVaultLockOutput] (val x: Self) extends AnyVal {
    
    inline def setLockId(value: String): Self = StObject.set(x, "lockId", value.asInstanceOf[js.Any])
    
    inline def setLockIdUndefined: Self = StObject.set(x, "lockId", js.undefined)
  }
}
