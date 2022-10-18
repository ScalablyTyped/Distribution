package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGrantRequest extends StObject {
  
  /**
    * Specifies a grant constraint.  KMS supports the EncryptionContextEquals and EncryptionContextSubset grant constraints. Each constraint value can include up to 8 encryption context pairs. The encryption context value in each constraint cannot exceed 384 characters. For information about grant constraints, see Using grant constraints in the Key Management Service Developer Guide. For more information about encryption context, see Encryption context in the  Key Management Service Developer Guide .  The encryption context grant constraints allow the permissions in the grant only when the encryption context in the request matches (EncryptionContextEquals) or includes (EncryptionContextSubset) the encryption context specified in this structure.  The encryption context grant constraints are supported only on grant operations that include an EncryptionContext parameter, such as cryptographic operations on symmetric encryption KMS keys. Grants with grant constraints can include the DescribeKey and RetireGrant operations, but the constraint doesn't apply to these operations. If a grant with a grant constraint includes the CreateGrant operation, the constraint requires that any grants created with the CreateGrant permission have an equally strict or stricter encryption context constraint. You cannot use an encryption context grant constraint for cryptographic operations with asymmetric KMS keys or HMAC KMS keys. These keys don't support an encryption context.  
    */
  var Constraints: js.UndefOr[GrantConstraints] = js.undefined
  
  /**
    * A list of grant tokens.  Use a grant token when your permission to call this operation comes from a new grant that has not yet achieved eventual consistency. For more information, see Grant token and Using a grant token in the Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
  
  /**
    * The identity that gets the permissions specified in the grant. To specify the principal, use the Amazon Resource Name (ARN) of an Amazon Web Services principal. Valid Amazon Web Services principals include Amazon Web Services accounts (root), IAM users, IAM roles, federated users, and assumed role users. For examples of the ARN syntax to use for specifying a principal, see Amazon Web Services Identity and Access Management (IAM) in the Example ARNs section of the Amazon Web Services General Reference.
    */
  var GranteePrincipal: PrincipalIdType
  
  /**
    * Identifies the KMS key for the grant. The grant gives principals permission to use this KMS key. Specify the key ID or key ARN of the KMS key. To specify a KMS key in a different Amazon Web Services account, you must use the key ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  
  /**
    * A friendly name for the grant. Use this value to prevent the unintended creation of duplicate grants when retrying this request. When this value is absent, all CreateGrant requests result in a new grant with a unique GrantId even if all the supplied parameters are identical. This can result in unintended duplicates when you retry the CreateGrant request. When this value is present, you can retry a CreateGrant request with identical parameters; if the grant already exists, the original GrantId is returned without creating a new grant. Note that the returned grant token is unique with every CreateGrant request, even when a duplicate GrantId is returned. All grant tokens for the same grant ID can be used interchangeably.
    */
  var Name: js.UndefOr[GrantNameType] = js.undefined
  
  /**
    * A list of operations that the grant permits.  This list must include only operations that are permitted in a grant. Also, the operation must be supported on the KMS key. For example, you cannot create a grant for a symmetric encryption KMS key that allows the Sign operation, or a grant for an asymmetric KMS key that allows the GenerateDataKey operation. If you try, KMS returns a ValidationError exception. For details, see Grant operations in the Key Management Service Developer Guide.
    */
  var Operations: GrantOperationList
  
  /**
    * The principal that has permission to use the RetireGrant operation to retire the grant.  To specify the principal, use the Amazon Resource Name (ARN) of an Amazon Web Services principal. Valid Amazon Web Services principals include Amazon Web Services accounts (root), IAM users, federated users, and assumed role users. For examples of the ARN syntax to use for specifying a principal, see Amazon Web Services Identity and Access Management (IAM) in the Example ARNs section of the Amazon Web Services General Reference. The grant determines the retiring principal. Other principals might have permission to retire the grant or revoke the grant. For details, see RevokeGrant and Retiring and revoking grants in the Key Management Service Developer Guide. 
    */
  var RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.undefined
}
object CreateGrantRequest {
  
  inline def apply(GranteePrincipal: PrincipalIdType, KeyId: KeyIdType, Operations: GrantOperationList): CreateGrantRequest = {
    val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGrantRequest]
  }
  
  extension [Self <: CreateGrantRequest](x: Self) {
    
    inline def setConstraints(value: GrantConstraints): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    inline def setGrantTokens(value: GrantTokenList): Self = StObject.set(x, "GrantTokens", value.asInstanceOf[js.Any])
    
    inline def setGrantTokensUndefined: Self = StObject.set(x, "GrantTokens", js.undefined)
    
    inline def setGrantTokensVarargs(value: GrantTokenType*): Self = StObject.set(x, "GrantTokens", js.Array(value*))
    
    inline def setGranteePrincipal(value: PrincipalIdType): Self = StObject.set(x, "GranteePrincipal", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setName(value: GrantNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOperations(value: GrantOperationList): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: GrantOperation*): Self = StObject.set(x, "Operations", js.Array(value*))
    
    inline def setRetiringPrincipal(value: PrincipalIdType): Self = StObject.set(x, "RetiringPrincipal", value.asInstanceOf[js.Any])
    
    inline def setRetiringPrincipalUndefined: Self = StObject.set(x, "RetiringPrincipal", js.undefined)
  }
}
