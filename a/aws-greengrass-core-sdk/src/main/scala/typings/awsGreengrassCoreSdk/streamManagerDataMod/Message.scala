package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "Message")
@js.native
open class Message protected () extends StObject {
  /**
    * @param streamName The name of the stream which this message is in.
    * @param sequenceNumber The sequence number of this message within the stream.
    * @param ingestTime The time that the message was ingested to Stream Manager. Data is Unix epoch time in milliseconds.
    * @param payload The binary message data.
    */
  def this(
    streamName: js.UndefOr[String | Null],
    sequenceNumber: js.UndefOr[Double | Null],
    ingestTime: js.UndefOr[Double | Null],
    payload: js.UndefOr[Buffer | Null]
  ) = this()
  
  def asMap(): MessageMap = js.native
  
  /**
    * The time that the message was ingested to Stream Manager. Data is Unix epoch time in milliseconds.
    */
  def ingestTime: Double | Null = js.native
  /**
    * @param value The time that the message was ingested to Stream Manager. Data is Unix epoch time in milliseconds.
    */
  def ingestTime_=(value: Double | Null): Unit = js.native
  
  /**
    * The binary message data.
    */
  def payload: Buffer | Null = js.native
  /**
    * @param value The binary message data.
    */
  def payload_=(value: Buffer | Null): Unit = js.native
  
  /**
    * The sequence number of this message within the stream.
    */
  def sequenceNumber: Double | Null = js.native
  /**
    * @param value The sequence number of this message within the stream.
    */
  def sequenceNumber_=(value: Double | Null): Unit = js.native
  
  /**
    * The name of the stream which this message is in.
    */
  def streamName: String | Null = js.native
  /**
    * @param value  The name of the stream which this message is in.
    */
  def streamName_=(value: String | Null): Unit = js.native
  
  /**
    * @param value The time that the message was ingested to Stream Manager. Data is Unix epoch time in milliseconds.
    * @returns The caller
    */
  def withIngestTime(): this.type = js.native
  def withIngestTime(value: Double): this.type = js.native
  
  /**
    * @param value The binary message data.
    * @returns The caller
    */
  def withPayload(): this.type = js.native
  def withPayload(value: Buffer): this.type = js.native
  
  /**
    * @param value The sequence number of this message within the stream.
    * @returns The caller
    */
  def withSequenceNumber(): this.type = js.native
  def withSequenceNumber(value: Double): this.type = js.native
  
  /**
    * @param value The name of the stream which this message is in.
    * @returns The caller
    */
  def withStreamName(): this.type = js.native
  def withStreamName(value: String): this.type = js.native
}
/* static members */
object Message {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Message")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Message.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: MessageMap): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[Message]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Message.typesMap")
  @js.native
  def typesMap: MessageTypesMap = js.native
  inline def typesMap_=(x: MessageTypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Message.validationsMap")
  @js.native
  def validationsMap: MessageValidationsMap = js.native
  inline def validationsMap_=(x: MessageValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
