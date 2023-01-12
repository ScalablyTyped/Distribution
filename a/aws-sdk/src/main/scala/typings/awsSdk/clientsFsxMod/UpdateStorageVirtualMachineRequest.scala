package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStorageVirtualMachineRequest extends StObject {
  
  /**
    * Updates the Microsoft Active Directory (AD) configuration for an SVM that is joined to an AD.
    */
  var ActiveDirectoryConfiguration: js.UndefOr[UpdateSvmActiveDirectoryConfiguration] = js.undefined
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The ID of the SVM that you want to update, in the format svm-0123456789abcdef0.
    */
  var StorageVirtualMachineId: typings.awsSdk.clientsFsxMod.StorageVirtualMachineId
  
  /**
    * Enter a new SvmAdminPassword if you are updating it.
    */
  var SvmAdminPassword: js.UndefOr[AdminPassword] = js.undefined
}
object UpdateStorageVirtualMachineRequest {
  
  inline def apply(StorageVirtualMachineId: StorageVirtualMachineId): UpdateStorageVirtualMachineRequest = {
    val __obj = js.Dynamic.literal(StorageVirtualMachineId = StorageVirtualMachineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStorageVirtualMachineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateStorageVirtualMachineRequest] (val x: Self) extends AnyVal {
    
    inline def setActiveDirectoryConfiguration(value: UpdateSvmActiveDirectoryConfiguration): Self = StObject.set(x, "ActiveDirectoryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryConfigurationUndefined: Self = StObject.set(x, "ActiveDirectoryConfiguration", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setStorageVirtualMachineId(value: StorageVirtualMachineId): Self = StObject.set(x, "StorageVirtualMachineId", value.asInstanceOf[js.Any])
    
    inline def setSvmAdminPassword(value: AdminPassword): Self = StObject.set(x, "SvmAdminPassword", value.asInstanceOf[js.Any])
    
    inline def setSvmAdminPasswordUndefined: Self = StObject.set(x, "SvmAdminPassword", js.undefined)
  }
}
