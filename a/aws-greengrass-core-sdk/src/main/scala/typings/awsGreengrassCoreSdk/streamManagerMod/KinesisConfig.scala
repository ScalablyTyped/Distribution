package typings.awsGreengrassCoreSdk.streamManagerMod

import typings.awsGreengrassCoreSdk.streamManagerDataMod.KinesisConfigMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager", "KinesisConfig")
@js.native
open class KinesisConfig protected ()
  extends typings.awsGreengrassCoreSdk.streamManagerClientMod.KinesisConfig {
  /**
    * @param identifier A unique identifier to identify this individual upload stream.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    * @param kinesisStreamName The name of the Kinesis data stream that this exporter should upload to.
    * @param batchSize The maximum size of a batch to send to Kinesis. Messages will be queued until the batch size is reached,
    * after which they will then be uploaded.
    * If unspecified the default will be 500.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The batch size must be between 1 and 500.
    * @param batchIntervalMillis The time in milliseconds between the earliest un-uploaded message and the current time.
    * If this time is exceeded, messages will be uploaded in the next batch. If unspecified messages will be eligible for upload immediately.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum value is 60000 milliseconds and the maximum is 9223372036854 milliseconds.
    * @param priority Priority for this upload stream. Lower values are higher priority. If not specified it will have the lowest priority.
    * @param startSequenceNumber The sequence number of the message to use as the starting message in the export. Default is 0.
    * The sequence number provided should be less than the newest sequence number in the stream, i.e., sequence number of the last messaged appended.
    * To find the newest sequence number, describe the stream and then check the storage status of the returned MessageStreamInfo object.
    * @param disabled Enable or disable this export. Default is false.
    */
  def this(
    identifier: js.UndefOr[String | Null],
    kinesisStreamName: js.UndefOr[String | Null],
    batchSize: js.UndefOr[Double | Null],
    batchIntervalMillis: js.UndefOr[Double | Null],
    priority: js.UndefOr[Double | Null],
    startSequenceNumber: js.UndefOr[Double | Null],
    disabled: js.UndefOr[Boolean | Null]
  ) = this()
}
/* static members */
object KinesisConfig {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "KinesisConfig")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromMap(d: KinesisConfigMap): typings.awsGreengrassCoreSdk.streamManagerDataMod.KinesisConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.streamManagerDataMod.KinesisConfig]
}
