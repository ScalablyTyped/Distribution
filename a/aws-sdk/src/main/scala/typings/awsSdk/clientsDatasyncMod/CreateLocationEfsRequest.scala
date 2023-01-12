package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationEfsRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the access point that DataSync uses to access the Amazon EFS file system.
    */
  var AccessPointArn: js.UndefOr[EfsAccessPointArn] = js.undefined
  
  /**
    * Specifies the subnet and security groups DataSync uses to access your Amazon EFS file system.
    */
  var Ec2Config: typings.awsSdk.clientsDatasyncMod.Ec2Config
  
  /**
    * Specifies the ARN for the Amazon EFS file system.
    */
  var EfsFilesystemArn: typings.awsSdk.clientsDatasyncMod.EfsFilesystemArn
  
  /**
    * Specifies an Identity and Access Management (IAM) role that DataSync assumes when mounting the Amazon EFS file system.
    */
  var FileSystemAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * Specifies whether you want DataSync to use Transport Layer Security (TLS) 1.2 encryption when it copies data to or from the Amazon EFS file system. If you specify an access point using AccessPointArn or an IAM role using FileSystemAccessRoleArn, you must set this parameter to TLS1_2.
    */
  var InTransitEncryption: js.UndefOr[EfsInTransitEncryption] = js.undefined
  
  /**
    * Specifies a mount path for your Amazon EFS file system. This is where DataSync reads or writes data (depending on if this is a source or destination location). By default, DataSync uses the root directory, but you can also include subdirectories.  You must specify a value with forward slashes (for example, /path/to/folder). 
    */
  var Subdirectory: js.UndefOr[EfsSubdirectory] = js.undefined
  
  /**
    * Specifies the key-value pair that represents a tag that you want to add to the resource. The value can be an empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for your location.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
}
object CreateLocationEfsRequest {
  
  inline def apply(Ec2Config: Ec2Config, EfsFilesystemArn: EfsFilesystemArn): CreateLocationEfsRequest = {
    val __obj = js.Dynamic.literal(Ec2Config = Ec2Config.asInstanceOf[js.Any], EfsFilesystemArn = EfsFilesystemArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationEfsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocationEfsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessPointArn(value: EfsAccessPointArn): Self = StObject.set(x, "AccessPointArn", value.asInstanceOf[js.Any])
    
    inline def setAccessPointArnUndefined: Self = StObject.set(x, "AccessPointArn", js.undefined)
    
    inline def setEc2Config(value: Ec2Config): Self = StObject.set(x, "Ec2Config", value.asInstanceOf[js.Any])
    
    inline def setEfsFilesystemArn(value: EfsFilesystemArn): Self = StObject.set(x, "EfsFilesystemArn", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "FileSystemAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setFileSystemAccessRoleArnUndefined: Self = StObject.set(x, "FileSystemAccessRoleArn", js.undefined)
    
    inline def setInTransitEncryption(value: EfsInTransitEncryption): Self = StObject.set(x, "InTransitEncryption", value.asInstanceOf[js.Any])
    
    inline def setInTransitEncryptionUndefined: Self = StObject.set(x, "InTransitEncryption", js.undefined)
    
    inline def setSubdirectory(value: EfsSubdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
