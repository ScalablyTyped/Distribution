package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeGrantRequest extends StObject {
  
  /**
    * Identifies the grant to revoke. To get the grant ID, use CreateGrant, ListGrants, or ListRetirableGrants.
    */
  var GrantId: GrantIdType
  
  /**
    * A unique identifier for the KMS key associated with the grant. To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey. Specify the key ID or key ARN of the KMS key. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
}
object RevokeGrantRequest {
  
  inline def apply(GrantId: GrantIdType, KeyId: KeyIdType): RevokeGrantRequest = {
    val __obj = js.Dynamic.literal(GrantId = GrantId.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeGrantRequest]
  }
  
  extension [Self <: RevokeGrantRequest](x: Self) {
    
    inline def setGrantId(value: GrantIdType): Self = StObject.set(x, "GrantId", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
  }
}
