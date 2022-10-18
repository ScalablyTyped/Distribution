package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails extends StObject {
  
  /**
    * The authorization configuration details for the Amazon EFS file system.
    */
  var AuthorizationConfig: js.UndefOr[AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails] = js.undefined
  
  /**
    * The Amazon EFS file system identifier to use.
    */
  var FilesystemId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The directory within the Amazon EFS file system to mount as the root directory inside the host.
    */
  var RootDirectory: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS server. 
    */
  var TransitEncryption: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS server.
    */
  var TransitEncryptionPort: js.UndefOr[Integer] = js.undefined
}
object AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails {
  
  inline def apply(): AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationDetails](x: Self) {
    
    inline def setAuthorizationConfig(value: AwsEcsTaskDefinitionVolumesEfsVolumeConfigurationAuthorizationConfigDetails): Self = StObject.set(x, "AuthorizationConfig", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationConfigUndefined: Self = StObject.set(x, "AuthorizationConfig", js.undefined)
    
    inline def setFilesystemId(value: NonEmptyString): Self = StObject.set(x, "FilesystemId", value.asInstanceOf[js.Any])
    
    inline def setFilesystemIdUndefined: Self = StObject.set(x, "FilesystemId", js.undefined)
    
    inline def setRootDirectory(value: NonEmptyString): Self = StObject.set(x, "RootDirectory", value.asInstanceOf[js.Any])
    
    inline def setRootDirectoryUndefined: Self = StObject.set(x, "RootDirectory", js.undefined)
    
    inline def setTransitEncryption(value: NonEmptyString): Self = StObject.set(x, "TransitEncryption", value.asInstanceOf[js.Any])
    
    inline def setTransitEncryptionPort(value: Integer): Self = StObject.set(x, "TransitEncryptionPort", value.asInstanceOf[js.Any])
    
    inline def setTransitEncryptionPortUndefined: Self = StObject.set(x, "TransitEncryptionPort", js.undefined)
    
    inline def setTransitEncryptionUndefined: Self = StObject.set(x, "TransitEncryption", js.undefined)
  }
}
