package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStorageVirtualMachineResponse extends StObject {
  
  var StorageVirtualMachine: js.UndefOr[typings.awsSdk.clientsFsxMod.StorageVirtualMachine] = js.undefined
}
object UpdateStorageVirtualMachineResponse {
  
  inline def apply(): UpdateStorageVirtualMachineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStorageVirtualMachineResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStorageVirtualMachineResponse] (val x: Self) extends AnyVal {
    
    inline def setStorageVirtualMachine(value: StorageVirtualMachine): Self = StObject.set(x, "StorageVirtualMachine", value.asInstanceOf[js.Any])
    
    inline def setStorageVirtualMachineUndefined: Self = StObject.set(x, "StorageVirtualMachine", js.undefined)
  }
}
