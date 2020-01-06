package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingS3Input extends js.Object {
  /**
    * The local path to the Amazon S3 bucket where you want Amazon SageMaker to download the inputs to run a processing job. LocalPath is an absolute path to the input data.
    */
  var LocalPath: ProcessingLocalPath = js.native
  /**
    * Whether to use Gzip compresion for Amazon S3 storage.
    */
  var S3CompressionType: js.UndefOr[ProcessingS3CompressionType] = js.native
  /**
    * Whether the data stored in Amazon S3 is FullyReplicated or ShardedByS3Key.
    */
  var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType] = js.native
  /**
    * Whether you use an S3Prefix or a ManifestFile for the data type. If you choose S3Prefix, S3Uri identifies a key name prefix. Amazon SageMaker uses all objects with the specified key name prefix for the processing job. If you choose ManifestFile, S3Uri identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to use for the processing job.
    */
  var S3DataType: ProcessingS3DataType = js.native
  /**
    * Wether to use File or Pipe input mode. In File mode, Amazon SageMaker copies the data from the input source onto the local Amazon Elastic Block Store (Amazon EBS) volumes before starting your training algorithm. This is the most commonly used input mode. In Pipe mode, Amazon SageMaker streams input data from the source directly to your algorithm without using the EBS volume.
    */
  var S3InputMode: ProcessingS3InputMode = js.native
  /**
    * The URI for the Amazon S3 storage where you want Amazon SageMaker to download the artifacts needed to run a processing job.
    */
  var S3Uri: typings.awsDashSdk.clientsSagemakerMod.S3Uri = js.native
}

object ProcessingS3Input {
  @scala.inline
  def apply(
    LocalPath: ProcessingLocalPath,
    S3DataType: ProcessingS3DataType,
    S3InputMode: ProcessingS3InputMode,
    S3Uri: S3Uri,
    S3CompressionType: ProcessingS3CompressionType = null,
    S3DataDistributionType: ProcessingS3DataDistributionType = null
  ): ProcessingS3Input = {
    val __obj = js.Dynamic.literal(LocalPath = LocalPath.asInstanceOf[js.Any], S3DataType = S3DataType.asInstanceOf[js.Any], S3InputMode = S3InputMode.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    if (S3CompressionType != null) __obj.updateDynamic("S3CompressionType")(S3CompressionType.asInstanceOf[js.Any])
    if (S3DataDistributionType != null) __obj.updateDynamic("S3DataDistributionType")(S3DataDistributionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingS3Input]
  }
}

