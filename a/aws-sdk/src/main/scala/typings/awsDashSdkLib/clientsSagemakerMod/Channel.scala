package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  /**
    * The name of the channel. 
    */
  var ChannelName: awsDashSdkLib.clientsSagemakerMod.ChannelName
  /**
    * If training data is compressed, the compression type. The default value is None. CompressionType is used only in Pipe input mode. In File mode, leave this field unset or set it to None.
    */
  var CompressionType: js.UndefOr[CompressionType] = js.undefined
  /**
    * The MIME type of the data.
    */
  var ContentType: js.UndefOr[ContentType] = js.undefined
  /**
    * The location of the channel data.
    */
  var DataSource: awsDashSdkLib.clientsSagemakerMod.DataSource
  /**
    * (Optional) The input mode to use for the data channel in a training job. If you don't set a value for InputMode, Amazon SageMaker uses the value set for TrainingInputMode. Use this parameter to override the TrainingInputMode setting in a AlgorithmSpecification request when you have a channel that needs a different input mode from the training job's general setting. To download the data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML storage volume, and mount the directory to a Docker volume, use File input mode. To stream data directly from Amazon S3 to the container, choose Pipe input mode. To use a model for incremental training, choose File input model.
    */
  var InputMode: js.UndefOr[TrainingInputMode] = js.undefined
  /**
    *  Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is already in RecordIO format, you don't need to set this attribute. For more information, see Create a Dataset Using RecordIO.  In File mode, leave this field unset or set it to None.
    */
  var RecordWrapperType: js.UndefOr[RecordWrapper] = js.undefined
  /**
    * A configuration for a shuffle option for input data in a channel. If you use S3Prefix for S3DataType, this shuffles the results of the S3 key prefix matches. If you use ManifestFile, the order of the S3 object references in the ManifestFile is shuffled. If you use AugmentedManifestFile, the order of the JSON lines in the AugmentedManifestFile is shuffled. The shuffling order is determined using the Seed value. For Pipe input mode, shuffling is done at the start of every epoch. With large datasets this ensures that the order of the training data is different for each epoch, it helps reduce bias and possible overfitting. In a multi-node training job when ShuffleConfig is combined with S3DataDistributionType of ShardedByS3Key, the data is shuffled across nodes so that the content sent to a particular node on the first epoch might be sent to a different node on the second epoch.
    */
  var ShuffleConfig: js.UndefOr[ShuffleConfig] = js.undefined
}

object Channel {
  @scala.inline
  def apply(
    ChannelName: ChannelName,
    DataSource: DataSource,
    CompressionType: CompressionType = null,
    ContentType: ContentType = null,
    InputMode: TrainingInputMode = null,
    RecordWrapperType: RecordWrapper = null,
    ShuffleConfig: ShuffleConfig = null
  ): Channel = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName, DataSource = DataSource)
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (InputMode != null) __obj.updateDynamic("InputMode")(InputMode.asInstanceOf[js.Any])
    if (RecordWrapperType != null) __obj.updateDynamic("RecordWrapperType")(RecordWrapperType.asInstanceOf[js.Any])
    if (ShuffleConfig != null) __obj.updateDynamic("ShuffleConfig")(ShuffleConfig)
    __obj.asInstanceOf[Channel]
  }
}

