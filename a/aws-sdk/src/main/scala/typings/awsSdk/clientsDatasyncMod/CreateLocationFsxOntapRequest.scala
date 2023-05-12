package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationFsxOntapRequest extends StObject {
  
  var Protocol: FsxProtocol
  
  /**
    * Specifies the Amazon EC2 security groups that provide access to your file system's preferred subnet. The security groups must allow outbound traffic on the following ports (depending on the protocol you use):    Network File System (NFS): TCP ports 111, 635, and 2049    Server Message Block (SMB): TCP port 445   Your file system's security groups must also allow inbound traffic on the same ports.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList
  
  /**
    * Specifies the ARN of the storage virtual machine (SVM) in your file system where you want to copy data to or from.
    */
  var StorageVirtualMachineArn: typings.awsSdk.clientsDatasyncMod.StorageVirtualMachineArn
  
  /**
    * Specifies a path to the file share in the SVM where you'll copy your data. You can specify a junction path (also known as a mount point), qtree path (for NFS file shares), or share name (for SMB file shares). For example, your mount path might be /vol1, /vol1/tree1, or /share1.  Don't specify a junction path in the SVM's root volume. For more information, see Managing FSx for ONTAP storage virtual machines in the Amazon FSx for NetApp ONTAP User Guide. 
    */
  var Subdirectory: js.UndefOr[FsxOntapSubdirectory] = js.undefined
  
  /**
    * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We recommend creating at least a name tag for your location.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
}
object CreateLocationFsxOntapRequest {
  
  inline def apply(
    Protocol: FsxProtocol,
    SecurityGroupArns: Ec2SecurityGroupArnList,
    StorageVirtualMachineArn: StorageVirtualMachineArn
  ): CreateLocationFsxOntapRequest = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any], SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any], StorageVirtualMachineArn = StorageVirtualMachineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationFsxOntapRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocationFsxOntapRequest] (val x: Self) extends AnyVal {
    
    inline def setProtocol(value: FsxProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = StObject.set(x, "SecurityGroupArns", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = StObject.set(x, "SecurityGroupArns", js.Array(value*))
    
    inline def setStorageVirtualMachineArn(value: StorageVirtualMachineArn): Self = StObject.set(x, "StorageVirtualMachineArn", value.asInstanceOf[js.Any])
    
    inline def setSubdirectory(value: FsxOntapSubdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
