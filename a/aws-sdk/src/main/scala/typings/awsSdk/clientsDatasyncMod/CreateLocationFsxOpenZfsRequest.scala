package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationFsxOpenZfsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the FSx for OpenZFS file system.
    */
  var FsxFilesystemArn: typings.awsSdk.clientsDatasyncMod.FsxFilesystemArn
  
  /**
    * The type of protocol that DataSync uses to access your file system.
    */
  var Protocol: FsxProtocol
  
  /**
    * The ARNs of the security groups that are used to configure the FSx for OpenZFS file system.
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList
  
  /**
    * A subdirectory in the location's path that must begin with /fsx. DataSync uses this subdirectory to read or write data (depending on whether the file system is a source or destination location).
    */
  var Subdirectory: js.UndefOr[FsxOpenZfsSubdirectory] = js.undefined
  
  /**
    * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for your location.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
}
object CreateLocationFsxOpenZfsRequest {
  
  inline def apply(
    FsxFilesystemArn: FsxFilesystemArn,
    Protocol: FsxProtocol,
    SecurityGroupArns: Ec2SecurityGroupArnList
  ): CreateLocationFsxOpenZfsRequest = {
    val __obj = js.Dynamic.literal(FsxFilesystemArn = FsxFilesystemArn.asInstanceOf[js.Any], Protocol = Protocol.asInstanceOf[js.Any], SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationFsxOpenZfsRequest]
  }
  
  extension [Self <: CreateLocationFsxOpenZfsRequest](x: Self) {
    
    inline def setFsxFilesystemArn(value: FsxFilesystemArn): Self = StObject.set(x, "FsxFilesystemArn", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: FsxProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = StObject.set(x, "SecurityGroupArns", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = StObject.set(x, "SecurityGroupArns", js.Array(value*))
    
    inline def setSubdirectory(value: FsxOpenZfsSubdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
