package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationToCreate extends StObject {
  
  /**
    * To create a file system that uses EFS One Zone storage, specify the name of the Availability Zone in which to create the destination file system.
    */
  var AvailabilityZoneName: js.UndefOr[typings.awsSdk.clientsEfsMod.AvailabilityZoneName] = js.undefined
  
  /**
    * Specifies the Key Management Service (KMS) key that you want to use to encrypt the destination file system. If you do not specify a KMS key, Amazon EFS uses your default KMS key for Amazon EFS, /aws/elasticfilesystem. This ID can be in one of the following formats:   Key ID - The unique identifier of the key, for example 1234abcd-12ab-34cd-56ef-1234567890ab.   ARN - The Amazon Resource Name (ARN) for the key, for example arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Key alias - A previously created display name for a key, for example alias/projectKey1.   Key alias ARN - The ARN for a key alias, for example arn:aws:kms:us-west-2:444455556666:alias/projectKey1.  
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsEfsMod.KmsKeyId] = js.undefined
  
  /**
    * To create a file system that uses Regional storage, specify the Amazon Web Services Region in which to create the destination file system.
    */
  var Region: js.UndefOr[RegionName] = js.undefined
}
object DestinationToCreate {
  
  inline def apply(): DestinationToCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationToCreate]
  }
  
  extension [Self <: DestinationToCreate](x: Self) {
    
    inline def setAvailabilityZoneName(value: AvailabilityZoneName): Self = StObject.set(x, "AvailabilityZoneName", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneNameUndefined: Self = StObject.set(x, "AvailabilityZoneName", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setRegion(value: RegionName): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
