package typings.awsGreengrassCoreSdk.dataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamConfigBase[TMap /* <: StreamConfigBaseMap */] extends StObject {
  
  def asMap(): TMap = js.native
  
  /**
    * The time in milliseconds between the earliest un-uploaded message and the current time. If this time is exceeded,
    * messages will be uploaded in the next batch. If unspecified messages will be eligible for upload immediately.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum value is 60000 milliseconds and the maximum is 9223372036854 milliseconds.
    * @returns
    */
  def batchIntervalMillis: Double | Null = js.native
  /**
    * @param value The time in milliseconds between the earliest un-uploaded message and the current time. If this time is exceeded,
    * messages will be uploaded in the next batch. If unspecified messages will be eligible for upload immediately.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum value is 60000 milliseconds and the maximum is 9223372036854 milliseconds.
    */
  def batchIntervalMillis_=(value: Double | Null): Unit = js.native
  
  /**
    * Enable or disable this export. Default is false.
    * @returns
    */
  def disabled: Boolean | Null = js.native
  /**
    * @param value Enable or disable this export. Default is false.
    */
  def disabled_=(value: Boolean | Null): Unit = js.native
  
  /**
    * A unique identifier to identify this individual upload stream.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    * @returns
    */
  def identifier: String | Null = js.native
  /**
    * @param value A unique identifier to identify this individual upload stream.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    */
  def identifier_=(value: String | Null): Unit = js.native
  
  /**
    * Priority for this upload stream. Lower values are higher priority. If not specified it will have the lowest priority.
    * @returns
    */
  def priority: Double | Null = js.native
  /**
    * @param value Priority for this upload stream. Lower values are higher priority. If not specified it will have the lowest priority.
    */
  def priority_=(value: Double | Null): Unit = js.native
  
  /**
    * The sequence number of the message to use as the starting message in the export. Default is 0.
    * The sequence number provided should be less than the newest sequence number in the stream, i.e.,
    * sequence number of the last messaged appended.
    * To find the newest sequence number, describe the stream and then check the storage status of the returned MessageStreamInfo object.
    * @returns
    */
  def startSequenceNumber: Double | Null = js.native
  /**
    * @param value The sequence number of the message to use as the starting message in the export. Default is 0.
    * The sequence number provided should be less than the newest sequence number in the stream, i.e.,
    * sequence number of the last messaged appended.
    * To find the newest sequence number, describe the stream and then check the storage status of the returned MessageStreamInfo object.
    */
  def startSequenceNumber_=(value: Double | Null): Unit = js.native
  
  /**
    * @param value The time in milliseconds between the earliest un-uploaded message and the current time. If this time is exceeded,
    * messages will be uploaded in the next batch. If unspecified messages will be eligible for upload immediately.
    * If both batchSize and batchIntervalMillis are specified, then messages will be eligible for upload when either condition is met.
    * The minimum value is 60000 milliseconds and the maximum is 9223372036854 milliseconds.
    */
  def withBatchIntervalMillis(): this.type = js.native
  def withBatchIntervalMillis(value: Double): this.type = js.native
  
  /**
    * @param value Enable or disable this export. Default is false.
    */
  def withDisabled(): this.type = js.native
  def withDisabled(value: Boolean): this.type = js.native
  
  /**
    * @param value A unique identifier to identify this individual upload stream.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    */
  def withIdentifier(): this.type = js.native
  def withIdentifier(value: String): this.type = js.native
  
  /**
    * @param value Priority for this upload stream. Lower values are higher priority. If not specified it will have the lowest priority.
    */
  def withPriority(): this.type = js.native
  def withPriority(value: Double): this.type = js.native
  
  /**
    * @param value The sequence number of the message to use as the starting message in the export. Default is 0.
    * The sequence number provided should be less than the newest sequence number in the stream, i.e.,
    * sequence number of the last messaged appended.
    * To find the newest sequence number, describe the stream and then check the storage status of the returned MessageStreamInfo object.
    */
  def withStartSequenceNumber(): this.type = js.native
  def withStartSequenceNumber(value: Double): this.type = js.native
}
