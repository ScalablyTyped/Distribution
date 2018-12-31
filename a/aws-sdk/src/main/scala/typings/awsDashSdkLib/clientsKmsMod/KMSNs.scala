package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/kms", "KMS")
@js.native
object KMSNs extends js.Object {
  trait AliasListEntry extends js.Object {
    /**
      * String that contains the key ARN.
      */
    var AliasArn: js.UndefOr[ArnType] = js.undefined
    /**
      * String that contains the alias.
      */
    var AliasName: js.UndefOr[AliasNameType] = js.undefined
    /**
      * String that contains the key identifier referred to by the alias.
      */
    var TargetKeyId: js.UndefOr[KeyIdType] = js.undefined
  }
  
  trait CancelKeyDeletionRequest extends js.Object {
    /**
      * The unique identifier for the customer master key (CMK) for which to cancel deletion. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
  }
  
  trait CancelKeyDeletionResponse extends js.Object {
    /**
      * The unique identifier of the master key for which deletion is canceled.
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ConnectCustomKeyStoreRequest extends js.Object {
    /**
      * Enter the key store ID of the custom key store that you want to connect. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
      */
    var CustomKeyStoreId: CustomKeyStoreIdType
  }
  
  trait ConnectCustomKeyStoreResponse extends js.Object
  
  trait CreateAliasRequest extends js.Object {
    /**
      * String that contains the display name. The name must start with the word "alias" followed by a forward slash (alias/). Aliases that begin with "alias/AWS" are reserved.
      */
    var AliasName: AliasNameType
    /**
      * Identifies the CMK for which you are creating the alias. This value cannot be an alias. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var TargetKeyId: KeyIdType
  }
  
  trait CreateCustomKeyStoreRequest extends js.Object {
    /**
      * Identifies the AWS CloudHSM cluster for the custom key store. Enter the cluster ID of any active AWS CloudHSM cluster that is not already associated with a custom key store. To find the cluster ID, use the DescribeClusters operation.
      */
    var CloudHsmClusterId: CloudHsmClusterIdType
    /**
      * Specifies a friendly name for the custom key store. The name must be unique in your AWS account.
      */
    var CustomKeyStoreName: CustomKeyStoreNameType
    /**
      * Enter the password of the  kmsuser crypto user (CU) account in the specified AWS CloudHSM cluster. AWS KMS logs into the cluster as this user to manage key material on your behalf. This parameter tells AWS KMS the kmsuser account password; it does not change the password in the AWS CloudHSM cluster.
      */
    var KeyStorePassword: KeyStorePasswordType
    /**
      * Enter the content of the trust anchor certificate for the cluster. This is the content of the customerCA.crt file that you created when you initialized the cluster.
      */
    var TrustAnchorCertificate: TrustAnchorCertificateType
  }
  
  trait CreateCustomKeyStoreResponse extends js.Object {
    /**
      * A unique identifier for the new custom key store.
      */
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
  }
  
  trait CreateGrantRequest extends js.Object {
    /**
      * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see Encryption Context in the AWS Key Management Service Developer Guide.
      */
    var Constraints: js.UndefOr[GrantConstraints] = js.undefined
    /**
      * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
      */
    var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    /**
      * The principal that is given permission to perform the operations that the grant permits. To specify the principal, use the Amazon Resource Name (ARN) of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, IAM roles, federated users, and assumed role users. For examples of the ARN syntax to use for specifying a principal, see AWS Identity and Access Management (IAM) in the Example ARNs section of the AWS General Reference.
      */
    var GranteePrincipal: PrincipalIdType
    /**
      * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
    /**
      * A friendly name for identifying the grant. Use this value to prevent unintended creation of duplicate grants when retrying this request. When this value is absent, all CreateGrant requests result in a new grant with a unique GrantId even if all the supplied parameters are identical. This can result in unintended duplicates when you retry the CreateGrant request. When this value is present, you can retry a CreateGrant request with identical parameters; if the grant already exists, the original GrantId is returned without creating a new grant. Note that the returned grant token is unique with every CreateGrant request, even when a duplicate GrantId is returned. All grant tokens obtained in this way can be used interchangeably.
      */
    var Name: js.UndefOr[GrantNameType] = js.undefined
    /**
      * A list of operations that the grant permits.
      */
    var Operations: GrantOperationList
    /**
      * The principal that is given permission to retire the grant by using RetireGrant operation. To specify the principal, use the Amazon Resource Name (ARN) of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated users, and assumed role users. For examples of the ARN syntax to use for specifying a principal, see AWS Identity and Access Management (IAM) in the Example ARNs section of the AWS General Reference.
      */
    var RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.undefined
  }
  
  trait CreateGrantResponse extends js.Object {
    /**
      * The unique identifier for the grant. You can use the GrantId in a subsequent RetireGrant or RevokeGrant operation.
      */
    var GrantId: js.UndefOr[GrantIdType] = js.undefined
    /**
      * The grant token. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
      */
    var GrantToken: js.UndefOr[GrantTokenType] = js.undefined
  }
  
  trait CreateKeyRequest extends js.Object {
    /**
      * A flag to indicate whether to bypass the key policy lockout safety check.  Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true indiscriminately. For more information, refer to the scenario in the Default Key Policy section in the AWS Key Management Service Developer Guide.  Use this parameter only when you include a policy in the request and you intend to prevent the principal that is making the request from making a subsequent PutKeyPolicy request on the CMK. The default value is false.
      */
    var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined
    /**
      * Creates the CMK in the specified custom key store and the key material in its associated AWS CloudHSM cluster. To create a CMK in a custom key store, you must also specify the Origin parameter with a value of AWS_CLOUDHSM. The AWS CloudHSM cluster that is associated with the custom key store must have at least two active HSMs, each in a different Availability Zone in the Region. To find the ID of a custom key store, use the DescribeCustomKeyStores operation. The response includes the custom key store ID and the ID of the AWS CloudHSM cluster. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store.
      */
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
    /**
      * A description of the CMK. Use a description that helps you decide whether the CMK is appropriate for a task.
      */
    var Description: js.UndefOr[DescriptionType] = js.undefined
    /**
      * The intended use of the CMK. You can use CMKs only for symmetric encryption and decryption.
      */
    var KeyUsage: js.UndefOr[KeyUsageType] = js.undefined
    /**
      * The source of the CMK's key material. You cannot change the origin after you create the CMK. The default is AWS_KMS, which means AWS KMS creates the key material in its own key store. When the parameter value is EXTERNAL, AWS KMS creates a CMK without key material so that you can import key material from your existing key management infrastructure. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. When the parameter value is AWS_CLOUDHSM, AWS KMS creates the CMK in a AWS KMS custom key store and creates its key material in the associated AWS CloudHSM cluster. You must also use the CustomKeyStoreId parameter to identify the custom key store.
      */
    var Origin: js.UndefOr[OriginType] = js.undefined
    /**
      * The key policy to attach to the CMK. If you provide a key policy, it must meet the following criteria:   If you don't set BypassPolicyLockoutSafetyCheck to true, the key policy must allow the principal that is making the CreateKey request to make a subsequent PutKeyPolicy request on the CMK. This reduces the risk that the CMK becomes unmanageable. For more information, refer to the scenario in the Default Key Policy section of the AWS Key Management Service Developer Guide.   Each statement in the key policy must contain one or more principals. The principals in the key policy must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need to enforce a delay before including the new principal in a key policy because the new principal might not be immediately visible to AWS KMS. For more information, see Changes that I make are not always immediately visible in the AWS Identity and Access Management User Guide.   If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK. For more information, see Default Key Policy in the AWS Key Management Service Developer Guide. The key policy size limit is 32 kilobytes (32768 bytes).
      */
    var Policy: js.UndefOr[PolicyType] = js.undefined
    /**
      * One or more tags. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty (null) strings. Use this parameter to tag the CMK when it is created. Alternately, you can omit this parameter and instead tag the CMK after it is created using TagResource.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateKeyResponse extends js.Object {
    /**
      * Metadata associated with the CMK.
      */
    var KeyMetadata: js.UndefOr[KeyMetadata] = js.undefined
  }
  
  trait CustomKeyStoresListEntry extends js.Object {
    /**
      * A unique identifier for the AWS CloudHSM cluster that is associated with the custom key store.
      */
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
    /**
      * Describes the connection error. Valid values are:    CLUSTER_NOT_FOUND - AWS KMS cannot find the AWS CloudHSM cluster with the specified cluster ID.    INSUFFICIENT_CLOUDHSM_HSMS - The associated AWS CloudHSM cluster does not contain any active HSMs. To connect a custom key store to its AWS CloudHSM cluster, the cluster must contain at least one active HSM.    INVALID_CREDENTIALS - AWS KMS does not have the correct password for the kmsuser crypto user in the AWS CloudHSM cluster.    NETWORK_ERRORS - Network errors are preventing AWS KMS from connecting to the custom key store.    USER_LOCKED_OUT - The kmsuser CU account is locked out of the associated AWS CloudHSM cluster due to too many failed password attempts. Before you can connect your custom key store to its AWS CloudHSM cluster, you must change the kmsuser account password and update the password value for the custom key store.   For help with connection failures, see Troubleshooting Custom Key Stores in the AWS Key Management Service Developer Guide.
      */
    var ConnectionErrorCode: js.UndefOr[ConnectionErrorCodeType] = js.undefined
    /**
      * Indicates whether the custom key store is connected to its AWS CloudHSM cluster. You can create and use CMKs in your custom key stores only when its connection state is CONNECTED. The value is DISCONNECTED if the key store has never been connected or you use the DisconnectCustomKeyStore operation to disconnect it. If the value is CONNECTED but you are having trouble using the custom key store, make sure that its associated AWS CloudHSM cluster is active and contains at least one active HSM. A value of FAILED indicates that an attempt to connect was unsuccessful. For help resolving a connection failure, see Troubleshooting a Custom Key Store in the AWS Key Management Service Developer Guide.
      */
    var ConnectionState: js.UndefOr[ConnectionStateType] = js.undefined
    /**
      * The date and time when the custom key store was created.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * A unique identifier for the custom key store.
      */
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
    /**
      * The user-specified friendly name for the custom key store.
      */
    var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined
    /**
      * The trust anchor certificate of the associated AWS CloudHSM cluster. When you initialize the cluster, you create this certificate and save it in the customerCA.crt file.
      */
    var TrustAnchorCertificate: js.UndefOr[TrustAnchorCertificateType] = js.undefined
  }
  
  trait DecryptRequest extends js.Object {
    /**
      * Ciphertext to be decrypted. The blob includes metadata.
      */
    var CiphertextBlob: CiphertextType
    /**
      * The encryption context. If this was specified in the Encrypt function, it must be specified here or the decryption operation will fail. For more information, see Encryption Context.
      */
    var EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
    /**
      * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
      */
    var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
  }
  
  trait DecryptResponse extends js.Object {
    /**
      * ARN of the key used to perform the decryption. This value is returned if no errors are encountered during the operation.
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
    /**
      * Decrypted plaintext data. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it is not encoded.
      */
    var Plaintext: js.UndefOr[PlaintextType] = js.undefined
  }
  
  trait DeleteAliasRequest extends js.Object {
    /**
      * The alias to be deleted. The name must start with the word "alias" followed by a forward slash (alias/). Aliases that begin with "alias/aws" are reserved.
      */
    var AliasName: AliasNameType
  }
  
  trait DeleteCustomKeyStoreRequest extends js.Object {
    /**
      * Enter the ID of the custom key store you want to delete. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
      */
    var CustomKeyStoreId: CustomKeyStoreIdType
  }
  
  trait DeleteCustomKeyStoreResponse extends js.Object
  
  trait DeleteImportedKeyMaterialRequest extends js.Object {
    /**
      * The identifier of the CMK whose key material to delete. The CMK's Origin must be EXTERNAL. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
  }
  
  trait DescribeCustomKeyStoresRequest extends js.Object {
    /**
      * Gets only information about the specified custom key store. Enter the key store ID. By default, this operation gets information about all custom key stores in the account and region. To limit the output to a particular custom key store, you can use either the CustomKeyStoreId or CustomKeyStoreName parameter, but not both.
      */
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
    /**
      * Gets only information about the specified custom key store. Enter the friendly name of the custom key store. By default, this operation gets information about all custom key stores in the account and region. To limit the output to a particular custom key store, you can use either the CustomKeyStoreId or CustomKeyStoreName parameter, but not both.
      */
    var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined
    /**
      * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not return more than the specified number of items, but it might return fewer.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
  }
  
  trait DescribeCustomKeyStoresResponse extends js.Object {
    /**
      * Contains metadata about each custom key store.
      */
    var CustomKeyStores: js.UndefOr[CustomKeyStoresList] = js.undefined
    /**
      * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
      */
    var NextMarker: js.UndefOr[MarkerType] = js.undefined
    /**
      * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in this response to the Marker parameter in a subsequent request.
      */
    var Truncated: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait DescribeKeyRequest extends js.Object {
    /**
      * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
      */
    var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    /**
      * Describes the specified customer master key (CMK).  If you specify a predefined AWS alias (an AWS alias with no key ID), KMS associates the alias with an AWS managed CMK and returns its KeyId and Arn in the response. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
      */
    var KeyId: KeyIdType
  }
  
  trait DescribeKeyResponse extends js.Object {
    /**
      * Metadata associated with the key.
      */
    var KeyMetadata: js.UndefOr[KeyMetadata] = js.undefined
  }
  
  trait DisableKeyRequest extends js.Object {
    /**
      * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
  }
  
  trait DisableKeyRotationRequest extends js.Object {
    /**
      * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
  }
  
  trait DisconnectCustomKeyStoreRequest extends js.Object {
    /**
      * Enter the ID of the custom key store you want to disconnect. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
      */
    var CustomKeyStoreId: CustomKeyStoreIdType
  }
  
  trait DisconnectCustomKeyStoreResponse extends js.Object
  
  trait EnableKeyRequest extends js.Object {
    /**
      * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
  }
  
  trait EnableKeyRotationRequest extends js.Object {
    /**
      * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
  }
  
  trait EncryptRequest extends js.Object {
    /**
      * Name-value pair that specifies the encryption context to be used for authenticated encryption. If used here, the same value must be supplied to the Decrypt API or decryption will fail. For more information, see Encryption Context.
      */
    var EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
    /**
      * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
      */
    var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    /**
      * A unique identifier for the customer master key (CMK). To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
      */
    var KeyId: KeyIdType
    /**
      * Data to be encrypted.
      */
    var Plaintext: PlaintextType
  }
  
  trait EncryptResponse extends js.Object {
    /**
      * The encrypted plaintext. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it is not encoded.
      */
    var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
    /**
      * The ID of the key used during encryption.
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
  }
  
  trait EncryptionContextType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[EncryptionContextValue]
  
  trait GenerateDataKeyRequest extends js.Object {
    /**
      * A set of key-value pairs that represents additional authenticated data. For more information, see Encryption Context in the AWS Key Management Service Developer Guide.
      */
    var EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
    /**
      * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
      */
    var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    /**
      * The identifier of the CMK under which to generate and encrypt the data encryption key. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
      */
    var KeyId: KeyIdType
    /**
      * The length of the data encryption key. Use AES_128 to generate a 128-bit symmetric key, or AES_256 to generate a 256-bit symmetric key.
      */
    var KeySpec: js.UndefOr[DataKeySpec] = js.undefined
    /**
      * The length of the data encryption key in bytes. For example, use the value 64 to generate a 512-bit data key (64 bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use the KeySpec field instead of this one.
      */
    var NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
  }
  
  trait GenerateDataKeyResponse extends js.Object {
    /**
      * The encrypted data encryption key. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it is not encoded.
      */
    var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
    /**
      * The identifier of the CMK under which the data encryption key was generated and encrypted.
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
    /**
      * The data encryption key. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it is not encoded. Use this data key for local encryption and decryption, then remove it from memory as soon as possible.
      */
    var Plaintext: js.UndefOr[PlaintextType] = js.undefined
  }
  
  trait GenerateDataKeyWithoutPlaintextRequest extends js.Object {
    /**
      * A set of key-value pairs that represents additional authenticated data. For more information, see Encryption Context in the AWS Key Management Service Developer Guide.
      */
    var EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
    /**
      * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
      */
    var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    /**
      * The identifier of the customer master key (CMK) under which to generate and encrypt the data encryption key. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
      */
    var KeyId: KeyIdType
    /**
      * The length of the data encryption key. Use AES_128 to generate a 128-bit symmetric key, or AES_256 to generate a 256-bit symmetric key.
      */
    var KeySpec: js.UndefOr[DataKeySpec] = js.undefined
    /**
      * The length of the data encryption key in bytes. For example, use the value 64 to generate a 512-bit data key (64 bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use the KeySpec field instead of this one.
      */
    var NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
  }
  
  trait GenerateDataKeyWithoutPlaintextResponse extends js.Object {
    /**
      * The encrypted data encryption key. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it is not encoded.
      */
    var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
    /**
      * The identifier of the CMK under which the data encryption key was generated and encrypted.
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
  }
  
  trait GenerateRandomRequest extends js.Object {
    /**
      * Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
      */
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
    /**
      * The length of the byte string.
      */
    var NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
  }
  
  trait GenerateRandomResponse extends js.Object {
    /**
      * The random byte string. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it is not encoded.
      */
    var Plaintext: js.UndefOr[PlaintextType] = js.undefined
  }
  
  trait GetKeyPolicyRequest extends js.Object {
    /**
      * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
    /**
      * Specifies the name of the key policy. The only valid name is default. To get the names of key policies, use ListKeyPolicies.
      */
    var PolicyName: PolicyNameType
  }
  
  trait GetKeyPolicyResponse extends js.Object {
    /**
      * A key policy document in JSON format.
      */
    var Policy: js.UndefOr[PolicyType] = js.undefined
  }
  
  trait GetKeyRotationStatusRequest extends js.Object {
    /**
      * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
  }
  
  trait GetKeyRotationStatusResponse extends js.Object {
    /**
      * A Boolean value that specifies whether key rotation is enabled.
      */
    var KeyRotationEnabled: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait GetParametersForImportRequest extends js.Object {
    /**
      * The identifier of the CMK into which you will import key material. The CMK's Origin must be EXTERNAL. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
    /**
      * The algorithm you will use to encrypt the key material before importing it with ImportKeyMaterial. For more information, see Encrypt the Key Material in the AWS Key Management Service Developer Guide.
      */
    var WrappingAlgorithm: AlgorithmSpec
    /**
      * The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are supported.
      */
    var WrappingKeySpec: WrappingKeySpec
  }
  
  trait GetParametersForImportResponse extends js.Object {
    /**
      * The import token to send in a subsequent ImportKeyMaterial request.
      */
    var ImportToken: js.UndefOr[CiphertextType] = js.undefined
    /**
      * The identifier of the CMK to use in a subsequent ImportKeyMaterial request. This is the same CMK specified in the GetParametersForImport request.
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
    /**
      * The time at which the import token and public key are no longer valid. After this time, you cannot use them to make an ImportKeyMaterial request and you must send another GetParametersForImport request to get new ones.
      */
    var ParametersValidTo: js.UndefOr[DateType] = js.undefined
    /**
      * The public key to use to encrypt the key material before importing it with ImportKeyMaterial.
      */
    var PublicKey: js.UndefOr[PlaintextType] = js.undefined
  }
  
  trait GrantConstraints extends js.Object {
    /**
      * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list, the grant allows the operation. Otherwise, the grant does not allow the operation.
      */
    var EncryptionContextEquals: js.UndefOr[EncryptionContextType] = js.undefined
    /**
      * A list of key-value pairs, all of which must be present in the encryption context of certain subsequent operations that the grant allows. When certain subsequent operations allowed by the grant include encryption context that matches this list or is a superset of this list, the grant allows the operation. Otherwise, the grant does not allow the operation.
      */
    var EncryptionContextSubset: js.UndefOr[EncryptionContextType] = js.undefined
  }
  
  trait GrantListEntry extends js.Object {
    /**
      * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.
      */
    var Constraints: js.UndefOr[GrantConstraints] = js.undefined
    /**
      * The date and time when the grant was created.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The unique identifier for the grant.
      */
    var GrantId: js.UndefOr[GrantIdType] = js.undefined
    /**
      * The principal that receives the grant's permissions.
      */
    var GranteePrincipal: js.UndefOr[PrincipalIdType] = js.undefined
    /**
      * The AWS account under which the grant was issued.
      */
    var IssuingAccount: js.UndefOr[PrincipalIdType] = js.undefined
    /**
      * The unique identifier for the customer master key (CMK) to which the grant applies.
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
    /**
      * The friendly name that identifies the grant. If a name was provided in the CreateGrant request, that name is returned. Otherwise this value is null.
      */
    var Name: js.UndefOr[GrantNameType] = js.undefined
    /**
      * The list of operations permitted by the grant.
      */
    var Operations: js.UndefOr[GrantOperationList] = js.undefined
    /**
      * The principal that can retire the grant.
      */
    var RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.undefined
  }
  
  trait ImportKeyMaterialRequest extends js.Object {
    /**
      * The encrypted key material to import. It must be encrypted with the public key that you received in the response to a previous GetParametersForImport request, using the wrapping algorithm that you specified in that request.
      */
    var EncryptedKeyMaterial: CiphertextType
    /**
      * Specifies whether the key material expires. The default is KEY_MATERIAL_EXPIRES, in which case you must include the ValidTo parameter. When this parameter is set to KEY_MATERIAL_DOES_NOT_EXPIRE, you must omit the ValidTo parameter.
      */
    var ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined
    /**
      * The import token that you received in the response to a previous GetParametersForImport request. It must be from the same response that contained the public key that you used to encrypt the key material.
      */
    var ImportToken: CiphertextType
    /**
      * The identifier of the CMK to import the key material into. The CMK's Origin must be EXTERNAL. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
    /**
      * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. You must omit this parameter when the ExpirationModel parameter is set to KEY_MATERIAL_DOES_NOT_EXPIRE. Otherwise it is required.
      */
    var ValidTo: js.UndefOr[DateType] = js.undefined
  }
  
  trait ImportKeyMaterialResponse extends js.Object
  
  trait KeyListEntry extends js.Object {
    /**
      * ARN of the key.
      */
    var KeyArn: js.UndefOr[ArnType] = js.undefined
    /**
      * Unique identifier of the key.
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
  }
  
  trait KeyMetadata extends js.Object {
    /**
      * The twelve-digit account ID of the AWS account that owns the CMK.
      */
    var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the CMK. For examples, see AWS Key Management Service (AWS KMS) in the Example ARNs section of the AWS General Reference.
      */
    var Arn: js.UndefOr[ArnType] = js.undefined
    /**
      * The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a CMK in a custom key store, AWS KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This value is present only when the CMK is created in a custom key store.
      */
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
    /**
      * The date and time when the CMK was created.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * A unique identifier for the custom key store that contains the CMK. This value is present only when the CMK is created in a custom key store.
      */
    var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
    /**
      * The date and time after which AWS KMS deletes the CMK. This value is present only when KeyState is PendingDeletion.
      */
    var DeletionDate: js.UndefOr[DateType] = js.undefined
    /**
      * The description of the CMK.
      */
    var Description: js.UndefOr[DescriptionType] = js.undefined
    /**
      * Specifies whether the CMK is enabled. When KeyState is Enabled this value is true, otherwise it is false.
      */
    var Enabled: js.UndefOr[BooleanType] = js.undefined
    /**
      * Specifies whether the CMK's key material expires. This value is present only when Origin is EXTERNAL, otherwise this value is omitted.
      */
    var ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined
    /**
      * The globally unique identifier for the CMK.
      */
    var KeyId: KeyIdType
    /**
      * The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the difference, see Customer Master Keys in the AWS Key Management Service Developer Guide.
      */
    var KeyManager: js.UndefOr[KeyManagerType] = js.undefined
    /**
      * The state of the CMK. For more information about how key state affects the use of a CMK, see How Key State Affects the Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    var KeyState: js.UndefOr[KeyState] = js.undefined
    /**
      * The cryptographic operations for which you can use the CMK. Currently the only allowed value is ENCRYPT_DECRYPT, which means you can use the CMK for the Encrypt and Decrypt operations.
      */
    var KeyUsage: js.UndefOr[KeyUsageType] = js.undefined
    /**
      * The source of the CMK's key material. When this value is AWS_KMS, AWS KMS created the key material. When this value is EXTERNAL, the key material was imported from your existing key management infrastructure or the CMK lacks key material. When this value is AWS_CLOUDHSM, the key material was created in the AWS CloudHSM cluster associated with a custom key store.
      */
    var Origin: js.UndefOr[OriginType] = js.undefined
    /**
      * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose Origin is EXTERNAL and whose ExpirationModel is KEY_MATERIAL_EXPIRES, otherwise this value is omitted.
      */
    var ValidTo: js.UndefOr[DateType] = js.undefined
  }
  
  trait ListAliasesRequest extends js.Object {
    /**
      * Lists only aliases that refer to the specified CMK. The value of this parameter can be the ID or Amazon Resource Name (ARN) of a CMK in the caller's account and region. You cannot use an alias name or alias ARN in this value. This parameter is optional. If you omit it, ListAliases returns all aliases in the account and region.
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
    /**
      * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not return more than the specified number of items, but it might return fewer. This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a value, it defaults to 50.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
  }
  
  trait ListAliasesResponse extends js.Object {
    /**
      * A list of aliases.
      */
    var Aliases: js.UndefOr[AliasList] = js.undefined
    /**
      * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
      */
    var NextMarker: js.UndefOr[MarkerType] = js.undefined
    /**
      * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in this response to the Marker parameter in a subsequent request.
      */
    var Truncated: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait ListGrantsRequest extends js.Object {
    /**
      * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
    /**
      * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not return more than the specified number of items, but it might return fewer. This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a value, it defaults to 50.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
  }
  
  trait ListGrantsResponse extends js.Object {
    /**
      * A list of grants.
      */
    var Grants: js.UndefOr[GrantList] = js.undefined
    /**
      * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
      */
    var NextMarker: js.UndefOr[MarkerType] = js.undefined
    /**
      * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in this response to the Marker parameter in a subsequent request.
      */
    var Truncated: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait ListKeyPoliciesRequest extends js.Object {
    /**
      * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
    /**
      * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not return more than the specified number of items, but it might return fewer. This value is optional. If you include a value, it must be between 1 and 1000, inclusive. If you do not include a value, it defaults to 100. Currently only 1 policy can be attached to a key.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
  }
  
  trait ListKeyPoliciesResponse extends js.Object {
    /**
      * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
      */
    var NextMarker: js.UndefOr[MarkerType] = js.undefined
    /**
      * A list of key policy names. Currently, there is only one key policy per CMK and it is always named default.
      */
    var PolicyNames: js.UndefOr[PolicyNameList] = js.undefined
    /**
      * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in this response to the Marker parameter in a subsequent request.
      */
    var Truncated: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait ListKeysRequest extends js.Object {
    /**
      * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not return more than the specified number of items, but it might return fewer. This value is optional. If you include a value, it must be between 1 and 1000, inclusive. If you do not include a value, it defaults to 100.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
  }
  
  trait ListKeysResponse extends js.Object {
    /**
      * A list of customer master keys (CMKs).
      */
    var Keys: js.UndefOr[KeyList] = js.undefined
    /**
      * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
      */
    var NextMarker: js.UndefOr[MarkerType] = js.undefined
    /**
      * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in this response to the Marker parameter in a subsequent request.
      */
    var Truncated: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait ListResourceTagsRequest extends js.Object {
    /**
      * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
    /**
      * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not return more than the specified number of items, but it might return fewer. This value is optional. If you include a value, it must be between 1 and 50, inclusive. If you do not include a value, it defaults to 50.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received. Do not attempt to construct this value. Use only the value of NextMarker from the truncated response you just received.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
  }
  
  trait ListResourceTagsResponse extends js.Object {
    /**
      * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request. Do not assume or infer any information from this value.
      */
    var NextMarker: js.UndefOr[MarkerType] = js.undefined
    /**
      * A list of tags. Each tag consists of a tag key and a tag value.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in this response to the Marker parameter in a subsequent request.
      */
    var Truncated: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait ListRetirableGrantsRequest extends js.Object {
    /**
      * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not return more than the specified number of items, but it might return fewer. This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a value, it defaults to 50.
      */
    var Limit: js.UndefOr[LimitType] = js.undefined
    /**
      * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
      */
    var Marker: js.UndefOr[MarkerType] = js.undefined
    /**
      * The retiring principal for which to list grants. To specify the retiring principal, use the Amazon Resource Name (ARN) of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated users, and assumed role users. For examples of the ARN syntax for specifying a principal, see AWS Identity and Access Management (IAM) in the Example ARNs section of the Amazon Web Services General Reference.
      */
    var RetiringPrincipal: PrincipalIdType
  }
  
  trait PutKeyPolicyRequest extends js.Object {
    /**
      * A flag to indicate whether to bypass the key policy lockout safety check.  Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true indiscriminately. For more information, refer to the scenario in the Default Key Policy section in the AWS Key Management Service Developer Guide.  Use this parameter only when you intend to prevent the principal that is making the request from making a subsequent PutKeyPolicy request on the CMK. The default value is false.
      */
    var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined
    /**
      * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
    /**
      * The key policy to attach to the CMK. The key policy must meet the following criteria:   If you don't set BypassPolicyLockoutSafetyCheck to true, the key policy must allow the principal that is making the PutKeyPolicy request to make a subsequent PutKeyPolicy request on the CMK. This reduces the risk that the CMK becomes unmanageable. For more information, refer to the scenario in the Default Key Policy section of the AWS Key Management Service Developer Guide.   Each statement in the key policy must contain one or more principals. The principals in the key policy must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need to enforce a delay before including the new principal in a key policy because the new principal might not be immediately visible to AWS KMS. For more information, see Changes that I make are not always immediately visible in the AWS Identity and Access Management User Guide.   The key policy size limit is 32 kilobytes (32768 bytes).
      */
    var Policy: PolicyType
    /**
      * The name of the key policy. The only valid value is default.
      */
    var PolicyName: PolicyNameType
  }
  
  trait ReEncryptRequest extends js.Object {
    /**
      * Ciphertext of the data to reencrypt.
      */
    var CiphertextBlob: CiphertextType
    /**
      * Encryption context to use when the data is reencrypted.
      */
    var DestinationEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
    /**
      * A unique identifier for the CMK that is used to reencrypt the data. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
      */
    var DestinationKeyId: KeyIdType
    /**
      * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
      */
    var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
    /**
      * Encryption context used to encrypt and decrypt the data specified in the CiphertextBlob parameter.
      */
    var SourceEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
  }
  
  trait ReEncryptResponse extends js.Object {
    /**
      * The reencrypted data. When you use the HTTP API or the AWS CLI, the value is Base64-encdoded. Otherwise, it is not encoded.
      */
    var CiphertextBlob: js.UndefOr[CiphertextType] = js.undefined
    /**
      * Unique identifier of the CMK used to reencrypt the data.
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
    /**
      * Unique identifier of the CMK used to originally encrypt the data.
      */
    var SourceKeyId: js.UndefOr[KeyIdType] = js.undefined
  }
  
  trait RetireGrantRequest extends js.Object {
    /**
      * Unique identifier of the grant to retire. The grant ID is returned in the response to a CreateGrant operation.   Grant ID Example - 0123456789012345678901234567890123456789012345678901234567890123  
      */
    var GrantId: js.UndefOr[GrantIdType] = js.undefined
    /**
      * Token that identifies the grant to be retired.
      */
    var GrantToken: js.UndefOr[GrantTokenType] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the CMK associated with the grant.  For example: arn:aws:kms:us-east-2:444455556666:key/1234abcd-12ab-34cd-56ef-1234567890ab 
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
  }
  
  trait RevokeGrantRequest extends js.Object {
    /**
      * Identifier of the grant to be revoked.
      */
    var GrantId: GrantIdType
    /**
      * A unique identifier for the customer master key associated with the grant. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
  }
  
  trait ScheduleKeyDeletionRequest extends js.Object {
    /**
      * The unique identifier of the customer master key (CMK) to delete. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
    /**
      * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the customer master key (CMK). This value is optional. If you include a value, it must be between 7 and 30, inclusive. If you do not include a value, it defaults to 30.
      */
    var PendingWindowInDays: js.UndefOr[PendingWindowInDaysType] = js.undefined
  }
  
  trait ScheduleKeyDeletionResponse extends js.Object {
    /**
      * The date and time after which AWS KMS deletes the customer master key (CMK).
      */
    var DeletionDate: js.UndefOr[DateType] = js.undefined
    /**
      * The unique identifier of the customer master key (CMK) for which deletion is scheduled.
      */
    var KeyId: js.UndefOr[KeyIdType] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The key of the tag.
      */
    var TagKey: TagKeyType
    /**
      * The value of the tag.
      */
    var TagValue: TagValueType
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * A unique identifier for the CMK you are tagging. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
    /**
      * One or more tags. Each tag consists of a tag key and a tag value.
      */
    var Tags: TagList
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Cancels the deletion of a customer master key (CMK). When this operation is successful, the CMK is set to the Disabled state. To enable a CMK, use EnableKey. You cannot perform this operation on a CMK in a different AWS account. For more information about scheduling and canceling deletion of a CMK, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def cancelKeyDeletion(): awsDashSdkLib.libRequestMod.Request[CancelKeyDeletionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelKeyDeletion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelKeyDeletionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelKeyDeletionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels the deletion of a customer master key (CMK). When this operation is successful, the CMK is set to the Disabled state. To enable a CMK, use EnableKey. You cannot perform this operation on a CMK in a different AWS account. For more information about scheduling and canceling deletion of a CMK, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def cancelKeyDeletion(params: CancelKeyDeletionRequest): awsDashSdkLib.libRequestMod.Request[CancelKeyDeletionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelKeyDeletion(
      params: CancelKeyDeletionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelKeyDeletionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelKeyDeletionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Connects or reconnects a custom key store to its associated AWS CloudHSM cluster. The custom key store must be connected before you can create customer master keys (CMKs) in the key store or use the CMKs it contains. You can disconnect and reconnect a custom key store at any time. To connect a custom key store, its associated AWS CloudHSM cluster must have at least one active HSM. To get the number of active HSMs in a cluster, use the DescribeClusters operation. To add HSMs to the cluster, use the CreateHsm operation. The connection process can take an extended amount of time to complete; up to 20 minutes. This operation starts the connection process, but it does not wait for it to complete. When it succeeds, this operation quickly returns an HTTP 200 response and a JSON object with no properties. However, this response does not indicate that the custom key store is connected. To get the connection state of the custom key store, use the DescribeCustomKeyStores operation. During the connection process, AWS KMS finds the AWS CloudHSM cluster that is associated with the custom key store, creates the connection infrastructure, connects to the cluster, logs into the AWS CloudHSM client as the  kmsuser crypto user (CU), and rotates its password. The ConnectCustomKeyStore operation might fail for various reasons. To find the reason, use the DescribeCustomKeyStores operation and see the ConnectionErrorCode in the response. For help interpreting the ConnectionErrorCode, see CustomKeyStoresListEntry. To fix the failure, use the DisconnectCustomKeyStore operation to disconnect the custom key store, correct the error, use the UpdateCustomKeyStore operation if necessary, and then use ConnectCustomKeyStore again. If you are having trouble connecting or disconnecting a custom key store, see Troubleshooting a Custom Key Store in the AWS Key Management Service Developer Guide.
      */
    def connectCustomKeyStore(): awsDashSdkLib.libRequestMod.Request[ConnectCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def connectCustomKeyStore(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConnectCustomKeyStoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConnectCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Connects or reconnects a custom key store to its associated AWS CloudHSM cluster. The custom key store must be connected before you can create customer master keys (CMKs) in the key store or use the CMKs it contains. You can disconnect and reconnect a custom key store at any time. To connect a custom key store, its associated AWS CloudHSM cluster must have at least one active HSM. To get the number of active HSMs in a cluster, use the DescribeClusters operation. To add HSMs to the cluster, use the CreateHsm operation. The connection process can take an extended amount of time to complete; up to 20 minutes. This operation starts the connection process, but it does not wait for it to complete. When it succeeds, this operation quickly returns an HTTP 200 response and a JSON object with no properties. However, this response does not indicate that the custom key store is connected. To get the connection state of the custom key store, use the DescribeCustomKeyStores operation. During the connection process, AWS KMS finds the AWS CloudHSM cluster that is associated with the custom key store, creates the connection infrastructure, connects to the cluster, logs into the AWS CloudHSM client as the  kmsuser crypto user (CU), and rotates its password. The ConnectCustomKeyStore operation might fail for various reasons. To find the reason, use the DescribeCustomKeyStores operation and see the ConnectionErrorCode in the response. For help interpreting the ConnectionErrorCode, see CustomKeyStoresListEntry. To fix the failure, use the DisconnectCustomKeyStore operation to disconnect the custom key store, correct the error, use the UpdateCustomKeyStore operation if necessary, and then use ConnectCustomKeyStore again. If you are having trouble connecting or disconnecting a custom key store, see Troubleshooting a Custom Key Store in the AWS Key Management Service Developer Guide.
      */
    def connectCustomKeyStore(params: ConnectCustomKeyStoreRequest): awsDashSdkLib.libRequestMod.Request[ConnectCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def connectCustomKeyStore(
      params: ConnectCustomKeyStoreRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ConnectCustomKeyStoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ConnectCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a display name for a customer master key (CMK). You can use an alias to identify a CMK in selected operations, such as Encrypt and GenerateDataKey.  Each CMK can have multiple aliases, but each alias points to only one CMK. The alias name must be unique in the AWS account and region. To simplify code that runs in multiple regions, use the same alias name, but point it to a different CMK in each region.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation. An alias must start with the word alias followed by a forward slash (alias/). The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws; that alias name prefix is reserved by Amazon Web Services (AWS). The alias and the CMK it is mapped to must be in the same AWS account and the same region. You cannot perform this operation on an alias in a different AWS account. To map an existing alias to a different CMK, call UpdateAlias. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def createAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAlias(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a display name for a customer master key (CMK). You can use an alias to identify a CMK in selected operations, such as Encrypt and GenerateDataKey.  Each CMK can have multiple aliases, but each alias points to only one CMK. The alias name must be unique in the AWS account and region. To simplify code that runs in multiple regions, use the same alias name, but point it to a different CMK in each region.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation. An alias must start with the word alias followed by a forward slash (alias/). The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws; that alias name prefix is reserved by Amazon Web Services (AWS). The alias and the CMK it is mapped to must be in the same AWS account and the same region. You cannot perform this operation on an alias in a different AWS account. To map an existing alias to a different CMK, call UpdateAlias. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def createAlias(params: CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAlias(
      params: CreateAliasRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a custom key store that is associated with an AWS CloudHSM cluster that you own and manage. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store. When the operation completes successfully, it returns the ID of the new custom key store. Before you can use your new custom key store, you need to use the ConnectCustomKeyStore operation to connect the new key store to its AWS CloudHSM cluster. The CreateCustomKeyStore operation requires the following elements.   You must specify an active AWS CloudHSM cluster in the same account and AWS Region as the custom key store. You can use an existing cluster or create and activate a new AWS CloudHSM cluster for the key store. AWS KMS does not require exclusive use of the cluster.   You must include the content of the trust anchor certificate for the cluster. You created this certificate, and saved it in the customerCA.crt file, when you initialized the cluster.   You must provide the password of the dedicated  kmsuser crypto user (CU) account in the cluster. Before you create the custom key store, use the createUser command in cloudhsm_mgmt_util to create a crypto user (CU) named kmsuser in specified AWS CloudHSM cluster. AWS KMS uses the kmsuser CU account to create and manage key material on your behalf. For instructions, see Create the kmsuser Crypto User in the AWS Key Management Service Developer Guide.   The AWS CloudHSM cluster that you specify must meet the following requirements.   The cluster must be active and be in the same AWS account and Region as the custom key store.   Each custom key store must be associated with a different AWS CloudHSM cluster. The cluster cannot be associated with another custom key store or have the same cluster certificate as a cluster that is associated with another custom key store. To view the cluster certificate, use the AWS CloudHSM DescribeClusters operation. Clusters that share a backup history have the same cluster certificate.   The cluster must be configured with subnets in at least two different Availability Zones in the Region. Because AWS CloudHSM is not supported in all Availability Zones, we recommend that the cluster have subnets in all Availability Zones in the Region.   The cluster must contain at least two active HSMs, each in a different Availability Zone.   New custom key stores are not automatically connected. After you create your custom key store, use the ConnectCustomKeyStore operation to connect the custom key store to its associated AWS CloudHSM cluster. Even if you are not going to use your custom key store immediately, you might want to connect it to verify that all settings are correct and then disconnect it until you are ready to use it. If this operation succeeds, it returns the ID of the new custom key store. For help with failures, see Troubleshoot a Custom Key Store in the AWS KMS Developer Guide.
      */
    def createCustomKeyStore(): awsDashSdkLib.libRequestMod.Request[CreateCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCustomKeyStore(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCustomKeyStoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a custom key store that is associated with an AWS CloudHSM cluster that you own and manage. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store. When the operation completes successfully, it returns the ID of the new custom key store. Before you can use your new custom key store, you need to use the ConnectCustomKeyStore operation to connect the new key store to its AWS CloudHSM cluster. The CreateCustomKeyStore operation requires the following elements.   You must specify an active AWS CloudHSM cluster in the same account and AWS Region as the custom key store. You can use an existing cluster or create and activate a new AWS CloudHSM cluster for the key store. AWS KMS does not require exclusive use of the cluster.   You must include the content of the trust anchor certificate for the cluster. You created this certificate, and saved it in the customerCA.crt file, when you initialized the cluster.   You must provide the password of the dedicated  kmsuser crypto user (CU) account in the cluster. Before you create the custom key store, use the createUser command in cloudhsm_mgmt_util to create a crypto user (CU) named kmsuser in specified AWS CloudHSM cluster. AWS KMS uses the kmsuser CU account to create and manage key material on your behalf. For instructions, see Create the kmsuser Crypto User in the AWS Key Management Service Developer Guide.   The AWS CloudHSM cluster that you specify must meet the following requirements.   The cluster must be active and be in the same AWS account and Region as the custom key store.   Each custom key store must be associated with a different AWS CloudHSM cluster. The cluster cannot be associated with another custom key store or have the same cluster certificate as a cluster that is associated with another custom key store. To view the cluster certificate, use the AWS CloudHSM DescribeClusters operation. Clusters that share a backup history have the same cluster certificate.   The cluster must be configured with subnets in at least two different Availability Zones in the Region. Because AWS CloudHSM is not supported in all Availability Zones, we recommend that the cluster have subnets in all Availability Zones in the Region.   The cluster must contain at least two active HSMs, each in a different Availability Zone.   New custom key stores are not automatically connected. After you create your custom key store, use the ConnectCustomKeyStore operation to connect the custom key store to its associated AWS CloudHSM cluster. Even if you are not going to use your custom key store immediately, you might want to connect it to verify that all settings are correct and then disconnect it until you are ready to use it. If this operation succeeds, it returns the ID of the new custom key store. For help with failures, see Troubleshoot a Custom Key Store in the AWS KMS Developer Guide.
      */
    def createCustomKeyStore(params: CreateCustomKeyStoreRequest): awsDashSdkLib.libRequestMod.Request[CreateCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createCustomKeyStore(
      params: CreateCustomKeyStoreRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateCustomKeyStoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a grant to a customer master key (CMK). The grant specifies who can use the CMK and under what conditions. When setting permissions, grants are an alternative to key policies.  To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter. For more information about grants, see Grants in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def createGrant(): awsDashSdkLib.libRequestMod.Request[CreateGrantResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGrant(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGrantResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGrantResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a grant to a customer master key (CMK). The grant specifies who can use the CMK and under what conditions. When setting permissions, grants are an alternative to key policies.  To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter. For more information about grants, see Grants in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def createGrant(params: CreateGrantRequest): awsDashSdkLib.libRequestMod.Request[CreateGrantResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGrant(
      params: CreateGrantRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGrantResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGrantResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a customer master key (CMK) in the caller's AWS account. You can use a CMK to encrypt small amounts of data (4 KiB or less) directly, but CMKs are more commonly used to encrypt data keys, which are used to encrypt raw data. For more information about data keys and the difference between CMKs and data keys, see the following:   The GenerateDataKey operation    AWS Key Management Service Concepts in the AWS Key Management Service Developer Guide    If you plan to import key material, use the Origin parameter with a value of EXTERNAL to create a CMK with no key material. To create a CMK in a custom key store, use CustomKeyStoreId parameter to specify the custom key store. You must also use the Origin parameter with a value of AWS_CLOUDHSM. The AWS CloudHSM cluster that is associated with the custom key store must have at least two active HSMs, each in a different Availability Zone in the Region. You cannot use this operation to create a CMK in a different AWS account.
      */
    def createKey(): awsDashSdkLib.libRequestMod.Request[CreateKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createKey(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a customer master key (CMK) in the caller's AWS account. You can use a CMK to encrypt small amounts of data (4 KiB or less) directly, but CMKs are more commonly used to encrypt data keys, which are used to encrypt raw data. For more information about data keys and the difference between CMKs and data keys, see the following:   The GenerateDataKey operation    AWS Key Management Service Concepts in the AWS Key Management Service Developer Guide    If you plan to import key material, use the Origin parameter with a value of EXTERNAL to create a CMK with no key material. To create a CMK in a custom key store, use CustomKeyStoreId parameter to specify the custom key store. You must also use the Origin parameter with a value of AWS_CLOUDHSM. The AWS CloudHSM cluster that is associated with the custom key store must have at least two active HSMs, each in a different Availability Zone in the Region. You cannot use this operation to create a CMK in a different AWS account.
      */
    def createKey(params: CreateKeyRequest): awsDashSdkLib.libRequestMod.Request[CreateKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createKey(
      params: CreateKeyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Decrypts ciphertext. Ciphertext is plaintext that has been previously encrypted by using any of the following operations:    GenerateDataKey     GenerateDataKeyWithoutPlaintext     Encrypt    Note that if a caller has been granted access permissions to all keys (through, for example, IAM user policies that grant Decrypt permission on all resources), then ciphertext encrypted by using keys in other accounts where the key grants access to the caller can be decrypted. To remedy this, we recommend that you do not grant Decrypt access in an IAM user policy. Instead grant Decrypt access only in key policies. If you must grant Decrypt access in an IAM user policy, you should scope the resource to specific keys or to specific trusted accounts. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def decrypt(): awsDashSdkLib.libRequestMod.Request[DecryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def decrypt(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DecryptResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DecryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Decrypts ciphertext. Ciphertext is plaintext that has been previously encrypted by using any of the following operations:    GenerateDataKey     GenerateDataKeyWithoutPlaintext     Encrypt    Note that if a caller has been granted access permissions to all keys (through, for example, IAM user policies that grant Decrypt permission on all resources), then ciphertext encrypted by using keys in other accounts where the key grants access to the caller can be decrypted. To remedy this, we recommend that you do not grant Decrypt access in an IAM user policy. Instead grant Decrypt access only in key policies. If you must grant Decrypt access in an IAM user policy, you should scope the resource to specific keys or to specific trusted accounts. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def decrypt(params: DecryptRequest): awsDashSdkLib.libRequestMod.Request[DecryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def decrypt(
      params: DecryptRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ DecryptResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[DecryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified alias. You cannot perform this operation on an alias in a different AWS account.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation.  Each CMK can have multiple aliases. To change the alias of a CMK, use DeleteAlias to delete the current alias and CreateAlias to create a new alias. To associate an existing alias with a different customer master key (CMK), call UpdateAlias.
      */
    def deleteAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAlias(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified alias. You cannot perform this operation on an alias in a different AWS account.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation.  Each CMK can have multiple aliases. To change the alias of a CMK, use DeleteAlias to delete the current alias and CreateAlias to create a new alias. To associate an existing alias with a different customer master key (CMK), call UpdateAlias.
      */
    def deleteAlias(params: DeleteAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAlias(
      params: DeleteAliasRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a custom key store. This operation does not delete the AWS CloudHSM cluster that is associated with the custom key store, or affect any users or keys in the cluster. The custom key store that you delete cannot contain any AWS KMS customer master keys (CMKs). Before deleting the key store, verify that you will never need to use any of the CMKs in the key store for any cryptographic operations. Then, use ScheduleKeyDeletion to delete the AWS KMS customer master keys (CMKs) from the key store. When the scheduled waiting period expires, the ScheduleKeyDeletion operation deletes the CMKs. Then it makes a best effort to delete the key material from the associated cluster. However, you might need to manually delete the orphaned key material from the cluster and its backups. After all CMKs are deleted from AWS KMS, use DisconnectCustomKeyStore to disconnect the key store from AWS KMS. Then, you can delete the custom key store. Instead of deleting the custom key store, consider using DisconnectCustomKeyStore to disconnect it from AWS KMS. While the key store is disconnected, you cannot create or use the CMKs in the key store. But, you do not need to delete CMKs and you can reconnect a disconnected custom key store at any time. If the operation succeeds, it returns a JSON object with no properties. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store.
      */
    def deleteCustomKeyStore(): awsDashSdkLib.libRequestMod.Request[DeleteCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCustomKeyStore(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCustomKeyStoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a custom key store. This operation does not delete the AWS CloudHSM cluster that is associated with the custom key store, or affect any users or keys in the cluster. The custom key store that you delete cannot contain any AWS KMS customer master keys (CMKs). Before deleting the key store, verify that you will never need to use any of the CMKs in the key store for any cryptographic operations. Then, use ScheduleKeyDeletion to delete the AWS KMS customer master keys (CMKs) from the key store. When the scheduled waiting period expires, the ScheduleKeyDeletion operation deletes the CMKs. Then it makes a best effort to delete the key material from the associated cluster. However, you might need to manually delete the orphaned key material from the cluster and its backups. After all CMKs are deleted from AWS KMS, use DisconnectCustomKeyStore to disconnect the key store from AWS KMS. Then, you can delete the custom key store. Instead of deleting the custom key store, consider using DisconnectCustomKeyStore to disconnect it from AWS KMS. While the key store is disconnected, you cannot create or use the CMKs in the key store. But, you do not need to delete CMKs and you can reconnect a disconnected custom key store at any time. If the operation succeeds, it returns a JSON object with no properties. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store.
      */
    def deleteCustomKeyStore(params: DeleteCustomKeyStoreRequest): awsDashSdkLib.libRequestMod.Request[DeleteCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteCustomKeyStore(
      params: DeleteCustomKeyStoreRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteCustomKeyStoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes key material that you previously imported. This operation makes the specified customer master key (CMK) unusable. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You cannot perform this operation on a CMK in a different AWS account. When the specified CMK is in the PendingDeletion state, this operation does not change the CMK's state. Otherwise, it changes the CMK's state to PendingImport. After you delete key material, you can use ImportKeyMaterial to reimport the same key material into the CMK. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def deleteImportedKeyMaterial(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteImportedKeyMaterial(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes key material that you previously imported. This operation makes the specified customer master key (CMK) unusable. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You cannot perform this operation on a CMK in a different AWS account. When the specified CMK is in the PendingDeletion state, this operation does not change the CMK's state. Otherwise, it changes the CMK's state to PendingImport. After you delete key material, you can use ImportKeyMaterial to reimport the same key material into the CMK. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def deleteImportedKeyMaterial(params: DeleteImportedKeyMaterialRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteImportedKeyMaterial(
      params: DeleteImportedKeyMaterialRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about custom key stores in the account and region. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store. By default, this operation returns information about all custom key stores in the account and region. To get only information about a particular custom key store, use either the CustomKeyStoreName or CustomKeyStoreId parameter (but not both). To determine whether the custom key store is connected to its AWS CloudHSM cluster, use the ConnectionState element in the response. If an attempt to connect the custom key store failed, the ConnectionState value is FAILED and the ConnectionErrorCode element in the response indicates the cause of the failure. For help interpreting the ConnectionErrorCode, see CustomKeyStoresListEntry. Custom key stores have a DISCONNECTED connection state if the key store has never been connected or you use the DisconnectCustomKeyStore operation to disconnect it. If your custom key store state is CONNECTED but you are having trouble using it, make sure that its associated AWS CloudHSM cluster is active and contains the minimum number of HSMs required for the operation, if any.  For help repairing your custom key store, see the Troubleshooting Custom Key Stores topic in the AWS Key Management Service Developer Guide.
      */
    def describeCustomKeyStores(): awsDashSdkLib.libRequestMod.Request[DescribeCustomKeyStoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCustomKeyStores(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCustomKeyStoresResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCustomKeyStoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets information about custom key stores in the account and region. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store. By default, this operation returns information about all custom key stores in the account and region. To get only information about a particular custom key store, use either the CustomKeyStoreName or CustomKeyStoreId parameter (but not both). To determine whether the custom key store is connected to its AWS CloudHSM cluster, use the ConnectionState element in the response. If an attempt to connect the custom key store failed, the ConnectionState value is FAILED and the ConnectionErrorCode element in the response indicates the cause of the failure. For help interpreting the ConnectionErrorCode, see CustomKeyStoresListEntry. Custom key stores have a DISCONNECTED connection state if the key store has never been connected or you use the DisconnectCustomKeyStore operation to disconnect it. If your custom key store state is CONNECTED but you are having trouble using it, make sure that its associated AWS CloudHSM cluster is active and contains the minimum number of HSMs required for the operation, if any.  For help repairing your custom key store, see the Troubleshooting Custom Key Stores topic in the AWS Key Management Service Developer Guide.
      */
    def describeCustomKeyStores(params: DescribeCustomKeyStoresRequest): awsDashSdkLib.libRequestMod.Request[DescribeCustomKeyStoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeCustomKeyStores(
      params: DescribeCustomKeyStoresRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeCustomKeyStoresResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeCustomKeyStoresResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides detailed information about the specified customer master key (CMK). If you use DescribeKey on a predefined AWS alias, that is, an AWS alias with no key ID, AWS KMS associates the alias with an AWS managed CMK and returns its KeyId and Arn in the response. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter.
      */
    def describeKey(): awsDashSdkLib.libRequestMod.Request[DescribeKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeKey(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Provides detailed information about the specified customer master key (CMK). If you use DescribeKey on a predefined AWS alias, that is, an AWS alias with no key ID, AWS KMS associates the alias with an AWS managed CMK and returns its KeyId and Arn in the response. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter.
      */
    def describeKey(params: DescribeKeyRequest): awsDashSdkLib.libRequestMod.Request[DescribeKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeKey(
      params: DescribeKeyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the state of a customer master key (CMK) to disabled, thereby preventing its use for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. For more information about how key state affects the use of a CMK, see How Key State Affects the Use of a Customer Master Key in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def disableKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the state of a customer master key (CMK) to disabled, thereby preventing its use for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. For more information about how key state affects the use of a CMK, see How Key State Affects the Use of a Customer Master Key in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def disableKey(params: DisableKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableKey(
      params: DisableKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def disableKeyRotation(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableKeyRotation(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def disableKeyRotation(params: DisableKeyRotationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disableKeyRotation(
      params: DisableKeyRotationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disconnects the custom key store from its associated AWS CloudHSM cluster. While a custom key store is disconnected, you can manage the custom key store and its customer master keys (CMKs), but you cannot create or use CMKs in the custom key store. You can reconnect the custom key store at any time.  While a custom key store is disconnected, all attempts to create customer master keys (CMKs) in the custom key store or to use existing CMKs in cryptographic operations will fail. This action can prevent users from storing and accessing sensitive data.   To find the connection state of a custom key store, use the DescribeCustomKeyStores operation. To reconnect a custom key store, use the ConnectCustomKeyStore operation. If the operation succeeds, it returns a JSON object with no properties. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store.
      */
    def disconnectCustomKeyStore(): awsDashSdkLib.libRequestMod.Request[DisconnectCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disconnectCustomKeyStore(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisconnectCustomKeyStoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisconnectCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disconnects the custom key store from its associated AWS CloudHSM cluster. While a custom key store is disconnected, you can manage the custom key store and its customer master keys (CMKs), but you cannot create or use CMKs in the custom key store. You can reconnect the custom key store at any time.  While a custom key store is disconnected, all attempts to create customer master keys (CMKs) in the custom key store or to use existing CMKs in cryptographic operations will fail. This action can prevent users from storing and accessing sensitive data.   To find the connection state of a custom key store, use the DescribeCustomKeyStores operation. To reconnect a custom key store, use the ConnectCustomKeyStore operation. If the operation succeeds, it returns a JSON object with no properties. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store.
      */
    def disconnectCustomKeyStore(params: DisconnectCustomKeyStoreRequest): awsDashSdkLib.libRequestMod.Request[DisconnectCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disconnectCustomKeyStore(
      params: DisconnectCustomKeyStoreRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisconnectCustomKeyStoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisconnectCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the key state of a customer master key (CMK) to enabled. This allows you to use the CMK for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def enableKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableKey(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the key state of a customer master key (CMK) to enabled. This allows you to use the CMK for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def enableKey(params: EnableKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableKey(
      params: EnableKeyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. You cannot enable automatic rotation of CMKs with imported key material or CMKs in a custom key store. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def enableKeyRotation(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableKeyRotation(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. You cannot enable automatic rotation of CMKs with imported key material or CMKs in a custom key store. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def enableKeyRotation(params: EnableKeyRotationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def enableKeyRotation(
      params: EnableKeyRotationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Encrypts plaintext into ciphertext by using a customer master key (CMK). The Encrypt operation has two primary use cases:   You can encrypt up to 4 kilobytes (4096 bytes) of arbitrary data such as an RSA key, a database password, or other sensitive information.   To move encrypted data from one AWS region to another, you can use this operation to encrypt in the new region the plaintext data key that was used to encrypt the data in the original region. This provides you with an encrypted copy of the data key that can be decrypted in the new region and used there to decrypt the encrypted data.   To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. Unless you are moving encrypted data from one region to another, you don't use this operation to encrypt a generated data key within a region. To get data keys that are already encrypted, call the GenerateDataKey or GenerateDataKeyWithoutPlaintext operation. Data keys don't need to be encrypted again by calling Encrypt. To encrypt data locally in your application, use the GenerateDataKey operation to return a plaintext data encryption key and a copy of the key encrypted under the CMK of your choosing. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def encrypt(): awsDashSdkLib.libRequestMod.Request[EncryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def encrypt(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EncryptResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EncryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Encrypts plaintext into ciphertext by using a customer master key (CMK). The Encrypt operation has two primary use cases:   You can encrypt up to 4 kilobytes (4096 bytes) of arbitrary data such as an RSA key, a database password, or other sensitive information.   To move encrypted data from one AWS region to another, you can use this operation to encrypt in the new region the plaintext data key that was used to encrypt the data in the original region. This provides you with an encrypted copy of the data key that can be decrypted in the new region and used there to decrypt the encrypted data.   To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. Unless you are moving encrypted data from one region to another, you don't use this operation to encrypt a generated data key within a region. To get data keys that are already encrypted, call the GenerateDataKey or GenerateDataKeyWithoutPlaintext operation. Data keys don't need to be encrypted again by calling Encrypt. To encrypt data locally in your application, use the GenerateDataKey operation to return a plaintext data encryption key and a copy of the key encrypted under the CMK of your choosing. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def encrypt(params: EncryptRequest): awsDashSdkLib.libRequestMod.Request[EncryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def encrypt(
      params: EncryptRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ EncryptResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[EncryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a data encryption key that you can use in your application to encrypt data locally.  You must specify the customer master key (CMK) under which to generate the data key. You must also specify the length of the data key using either the KeySpec or NumberOfBytes field. You must specify one field or the other, but not both. For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use KeySpec. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation returns a plaintext copy of the data key in the Plaintext field of the response, and an encrypted copy of the data key in the CiphertextBlob field. The data key is encrypted under the CMK specified in the KeyId field of the request.  We recommend that you use the following pattern to encrypt data locally in your application:   Use this operation (GenerateDataKey) to get a data encryption key.   Use the plaintext data encryption key (returned in the Plaintext field of the response) to encrypt data locally, then erase the plaintext data key from memory.   Store the encrypted data key (returned in the CiphertextBlob field of the response) alongside the locally encrypted data.   To decrypt data locally:   Use the Decrypt operation to decrypt the encrypted data key into a plaintext copy of the data key.   Use the plaintext data key to decrypt data locally, then erase the plaintext data key from memory.   To return only an encrypted copy of the data key, use GenerateDataKeyWithoutPlaintext. To return a random byte string that is cryptographically secure, use GenerateRandom. If you use the optional EncryptionContext field, you must store at least enough information to be able to reconstruct the full encryption context when you later send the ciphertext to the Decrypt operation. It is a good practice to choose an encryption context that you can reconstruct on the fly to better secure the ciphertext. For more information, see Encryption Context in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def generateDataKey(): awsDashSdkLib.libRequestMod.Request[GenerateDataKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def generateDataKey(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GenerateDataKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GenerateDataKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a data encryption key that you can use in your application to encrypt data locally.  You must specify the customer master key (CMK) under which to generate the data key. You must also specify the length of the data key using either the KeySpec or NumberOfBytes field. You must specify one field or the other, but not both. For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use KeySpec. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation returns a plaintext copy of the data key in the Plaintext field of the response, and an encrypted copy of the data key in the CiphertextBlob field. The data key is encrypted under the CMK specified in the KeyId field of the request.  We recommend that you use the following pattern to encrypt data locally in your application:   Use this operation (GenerateDataKey) to get a data encryption key.   Use the plaintext data encryption key (returned in the Plaintext field of the response) to encrypt data locally, then erase the plaintext data key from memory.   Store the encrypted data key (returned in the CiphertextBlob field of the response) alongside the locally encrypted data.   To decrypt data locally:   Use the Decrypt operation to decrypt the encrypted data key into a plaintext copy of the data key.   Use the plaintext data key to decrypt data locally, then erase the plaintext data key from memory.   To return only an encrypted copy of the data key, use GenerateDataKeyWithoutPlaintext. To return a random byte string that is cryptographically secure, use GenerateRandom. If you use the optional EncryptionContext field, you must store at least enough information to be able to reconstruct the full encryption context when you later send the ciphertext to the Decrypt operation. It is a good practice to choose an encryption context that you can reconstruct on the fly to better secure the ciphertext. For more information, see Encryption Context in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def generateDataKey(params: GenerateDataKeyRequest): awsDashSdkLib.libRequestMod.Request[GenerateDataKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def generateDataKey(
      params: GenerateDataKeyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GenerateDataKeyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GenerateDataKeyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a data encryption key encrypted under a customer master key (CMK). This operation is identical to GenerateDataKey but returns only the encrypted copy of the data key.  To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation is useful in a system that has multiple components with different degrees of trust. For example, consider a system that stores encrypted data in containers. Each container stores the encrypted data and an encrypted copy of the data key. One component of the system, called the control plane, creates new containers. When it creates a new container, it uses this operation (GenerateDataKeyWithoutPlaintext) to get an encrypted data key and then stores it in the container. Later, a different component of the system, called the data plane, puts encrypted data into the containers. To do this, it passes the encrypted data key to the Decrypt operation, then uses the returned plaintext data key to encrypt data, and finally stores the encrypted data in the container. In this system, the control plane never sees the plaintext data key. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def generateDataKeyWithoutPlaintext(): awsDashSdkLib.libRequestMod.Request[GenerateDataKeyWithoutPlaintextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def generateDataKeyWithoutPlaintext(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GenerateDataKeyWithoutPlaintextResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GenerateDataKeyWithoutPlaintextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a data encryption key encrypted under a customer master key (CMK). This operation is identical to GenerateDataKey but returns only the encrypted copy of the data key.  To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation is useful in a system that has multiple components with different degrees of trust. For example, consider a system that stores encrypted data in containers. Each container stores the encrypted data and an encrypted copy of the data key. One component of the system, called the control plane, creates new containers. When it creates a new container, it uses this operation (GenerateDataKeyWithoutPlaintext) to get an encrypted data key and then stores it in the container. Later, a different component of the system, called the data plane, puts encrypted data into the containers. To do this, it passes the encrypted data key to the Decrypt operation, then uses the returned plaintext data key to encrypt data, and finally stores the encrypted data in the container. In this system, the control plane never sees the plaintext data key. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def generateDataKeyWithoutPlaintext(params: GenerateDataKeyWithoutPlaintextRequest): awsDashSdkLib.libRequestMod.Request[GenerateDataKeyWithoutPlaintextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def generateDataKeyWithoutPlaintext(
      params: GenerateDataKeyWithoutPlaintextRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GenerateDataKeyWithoutPlaintextResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GenerateDataKeyWithoutPlaintextResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a random byte string that is cryptographically secure. By default, the random byte string is generated in AWS KMS. To generate the byte string in the AWS CloudHSM cluster that is associated with a custom key store, specify the custom key store ID. For more information about entropy and random number generation, see the AWS Key Management Service Cryptographic Details whitepaper.
      */
    def generateRandom(): awsDashSdkLib.libRequestMod.Request[GenerateRandomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def generateRandom(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GenerateRandomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GenerateRandomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a random byte string that is cryptographically secure. By default, the random byte string is generated in AWS KMS. To generate the byte string in the AWS CloudHSM cluster that is associated with a custom key store, specify the custom key store ID. For more information about entropy and random number generation, see the AWS Key Management Service Cryptographic Details whitepaper.
      */
    def generateRandom(params: GenerateRandomRequest): awsDashSdkLib.libRequestMod.Request[GenerateRandomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def generateRandom(
      params: GenerateRandomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GenerateRandomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GenerateRandomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a key policy attached to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
      */
    def getKeyPolicy(): awsDashSdkLib.libRequestMod.Request[GetKeyPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getKeyPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetKeyPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetKeyPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a key policy attached to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
      */
    def getKeyPolicy(params: GetKeyPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetKeyPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getKeyPolicy(
      params: GetKeyPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetKeyPolicyResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetKeyPolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a Boolean value that indicates whether automatic rotation of the key material is enabled for the specified customer master key (CMK). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.   Disabled: The key rotation status does not change when you disable a CMK. However, while the CMK is disabled, AWS KMS does not rotate the backing key.   Pending deletion: While a CMK is pending deletion, its key rotation status is false and AWS KMS does not rotate the backing key. If you cancel the deletion, the original key rotation status is restored.   To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
      */
    def getKeyRotationStatus(): awsDashSdkLib.libRequestMod.Request[GetKeyRotationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getKeyRotationStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetKeyRotationStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetKeyRotationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a Boolean value that indicates whether automatic rotation of the key material is enabled for the specified customer master key (CMK). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.   Disabled: The key rotation status does not change when you disable a CMK. However, while the CMK is disabled, AWS KMS does not rotate the backing key.   Pending deletion: While a CMK is pending deletion, its key rotation status is false and AWS KMS does not rotate the backing key. If you cancel the deletion, the original key rotation status is restored.   To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
      */
    def getKeyRotationStatus(params: GetKeyRotationStatusRequest): awsDashSdkLib.libRequestMod.Request[GetKeyRotationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getKeyRotationStatus(
      params: GetKeyRotationStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetKeyRotationStatusResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetKeyRotationStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the items you need in order to import key material into AWS KMS from your existing key management infrastructure. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You must specify the key ID of the customer master key (CMK) into which you will import key material. This CMK's Origin must be EXTERNAL. You must also specify the wrapping algorithm and type of wrapping key (public key) that you will use to encrypt the key material. You cannot perform this operation on a CMK in a different AWS account. This operation returns a public key and an import token. Use the public key to encrypt the key material. Store the import token to send with a subsequent ImportKeyMaterial request. The public key and import token from the same response must be used together. These items are valid for 24 hours. When they expire, they cannot be used for a subsequent ImportKeyMaterial request. To get new ones, send another GetParametersForImport request. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def getParametersForImport(): awsDashSdkLib.libRequestMod.Request[GetParametersForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getParametersForImport(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetParametersForImportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetParametersForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the items you need in order to import key material into AWS KMS from your existing key management infrastructure. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You must specify the key ID of the customer master key (CMK) into which you will import key material. This CMK's Origin must be EXTERNAL. You must also specify the wrapping algorithm and type of wrapping key (public key) that you will use to encrypt the key material. You cannot perform this operation on a CMK in a different AWS account. This operation returns a public key and an import token. Use the public key to encrypt the key material. Store the import token to send with a subsequent ImportKeyMaterial request. The public key and import token from the same response must be used together. These items are valid for 24 hours. When they expire, they cannot be used for a subsequent ImportKeyMaterial request. To get new ones, send another GetParametersForImport request. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def getParametersForImport(params: GetParametersForImportRequest): awsDashSdkLib.libRequestMod.Request[GetParametersForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getParametersForImport(
      params: GetParametersForImportRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetParametersForImportResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetParametersForImportResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Imports key material into an existing AWS KMS customer master key (CMK) that was created without key material. You cannot perform this operation on a CMK in a different AWS account. For more information about creating CMKs with no key material and then importing key material, see Importing Key Material in the AWS Key Management Service Developer Guide. Before using this operation, call GetParametersForImport. Its response includes a public key and an import token. Use the public key to encrypt the key material. Then, submit the import token from the same GetParametersForImport response. When calling this operation, you must specify the following values:   The key ID or key ARN of a CMK with no key material. Its Origin must be EXTERNAL. To create a CMK with no key material, call CreateKey and set the value of its Origin parameter to EXTERNAL. To get the Origin of a CMK, call DescribeKey.)   The encrypted key material. To get the public key to encrypt the key material, call GetParametersForImport.   The import token that GetParametersForImport returned. This token and the public key used to encrypt the key material must have come from the same response.   Whether the key material expires and if so, when. If you set an expiration date, you can change it only by reimporting the same key material and specifying a new expiration date. If the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. To use the CMK again, you must reimport the same key material.   When this operation is successful, the key state of the CMK changes from PendingImport to Enabled, and you can use the CMK. After you successfully import key material into a CMK, you can reimport the same key material into that CMK, but you cannot import different key material. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def importKeyMaterial(): awsDashSdkLib.libRequestMod.Request[ImportKeyMaterialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importKeyMaterial(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportKeyMaterialResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportKeyMaterialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Imports key material into an existing AWS KMS customer master key (CMK) that was created without key material. You cannot perform this operation on a CMK in a different AWS account. For more information about creating CMKs with no key material and then importing key material, see Importing Key Material in the AWS Key Management Service Developer Guide. Before using this operation, call GetParametersForImport. Its response includes a public key and an import token. Use the public key to encrypt the key material. Then, submit the import token from the same GetParametersForImport response. When calling this operation, you must specify the following values:   The key ID or key ARN of a CMK with no key material. Its Origin must be EXTERNAL. To create a CMK with no key material, call CreateKey and set the value of its Origin parameter to EXTERNAL. To get the Origin of a CMK, call DescribeKey.)   The encrypted key material. To get the public key to encrypt the key material, call GetParametersForImport.   The import token that GetParametersForImport returned. This token and the public key used to encrypt the key material must have come from the same response.   Whether the key material expires and if so, when. If you set an expiration date, you can change it only by reimporting the same key material and specifying a new expiration date. If the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. To use the CMK again, you must reimport the same key material.   When this operation is successful, the key state of the CMK changes from PendingImport to Enabled, and you can use the CMK. After you successfully import key material into a CMK, you can reimport the same key material into that CMK, but you cannot import different key material. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def importKeyMaterial(params: ImportKeyMaterialRequest): awsDashSdkLib.libRequestMod.Request[ImportKeyMaterialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importKeyMaterial(
      params: ImportKeyMaterialRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportKeyMaterialResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportKeyMaterialResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of all aliases in the caller's AWS account and region. You cannot list aliases in other accounts. For more information about aliases, see CreateAlias. By default, the ListAliases command returns all aliases in the account and region. To get only the aliases that point to a particular customer master key (CMK), use the KeyId parameter. The ListAliases response might include several aliases have no TargetKeyId field. These are predefined aliases that AWS has created but has not yet associated with a CMK. Aliases that AWS creates in your account, including predefined aliases, do not count against your AWS KMS aliases limit.
      */
    def listAliases(): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAliases(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of all aliases in the caller's AWS account and region. You cannot list aliases in other accounts. For more information about aliases, see CreateAlias. By default, the ListAliases command returns all aliases in the account and region. To get only the aliases that point to a particular customer master key (CMK), use the KeyId parameter. The ListAliases response might include several aliases have no TargetKeyId field. These are predefined aliases that AWS has created but has not yet associated with a CMK. Aliases that AWS creates in your account, including predefined aliases, do not count against your AWS KMS aliases limit.
      */
    def listAliases(params: ListAliasesRequest): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAliases(
      params: ListAliasesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAliasesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAliasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of all grants for the specified customer master key (CMK). To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
      */
    def listGrants(): awsDashSdkLib.libRequestMod.Request[ListGrantsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGrants(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGrantsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGrantsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of all grants for the specified customer master key (CMK). To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
      */
    def listGrants(params: ListGrantsRequest): awsDashSdkLib.libRequestMod.Request[ListGrantsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listGrants(
      params: ListGrantsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGrantsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGrantsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the names of the key policies that are attached to a customer master key (CMK). This operation is designed to get policy names that you can use in a GetKeyPolicy operation. However, the only valid policy name is default. You cannot perform this operation on a CMK in a different AWS account.
      */
    def listKeyPolicies(): awsDashSdkLib.libRequestMod.Request[ListKeyPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listKeyPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListKeyPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListKeyPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the names of the key policies that are attached to a customer master key (CMK). This operation is designed to get policy names that you can use in a GetKeyPolicy operation. However, the only valid policy name is default. You cannot perform this operation on a CMK in a different AWS account.
      */
    def listKeyPolicies(params: ListKeyPoliciesRequest): awsDashSdkLib.libRequestMod.Request[ListKeyPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listKeyPolicies(
      params: ListKeyPoliciesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListKeyPoliciesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListKeyPoliciesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of all customer master keys (CMKs) in the caller's AWS account and region.
      */
    def listKeys(): awsDashSdkLib.libRequestMod.Request[ListKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listKeys(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a list of all customer master keys (CMKs) in the caller's AWS account and region.
      */
    def listKeys(params: ListKeysRequest): awsDashSdkLib.libRequestMod.Request[ListKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listKeys(
      params: ListKeysRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListKeysResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListKeysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of all tags for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
      */
    def listResourceTags(): awsDashSdkLib.libRequestMod.Request[ListResourceTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResourceTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourceTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourceTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of all tags for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
      */
    def listResourceTags(params: ListResourceTagsRequest): awsDashSdkLib.libRequestMod.Request[ListResourceTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listResourceTags(
      params: ListResourceTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListResourceTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListResourceTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of all grants for which the grant's RetiringPrincipal matches the one specified. A typical use is to list all grants that you are able to retire. To retire a grant, use RetireGrant.
      */
    def listRetirableGrants(): awsDashSdkLib.libRequestMod.Request[ListGrantsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRetirableGrants(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGrantsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGrantsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of all grants for which the grant's RetiringPrincipal matches the one specified. A typical use is to list all grants that you are able to retire. To retire a grant, use RetireGrant.
      */
    def listRetirableGrants(params: ListRetirableGrantsRequest): awsDashSdkLib.libRequestMod.Request[ListGrantsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRetirableGrants(
      params: ListRetirableGrantsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListGrantsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListGrantsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches a key policy to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. For more information about key policies, see Key Policies in the AWS Key Management Service Developer Guide.
      */
    def putKeyPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putKeyPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Attaches a key policy to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. For more information about key policies, see Key Policies in the AWS Key Management Service Developer Guide.
      */
    def putKeyPolicy(params: PutKeyPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putKeyPolicy(
      params: PutKeyPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Encrypts data on the server side with a new customer master key (CMK) without exposing the plaintext of the data on the client side. The data is first decrypted and then reencrypted. You can also use this operation to change the encryption context of a ciphertext.  You can reencrypt data using CMKs in different AWS accounts. Unlike other operations, ReEncrypt is authorized twice, once as ReEncryptFrom on the source CMK and once as ReEncryptTo on the destination CMK. We recommend that you include the "kms:ReEncrypt*" permission in your key policies to permit reencryption from or to the CMK. This permission is automatically included in the key policy when you create a CMK through the console, but you must include it manually when you create a CMK programmatically or when you set a key policy with the PutKeyPolicy operation. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def reEncrypt(): awsDashSdkLib.libRequestMod.Request[ReEncryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def reEncrypt(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReEncryptResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReEncryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Encrypts data on the server side with a new customer master key (CMK) without exposing the plaintext of the data on the client side. The data is first decrypted and then reencrypted. You can also use this operation to change the encryption context of a ciphertext.  You can reencrypt data using CMKs in different AWS accounts. Unlike other operations, ReEncrypt is authorized twice, once as ReEncryptFrom on the source CMK and once as ReEncryptTo on the destination CMK. We recommend that you include the "kms:ReEncrypt*" permission in your key policies to permit reencryption from or to the CMK. This permission is automatically included in the key policy when you create a CMK through the console, but you must include it manually when you create a CMK programmatically or when you set a key policy with the PutKeyPolicy operation. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def reEncrypt(params: ReEncryptRequest): awsDashSdkLib.libRequestMod.Request[ReEncryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def reEncrypt(
      params: ReEncryptRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ReEncryptResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ReEncryptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retires a grant. To clean up, you can retire a grant when you're done using it. You should revoke a grant when you intend to actively deny operations that depend on it. The following are permitted to call this API:   The AWS account (root user) under which the grant was created   The RetiringPrincipal, if present in the grant   The GranteePrincipal, if RetireGrant is an operation specified in the grant   You must identify the grant to retire by its grant token or by a combination of the grant ID and the Amazon Resource Name (ARN) of the customer master key (CMK). A grant token is a unique variable-length base64-encoded string. A grant ID is a 64 character unique identifier of a grant. The CreateGrant operation returns both.
      */
    def retireGrant(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retireGrant(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retires a grant. To clean up, you can retire a grant when you're done using it. You should revoke a grant when you intend to actively deny operations that depend on it. The following are permitted to call this API:   The AWS account (root user) under which the grant was created   The RetiringPrincipal, if present in the grant   The GranteePrincipal, if RetireGrant is an operation specified in the grant   You must identify the grant to retire by its grant token or by a combination of the grant ID and the Amazon Resource Name (ARN) of the customer master key (CMK). A grant token is a unique variable-length base64-encoded string. A grant ID is a 64 character unique identifier of a grant. The CreateGrant operation returns both.
      */
    def retireGrant(params: RetireGrantRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def retireGrant(
      params: RetireGrantRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes the specified grant for the specified customer master key (CMK). You can revoke a grant to actively deny operations that depend on it. To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
      */
    def revokeGrant(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeGrant(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes the specified grant for the specified customer master key (CMK). You can revoke a grant to actively deny operations that depend on it. To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
      */
    def revokeGrant(params: RevokeGrantRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeGrant(
      params: RevokeGrantRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Schedules the deletion of a customer master key (CMK). You may provide a waiting period, specified in days, before deletion occurs. If you do not provide a waiting period, the default period of 30 days is used. When this operation is successful, the key state of the CMK changes to PendingDeletion. Before the waiting period ends, you can use CancelKeyDeletion to cancel the deletion of the CMK. After the waiting period ends, AWS KMS deletes the CMK and all AWS KMS data associated with it, including all aliases that refer to it.  Deleting a CMK is a destructive and potentially dangerous operation. When a CMK is deleted, all data that was encrypted under the CMK is unrecoverable. To prevent the use of a CMK without deleting it, use DisableKey.  If you schedule deletion of a CMK from a custom key store, when the waiting period expires, ScheduleKeyDeletion deletes the CMK from AWS KMS. Then AWS KMS makes a best effort to delete the key material from the associated AWS CloudHSM cluster. However, you might need to manually delete the orphaned key material from the cluster and its backups. You cannot perform this operation on a CMK in a different AWS account. For more information about scheduling a CMK for deletion, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def scheduleKeyDeletion(): awsDashSdkLib.libRequestMod.Request[ScheduleKeyDeletionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def scheduleKeyDeletion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ScheduleKeyDeletionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ScheduleKeyDeletionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Schedules the deletion of a customer master key (CMK). You may provide a waiting period, specified in days, before deletion occurs. If you do not provide a waiting period, the default period of 30 days is used. When this operation is successful, the key state of the CMK changes to PendingDeletion. Before the waiting period ends, you can use CancelKeyDeletion to cancel the deletion of the CMK. After the waiting period ends, AWS KMS deletes the CMK and all AWS KMS data associated with it, including all aliases that refer to it.  Deleting a CMK is a destructive and potentially dangerous operation. When a CMK is deleted, all data that was encrypted under the CMK is unrecoverable. To prevent the use of a CMK without deleting it, use DisableKey.  If you schedule deletion of a CMK from a custom key store, when the waiting period expires, ScheduleKeyDeletion deletes the CMK from AWS KMS. Then AWS KMS makes a best effort to delete the key material from the associated AWS CloudHSM cluster. However, you might need to manually delete the orphaned key material from the cluster and its backups. You cannot perform this operation on a CMK in a different AWS account. For more information about scheduling a CMK for deletion, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def scheduleKeyDeletion(params: ScheduleKeyDeletionRequest): awsDashSdkLib.libRequestMod.Request[ScheduleKeyDeletionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def scheduleKeyDeletion(
      params: ScheduleKeyDeletionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ScheduleKeyDeletionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ScheduleKeyDeletionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or edits tags for a customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty (null) strings. You can only use a tag key once for each CMK. If you use the tag key again, AWS KMS replaces the current tag value with the specified value. For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or edits tags for a customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty (null) strings. You can only use a tag key once for each CMK. If you use the tag key again, AWS KMS replaces the current tag value with the specified value. For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use TagResource. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use TagResource. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates an existing alias with a different customer master key (CMK). Each CMK can have multiple aliases, but the aliases must be unique within the account and region. You cannot perform this operation on an alias in a different AWS account. This operation works only on existing aliases. To change the alias of a CMK to a new value, use CreateAlias to create a new alias and DeleteAlias to delete the old alias. Because an alias is not a property of a CMK, you can create, update, and delete the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs in the account, use the ListAliases operation.  An alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). An alias must start with the word alias followed by a forward slash (alias/). The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws; that alias name prefix is reserved by Amazon Web Services (AWS). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def updateAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAlias(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates an existing alias with a different customer master key (CMK). Each CMK can have multiple aliases, but the aliases must be unique within the account and region. You cannot perform this operation on an alias in a different AWS account. This operation works only on existing aliases. To change the alias of a CMK to a new value, use CreateAlias to create a new alias and DeleteAlias to delete the old alias. Because an alias is not a property of a CMK, you can create, update, and delete the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs in the account, use the ListAliases operation.  An alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). An alias must start with the word alias followed by a forward slash (alias/). The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws; that alias name prefix is reserved by Amazon Web Services (AWS). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def updateAlias(params: UpdateAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAlias(
      params: UpdateAliasRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the properties of a custom key store. Use the CustomKeyStoreId parameter to identify the custom key store you want to edit. Use the remaining parameters to change the properties of the custom key store. You can only update a custom key store that is disconnected. To disconnect the custom key store, use DisconnectCustomKeyStore. To reconnect the custom key store after the update completes, use ConnectCustomKeyStore. To find the connection state of a custom key store, use the DescribeCustomKeyStores operation. Use the NewCustomKeyStoreName parameter to change the friendly name of the custom key store to the value that you specify. Use the KeyStorePassword parameter tell AWS KMS the current password of the  kmsuser crypto user (CU) in the associated AWS CloudHSM cluster. You can use this parameter to fix connection failures that occur when AWS KMS cannot log into the associated cluster because the kmsuser password has changed. This value does not change the password in the AWS CloudHSM cluster. Use the CloudHsmClusterId parameter to associate the custom key store with a related AWS CloudHSM cluster, that is, a cluster that shares a backup history with the original cluster. You can use this parameter to repair a custom key store if its AWS CloudHSM cluster becomes corrupted or is deleted, or when you need to create or restore a cluster from a backup. The cluster ID must identify a AWS CloudHSM cluster with the following requirements.   The cluster must be active and be in the same AWS account and Region as the custom key store.   The cluster must have the same cluster certificate as the original cluster. You cannot use this parameter to associate the custom key store with an unrelated cluster. To view the cluster certificate, use the AWS CloudHSM DescribeClusters operation. Clusters that share a backup history have the same cluster certificate.   The cluster must be configured with subnets in at least two different Availability Zones in the Region. Because AWS CloudHSM is not supported in all Availability Zones, we recommend that the cluster have subnets in all Availability Zones in the Region.   The cluster must contain at least two active HSMs, each in a different Availability Zone.   If the operation succeeds, it returns a JSON object with no properties. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store.
      */
    def updateCustomKeyStore(): awsDashSdkLib.libRequestMod.Request[UpdateCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCustomKeyStore(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCustomKeyStoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Changes the properties of a custom key store. Use the CustomKeyStoreId parameter to identify the custom key store you want to edit. Use the remaining parameters to change the properties of the custom key store. You can only update a custom key store that is disconnected. To disconnect the custom key store, use DisconnectCustomKeyStore. To reconnect the custom key store after the update completes, use ConnectCustomKeyStore. To find the connection state of a custom key store, use the DescribeCustomKeyStores operation. Use the NewCustomKeyStoreName parameter to change the friendly name of the custom key store to the value that you specify. Use the KeyStorePassword parameter tell AWS KMS the current password of the  kmsuser crypto user (CU) in the associated AWS CloudHSM cluster. You can use this parameter to fix connection failures that occur when AWS KMS cannot log into the associated cluster because the kmsuser password has changed. This value does not change the password in the AWS CloudHSM cluster. Use the CloudHsmClusterId parameter to associate the custom key store with a related AWS CloudHSM cluster, that is, a cluster that shares a backup history with the original cluster. You can use this parameter to repair a custom key store if its AWS CloudHSM cluster becomes corrupted or is deleted, or when you need to create or restore a cluster from a backup. The cluster ID must identify a AWS CloudHSM cluster with the following requirements.   The cluster must be active and be in the same AWS account and Region as the custom key store.   The cluster must have the same cluster certificate as the original cluster. You cannot use this parameter to associate the custom key store with an unrelated cluster. To view the cluster certificate, use the AWS CloudHSM DescribeClusters operation. Clusters that share a backup history have the same cluster certificate.   The cluster must be configured with subnets in at least two different Availability Zones in the Region. Because AWS CloudHSM is not supported in all Availability Zones, we recommend that the cluster have subnets in all Availability Zones in the Region.   The cluster must contain at least two active HSMs, each in a different Availability Zone.   If the operation succeeds, it returns a JSON object with no properties. This operation is part of the Custom Key Store feature feature in AWS KMS, which combines the convenience and extensive integration of AWS KMS with the isolation and control of a single-tenant key store.
      */
    def updateCustomKeyStore(params: UpdateCustomKeyStoreRequest): awsDashSdkLib.libRequestMod.Request[UpdateCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateCustomKeyStore(
      params: UpdateCustomKeyStoreRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateCustomKeyStoreResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateCustomKeyStoreResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the description of a customer master key (CMK). To see the decription of a CMK, use DescribeKey.  You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def updateKeyDescription(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateKeyDescription(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the description of a customer master key (CMK). To see the decription of a CMK, use DescribeKey.  You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
      */
    def updateKeyDescription(params: UpdateKeyDescriptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateKeyDescription(
      params: UpdateKeyDescriptionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * A unique identifier for the CMK from which you are removing tags. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
    /**
      * One or more tag keys. Specify only the tag keys, not the tag values.
      */
    var TagKeys: TagKeyList
  }
  
  trait UpdateAliasRequest extends js.Object {
    /**
      * String that contains the name of the alias to be modified. The name must start with the word "alias" followed by a forward slash (alias/). Aliases that begin with "alias/aws" are reserved.
      */
    var AliasName: AliasNameType
    /**
      * Unique identifier of the customer master key to be mapped to the alias. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To verify that the alias is mapped to the correct CMK, use ListAliases.
      */
    var TargetKeyId: KeyIdType
  }
  
  trait UpdateCustomKeyStoreRequest extends js.Object {
    /**
      * Associates the custom key store with a related AWS CloudHSM cluster.  Enter the cluster ID of the cluster that you used to create the custom key store or a cluster that shares a backup history with the original cluster. You cannot use this parameter to associate a custom key store with a different cluster. Clusters that share a backup history have the same cluster certificate. To view the cluster certificate of a cluster, use the DescribeClusters operation.
      */
    var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
    /**
      * Identifies the custom key store that you want to update. Enter the ID of the custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
      */
    var CustomKeyStoreId: CustomKeyStoreIdType
    /**
      * Enter the current password of the kmsuser crypto user (CU) in the AWS CloudHSM cluster that is associated with the custom key store. This parameter tells AWS KMS the current password of the kmsuser crypto user (CU). It does not set or change the password of any users in the AWS CloudHSM cluster.
      */
    var KeyStorePassword: js.UndefOr[KeyStorePasswordType] = js.undefined
    /**
      * Changes the friendly name of the custom key store to the value that you specify. The custom key store name must be unique in the AWS account.
      */
    var NewCustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.undefined
  }
  
  trait UpdateCustomKeyStoreResponse extends js.Object
  
  trait UpdateKeyDescriptionRequest extends js.Object {
    /**
      * New description for the CMK.
      */
    var Description: DescriptionType
    /**
      * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
      */
    var KeyId: KeyIdType
  }
  
  val TypesNs: this.type = js.native
  type AWSAccountIdType = java.lang.String
  type AlgorithmSpec = awsDashSdkLib.awsDashSdkLibStrings.RSAES_PKCS1_V1_5 | awsDashSdkLib.awsDashSdkLibStrings.RSAES_OAEP_SHA_1 | awsDashSdkLib.awsDashSdkLibStrings.RSAES_OAEP_SHA_256 | java.lang.String
  type AliasList = js.Array[AliasListEntry]
  type AliasNameType = java.lang.String
  type ArnType = java.lang.String
  type BooleanType = scala.Boolean
  type CiphertextType = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsKmsMod.Blob | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CloudHsmClusterIdType = java.lang.String
  type ConnectionErrorCodeType = awsDashSdkLib.awsDashSdkLibStrings.INVALID_CREDENTIALS | awsDashSdkLib.awsDashSdkLibStrings.CLUSTER_NOT_FOUND | awsDashSdkLib.awsDashSdkLibStrings.NETWORK_ERRORS | awsDashSdkLib.awsDashSdkLibStrings.INSUFFICIENT_CLOUDHSM_HSMS | awsDashSdkLib.awsDashSdkLibStrings.USER_LOCKED_OUT | java.lang.String
  type ConnectionStateType = awsDashSdkLib.awsDashSdkLibStrings.CONNECTED | awsDashSdkLib.awsDashSdkLibStrings.CONNECTING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.DISCONNECTED | awsDashSdkLib.awsDashSdkLibStrings.DISCONNECTING | java.lang.String
  type CustomKeyStoreIdType = java.lang.String
  type CustomKeyStoreNameType = java.lang.String
  type CustomKeyStoresList = js.Array[CustomKeyStoresListEntry]
  type DataKeySpec = awsDashSdkLib.awsDashSdkLibStrings.AES_256 | awsDashSdkLib.awsDashSdkLibStrings.AES_128 | java.lang.String
  type DateType = stdLib.Date
  type DescriptionType = java.lang.String
  type EncryptionContextKey = java.lang.String
  type EncryptionContextValue = java.lang.String
  type ExpirationModelType = awsDashSdkLib.awsDashSdkLibStrings.KEY_MATERIAL_EXPIRES | awsDashSdkLib.awsDashSdkLibStrings.KEY_MATERIAL_DOES_NOT_EXPIRE | java.lang.String
  type GrantIdType = java.lang.String
  type GrantList = js.Array[GrantListEntry]
  type GrantNameType = java.lang.String
  type GrantOperation = awsDashSdkLib.awsDashSdkLibStrings.Decrypt | awsDashSdkLib.awsDashSdkLibStrings.Encrypt | awsDashSdkLib.awsDashSdkLibStrings.GenerateDataKey | awsDashSdkLib.awsDashSdkLibStrings.GenerateDataKeyWithoutPlaintext | awsDashSdkLib.awsDashSdkLibStrings.ReEncryptFrom | awsDashSdkLib.awsDashSdkLibStrings.ReEncryptTo | awsDashSdkLib.awsDashSdkLibStrings.CreateGrant | awsDashSdkLib.awsDashSdkLibStrings.RetireGrant | awsDashSdkLib.awsDashSdkLibStrings.DescribeKey | java.lang.String
  type GrantOperationList = js.Array[GrantOperation]
  type GrantTokenList = js.Array[GrantTokenType]
  type GrantTokenType = java.lang.String
  type KeyIdType = java.lang.String
  type KeyList = js.Array[KeyListEntry]
  type KeyManagerType = awsDashSdkLib.awsDashSdkLibStrings.AWS | awsDashSdkLib.awsDashSdkLibStrings.CUSTOMER | java.lang.String
  type KeyState = awsDashSdkLib.awsDashSdkLibStrings.Enabled | awsDashSdkLib.awsDashSdkLibStrings.Disabled | awsDashSdkLib.awsDashSdkLibStrings.PendingDeletion | awsDashSdkLib.awsDashSdkLibStrings.PendingImport | awsDashSdkLib.awsDashSdkLibStrings.Unavailable | java.lang.String
  type KeyStorePasswordType = java.lang.String
  type KeyUsageType = awsDashSdkLib.awsDashSdkLibStrings.ENCRYPT_DECRYPT | java.lang.String
  type LimitType = scala.Double
  type MarkerType = java.lang.String
  type NumberOfBytesType = scala.Double
  type OriginType = awsDashSdkLib.awsDashSdkLibStrings.AWS_KMS | awsDashSdkLib.awsDashSdkLibStrings.EXTERNAL | awsDashSdkLib.awsDashSdkLibStrings.AWS_CLOUDHSM | java.lang.String
  type PendingWindowInDaysType = scala.Double
  type PlaintextType = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsKmsMod.Blob | java.lang.String
  type PolicyNameList = js.Array[PolicyNameType]
  type PolicyNameType = java.lang.String
  type PolicyType = java.lang.String
  type PrincipalIdType = java.lang.String
  type TagKeyList = js.Array[TagKeyType]
  type TagKeyType = java.lang.String
  type TagList = js.Array[Tag]
  type TagValueType = java.lang.String
  type TrustAnchorCertificateType = java.lang.String
  type WrappingKeySpec = awsDashSdkLib.awsDashSdkLibStrings.RSA_2048 | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2014-11-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

