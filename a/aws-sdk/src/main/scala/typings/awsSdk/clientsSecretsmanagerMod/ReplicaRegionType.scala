package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaRegionType extends StObject {
  
  /**
    * The ARN, key ID, or alias of the KMS key to encrypt the secret. If you don't include this field, Secrets Manager uses aws/secretsmanager.
    */
  var KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined
  
  /**
    * A Region code. For a list of Region codes, see Name and code of Regions.
    */
  var Region: js.UndefOr[RegionType] = js.undefined
}
object ReplicaRegionType {
  
  inline def apply(): ReplicaRegionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaRegionType]
  }
  
  extension [Self <: ReplicaRegionType](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyIdType): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setRegion(value: RegionType): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
