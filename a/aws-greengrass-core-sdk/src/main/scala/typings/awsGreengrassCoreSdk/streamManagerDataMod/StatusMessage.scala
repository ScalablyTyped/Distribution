package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusMessage")
@js.native
open class StatusMessage protected () extends StObject {
  /**
    * @param eventType
    * @param statusLevel
    * @param status
    * @param statusContext
    * @param message  String describing the status message.
    * @param timestampEpochMs  The time this status was added to the status-stream (in milliseconds since epoch).
    */
  def this(
    eventType: js.UndefOr[EventType | Null],
    statusLevel: js.UndefOr[StatusLevel | Null],
    status: js.UndefOr[Status | Null],
    statusContext: js.UndefOr[StatusContext | Null],
    message: js.UndefOr[String | Null],
    timestampEpochMs: js.UndefOr[Double | Null]
  ) = this()
  
  def asMap(): StatusMessageMap = js.native
  
  /**
    * @returns
    */
  def eventType: EventType | Null = js.native
  /**
    * @param value
    */
  def eventType_=(value: EventType | Null): Unit = js.native
  
  /**
    * String describing the status message.
    * @returns
    */
  def message: String | Null = js.native
  /**
    * @param value String describing the status message.
    */
  def message_=(value: String | Null): Unit = js.native
  
  /**
    * @returns
    */
  def status: Status | Null = js.native
  
  /**
    * @returns
    */
  def statusContext: StatusContext | Null = js.native
  /**
    * @param value
    */
  def statusContext_=(value: StatusContext | Null): Unit = js.native
  
  /**
    * @returns
    */
  def statusLevel: StatusLevel | Null = js.native
  /**
    * @param value
    */
  def statusLevel_=(value: StatusLevel | Null): Unit = js.native
  
  /**
    * @param value
    */
  def status_=(value: Status | Null): Unit = js.native
  
  /**
    * The time this status was added to the status-stream (in milliseconds since epoch).
    * @returns
    */
  def timestampEpochMs: Double | Null = js.native
  /**
    * @param value The time this status was added to the status-stream (in milliseconds since epoch).
    */
  def timestampEpochMs_=(value: Double | Null): Unit = js.native
  
  /**
    * @param value
    * @returns
    */
  def withEventType(): this.type = js.native
  def withEventType(value: EventType): this.type = js.native
  
  /**
    * @param value String describing the status message.
    * @returns
    */
  def withMessage(): this.type = js.native
  def withMessage(value: String): this.type = js.native
  
  /**
    * @param value
    * @returns
    */
  def withStatus(): this.type = js.native
  def withStatus(value: Status): this.type = js.native
  
  /**
    * @param value
    * @returns
    */
  def withStatusContext(): this.type = js.native
  def withStatusContext(value: StatusContext): this.type = js.native
  
  /**
    * @param value
    * @returns
    */
  def withStatusLevel(): this.type = js.native
  def withStatusLevel(value: StatusLevel): this.type = js.native
  
  /**
    * @param value The time this status was added to the status-stream (in milliseconds since epoch).
    * @returns
    */
  def withTimestampEpochMs(): this.type = js.native
  def withTimestampEpochMs(value: Double): this.type = js.native
}
/* static members */
object StatusMessage {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusMessage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusMessage.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusMessageMap): StatusMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[StatusMessage]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusMessage.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusMessage.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
