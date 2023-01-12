package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationFsxWindowsRequest extends StObject {
  
  /**
    * Specifies the name of the Windows domain that the FSx for Windows File Server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.undefined
  
  /**
    * Specifies the Amazon Resource Name (ARN) for the FSx for Windows File Server file system.
    */
  var FsxFilesystemArn: typings.awsSdk.clientsDatasyncMod.FsxFilesystemArn
  
  /**
    * Specifies the password of the user who has the permissions to access files and folders in the file system.
    */
  var Password: SmbPassword
  
  /**
    * Specifies the ARNs of the security groups that provide access to your file system's preferred subnet.  If you choose a security group that doesn't allow connections from within itself, do one of the following:   Configure the security group to allow it to communicate within itself.   Choose a different security group that can communicate with the mount target's security group.   
    */
  var SecurityGroupArns: Ec2SecurityGroupArnList
  
  /**
    * Specifies a mount path for your file system using forward slashes. This is where DataSync reads or writes data (depending on if this is a source or destination location).
    */
  var Subdirectory: js.UndefOr[FsxWindowsSubdirectory] = js.undefined
  
  /**
    * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We recommend creating at least a name tag for your location.
    */
  var Tags: js.UndefOr[InputTagList] = js.undefined
  
  /**
    * Specifies the user who has the permissions to access files and folders in the file system. For information about choosing a user name that ensures sufficient permissions to files, folders, and metadata, see user.
    */
  var User: SmbUser
}
object CreateLocationFsxWindowsRequest {
  
  inline def apply(
    FsxFilesystemArn: FsxFilesystemArn,
    Password: SmbPassword,
    SecurityGroupArns: Ec2SecurityGroupArnList,
    User: SmbUser
  ): CreateLocationFsxWindowsRequest = {
    val __obj = js.Dynamic.literal(FsxFilesystemArn = FsxFilesystemArn.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], SecurityGroupArns = SecurityGroupArns.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationFsxWindowsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocationFsxWindowsRequest] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: SmbDomain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setFsxFilesystemArn(value: FsxFilesystemArn): Self = StObject.set(x, "FsxFilesystemArn", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: SmbPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = StObject.set(x, "SecurityGroupArns", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupArnsVarargs(value: Ec2SecurityGroupArn*): Self = StObject.set(x, "SecurityGroupArns", js.Array(value*))
    
    inline def setSubdirectory(value: FsxWindowsSubdirectory): Self = StObject.set(x, "Subdirectory", value.asInstanceOf[js.Any])
    
    inline def setSubdirectoryUndefined: Self = StObject.set(x, "Subdirectory", js.undefined)
    
    inline def setTags(value: InputTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagListEntry*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUser(value: SmbUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
  }
}
