package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "IoTSiteWiseConfig")
@js.native
open class IoTSiteWiseConfig protected ()
  extends StObject
     with StreamConfigBase[IoTSiteWiseConfigMap] {
  /**
    * @param identifier A unique identifier to identify this individual upload stream.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    * @param batchSize The maximum size of a batch to send to the destination. Messages will be queued until the batch size is reached, after which they will then be uploaded.
    * If unspecified the default will be 10.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum batch size is 1 and the maximum is 10.
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
    batchSize: js.UndefOr[Double | Null],
    batchIntervalMillis: js.UndefOr[Double | Null],
    priority: js.UndefOr[Double | Null],
    startSequenceNumber: js.UndefOr[Double | Null],
    disabled: js.UndefOr[Boolean | Null]
  ) = this()
  
  /**
    * The maximum size of a batch to send to the destination. Messages will be queued until the batch size is reached, after which they will then be uploaded.
    * If unspecified the default will be 10.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum batch size is 1 and the maximum is 10.
    * @returns
    */
  def batchSize: Double | Null = js.native
  /**
    * @param value The maximum size of a batch to send to the destination. Messages will be queued until the batch size is reached, after which they will then be uploaded.
    * If unspecified the default will be 10.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum batch size is 1 and the maximum is 10.
    */
  def batchSize_=(value: Double | Null): Unit = js.native
  
  /**
    * @param value The maximum size of a batch to send to the destination. Messages will be queued until the batch size is reached, after which they will then be uploaded.
    * If unspecified the default will be 10.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum batch size is 1 and the maximum is 10.
    */
  def withBatchSize(): IoTSiteWiseConfig = js.native
  def withBatchSize(value: Double): IoTSiteWiseConfig = js.native
}
/* static members */
object IoTSiteWiseConfig {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "IoTSiteWiseConfig")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromMap(d: IoTSiteWiseConfigMap): IoTSiteWiseConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[IoTSiteWiseConfig]
}
