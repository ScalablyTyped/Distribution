package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "IoTAnalyticsConfig")
@js.native
open class IoTAnalyticsConfig protected ()
  extends StObject
     with StreamConfigBase[IoTAnalyticsConfigMap] {
  /**
    * @param identifier A unique identifier to identify this individual upload stream.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    * @param iotChannel The name of the IoT Analytics Channel that this exporter should upload to.
    * @param iotMsgIdPrefix A string prefixed to each unique message id. After this prefix, StreamManager may append
    * more data to make the message ID unique.
    * This prefix must be less than 32 characters.
    * @param batchSize The maximum size of a batch to send to IoT Analytics. Messages will be queued until the batch size is reached,
    * after which they will then be uploaded.
    * If unspecified the default will be 100.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The batch size must be between 1 and 100.
    * @param batchIntervalMillis The time in milliseconds between the earliest un-uploaded message and the current time.
    * If this time is exceeded, messages will be uploaded in the next batch. If unspecified messages will be eligible for upload immediately.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum value is 60000 milliseconds and the maximum is 9223372036854 milliseconds.
    * @param priority Priority for this upload stream. Lower values are higher priority. If not specified it will have the lowest priority.
    * @param startSequenceNumber The sequence number of the message to use as the starting message in the export.
    * Default is 0.
    * The sequence number provided should be less than the newest sequence number in the stream, i.e., sequence number of the last messaged appended.
    * To find the newest sequence number, describe the stream and then check the storage status of the returned MessageStreamInfo object.
    * @param disabled Enable or disable this export. Default is false.
    */
  def this(
    identifier: js.UndefOr[String | Null],
    iotChannel: js.UndefOr[String | Null],
    iotMsgIdPrefix: js.UndefOr[String | Null],
    batchSize: js.UndefOr[Double | Null],
    batchIntervalMillis: js.UndefOr[Double | Null],
    priority: js.UndefOr[Double | Null],
    startSequenceNumber: js.UndefOr[Double | Null],
    disabled: js.UndefOr[Boolean | Null]
  ) = this()
  
  /**
    * The maximum size of a batch to send to IoT Analytics. Messages will be queued until the batch size is reached,
    * after which they will then be uploaded.
    * If unspecified the default will be 100.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The batch size must be between 1 and 100.
    * @returns
    */
  def batchSize: Double | Null = js.native
  /**
    * @param value The maximum size of a batch to send to IoT Analytics. Messages will be queued until the batch size is reached,
    * after which they will then be uploaded.
    * If unspecified the default will be 100.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The batch size must be between 1 and 100.
    */
  def batchSize_=(value: Double | Null): Unit = js.native
  
  /**
    * The name of the IoT Analytics Channel that this exporter should upload to.
    * @returns
    */
  def iotChannel: String | Null = js.native
  /**
    * @param value The name of the IoT Analytics Channel that this exporter should upload to.
    */
  def iotChannel_=(value: String | Null): Unit = js.native
  
  /**
    * A string prefixed to each unique message id. After this prefix, StreamManager may append more data to make the message ID unique.
    * This prefix must be less than 32 characters.
    * @returns
    */
  def iotMsgIdPrefix: String | Null = js.native
  /**
    * @param value A string prefixed to each unique message id. After this prefix, StreamManager may append more data to make the message ID unique.
    * This prefix must be less than 32 characters.
    */
  def iotMsgIdPrefix_=(value: String | Null): Unit = js.native
  
  /**
    * @param value The maximum size of a batch to send to IoT Analytics. Messages will be queued until the batch size is reached,
    * after which they will then be uploaded.
    * If unspecified the default will be 100.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The batch size must be between 1 and 100.
    */
  def withBatchSize(): IoTAnalyticsConfig = js.native
  def withBatchSize(value: Double): IoTAnalyticsConfig = js.native
  
  /**
    * @param value The name of the IoT Analytics Channel that this exporter should upload to.
    * @returns
    */
  def withIotChannel(): IoTAnalyticsConfig = js.native
  def withIotChannel(value: String): IoTAnalyticsConfig = js.native
  
  /**
    * @param value A string prefixed to each unique message id. After this prefix, StreamManager may append more data to make the message ID unique.
    * This prefix must be less than 32 characters.
    * @returns
    */
  def withIotMsgIdPrefix(): IoTAnalyticsConfig = js.native
  def withIotMsgIdPrefix(value: String): IoTAnalyticsConfig = js.native
}
/* static members */
object IoTAnalyticsConfig {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "IoTAnalyticsConfig")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromMap(d: IoTAnalyticsConfigMap): IoTAnalyticsConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[IoTAnalyticsConfig]
}
