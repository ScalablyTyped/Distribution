package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_KMS: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsKmsMod.KMSNs.ClientConfiguration = js.native
  /**
     * Cancels the deletion of a customer master key (CMK). When this operation is successful, the CMK is set to the Disabled state. To enable a CMK, use EnableKey. You cannot perform this operation on a CMK in a different AWS account. For more information about scheduling and canceling deletion of a CMK, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def cancelKeyDeletion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CancelKeyDeletionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels the deletion of a customer master key (CMK). When this operation is successful, the CMK is set to the Disabled state. To enable a CMK, use EnableKey. You cannot perform this operation on a CMK in a different AWS account. For more information about scheduling and canceling deletion of a CMK, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def cancelKeyDeletion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.CancelKeyDeletionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CancelKeyDeletionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels the deletion of a customer master key (CMK). When this operation is successful, the CMK is set to the Disabled state. To enable a CMK, use EnableKey. You cannot perform this operation on a CMK in a different AWS account. For more information about scheduling and canceling deletion of a CMK, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def cancelKeyDeletion(params: awsDashSdkLib.clientsKmsMod.KMSNs.CancelKeyDeletionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CancelKeyDeletionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Cancels the deletion of a customer master key (CMK). When this operation is successful, the CMK is set to the Disabled state. To enable a CMK, use EnableKey. You cannot perform this operation on a CMK in a different AWS account. For more information about scheduling and canceling deletion of a CMK, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def cancelKeyDeletion(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.CancelKeyDeletionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.CancelKeyDeletionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CancelKeyDeletionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a display name for a customer-managed customer master key (CMK). You can use an alias to identify a CMK in selected operations, such as Encrypt and GenerateDataKey.  Each CMK can have multiple aliases, but each alias points to only one CMK. The alias name must be unique in the AWS account and region. To simplify code that runs in multiple regions, use the same alias name, but point it to a different CMK in each region.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation. The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws/. That alias name prefix is reserved for AWS managed CMKs. The alias and the CMK it is mapped to must be in the same AWS account and the same region. You cannot perform this operation on an alias in a different AWS account. To map an existing alias to a different CMK, call UpdateAlias. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def createAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a display name for a customer-managed customer master key (CMK). You can use an alias to identify a CMK in selected operations, such as Encrypt and GenerateDataKey.  Each CMK can have multiple aliases, but each alias points to only one CMK. The alias name must be unique in the AWS account and region. To simplify code that runs in multiple regions, use the same alias name, but point it to a different CMK in each region.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation. The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws/. That alias name prefix is reserved for AWS managed CMKs. The alias and the CMK it is mapped to must be in the same AWS account and the same region. You cannot perform this operation on an alias in a different AWS account. To map an existing alias to a different CMK, call UpdateAlias. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def createAlias(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a display name for a customer-managed customer master key (CMK). You can use an alias to identify a CMK in selected operations, such as Encrypt and GenerateDataKey.  Each CMK can have multiple aliases, but each alias points to only one CMK. The alias name must be unique in the AWS account and region. To simplify code that runs in multiple regions, use the same alias name, but point it to a different CMK in each region.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation. The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws/. That alias name prefix is reserved for AWS managed CMKs. The alias and the CMK it is mapped to must be in the same AWS account and the same region. You cannot perform this operation on an alias in a different AWS account. To map an existing alias to a different CMK, call UpdateAlias. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def createAlias(params: awsDashSdkLib.clientsKmsMod.KMSNs.CreateAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a display name for a customer-managed customer master key (CMK). You can use an alias to identify a CMK in selected operations, such as Encrypt and GenerateDataKey.  Each CMK can have multiple aliases, but each alias points to only one CMK. The alias name must be unique in the AWS account and region. To simplify code that runs in multiple regions, use the same alias name, but point it to a different CMK in each region.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation. The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws/. That alias name prefix is reserved for AWS managed CMKs. The alias and the CMK it is mapped to must be in the same AWS account and the same region. You cannot perform this operation on an alias in a different AWS account. To map an existing alias to a different CMK, call UpdateAlias. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def createAlias(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.CreateAliasRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds a grant to a customer master key (CMK). The grant specifies who can use the CMK and under what conditions. When setting permissions, grants are an alternative to key policies.  To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter. For more information about grants, see Grants in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def createGrant(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CreateGrantResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a grant to a customer master key (CMK). The grant specifies who can use the CMK and under what conditions. When setting permissions, grants are an alternative to key policies.  To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter. For more information about grants, see Grants in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def createGrant(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.CreateGrantResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CreateGrantResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a grant to a customer master key (CMK). The grant specifies who can use the CMK and under what conditions. When setting permissions, grants are an alternative to key policies.  To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter. For more information about grants, see Grants in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def createGrant(params: awsDashSdkLib.clientsKmsMod.KMSNs.CreateGrantRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CreateGrantResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a grant to a customer master key (CMK). The grant specifies who can use the CMK and under what conditions. When setting permissions, grants are an alternative to key policies.  To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter. For more information about grants, see Grants in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def createGrant(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.CreateGrantRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.CreateGrantResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CreateGrantResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a customer master key (CMK) in the caller's AWS account. You can use a CMK to encrypt small amounts of data (4 KiB or less) directly. But CMKs are more commonly used to encrypt data encryption keys (DEKs), which are used to encrypt raw data. For more information about DEKs and the difference between CMKs and DEKs, see the following:   The GenerateDataKey operation    AWS Key Management Service Concepts in the AWS Key Management Service Developer Guide    You cannot use this operation to create a CMK in a different AWS account.
     */
  def createKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CreateKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a customer master key (CMK) in the caller's AWS account. You can use a CMK to encrypt small amounts of data (4 KiB or less) directly. But CMKs are more commonly used to encrypt data encryption keys (DEKs), which are used to encrypt raw data. For more information about DEKs and the difference between CMKs and DEKs, see the following:   The GenerateDataKey operation    AWS Key Management Service Concepts in the AWS Key Management Service Developer Guide    You cannot use this operation to create a CMK in a different AWS account.
     */
  def createKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.CreateKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CreateKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a customer master key (CMK) in the caller's AWS account. You can use a CMK to encrypt small amounts of data (4 KiB or less) directly. But CMKs are more commonly used to encrypt data encryption keys (DEKs), which are used to encrypt raw data. For more information about DEKs and the difference between CMKs and DEKs, see the following:   The GenerateDataKey operation    AWS Key Management Service Concepts in the AWS Key Management Service Developer Guide    You cannot use this operation to create a CMK in a different AWS account.
     */
  def createKey(params: awsDashSdkLib.clientsKmsMod.KMSNs.CreateKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CreateKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a customer master key (CMK) in the caller's AWS account. You can use a CMK to encrypt small amounts of data (4 KiB or less) directly. But CMKs are more commonly used to encrypt data encryption keys (DEKs), which are used to encrypt raw data. For more information about DEKs and the difference between CMKs and DEKs, see the following:   The GenerateDataKey operation    AWS Key Management Service Concepts in the AWS Key Management Service Developer Guide    You cannot use this operation to create a CMK in a different AWS account.
     */
  def createKey(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.CreateKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.CreateKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.CreateKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously encrypted by using any of the following operations:    GenerateDataKey     GenerateDataKeyWithoutPlaintext     Encrypt    Whenever possible, use key policies to give users permission to call the Decrypt operation on the CMK, instead of IAM policies. Otherwise, you might create an IAM user policy that gives the user Decrypt permission on all CMKs. This user could decrypt ciphertext that was encrypted by CMKs in other accounts if the key policy for the cross-account CMK permits it. If you must use an IAM policy for Decrypt permissions, limit the user to particular CMKs or particular trusted accounts. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def decrypt(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.DecryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously encrypted by using any of the following operations:    GenerateDataKey     GenerateDataKeyWithoutPlaintext     Encrypt    Whenever possible, use key policies to give users permission to call the Decrypt operation on the CMK, instead of IAM policies. Otherwise, you might create an IAM user policy that gives the user Decrypt permission on all CMKs. This user could decrypt ciphertext that was encrypted by CMKs in other accounts if the key policy for the cross-account CMK permits it. If you must use an IAM policy for Decrypt permissions, limit the user to particular CMKs or particular trusted accounts. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def decrypt(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.DecryptResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.DecryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously encrypted by using any of the following operations:    GenerateDataKey     GenerateDataKeyWithoutPlaintext     Encrypt    Whenever possible, use key policies to give users permission to call the Decrypt operation on the CMK, instead of IAM policies. Otherwise, you might create an IAM user policy that gives the user Decrypt permission on all CMKs. This user could decrypt ciphertext that was encrypted by CMKs in other accounts if the key policy for the cross-account CMK permits it. If you must use an IAM policy for Decrypt permissions, limit the user to particular CMKs or particular trusted accounts. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def decrypt(params: awsDashSdkLib.clientsKmsMod.KMSNs.DecryptRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.DecryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Decrypts ciphertext. Ciphertext is plaintext that has been previously encrypted by using any of the following operations:    GenerateDataKey     GenerateDataKeyWithoutPlaintext     Encrypt    Whenever possible, use key policies to give users permission to call the Decrypt operation on the CMK, instead of IAM policies. Otherwise, you might create an IAM user policy that gives the user Decrypt permission on all CMKs. This user could decrypt ciphertext that was encrypted by CMKs in other accounts if the key policy for the cross-account CMK permits it. If you must use an IAM policy for Decrypt permissions, limit the user to particular CMKs or particular trusted accounts. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def decrypt(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.DecryptRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.DecryptResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.DecryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified alias. You cannot perform this operation on an alias in a different AWS account.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation.  Each CMK can have multiple aliases. To change the alias of a CMK, use DeleteAlias to delete the current alias and CreateAlias to create a new alias. To associate an existing alias with a different customer master key (CMK), call UpdateAlias.
     */
  def deleteAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified alias. You cannot perform this operation on an alias in a different AWS account.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation.  Each CMK can have multiple aliases. To change the alias of a CMK, use DeleteAlias to delete the current alias and CreateAlias to create a new alias. To associate an existing alias with a different customer master key (CMK), call UpdateAlias.
     */
  def deleteAlias(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified alias. You cannot perform this operation on an alias in a different AWS account.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation.  Each CMK can have multiple aliases. To change the alias of a CMK, use DeleteAlias to delete the current alias and CreateAlias to create a new alias. To associate an existing alias with a different customer master key (CMK), call UpdateAlias.
     */
  def deleteAlias(params: awsDashSdkLib.clientsKmsMod.KMSNs.DeleteAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes the specified alias. You cannot perform this operation on an alias in a different AWS account.  Because an alias is not a property of a CMK, you can delete and change the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs, use the ListAliases operation.  Each CMK can have multiple aliases. To change the alias of a CMK, use DeleteAlias to delete the current alias and CreateAlias to create a new alias. To associate an existing alias with a different customer master key (CMK), call UpdateAlias.
     */
  def deleteAlias(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.DeleteAliasRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes key material that you previously imported. This operation makes the specified customer master key (CMK) unusable. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You cannot perform this operation on a CMK in a different AWS account. When the specified CMK is in the PendingDeletion state, this operation does not change the CMK's state. Otherwise, it changes the CMK's state to PendingImport. After you delete key material, you can use ImportKeyMaterial to reimport the same key material into the CMK. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def deleteImportedKeyMaterial(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes key material that you previously imported. This operation makes the specified customer master key (CMK) unusable. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You cannot perform this operation on a CMK in a different AWS account. When the specified CMK is in the PendingDeletion state, this operation does not change the CMK's state. Otherwise, it changes the CMK's state to PendingImport. After you delete key material, you can use ImportKeyMaterial to reimport the same key material into the CMK. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def deleteImportedKeyMaterial(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes key material that you previously imported. This operation makes the specified customer master key (CMK) unusable. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You cannot perform this operation on a CMK in a different AWS account. When the specified CMK is in the PendingDeletion state, this operation does not change the CMK's state. Otherwise, it changes the CMK's state to PendingImport. After you delete key material, you can use ImportKeyMaterial to reimport the same key material into the CMK. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def deleteImportedKeyMaterial(params: awsDashSdkLib.clientsKmsMod.KMSNs.DeleteImportedKeyMaterialRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes key material that you previously imported. This operation makes the specified customer master key (CMK) unusable. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You cannot perform this operation on a CMK in a different AWS account. When the specified CMK is in the PendingDeletion state, this operation does not change the CMK's state. Otherwise, it changes the CMK's state to PendingImport. After you delete key material, you can use ImportKeyMaterial to reimport the same key material into the CMK. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def deleteImportedKeyMaterial(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.DeleteImportedKeyMaterialRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Provides detailed information about the specified customer master key (CMK). You can use DescribeKey on a predefined AWS alias, that is, an AWS alias with no key ID. When you do, AWS KMS associates the alias with an AWS managed CMK and returns its KeyId and Arn in the response. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter.
     */
  def describeKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.DescribeKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides detailed information about the specified customer master key (CMK). You can use DescribeKey on a predefined AWS alias, that is, an AWS alias with no key ID. When you do, AWS KMS associates the alias with an AWS managed CMK and returns its KeyId and Arn in the response. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter.
     */
  def describeKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.DescribeKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.DescribeKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides detailed information about the specified customer master key (CMK). You can use DescribeKey on a predefined AWS alias, that is, an AWS alias with no key ID. When you do, AWS KMS associates the alias with an AWS managed CMK and returns its KeyId and Arn in the response. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter.
     */
  def describeKey(params: awsDashSdkLib.clientsKmsMod.KMSNs.DescribeKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.DescribeKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides detailed information about the specified customer master key (CMK). You can use DescribeKey on a predefined AWS alias, that is, an AWS alias with no key ID. When you do, AWS KMS associates the alias with an AWS managed CMK and returns its KeyId and Arn in the response. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter.
     */
  def describeKey(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.DescribeKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.DescribeKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.DescribeKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the state of a customer master key (CMK) to disabled, thereby preventing its use for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. For more information about how key state affects the use of a CMK, see How Key State Affects the Use of a Customer Master Key in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def disableKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the state of a customer master key (CMK) to disabled, thereby preventing its use for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. For more information about how key state affects the use of a CMK, see How Key State Affects the Use of a Customer Master Key in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def disableKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the state of a customer master key (CMK) to disabled, thereby preventing its use for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. For more information about how key state affects the use of a CMK, see How Key State Affects the Use of a Customer Master Key in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def disableKey(params: awsDashSdkLib.clientsKmsMod.KMSNs.DisableKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the state of a customer master key (CMK) to disabled, thereby preventing its use for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. For more information about how key state affects the use of a CMK, see How Key State Affects the Use of a Customer Master Key in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def disableKey(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.DisableKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def disableKeyRotation(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def disableKeyRotation(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def disableKeyRotation(params: awsDashSdkLib.clientsKmsMod.KMSNs.DisableKeyRotationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def disableKeyRotation(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.DisableKeyRotationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the state of a customer master key (CMK) to enabled, thereby permitting its use for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def enableKey(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the state of a customer master key (CMK) to enabled, thereby permitting its use for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def enableKey(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the state of a customer master key (CMK) to enabled, thereby permitting its use for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def enableKey(params: awsDashSdkLib.clientsKmsMod.KMSNs.EnableKeyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Sets the state of a customer master key (CMK) to enabled, thereby permitting its use for cryptographic operations. You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def enableKey(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.EnableKeyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def enableKeyRotation(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def enableKeyRotation(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def enableKeyRotation(params: awsDashSdkLib.clientsKmsMod.KMSNs.EnableKeyRotationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Enables automatic rotation of the key material for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def enableKeyRotation(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.EnableKeyRotationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Encrypts plaintext into ciphertext by using a customer master key (CMK). The Encrypt operation has two primary use cases:   You can encrypt up to 4 kilobytes (4096 bytes) of arbitrary data such as an RSA key, a database password, or other sensitive information.   You can use the Encrypt operation to move encrypted data from one AWS region to another. In the first region, generate a data key and use the plaintext key to encrypt the data. Then, in the new region, call the Encrypt method on same plaintext data key. Now, you can safely move the encrypted data and encrypted data key to the new region, and decrypt in the new region when necessary.   You don't need use this operation to encrypt a data key within a region. The GenerateDataKey and GenerateDataKeyWithoutPlaintext operations return an encrypted data key. Also, you don't need to use this operation to encrypt data in your application. You can use the plaintext and encrypted data keys that the GenerateDataKey operation returns. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter.
     */
  def encrypt(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.EncryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Encrypts plaintext into ciphertext by using a customer master key (CMK). The Encrypt operation has two primary use cases:   You can encrypt up to 4 kilobytes (4096 bytes) of arbitrary data such as an RSA key, a database password, or other sensitive information.   You can use the Encrypt operation to move encrypted data from one AWS region to another. In the first region, generate a data key and use the plaintext key to encrypt the data. Then, in the new region, call the Encrypt method on same plaintext data key. Now, you can safely move the encrypted data and encrypted data key to the new region, and decrypt in the new region when necessary.   You don't need use this operation to encrypt a data key within a region. The GenerateDataKey and GenerateDataKeyWithoutPlaintext operations return an encrypted data key. Also, you don't need to use this operation to encrypt data in your application. You can use the plaintext and encrypted data keys that the GenerateDataKey operation returns. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter.
     */
  def encrypt(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.EncryptResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.EncryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Encrypts plaintext into ciphertext by using a customer master key (CMK). The Encrypt operation has two primary use cases:   You can encrypt up to 4 kilobytes (4096 bytes) of arbitrary data such as an RSA key, a database password, or other sensitive information.   You can use the Encrypt operation to move encrypted data from one AWS region to another. In the first region, generate a data key and use the plaintext key to encrypt the data. Then, in the new region, call the Encrypt method on same plaintext data key. Now, you can safely move the encrypted data and encrypted data key to the new region, and decrypt in the new region when necessary.   You don't need use this operation to encrypt a data key within a region. The GenerateDataKey and GenerateDataKeyWithoutPlaintext operations return an encrypted data key. Also, you don't need to use this operation to encrypt data in your application. You can use the plaintext and encrypted data keys that the GenerateDataKey operation returns. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter.
     */
  def encrypt(params: awsDashSdkLib.clientsKmsMod.KMSNs.EncryptRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.EncryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Encrypts plaintext into ciphertext by using a customer master key (CMK). The Encrypt operation has two primary use cases:   You can encrypt up to 4 kilobytes (4096 bytes) of arbitrary data such as an RSA key, a database password, or other sensitive information.   You can use the Encrypt operation to move encrypted data from one AWS region to another. In the first region, generate a data key and use the plaintext key to encrypt the data. Then, in the new region, call the Encrypt method on same plaintext data key. Now, you can safely move the encrypted data and encrypted data key to the new region, and decrypt in the new region when necessary.   You don't need use this operation to encrypt a data key within a region. The GenerateDataKey and GenerateDataKeyWithoutPlaintext operations return an encrypted data key. Also, you don't need to use this operation to encrypt data in your application. You can use the plaintext and encrypted data keys that the GenerateDataKey operation returns. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter.
     */
  def encrypt(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.EncryptRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.EncryptResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.EncryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a data encryption key that you can use in your application to encrypt data locally.  You must specify the customer master key (CMK) under which to generate the data key. You must also specify the length of the data key using either the KeySpec or NumberOfBytes field. You must specify one field or the other, but not both. For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use KeySpec. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation returns a plaintext copy of the data key in the Plaintext field of the response, and an encrypted copy of the data key in the CiphertextBlob field. The data key is encrypted under the CMK specified in the KeyId field of the request.  We recommend that you use the following pattern to encrypt data locally in your application:   Use this operation (GenerateDataKey) to get a data encryption key.   Use the plaintext data encryption key (returned in the Plaintext field of the response) to encrypt data locally, then erase the plaintext data key from memory.   Store the encrypted data key (returned in the CiphertextBlob field of the response) alongside the locally encrypted data.   To decrypt data locally:   Use the Decrypt operation to decrypt the encrypted data key into a plaintext copy of the data key.   Use the plaintext data key to decrypt data locally, then erase the plaintext data key from memory.   To return only an encrypted copy of the data key, use GenerateDataKeyWithoutPlaintext. To return a random byte string that is cryptographically secure, use GenerateRandom. If you use the optional EncryptionContext field, you must store at least enough information to be able to reconstruct the full encryption context when you later send the ciphertext to the Decrypt operation. It is a good practice to choose an encryption context that you can reconstruct on the fly to better secure the ciphertext. For more information, see Encryption Context in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def generateDataKey(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a data encryption key that you can use in your application to encrypt data locally.  You must specify the customer master key (CMK) under which to generate the data key. You must also specify the length of the data key using either the KeySpec or NumberOfBytes field. You must specify one field or the other, but not both. For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use KeySpec. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation returns a plaintext copy of the data key in the Plaintext field of the response, and an encrypted copy of the data key in the CiphertextBlob field. The data key is encrypted under the CMK specified in the KeyId field of the request.  We recommend that you use the following pattern to encrypt data locally in your application:   Use this operation (GenerateDataKey) to get a data encryption key.   Use the plaintext data encryption key (returned in the Plaintext field of the response) to encrypt data locally, then erase the plaintext data key from memory.   Store the encrypted data key (returned in the CiphertextBlob field of the response) alongside the locally encrypted data.   To decrypt data locally:   Use the Decrypt operation to decrypt the encrypted data key into a plaintext copy of the data key.   Use the plaintext data key to decrypt data locally, then erase the plaintext data key from memory.   To return only an encrypted copy of the data key, use GenerateDataKeyWithoutPlaintext. To return a random byte string that is cryptographically secure, use GenerateRandom. If you use the optional EncryptionContext field, you must store at least enough information to be able to reconstruct the full encryption context when you later send the ciphertext to the Decrypt operation. It is a good practice to choose an encryption context that you can reconstruct on the fly to better secure the ciphertext. For more information, see Encryption Context in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def generateDataKey(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a data encryption key that you can use in your application to encrypt data locally.  You must specify the customer master key (CMK) under which to generate the data key. You must also specify the length of the data key using either the KeySpec or NumberOfBytes field. You must specify one field or the other, but not both. For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use KeySpec. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation returns a plaintext copy of the data key in the Plaintext field of the response, and an encrypted copy of the data key in the CiphertextBlob field. The data key is encrypted under the CMK specified in the KeyId field of the request.  We recommend that you use the following pattern to encrypt data locally in your application:   Use this operation (GenerateDataKey) to get a data encryption key.   Use the plaintext data encryption key (returned in the Plaintext field of the response) to encrypt data locally, then erase the plaintext data key from memory.   Store the encrypted data key (returned in the CiphertextBlob field of the response) alongside the locally encrypted data.   To decrypt data locally:   Use the Decrypt operation to decrypt the encrypted data key into a plaintext copy of the data key.   Use the plaintext data key to decrypt data locally, then erase the plaintext data key from memory.   To return only an encrypted copy of the data key, use GenerateDataKeyWithoutPlaintext. To return a random byte string that is cryptographically secure, use GenerateRandom. If you use the optional EncryptionContext field, you must store at least enough information to be able to reconstruct the full encryption context when you later send the ciphertext to the Decrypt operation. It is a good practice to choose an encryption context that you can reconstruct on the fly to better secure the ciphertext. For more information, see Encryption Context in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def generateDataKey(params: awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a data encryption key that you can use in your application to encrypt data locally.  You must specify the customer master key (CMK) under which to generate the data key. You must also specify the length of the data key using either the KeySpec or NumberOfBytes field. You must specify one field or the other, but not both. For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use KeySpec. To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation returns a plaintext copy of the data key in the Plaintext field of the response, and an encrypted copy of the data key in the CiphertextBlob field. The data key is encrypted under the CMK specified in the KeyId field of the request.  We recommend that you use the following pattern to encrypt data locally in your application:   Use this operation (GenerateDataKey) to get a data encryption key.   Use the plaintext data encryption key (returned in the Plaintext field of the response) to encrypt data locally, then erase the plaintext data key from memory.   Store the encrypted data key (returned in the CiphertextBlob field of the response) alongside the locally encrypted data.   To decrypt data locally:   Use the Decrypt operation to decrypt the encrypted data key into a plaintext copy of the data key.   Use the plaintext data key to decrypt data locally, then erase the plaintext data key from memory.   To return only an encrypted copy of the data key, use GenerateDataKeyWithoutPlaintext. To return a random byte string that is cryptographically secure, use GenerateRandom. If you use the optional EncryptionContext field, you must store at least enough information to be able to reconstruct the full encryption context when you later send the ciphertext to the Decrypt operation. It is a good practice to choose an encryption context that you can reconstruct on the fly to better secure the ciphertext. For more information, see Encryption Context in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def generateDataKey(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a data encryption key encrypted under a customer master key (CMK). This operation is identical to GenerateDataKey but returns only the encrypted copy of the data key.  To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation is useful in a system that has multiple components with different degrees of trust. For example, consider a system that stores encrypted data in containers. Each container stores the encrypted data and an encrypted copy of the data key. One component of the system, called the control plane, creates new containers. When it creates a new container, it uses this operation (GenerateDataKeyWithoutPlaintext) to get an encrypted data key and then stores it in the container. Later, a different component of the system, called the data plane, puts encrypted data into the containers. To do this, it passes the encrypted data key to the Decrypt operation. It then uses the returned plaintext data key to encrypt data and finally stores the encrypted data in the container. In this system, the control plane never sees the plaintext data key. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def generateDataKeyWithoutPlaintext(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyWithoutPlaintextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a data encryption key encrypted under a customer master key (CMK). This operation is identical to GenerateDataKey but returns only the encrypted copy of the data key.  To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation is useful in a system that has multiple components with different degrees of trust. For example, consider a system that stores encrypted data in containers. Each container stores the encrypted data and an encrypted copy of the data key. One component of the system, called the control plane, creates new containers. When it creates a new container, it uses this operation (GenerateDataKeyWithoutPlaintext) to get an encrypted data key and then stores it in the container. Later, a different component of the system, called the data plane, puts encrypted data into the containers. To do this, it passes the encrypted data key to the Decrypt operation. It then uses the returned plaintext data key to encrypt data and finally stores the encrypted data in the container. In this system, the control plane never sees the plaintext data key. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def generateDataKeyWithoutPlaintext(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyWithoutPlaintextResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyWithoutPlaintextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a data encryption key encrypted under a customer master key (CMK). This operation is identical to GenerateDataKey but returns only the encrypted copy of the data key.  To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation is useful in a system that has multiple components with different degrees of trust. For example, consider a system that stores encrypted data in containers. Each container stores the encrypted data and an encrypted copy of the data key. One component of the system, called the control plane, creates new containers. When it creates a new container, it uses this operation (GenerateDataKeyWithoutPlaintext) to get an encrypted data key and then stores it in the container. Later, a different component of the system, called the data plane, puts encrypted data into the containers. To do this, it passes the encrypted data key to the Decrypt operation. It then uses the returned plaintext data key to encrypt data and finally stores the encrypted data in the container. In this system, the control plane never sees the plaintext data key. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def generateDataKeyWithoutPlaintext(params: awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyWithoutPlaintextRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyWithoutPlaintextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a data encryption key encrypted under a customer master key (CMK). This operation is identical to GenerateDataKey but returns only the encrypted copy of the data key.  To perform this operation on a CMK in a different AWS account, specify the key ARN or alias ARN in the value of the KeyId parameter. This operation is useful in a system that has multiple components with different degrees of trust. For example, consider a system that stores encrypted data in containers. Each container stores the encrypted data and an encrypted copy of the data key. One component of the system, called the control plane, creates new containers. When it creates a new container, it uses this operation (GenerateDataKeyWithoutPlaintext) to get an encrypted data key and then stores it in the container. Later, a different component of the system, called the data plane, puts encrypted data into the containers. To do this, it passes the encrypted data key to the Decrypt operation. It then uses the returned plaintext data key to encrypt data and finally stores the encrypted data in the container. In this system, the control plane never sees the plaintext data key. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def generateDataKeyWithoutPlaintext(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyWithoutPlaintextRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyWithoutPlaintextResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateDataKeyWithoutPlaintextResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a random byte string that is cryptographically secure. For more information about entropy and random number generation, see the AWS Key Management Service Cryptographic Details whitepaper.
     */
  def generateRandom(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateRandomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a random byte string that is cryptographically secure. For more information about entropy and random number generation, see the AWS Key Management Service Cryptographic Details whitepaper.
     */
  def generateRandom(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GenerateRandomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateRandomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a random byte string that is cryptographically secure. For more information about entropy and random number generation, see the AWS Key Management Service Cryptographic Details whitepaper.
     */
  def generateRandom(params: awsDashSdkLib.clientsKmsMod.KMSNs.GenerateRandomRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateRandomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a random byte string that is cryptographically secure. For more information about entropy and random number generation, see the AWS Key Management Service Cryptographic Details whitepaper.
     */
  def generateRandom(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.GenerateRandomRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GenerateRandomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GenerateRandomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a key policy attached to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
     */
  def getKeyPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a key policy attached to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
     */
  def getKeyPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a key policy attached to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
     */
  def getKeyPolicy(params: awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyPolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a key policy attached to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
     */
  def getKeyPolicy(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyPolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyPolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyPolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Boolean value that indicates whether automatic rotation of the key material is enabled for the specified customer master key (CMK). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.   Disabled: The key rotation status does not change when you disable a CMK. However, while the CMK is disabled, AWS KMS does not rotate the backing key.   Pending deletion: While a CMK is pending deletion, its key rotation status is false and AWS KMS does not rotate the backing key. If you cancel the deletion, the original key rotation status is restored.   To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def getKeyRotationStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyRotationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Boolean value that indicates whether automatic rotation of the key material is enabled for the specified customer master key (CMK). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.   Disabled: The key rotation status does not change when you disable a CMK. However, while the CMK is disabled, AWS KMS does not rotate the backing key.   Pending deletion: While a CMK is pending deletion, its key rotation status is false and AWS KMS does not rotate the backing key. If you cancel the deletion, the original key rotation status is restored.   To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def getKeyRotationStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyRotationStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyRotationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Boolean value that indicates whether automatic rotation of the key material is enabled for the specified customer master key (CMK). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.   Disabled: The key rotation status does not change when you disable a CMK. However, while the CMK is disabled, AWS KMS does not rotate the backing key.   Pending deletion: While a CMK is pending deletion, its key rotation status is false and AWS KMS does not rotate the backing key. If you cancel the deletion, the original key rotation status is restored.   To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def getKeyRotationStatus(params: awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyRotationStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyRotationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a Boolean value that indicates whether automatic rotation of the key material is enabled for the specified customer master key (CMK). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.   Disabled: The key rotation status does not change when you disable a CMK. However, while the CMK is disabled, AWS KMS does not rotate the backing key.   Pending deletion: While a CMK is pending deletion, its key rotation status is false and AWS KMS does not rotate the backing key. If you cancel the deletion, the original key rotation status is restored.   To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def getKeyRotationStatus(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyRotationStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyRotationStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetKeyRotationStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the items you need in order to import key material into AWS KMS from your existing key management infrastructure. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You must specify the key ID of the customer master key (CMK) into which you will import key material. This CMK's Origin must be EXTERNAL. You must also specify the wrapping algorithm and type of wrapping key (public key) that you will use to encrypt the key material. You cannot perform this operation on a CMK in a different AWS account. This operation returns a public key and an import token. Use the public key to encrypt the key material. Store the import token to send with a subsequent ImportKeyMaterial request. The public key and import token from the same response must be used together. These items are valid for 24 hours. When they expire, they cannot be used for a subsequent ImportKeyMaterial request. To get new ones, send another GetParametersForImport request. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def getParametersForImport(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetParametersForImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the items you need in order to import key material into AWS KMS from your existing key management infrastructure. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You must specify the key ID of the customer master key (CMK) into which you will import key material. This CMK's Origin must be EXTERNAL. You must also specify the wrapping algorithm and type of wrapping key (public key) that you will use to encrypt the key material. You cannot perform this operation on a CMK in a different AWS account. This operation returns a public key and an import token. Use the public key to encrypt the key material. Store the import token to send with a subsequent ImportKeyMaterial request. The public key and import token from the same response must be used together. These items are valid for 24 hours. When they expire, they cannot be used for a subsequent ImportKeyMaterial request. To get new ones, send another GetParametersForImport request. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def getParametersForImport(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GetParametersForImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetParametersForImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the items you need in order to import key material into AWS KMS from your existing key management infrastructure. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You must specify the key ID of the customer master key (CMK) into which you will import key material. This CMK's Origin must be EXTERNAL. You must also specify the wrapping algorithm and type of wrapping key (public key) that you will use to encrypt the key material. You cannot perform this operation on a CMK in a different AWS account. This operation returns a public key and an import token. Use the public key to encrypt the key material. Store the import token to send with a subsequent ImportKeyMaterial request. The public key and import token from the same response must be used together. These items are valid for 24 hours. When they expire, they cannot be used for a subsequent ImportKeyMaterial request. To get new ones, send another GetParametersForImport request. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def getParametersForImport(params: awsDashSdkLib.clientsKmsMod.KMSNs.GetParametersForImportRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetParametersForImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the items you need in order to import key material into AWS KMS from your existing key management infrastructure. For more information about importing key material into AWS KMS, see Importing Key Material in the AWS Key Management Service Developer Guide. You must specify the key ID of the customer master key (CMK) into which you will import key material. This CMK's Origin must be EXTERNAL. You must also specify the wrapping algorithm and type of wrapping key (public key) that you will use to encrypt the key material. You cannot perform this operation on a CMK in a different AWS account. This operation returns a public key and an import token. Use the public key to encrypt the key material. Store the import token to send with a subsequent ImportKeyMaterial request. The public key and import token from the same response must be used together. These items are valid for 24 hours. When they expire, they cannot be used for a subsequent ImportKeyMaterial request. To get new ones, send another GetParametersForImport request. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def getParametersForImport(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.GetParametersForImportRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.GetParametersForImportResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.GetParametersForImportResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Imports key material into an existing AWS KMS customer master key (CMK) that was created without key material. You cannot perform this operation on a CMK in a different AWS account. For more information about creating CMKs with no key material and then importing key material, see Importing Key Material in the AWS Key Management Service Developer Guide. Before using this operation, call GetParametersForImport. Its response includes a public key and an import token. Use the public key to encrypt the key material. Then, submit the import token from the same GetParametersForImport response. When calling this operation, you must specify the following values:   The key ID or key ARN of a CMK with no key material. Its Origin must be EXTERNAL. To create a CMK with no key material, call CreateKey and set the value of its Origin parameter to EXTERNAL. To get the Origin of a CMK, call DescribeKey.)   The encrypted key material. To get the public key to encrypt the key material, call GetParametersForImport.   The import token that GetParametersForImport returned. This token and the public key used to encrypt the key material must have come from the same response.   Whether the key material expires and if so, when. If you set an expiration date, you can change it only by reimporting the same key material and specifying a new expiration date. If the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. To use the CMK again, you must reimport the same key material.   When this operation is successful, the CMK's key state changes from PendingImport to Enabled, and you can use the CMK. After you successfully import key material into a CMK, you can reimport the same key material into that CMK, but you cannot import different key material. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def importKeyMaterial(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ImportKeyMaterialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Imports key material into an existing AWS KMS customer master key (CMK) that was created without key material. You cannot perform this operation on a CMK in a different AWS account. For more information about creating CMKs with no key material and then importing key material, see Importing Key Material in the AWS Key Management Service Developer Guide. Before using this operation, call GetParametersForImport. Its response includes a public key and an import token. Use the public key to encrypt the key material. Then, submit the import token from the same GetParametersForImport response. When calling this operation, you must specify the following values:   The key ID or key ARN of a CMK with no key material. Its Origin must be EXTERNAL. To create a CMK with no key material, call CreateKey and set the value of its Origin parameter to EXTERNAL. To get the Origin of a CMK, call DescribeKey.)   The encrypted key material. To get the public key to encrypt the key material, call GetParametersForImport.   The import token that GetParametersForImport returned. This token and the public key used to encrypt the key material must have come from the same response.   Whether the key material expires and if so, when. If you set an expiration date, you can change it only by reimporting the same key material and specifying a new expiration date. If the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. To use the CMK again, you must reimport the same key material.   When this operation is successful, the CMK's key state changes from PendingImport to Enabled, and you can use the CMK. After you successfully import key material into a CMK, you can reimport the same key material into that CMK, but you cannot import different key material. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def importKeyMaterial(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ImportKeyMaterialResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ImportKeyMaterialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Imports key material into an existing AWS KMS customer master key (CMK) that was created without key material. You cannot perform this operation on a CMK in a different AWS account. For more information about creating CMKs with no key material and then importing key material, see Importing Key Material in the AWS Key Management Service Developer Guide. Before using this operation, call GetParametersForImport. Its response includes a public key and an import token. Use the public key to encrypt the key material. Then, submit the import token from the same GetParametersForImport response. When calling this operation, you must specify the following values:   The key ID or key ARN of a CMK with no key material. Its Origin must be EXTERNAL. To create a CMK with no key material, call CreateKey and set the value of its Origin parameter to EXTERNAL. To get the Origin of a CMK, call DescribeKey.)   The encrypted key material. To get the public key to encrypt the key material, call GetParametersForImport.   The import token that GetParametersForImport returned. This token and the public key used to encrypt the key material must have come from the same response.   Whether the key material expires and if so, when. If you set an expiration date, you can change it only by reimporting the same key material and specifying a new expiration date. If the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. To use the CMK again, you must reimport the same key material.   When this operation is successful, the CMK's key state changes from PendingImport to Enabled, and you can use the CMK. After you successfully import key material into a CMK, you can reimport the same key material into that CMK, but you cannot import different key material. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def importKeyMaterial(params: awsDashSdkLib.clientsKmsMod.KMSNs.ImportKeyMaterialRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ImportKeyMaterialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Imports key material into an existing AWS KMS customer master key (CMK) that was created without key material. You cannot perform this operation on a CMK in a different AWS account. For more information about creating CMKs with no key material and then importing key material, see Importing Key Material in the AWS Key Management Service Developer Guide. Before using this operation, call GetParametersForImport. Its response includes a public key and an import token. Use the public key to encrypt the key material. Then, submit the import token from the same GetParametersForImport response. When calling this operation, you must specify the following values:   The key ID or key ARN of a CMK with no key material. Its Origin must be EXTERNAL. To create a CMK with no key material, call CreateKey and set the value of its Origin parameter to EXTERNAL. To get the Origin of a CMK, call DescribeKey.)   The encrypted key material. To get the public key to encrypt the key material, call GetParametersForImport.   The import token that GetParametersForImport returned. This token and the public key used to encrypt the key material must have come from the same response.   Whether the key material expires and if so, when. If you set an expiration date, you can change it only by reimporting the same key material and specifying a new expiration date. If the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. To use the CMK again, you must reimport the same key material.   When this operation is successful, the CMK's key state changes from PendingImport to Enabled, and you can use the CMK. After you successfully import key material into a CMK, you can reimport the same key material into that CMK, but you cannot import different key material. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def importKeyMaterial(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.ImportKeyMaterialRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ImportKeyMaterialResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ImportKeyMaterialResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of aliases in the caller's AWS account and region. You cannot list aliases in other accounts. For more information about aliases, see CreateAlias. By default, the ListAliases command returns all aliases in the account and region. To get only the aliases that point to a particular customer master key (CMK), use the KeyId parameter. The ListAliases response can include aliases that you created and associated with your customer managed CMKs, and aliases that AWS created and associated with AWS managed CMKs in your account. You can recognize AWS aliases because their names have the format aws/&lt;service-name&gt;, such as aws/dynamodb. The response might also include aliases that have no TargetKeyId field. These are predefined aliases that AWS has created but has not yet associated with a CMK. Aliases that AWS creates in your account, including predefined aliases, do not count against your AWS KMS aliases limit.
     */
  def listAliases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of aliases in the caller's AWS account and region. You cannot list aliases in other accounts. For more information about aliases, see CreateAlias. By default, the ListAliases command returns all aliases in the account and region. To get only the aliases that point to a particular customer master key (CMK), use the KeyId parameter. The ListAliases response can include aliases that you created and associated with your customer managed CMKs, and aliases that AWS created and associated with AWS managed CMKs in your account. You can recognize AWS aliases because their names have the format aws/&lt;service-name&gt;, such as aws/dynamodb. The response might also include aliases that have no TargetKeyId field. These are predefined aliases that AWS has created but has not yet associated with a CMK. Aliases that AWS creates in your account, including predefined aliases, do not count against your AWS KMS aliases limit.
     */
  def listAliases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of aliases in the caller's AWS account and region. You cannot list aliases in other accounts. For more information about aliases, see CreateAlias. By default, the ListAliases command returns all aliases in the account and region. To get only the aliases that point to a particular customer master key (CMK), use the KeyId parameter. The ListAliases response can include aliases that you created and associated with your customer managed CMKs, and aliases that AWS created and associated with AWS managed CMKs in your account. You can recognize AWS aliases because their names have the format aws/&lt;service-name&gt;, such as aws/dynamodb. The response might also include aliases that have no TargetKeyId field. These are predefined aliases that AWS has created but has not yet associated with a CMK. Aliases that AWS creates in your account, including predefined aliases, do not count against your AWS KMS aliases limit.
     */
  def listAliases(params: awsDashSdkLib.clientsKmsMod.KMSNs.ListAliasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of aliases in the caller's AWS account and region. You cannot list aliases in other accounts. For more information about aliases, see CreateAlias. By default, the ListAliases command returns all aliases in the account and region. To get only the aliases that point to a particular customer master key (CMK), use the KeyId parameter. The ListAliases response can include aliases that you created and associated with your customer managed CMKs, and aliases that AWS created and associated with AWS managed CMKs in your account. You can recognize AWS aliases because their names have the format aws/&lt;service-name&gt;, such as aws/dynamodb. The response might also include aliases that have no TargetKeyId field. These are predefined aliases that AWS has created but has not yet associated with a CMK. Aliases that AWS creates in your account, including predefined aliases, do not count against your AWS KMS aliases limit.
     */
  def listAliases(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.ListAliasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListAliasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListAliasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all grants for the specified customer master key (CMK). To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def listGrants(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all grants for the specified customer master key (CMK). To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def listGrants(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all grants for the specified customer master key (CMK). To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def listGrants(params: awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all grants for the specified customer master key (CMK). To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def listGrants(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the names of the key policies that are attached to a customer master key (CMK). This operation is designed to get policy names that you can use in a GetKeyPolicy operation. However, the only valid policy name is default. You cannot perform this operation on a CMK in a different AWS account.
     */
  def listKeyPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListKeyPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the names of the key policies that are attached to a customer master key (CMK). This operation is designed to get policy names that you can use in a GetKeyPolicy operation. However, the only valid policy name is default. You cannot perform this operation on a CMK in a different AWS account.
     */
  def listKeyPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListKeyPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListKeyPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the names of the key policies that are attached to a customer master key (CMK). This operation is designed to get policy names that you can use in a GetKeyPolicy operation. However, the only valid policy name is default. You cannot perform this operation on a CMK in a different AWS account.
     */
  def listKeyPolicies(params: awsDashSdkLib.clientsKmsMod.KMSNs.ListKeyPoliciesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListKeyPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the names of the key policies that are attached to a customer master key (CMK). This operation is designed to get policy names that you can use in a GetKeyPolicy operation. However, the only valid policy name is default. You cannot perform this operation on a CMK in a different AWS account.
     */
  def listKeyPolicies(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.ListKeyPoliciesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListKeyPoliciesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListKeyPoliciesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all customer master keys (CMKs) in the caller's AWS account and region.
     */
  def listKeys(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all customer master keys (CMKs) in the caller's AWS account and region.
     */
  def listKeys(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all customer master keys (CMKs) in the caller's AWS account and region.
     */
  def listKeys(params: awsDashSdkLib.clientsKmsMod.KMSNs.ListKeysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of all customer master keys (CMKs) in the caller's AWS account and region.
     */
  def listKeys(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.ListKeysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListKeysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListKeysResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all tags for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
     */
  def listResourceTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListResourceTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all tags for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
     */
  def listResourceTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListResourceTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListResourceTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all tags for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
     */
  def listResourceTags(params: awsDashSdkLib.clientsKmsMod.KMSNs.ListResourceTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListResourceTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all tags for the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account.
     */
  def listResourceTags(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.ListResourceTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListResourceTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListResourceTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all grants for which the grant's RetiringPrincipal matches the one specified. A typical use is to list all grants that you are able to retire. To retire a grant, use RetireGrant.
     */
  def listRetirableGrants(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all grants for which the grant's RetiringPrincipal matches the one specified. A typical use is to list all grants that you are able to retire. To retire a grant, use RetireGrant.
     */
  def listRetirableGrants(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all grants for which the grant's RetiringPrincipal matches the one specified. A typical use is to list all grants that you are able to retire. To retire a grant, use RetireGrant.
     */
  def listRetirableGrants(params: awsDashSdkLib.clientsKmsMod.KMSNs.ListRetirableGrantsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of all grants for which the grant's RetiringPrincipal matches the one specified. A typical use is to list all grants that you are able to retire. To retire a grant, use RetireGrant.
     */
  def listRetirableGrants(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.ListRetirableGrantsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ListGrantsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Attaches a key policy to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. For more information about key policies, see Key Policies in the AWS Key Management Service Developer Guide.
     */
  def putKeyPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches a key policy to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. For more information about key policies, see Key Policies in the AWS Key Management Service Developer Guide.
     */
  def putKeyPolicy(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches a key policy to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. For more information about key policies, see Key Policies in the AWS Key Management Service Developer Guide.
     */
  def putKeyPolicy(params: awsDashSdkLib.clientsKmsMod.KMSNs.PutKeyPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches a key policy to the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. For more information about key policies, see Key Policies in the AWS Key Management Service Developer Guide.
     */
  def putKeyPolicy(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.PutKeyPolicyRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Encrypts data on the server side with a new customer master key (CMK) without exposing the plaintext of the data on the client side. The data is first decrypted and then reencrypted. You can also use this operation to change the encryption context of a ciphertext.  You can reencrypt data using CMKs in different AWS accounts. Unlike other operations, ReEncrypt is authorized twice, once as ReEncryptFrom on the source CMK and once as ReEncryptTo on the destination CMK. We recommend that you include the "kms:ReEncrypt*" permission in your key policies to permit reencryption from or to the CMK. This permission is automatically included in the key policy when you create a CMK through the console. But you must include it manually when you create a CMK programmatically or when you set a key policy with the PutKeyPolicy operation. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def reEncrypt(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ReEncryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Encrypts data on the server side with a new customer master key (CMK) without exposing the plaintext of the data on the client side. The data is first decrypted and then reencrypted. You can also use this operation to change the encryption context of a ciphertext.  You can reencrypt data using CMKs in different AWS accounts. Unlike other operations, ReEncrypt is authorized twice, once as ReEncryptFrom on the source CMK and once as ReEncryptTo on the destination CMK. We recommend that you include the "kms:ReEncrypt*" permission in your key policies to permit reencryption from or to the CMK. This permission is automatically included in the key policy when you create a CMK through the console. But you must include it manually when you create a CMK programmatically or when you set a key policy with the PutKeyPolicy operation. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def reEncrypt(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ReEncryptResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ReEncryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Encrypts data on the server side with a new customer master key (CMK) without exposing the plaintext of the data on the client side. The data is first decrypted and then reencrypted. You can also use this operation to change the encryption context of a ciphertext.  You can reencrypt data using CMKs in different AWS accounts. Unlike other operations, ReEncrypt is authorized twice, once as ReEncryptFrom on the source CMK and once as ReEncryptTo on the destination CMK. We recommend that you include the "kms:ReEncrypt*" permission in your key policies to permit reencryption from or to the CMK. This permission is automatically included in the key policy when you create a CMK through the console. But you must include it manually when you create a CMK programmatically or when you set a key policy with the PutKeyPolicy operation. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def reEncrypt(params: awsDashSdkLib.clientsKmsMod.KMSNs.ReEncryptRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ReEncryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Encrypts data on the server side with a new customer master key (CMK) without exposing the plaintext of the data on the client side. The data is first decrypted and then reencrypted. You can also use this operation to change the encryption context of a ciphertext.  You can reencrypt data using CMKs in different AWS accounts. Unlike other operations, ReEncrypt is authorized twice, once as ReEncryptFrom on the source CMK and once as ReEncryptTo on the destination CMK. We recommend that you include the "kms:ReEncrypt*" permission in your key policies to permit reencryption from or to the CMK. This permission is automatically included in the key policy when you create a CMK through the console. But you must include it manually when you create a CMK programmatically or when you set a key policy with the PutKeyPolicy operation. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def reEncrypt(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.ReEncryptRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ReEncryptResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ReEncryptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retires a grant. To clean up, you can retire a grant when you're done using it. You should revoke a grant when you intend to actively deny operations that depend on it. The following are permitted to call this API:   The AWS account (root user) under which the grant was created   The RetiringPrincipal, if present in the grant   The GranteePrincipal, if RetireGrant is an operation specified in the grant   You must identify the grant to retire by its grant token or by a combination of the grant ID and the Amazon Resource Name (ARN) of the customer master key (CMK). A grant token is a unique variable-length base64-encoded string. A grant ID is a 64 character unique identifier of a grant. The CreateGrant operation returns both.
     */
  def retireGrant(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Retires a grant. To clean up, you can retire a grant when you're done using it. You should revoke a grant when you intend to actively deny operations that depend on it. The following are permitted to call this API:   The AWS account (root user) under which the grant was created   The RetiringPrincipal, if present in the grant   The GranteePrincipal, if RetireGrant is an operation specified in the grant   You must identify the grant to retire by its grant token or by a combination of the grant ID and the Amazon Resource Name (ARN) of the customer master key (CMK). A grant token is a unique variable-length base64-encoded string. A grant ID is a 64 character unique identifier of a grant. The CreateGrant operation returns both.
     */
  def retireGrant(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Retires a grant. To clean up, you can retire a grant when you're done using it. You should revoke a grant when you intend to actively deny operations that depend on it. The following are permitted to call this API:   The AWS account (root user) under which the grant was created   The RetiringPrincipal, if present in the grant   The GranteePrincipal, if RetireGrant is an operation specified in the grant   You must identify the grant to retire by its grant token or by a combination of the grant ID and the Amazon Resource Name (ARN) of the customer master key (CMK). A grant token is a unique variable-length base64-encoded string. A grant ID is a 64 character unique identifier of a grant. The CreateGrant operation returns both.
     */
  def retireGrant(params: awsDashSdkLib.clientsKmsMod.KMSNs.RetireGrantRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Retires a grant. To clean up, you can retire a grant when you're done using it. You should revoke a grant when you intend to actively deny operations that depend on it. The following are permitted to call this API:   The AWS account (root user) under which the grant was created   The RetiringPrincipal, if present in the grant   The GranteePrincipal, if RetireGrant is an operation specified in the grant   You must identify the grant to retire by its grant token or by a combination of the grant ID and the Amazon Resource Name (ARN) of the customer master key (CMK). A grant token is a unique variable-length base64-encoded string. A grant ID is a 64 character unique identifier of a grant. The CreateGrant operation returns both.
     */
  def retireGrant(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.RetireGrantRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Revokes the specified grant for the specified customer master key (CMK). You can revoke a grant to actively deny operations that depend on it. To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def revokeGrant(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Revokes the specified grant for the specified customer master key (CMK). You can revoke a grant to actively deny operations that depend on it. To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def revokeGrant(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Revokes the specified grant for the specified customer master key (CMK). You can revoke a grant to actively deny operations that depend on it. To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def revokeGrant(params: awsDashSdkLib.clientsKmsMod.KMSNs.RevokeGrantRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Revokes the specified grant for the specified customer master key (CMK). You can revoke a grant to actively deny operations that depend on it. To perform this operation on a CMK in a different AWS account, specify the key ARN in the value of the KeyId parameter.
     */
  def revokeGrant(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.RevokeGrantRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Schedules the deletion of a customer master key (CMK). You may provide a waiting period, specified in days, before deletion occurs. If you do not provide a waiting period, the default period of 30 days is used. When this operation is successful, the state of the CMK changes to PendingDeletion. Before the waiting period ends, you can use CancelKeyDeletion to cancel the deletion of the CMK. After the waiting period ends, AWS KMS deletes the CMK and all AWS KMS data associated with it, including all aliases that refer to it. You cannot perform this operation on a CMK in a different AWS account.  Deleting a CMK is a destructive and potentially dangerous operation. When a CMK is deleted, all data that was encrypted under the CMK is rendered unrecoverable. To restrict the use of a CMK without deleting it, use DisableKey.  For more information about scheduling a CMK for deletion, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def scheduleKeyDeletion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ScheduleKeyDeletionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Schedules the deletion of a customer master key (CMK). You may provide a waiting period, specified in days, before deletion occurs. If you do not provide a waiting period, the default period of 30 days is used. When this operation is successful, the state of the CMK changes to PendingDeletion. Before the waiting period ends, you can use CancelKeyDeletion to cancel the deletion of the CMK. After the waiting period ends, AWS KMS deletes the CMK and all AWS KMS data associated with it, including all aliases that refer to it. You cannot perform this operation on a CMK in a different AWS account.  Deleting a CMK is a destructive and potentially dangerous operation. When a CMK is deleted, all data that was encrypted under the CMK is rendered unrecoverable. To restrict the use of a CMK without deleting it, use DisableKey.  For more information about scheduling a CMK for deletion, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def scheduleKeyDeletion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ScheduleKeyDeletionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ScheduleKeyDeletionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Schedules the deletion of a customer master key (CMK). You may provide a waiting period, specified in days, before deletion occurs. If you do not provide a waiting period, the default period of 30 days is used. When this operation is successful, the state of the CMK changes to PendingDeletion. Before the waiting period ends, you can use CancelKeyDeletion to cancel the deletion of the CMK. After the waiting period ends, AWS KMS deletes the CMK and all AWS KMS data associated with it, including all aliases that refer to it. You cannot perform this operation on a CMK in a different AWS account.  Deleting a CMK is a destructive and potentially dangerous operation. When a CMK is deleted, all data that was encrypted under the CMK is rendered unrecoverable. To restrict the use of a CMK without deleting it, use DisableKey.  For more information about scheduling a CMK for deletion, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def scheduleKeyDeletion(params: awsDashSdkLib.clientsKmsMod.KMSNs.ScheduleKeyDeletionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ScheduleKeyDeletionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Schedules the deletion of a customer master key (CMK). You may provide a waiting period, specified in days, before deletion occurs. If you do not provide a waiting period, the default period of 30 days is used. When this operation is successful, the state of the CMK changes to PendingDeletion. Before the waiting period ends, you can use CancelKeyDeletion to cancel the deletion of the CMK. After the waiting period ends, AWS KMS deletes the CMK and all AWS KMS data associated with it, including all aliases that refer to it. You cannot perform this operation on a CMK in a different AWS account.  Deleting a CMK is a destructive and potentially dangerous operation. When a CMK is deleted, all data that was encrypted under the CMK is rendered unrecoverable. To restrict the use of a CMK without deleting it, use DisableKey.  For more information about scheduling a CMK for deletion, see Deleting Customer Master Keys in the AWS Key Management Service Developer Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def scheduleKeyDeletion(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.ScheduleKeyDeletionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKmsMod.KMSNs.ScheduleKeyDeletionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKmsMod.KMSNs.ScheduleKeyDeletionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds or edits tags for a customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty (null) strings. You can only use a tag key once for each CMK. If you use the tag key again, AWS KMS replaces the current tag value with the specified value. For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or edits tags for a customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty (null) strings. You can only use a tag key once for each CMK. If you use the tag key again, AWS KMS replaces the current tag value with the specified value. For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or edits tags for a customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty (null) strings. You can only use a tag key once for each CMK. If you use the tag key again, AWS KMS replaces the current tag value with the specified value. For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def tagResource(params: awsDashSdkLib.clientsKmsMod.KMSNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Adds or edits tags for a customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty (null) strings. You can only use a tag key once for each CMK. If you use the tag key again, AWS KMS replaces the current tag value with the specified value. For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def tagResource(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use TagResource. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use TagResource. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use TagResource. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def untagResource(params: awsDashSdkLib.clientsKmsMod.KMSNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes the specified tags from the specified customer master key (CMK). You cannot perform this operation on a CMK in a different AWS account. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use TagResource. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def untagResource(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates an existing alias with a different customer master key (CMK). Each CMK can have multiple aliases, but the aliases must be unique within the account and region. You cannot perform this operation on an alias in a different AWS account. This operation works only on existing aliases. To change the alias of a CMK to a new value, use CreateAlias to create a new alias and DeleteAlias to delete the old alias. Because an alias is not a property of a CMK, you can create, update, and delete the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs in the account, use the ListAliases operation.  An alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). An alias must start with the word alias followed by a forward slash (alias/). The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws; that alias name prefix is reserved by Amazon Web Services (AWS). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def updateAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates an existing alias with a different customer master key (CMK). Each CMK can have multiple aliases, but the aliases must be unique within the account and region. You cannot perform this operation on an alias in a different AWS account. This operation works only on existing aliases. To change the alias of a CMK to a new value, use CreateAlias to create a new alias and DeleteAlias to delete the old alias. Because an alias is not a property of a CMK, you can create, update, and delete the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs in the account, use the ListAliases operation.  An alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). An alias must start with the word alias followed by a forward slash (alias/). The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws; that alias name prefix is reserved by Amazon Web Services (AWS). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def updateAlias(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates an existing alias with a different customer master key (CMK). Each CMK can have multiple aliases, but the aliases must be unique within the account and region. You cannot perform this operation on an alias in a different AWS account. This operation works only on existing aliases. To change the alias of a CMK to a new value, use CreateAlias to create a new alias and DeleteAlias to delete the old alias. Because an alias is not a property of a CMK, you can create, update, and delete the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs in the account, use the ListAliases operation.  An alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). An alias must start with the word alias followed by a forward slash (alias/). The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws; that alias name prefix is reserved by Amazon Web Services (AWS). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def updateAlias(params: awsDashSdkLib.clientsKmsMod.KMSNs.UpdateAliasRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates an existing alias with a different customer master key (CMK). Each CMK can have multiple aliases, but the aliases must be unique within the account and region. You cannot perform this operation on an alias in a different AWS account. This operation works only on existing aliases. To change the alias of a CMK to a new value, use CreateAlias to create a new alias and DeleteAlias to delete the old alias. Because an alias is not a property of a CMK, you can create, update, and delete the aliases of a CMK without affecting the CMK. Also, aliases do not appear in the response from the DescribeKey operation. To get the aliases of all CMKs in the account, use the ListAliases operation.  An alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). An alias must start with the word alias followed by a forward slash (alias/). The alias name can contain only alphanumeric characters, forward slashes (/), underscores (_), and dashes (-). Alias names cannot begin with aws; that alias name prefix is reserved by Amazon Web Services (AWS). The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def updateAlias(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.UpdateAliasRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the description of a customer master key (CMK). To see the description of a CMK, use DescribeKey.  You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def updateKeyDescription(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the description of a customer master key (CMK). To see the description of a CMK, use DescribeKey.  You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def updateKeyDescription(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the description of a customer master key (CMK). To see the description of a CMK, use DescribeKey.  You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def updateKeyDescription(params: awsDashSdkLib.clientsKmsMod.KMSNs.UpdateKeyDescriptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the description of a customer master key (CMK). To see the description of a CMK, use DescribeKey.  You cannot perform this operation on a CMK in a different AWS account. The result of this operation varies with the key state of the CMK. For details, see How Key State Affects Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
     */
  def updateKeyDescription(
    params: awsDashSdkLib.clientsKmsMod.KMSNs.UpdateKeyDescriptionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

