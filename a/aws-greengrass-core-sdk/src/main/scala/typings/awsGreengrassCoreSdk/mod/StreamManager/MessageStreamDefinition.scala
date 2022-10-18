package typings.awsGreengrassCoreSdk.mod.StreamManager

import typings.awsGreengrassCoreSdk.streamManagerDataMod.MessageStreamDefinitionMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.TypesMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.ValidationsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamDefinition")
@js.native
open class MessageStreamDefinition protected ()
  extends typings.awsGreengrassCoreSdk.streamManagerMod.MessageStreamDefinition {
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
    strategyOnFull: js.UndefOr[typings.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFull | Null],
    persistence: js.UndefOr[typings.awsGreengrassCoreSdk.streamManagerDataMod.Persistence | Null],
    flushOnWrite: js.UndefOr[Boolean | Null],
    exportDefinition: js.UndefOr[typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportDefinition | Null]
  ) = this()
}
/* static members */
object MessageStreamDefinition {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamDefinition")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamDefinition.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: MessageStreamDefinitionMap): typings.awsGreengrassCoreSdk.streamManagerDataMod.MessageStreamDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.streamManagerDataMod.MessageStreamDefinition]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamDefinition.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.MessageStreamDefinition.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
