package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEfsAccessPointDetails extends StObject {
  
  /**
    * The ID of the Amazon EFS access point. 
    */
  var AccessPointId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS access point. 
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The opaque string specified in the request to ensure idempotent creation. 
    */
  var ClientToken: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ID of the Amazon EFS file system that the access point applies to. 
    */
  var FileSystemId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The full POSIX identity, including the user ID, group ID, and secondary group IDs on the access point, that is used for all file operations by NFS clients using the access point. 
    */
  var PosixUser: js.UndefOr[AwsEfsAccessPointPosixUserDetails] = js.undefined
  
  /**
    * The directory on the Amazon EFS file system that the access point exposes as the root directory to NFS clients using the access point. 
    */
  var RootDirectory: js.UndefOr[AwsEfsAccessPointRootDirectoryDetails] = js.undefined
}
object AwsEfsAccessPointDetails {
  
  inline def apply(): AwsEfsAccessPointDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEfsAccessPointDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEfsAccessPointDetails] (val x: Self) extends AnyVal {
    
    inline def setAccessPointId(value: NonEmptyString): Self = StObject.set(x, "AccessPointId", value.asInstanceOf[js.Any])
    
    inline def setAccessPointIdUndefined: Self = StObject.set(x, "AccessPointId", js.undefined)
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setClientToken(value: NonEmptyString): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setFileSystemId(value: NonEmptyString): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setPosixUser(value: AwsEfsAccessPointPosixUserDetails): Self = StObject.set(x, "PosixUser", value.asInstanceOf[js.Any])
    
    inline def setPosixUserUndefined: Self = StObject.set(x, "PosixUser", js.undefined)
    
    inline def setRootDirectory(value: AwsEfsAccessPointRootDirectoryDetails): Self = StObject.set(x, "RootDirectory", value.asInstanceOf[js.Any])
    
    inline def setRootDirectoryUndefined: Self = StObject.set(x, "RootDirectory", js.undefined)
  }
}
