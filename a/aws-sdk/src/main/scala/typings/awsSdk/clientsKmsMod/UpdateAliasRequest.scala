package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAliasRequest extends StObject {
  
  /**
    * Identifies the alias that is changing its KMS key. This value must begin with alias/ followed by the alias name, such as alias/ExampleAlias. You cannot use UpdateAlias to change the alias name.
    */
  var AliasName: AliasNameType
  
  /**
    * Identifies the customer managed key to associate with the alias. You don't have permission to associate an alias with an Amazon Web Services managed key. The KMS key must be in the same Amazon Web Services account and Region as the alias. Also, the new target KMS key must be the same type as the current target KMS key (both symmetric or both asymmetric) and they must have the same key usage.  Specify the key ID or key ARN of the KMS key. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey. To verify that the alias is mapped to the correct KMS key, use ListAliases.
    */
  var TargetKeyId: KeyIdType
}
object UpdateAliasRequest {
  
  inline def apply(AliasName: AliasNameType, TargetKeyId: KeyIdType): UpdateAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setAliasName(value: AliasNameType): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setTargetKeyId(value: KeyIdType): Self = StObject.set(x, "TargetKeyId", value.asInstanceOf[js.Any])
  }
}
