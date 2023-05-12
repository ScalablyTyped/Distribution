package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualMachineDetails extends StObject {
  
  /**
    * The host name of the virtual machine.
    */
  var HostName: js.UndefOr[Name] = js.undefined
  
  /**
    * The ID of the virtual machine's hypervisor.
    */
  var HypervisorId: js.UndefOr[String] = js.undefined
  
  /**
    * The most recent date a virtual machine was backed up, in Unix format and UTC time.
    */
  var LastBackupDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the virtual machine.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Name] = js.undefined
  
  /**
    * The path of the virtual machine.
    */
  var Path: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Path] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the virtual machine. For example, arn:aws:backup-gateway:us-west-1:0000000000000:vm/vm-0000ABCDEFGIJKL.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.ResourceArn] = js.undefined
  
  /**
    * These are the details of the VMware tags associated with the specified virtual machine.
    */
  var VmwareTags: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.VmwareTags] = js.undefined
}
object VirtualMachineDetails {
  
  inline def apply(): VirtualMachineDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualMachineDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualMachineDetails] (val x: Self) extends AnyVal {
    
    inline def setHostName(value: Name): Self = StObject.set(x, "HostName", value.asInstanceOf[js.Any])
    
    inline def setHostNameUndefined: Self = StObject.set(x, "HostName", js.undefined)
    
    inline def setHypervisorId(value: String): Self = StObject.set(x, "HypervisorId", value.asInstanceOf[js.Any])
    
    inline def setHypervisorIdUndefined: Self = StObject.set(x, "HypervisorId", js.undefined)
    
    inline def setLastBackupDate(value: js.Date): Self = StObject.set(x, "LastBackupDate", value.asInstanceOf[js.Any])
    
    inline def setLastBackupDateUndefined: Self = StObject.set(x, "LastBackupDate", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPath(value: Path): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setVmwareTags(value: VmwareTags): Self = StObject.set(x, "VmwareTags", value.asInstanceOf[js.Any])
    
    inline def setVmwareTagsUndefined: Self = StObject.set(x, "VmwareTags", js.undefined)
    
    inline def setVmwareTagsVarargs(value: VmwareTag*): Self = StObject.set(x, "VmwareTags", js.Array(value*))
  }
}
