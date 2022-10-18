package typings.awsGreengrassCoreSdk.mod.StreamManager

import typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusContextMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.TypesMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.ValidationsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.StatusContext")
@js.native
open class StatusContext protected ()
  extends typings.awsGreengrassCoreSdk.streamManagerMod.StatusContext {
  /**
    * @param s3ExportTaskDefinition The task definition of an S3 upload task if the status is associated with it, ie, if the eventType = S3Task.
    * @param exportIdentifier The export identifier the status is associated with.
    * @param streamName The name of the stream the status is associated with.
    * @param sequenceNumber The sequence number of the message the status is associated with.
    */
  def this(
    s3ExportTaskDefinition: js.UndefOr[typings.awsGreengrassCoreSdk.streamManagerDataMod.S3ExportTaskDefinition | Null],
    exportIdentifier: js.UndefOr[String | Null],
    streamName: js.UndefOr[String | Null],
    sequenceNumber: js.UndefOr[Double | Null]
  ) = this()
}
/* static members */
object StatusContext {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusContext")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusContext.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusContextMap): typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusContext = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusContext]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusContext.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusContext.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
