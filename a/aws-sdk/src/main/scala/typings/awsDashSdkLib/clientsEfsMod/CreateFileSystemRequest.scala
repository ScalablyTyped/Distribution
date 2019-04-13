package typings
package awsDashSdkLib.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFileSystemRequest extends js.Object {
  /**
    * A string of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
    */
  var CreationToken: awsDashSdkLib.clientsEfsMod.CreationToken
  /**
    * A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have the option of specifying CreateFileSystemRequest$KmsKeyId for an existing AWS Key Management Service (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS, /aws/elasticfilesystem, is used to protect the encrypted file system. 
    */
  var Encrypted: js.UndefOr[Encrypted] = js.undefined
  /**
    * The ID of the AWS KMS CMK to be used to protect the encrypted file system. This parameter is only required if you want to use a nondefault CMK. If this parameter is not specified, the default CMK for Amazon EFS is used. This ID can be in one of the following formats:   Key ID - A unique identifier of the key, for example 1234abcd-12ab-34cd-56ef-1234567890ab.   ARN - An Amazon Resource Name (ARN) for the key, for example arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Key alias - A previously created display name for a key, for example alias/projectKey1.   Key alias ARN - An ARN for a key alias, for example arn:aws:kms:us-west-2:444455556666:alias/projectKey1.   If KmsKeyId is specified, the CreateFileSystemRequest$Encrypted parameter must be set to true.
    */
  var KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * The performance mode of the file system. We recommend generalPurpose performance mode for most file systems. File systems using the maxIO performance mode can scale to higher levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file operations. The performance mode can't be changed after the file system has been created.
    */
  var PerformanceMode: js.UndefOr[PerformanceMode] = js.undefined
  /**
    * The throughput, measured in MiB/s, that you want to provision for a file system that you're creating. The limit on throughput is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more information, see Amazon EFS Limits That You Can Increase in the Amazon EFS User Guide. 
    */
  var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined
  /**
    * A value that specifies to create one or more tags associated with the file system. Each tag is a user-defined key-value pair. Name your file system on creation by including a "Key":"Name","Value":"{value}" key-value pair.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * The throughput mode for the file system to be created. There are two throughput modes to choose from for your file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput mode or change between the throughput modes as long as it’s been more than 24 hours since the last decrease or throughput mode change.
    */
  var ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined
}

object CreateFileSystemRequest {
  @scala.inline
  def apply(
    CreationToken: CreationToken,
    Encrypted: js.UndefOr[Encrypted] = js.undefined,
    KmsKeyId: KmsKeyId = null,
    PerformanceMode: PerformanceMode = null,
    ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
    Tags: Tags = null,
    ThroughputMode: ThroughputMode = null
  ): CreateFileSystemRequest = {
    val __obj = js.Dynamic.literal(CreationToken = CreationToken)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (PerformanceMode != null) __obj.updateDynamic("PerformanceMode")(PerformanceMode.asInstanceOf[js.Any])
    if (!js.isUndefined(ProvisionedThroughputInMibps)) __obj.updateDynamic("ProvisionedThroughputInMibps")(ProvisionedThroughputInMibps)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (ThroughputMode != null) __obj.updateDynamic("ThroughputMode")(ThroughputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemRequest]
  }
}

