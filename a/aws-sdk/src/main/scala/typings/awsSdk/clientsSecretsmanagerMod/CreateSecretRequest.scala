package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecretRequest extends StObject {
  
  /**
    * A list of Regions and KMS keys to replicate secrets.
    */
  var AddReplicaRegions: js.UndefOr[AddReplicaRegionListType] = js.undefined
  
  /**
    * If you include SecretString or SecretBinary, then Secrets Manager creates an initial version for the secret, and this parameter specifies the unique identifier for the new version.   If you use the Amazon Web Services CLI or one of the Amazon Web Services SDKs to call this operation, then you can leave this parameter empty. The CLI or SDK generates a random UUID for you and includes it as the value for this parameter in the request. If you don't use the SDK and instead generate a raw HTTP request to the Secrets Manager service endpoint, then you must generate a ClientRequestToken yourself for the new version and include the value in the request.  This value helps ensure idempotency. Secrets Manager uses this value to prevent the accidental creation of duplicate versions if there are failures and retries during a rotation. We recommend that you generate a UUID-type value to ensure uniqueness of your versions within the specified secret.    If the ClientRequestToken value isn't already associated with a version of the secret then a new version of the secret is created.    If a version with this value already exists and the version SecretString and SecretBinary values are the same as those in the request, then the request is ignored.   If a version with this value already exists and that version's SecretString and SecretBinary values are different from those in the request, then the request fails because you cannot modify an existing version. Instead, use PutSecretValue to create a new version.   This value becomes the VersionId of the new version.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenType] = js.undefined
  
  /**
    * The description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  
  /**
    * Specifies whether to overwrite a secret with the same name in the destination Region.
    */
  var ForceOverwriteReplicaSecret: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The ARN, key ID, or alias of the KMS key that Secrets Manager uses to encrypt the secret value in the secret. An alias is always prefixed by alias/, for example alias/aws/secretsmanager. For more information, see About aliases. To use a KMS key in a different account, use the key ARN or the alias ARN. If you don't specify this value, then Secrets Manager uses the key aws/secretsmanager. If that key doesn't yet exist, then Secrets Manager creates it for you automatically the first time it encrypts the secret value. If the secret is in a different Amazon Web Services account from the credentials calling the API, then you can't use aws/secretsmanager to encrypt the secret, and you must create and use a customer managed KMS key. 
    */
  var KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined
  
  /**
    * The name of the new secret. The secret name can contain ASCII letters, numbers, and the following characters: /_+=.@- Do not end your secret name with a hyphen followed by six characters. If you do so, you risk confusion and unexpected results when searching for a secret by partial ARN. Secrets Manager automatically adds a hyphen and six random characters after the secret name at the end of the ARN.
    */
  var Name: NameType
  
  /**
    * The binary data to encrypt and store in the new version of the secret. We recommend that you store your binary data in a file and then pass the contents of the file as a parameter. Either SecretString or SecretBinary must have a value, but not both. This parameter is not available in the Secrets Manager console.
    */
  var SecretBinary: js.UndefOr[SecretBinaryType] = js.undefined
  
  /**
    * The text data to encrypt and store in this new version of the secret. We recommend you use a JSON structure of key/value pairs for your secret value. Either SecretString or SecretBinary must have a value, but not both. If you create a secret by using the Secrets Manager console then Secrets Manager puts the protected secret text in only the SecretString parameter. The Secrets Manager console stores the information as a JSON structure of key/value pairs that a Lambda rotation function can parse.
    */
  var SecretString: js.UndefOr[SecretStringType] = js.undefined
  
  /**
    * A list of tags to attach to the secret. Each tag is a key and value pair of strings in a JSON text string, for example:  [{"Key":"CostCenter","Value":"12345"},{"Key":"environment","Value":"production"}]  Secrets Manager tag key names are case sensitive. A tag with the key "ABC" is a different tag from one with key "abc". If you check tags in permissions policies as part of your security strategy, then adding or removing a tag can change permissions. If the completion of this operation would result in you losing your permissions for this secret, then Secrets Manager blocks the operation and returns an Access Denied error. For more information, see Control access to secrets using tags and Limit access to identities with tags that match secrets' tags. For information about how to format a JSON parameter for the various command line tool environments, see Using JSON for Parameters. If your command-line tool or SDK requires quotation marks around the parameter, you should use single quotes to avoid confusion with the double quotes required in the JSON text. The following restrictions apply to tags:   Maximum number of tags per secret: 50   Maximum key length: 127 Unicode characters in UTF-8   Maximum value length: 255 Unicode characters in UTF-8   Tag keys and values are case sensitive.   Do not use the aws: prefix in your tag names or values because Amazon Web Services reserves it for Amazon Web Services use. You can't edit or delete tag names or values with this prefix. Tags with this prefix do not count against your tags per secret limit.   If you use your tagging schema across multiple services and resources, other services might have restrictions on allowed characters. Generally allowed characters: letters, spaces, and numbers representable in UTF-8, plus the following special characters: + - = . _ : / @.  
    */
  var Tags: js.UndefOr[TagListType] = js.undefined
}
object CreateSecretRequest {
  
  inline def apply(Name: NameType): CreateSecretRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSecretRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSecretRequest] (val x: Self) extends AnyVal {
    
    inline def setAddReplicaRegions(value: AddReplicaRegionListType): Self = StObject.set(x, "AddReplicaRegions", value.asInstanceOf[js.Any])
    
    inline def setAddReplicaRegionsUndefined: Self = StObject.set(x, "AddReplicaRegions", js.undefined)
    
    inline def setAddReplicaRegionsVarargs(value: ReplicaRegionType*): Self = StObject.set(x, "AddReplicaRegions", js.Array(value*))
    
    inline def setClientRequestToken(value: ClientRequestTokenType): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDescription(value: DescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setForceOverwriteReplicaSecret(value: BooleanType): Self = StObject.set(x, "ForceOverwriteReplicaSecret", value.asInstanceOf[js.Any])
    
    inline def setForceOverwriteReplicaSecretUndefined: Self = StObject.set(x, "ForceOverwriteReplicaSecret", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyIdType): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setName(value: NameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSecretBinary(value: SecretBinaryType): Self = StObject.set(x, "SecretBinary", value.asInstanceOf[js.Any])
    
    inline def setSecretBinaryUndefined: Self = StObject.set(x, "SecretBinary", js.undefined)
    
    inline def setSecretString(value: SecretStringType): Self = StObject.set(x, "SecretString", value.asInstanceOf[js.Any])
    
    inline def setSecretStringUndefined: Self = StObject.set(x, "SecretString", js.undefined)
    
    inline def setTags(value: TagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
