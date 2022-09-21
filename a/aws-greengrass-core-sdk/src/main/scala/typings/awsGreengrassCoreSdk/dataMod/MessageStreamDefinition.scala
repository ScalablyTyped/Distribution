package typings.awsGreengrassCoreSdk.dataMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "MessageStreamDefinition")
@js.native
open class MessageStreamDefinition protected () extends StObject {
  /**
    * @param name The unique name of the stream.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    * @param maxSize The maximum size in bytes for the entire stream. Set to 256MB by default with a minimum of 1KB and a maximum of 8192PB.
    * @param streamSegmentSize The size of each segment of the stream. Set to 16MB by default with a minimum of 1KB and a maximum of 2GB.
    * Data is only deleted segment by segment, so the segment size is the smallest amount of data which can be deleted.
    * @param timeToLiveMillis Time to live for each message in milliseconds. Data may be deleted at any time after the TTL expires; deletion is not guaranteed to occur immediately when the TTL expires.
    * The minimum value is 60000 milliseconds and the maximum is 9223372036854 milliseconds.
    * @param strategyOnFull What to do when the maximum size of the stream is reached.
    * RejectNewData: any append message request after the stream is full will be rejected with an exception.
    * OverwriteOldestData: the oldest stream segments will be deleted until there is room for the new message.
    * @param persistence Stream persistence. If set to File, the file system will be used to persist messages long-term and is resilient to restarts.
    * Memory should be used when performance matters more than durability as it only stores the stream in memory and never writes to the disk.
    * @param flushOnWrite This only applies when Persistence is set to File mode.
    * Waits for the filesystem to complete the write for every message. This is safer, but slower. Default is false.
    * @param exportDefinition Defines how and where the stream is uploaded. See the definition of the ExportDefinition object for more detail.
    */
  def this(
    name: js.UndefOr[String | Null],
    maxSize: js.UndefOr[Double | Null],
    streamSegmentSize: js.UndefOr[Double | Null],
    timeToLiveMillis: js.UndefOr[Double | Null],
    strategyOnFull: js.UndefOr[StrategyOnFull | Null],
    persistence: js.UndefOr[Persistence | Null],
    flushOnWrite: js.UndefOr[Boolean | Null],
    exportDefinition: js.UndefOr[ExportDefinition | Null]
  ) = this()
  
  def asMap(): MessageStreamDefinitionMap = js.native
  
  /**
    * Defines how and where the stream is uploaded. See the definition of the ExportDefinition object for more detail.
    * @returns
    */
  def exportDefinition: ExportDefinition | Null = js.native
  /**
    * @param value Defines how and where the stream is uploaded. See the definition of the ExportDefinition object for more detail.
    */
  def exportDefinition_=(value: ExportDefinition | Null): Unit = js.native
  
  /**
    * This only applies when Persistence is set to File mode.
    * Waits for the filesystem to complete the write for every message. This is safer, but slower. Default is false.
    * @returns
    */
  def flushOnWrite: Boolean | Null = js.native
  /**
    * @param value This only applies when Persistence is set to File mode.
    * Waits for the filesystem to complete the write for every message. This is safer, but slower. Default is false.
    */
  def flushOnWrite_=(value: Boolean | Null): Unit = js.native
  
  /**
    * The maximum size in bytes for the entire stream. Set to 256MB by default with a minimum of 1KB and a maximum of 8192PB.
    * @returns
    */
  def maxSize: Double | Null = js.native
  /**
    * @param value The maximum size in bytes for the entire stream. Set to 256MB by default with a minimum of 1KB and a maximum of 8192PB.
    */
  def maxSize_=(value: Double | Null): Unit = js.native
  
  /**
    * The unique name of the stream.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    * @returns
    */
  def name: String | Null = js.native
  /**
    * @param value The unique name of the stream.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    */
  def name_=(value: String | Null): Unit = js.native
  
  /**
    * Stream persistence. If set to File, the file system will be used to persist messages long-term and is resilient to restarts.
    * Memory should be used when performance matters more than durability as it only stores the stream in memory and never writes to the disk.
    * @returns
    */
  def persistence: Persistence | Null = js.native
  /**
    * @param value Stream persistence. If set to File, the file system will be used to persist messages long-term and is resilient to restarts.
    * Memory should be used when performance matters more than durability as it only stores the stream in memory and never writes to the disk.
    */
  def persistence_=(value: Persistence | Null): Unit = js.native
  
  /**
    * What to do when the maximum size of the stream is reached.
    * RejectNewData: any append message request after the stream is full will be rejected with an exception.
    * OverwriteOldestData: the oldest stream segments will be deleted until there is room for the new message.
    * @returns
    */
  def strategyOnFull: StrategyOnFull | Null = js.native
  /**
    * @param value What to do when the maximum size of the stream is reached.
    * RejectNewData: any append message request after the stream is full will be rejected with an exception.
    * OverwriteOldestData: the oldest stream segments will be deleted until there is room for the new message.
    */
  def strategyOnFull_=(value: StrategyOnFull | Null): Unit = js.native
  
  /**
    * The size of each segment of the stream. Set to 16MB by default with a minimum of 1KB and a maximum of 2GB.
    * Data is only deleted segment by segment, so the segment size is the smallest amount of data which can be deleted.
    * @returns
    */
  def streamSegmentSize: Double | Null = js.native
  /**
    * @param value The size of each segment of the stream. Set to 16MB by default with a minimum of 1KB and a maximum of 2GB.
    * Data is only deleted segment by segment, so the segment size is the smallest amount of data which can be deleted.
    */
  def streamSegmentSize_=(value: Double | Null): Unit = js.native
  
  /**
    * Time to live for each message in milliseconds. Data may be deleted at any time after the TTL expires; deletion is not guaranteed to occur immediately when the TTL expires.
    * The minimum value is 60000 milliseconds and the maximum is 9223372036854 milliseconds.
    * @returns
    */
  def timeToLiveMillis: Double | Null = js.native
  /**
    * @param value Time to live for each message in milliseconds. Data may be deleted at any time after the TTL expires; deletion is not guaranteed to occur immediately when the TTL expires.
    * The minimum value is 60000 milliseconds and the maximum is 9223372036854 milliseconds.
    */
  def timeToLiveMillis_=(value: Double | Null): Unit = js.native
  
  /**
    * @param value Defines how and where the stream is uploaded. See the definition of the ExportDefinition object for more detail.
    * @returns
    */
  def withExportDefinition(): this.type = js.native
  def withExportDefinition(value: ExportDefinition): this.type = js.native
  
  /**
    * @param value This only applies when Persistence is set to File mode.
    * Waits for the filesystem to complete the write for every message. This is safer, but slower. Default is false.
    * @returns
    */
  def withFlushOnWrite(): this.type = js.native
  def withFlushOnWrite(value: Boolean): this.type = js.native
  
  /**
    * @param value The maximum size in bytes for the entire stream. Set to 256MB by default with a minimum of 1KB and a maximum of 8192PB.
    * @returns
    */
  def withMaxSize(): this.type = js.native
  def withMaxSize(value: Double): this.type = js.native
  
  /**
    * @param value The unique name of the stream.
    * Must be an alphanumeric string including spaces, commas, periods, hyphens, and underscores with length between 1 and 255.
    * @returns
    */
  def withName(): this.type = js.native
  def withName(value: String): this.type = js.native
  
  /**
    * @param value Stream persistence. If set to File, the file system will be used to persist messages long-term and is resilient to restarts.
    * Memory should be used when performance matters more than durability as it only stores the stream in memory and never writes to the disk.
    * @returns
    */
  def withPersistence(): this.type = js.native
  def withPersistence(value: Persistence): this.type = js.native
  
  /**
    * @param value What to do when the maximum size of the stream is reached.
    * RejectNewData: any append message request after the stream is full will be rejected with an exception.
    * OverwriteOldestData: the oldest stream segments will be deleted until there is room for the new message.
    * @returns
    */
  def withStrategyOnFull(): this.type = js.native
  def withStrategyOnFull(value: StrategyOnFull): this.type = js.native
  
  /**
    * @param value The size of each segment of the stream. Set to 16MB by default with a minimum of 1KB and a maximum of 2GB.
    * Data is only deleted segment by segment, so the segment size is the smallest amount of data which can be deleted.
    * @returns
    */
  def withStreamSegmentSize(): this.type = js.native
  def withStreamSegmentSize(value: Double): this.type = js.native
  
  /**
    * @param value Time to live for each message in milliseconds. Data may be deleted at any time after the TTL expires; deletion is not guaranteed to occur immediately when the TTL expires.
    * The minimum value is 60000 milliseconds and the maximum is 9223372036854 milliseconds.
    * @returns
    */
  def withTimeToLiveMillis(): this.type = js.native
  def withTimeToLiveMillis(value: Double): this.type = js.native
}
/* static members */
object MessageStreamDefinition {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "MessageStreamDefinition")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "MessageStreamDefinition.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: MessageStreamDefinitionMap): MessageStreamDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[MessageStreamDefinition]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "MessageStreamDefinition.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "MessageStreamDefinition.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
