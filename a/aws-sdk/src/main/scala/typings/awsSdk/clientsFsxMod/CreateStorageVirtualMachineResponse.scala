package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStorageVirtualMachineResponse extends StObject {
  
  /**
    * Returned after a successful CreateStorageVirtualMachine operation; describes the SVM just created.
    */
  var StorageVirtualMachine: js.UndefOr[typings.awsSdk.clientsFsxMod.StorageVirtualMachine] = js.undefined
}
object CreateStorageVirtualMachineResponse {
  
  inline def apply(): CreateStorageVirtualMachineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStorageVirtualMachineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStorageVirtualMachineResponse] (val x: Self) extends AnyVal {
    
    inline def setStorageVirtualMachine(value: StorageVirtualMachine): Self = StObject.set(x, "StorageVirtualMachine", value.asInstanceOf[js.Any])
    
    inline def setStorageVirtualMachineUndefined: Self = StObject.set(x, "StorageVirtualMachine", js.undefined)
  }
}
