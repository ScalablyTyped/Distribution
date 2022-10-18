package typings.awsGreengrassCoreSdk.mod.StreamManager

import typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusMessageMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.TypesMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.ValidationsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.StatusMessage")
@js.native
open class StatusMessage protected ()
  extends typings.awsGreengrassCoreSdk.streamManagerMod.StatusMessage {
  /**
    * @param eventType
    * @param statusLevel
    * @param status
    * @param statusContext
    * @param message  String describing the status message.
    * @param timestampEpochMs  The time this status was added to the status-stream (in milliseconds since epoch).
    */
  def this(
    eventType: js.UndefOr[typings.awsGreengrassCoreSdk.streamManagerDataMod.EventType | Null],
    statusLevel: js.UndefOr[typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel | Null],
    status: js.UndefOr[typings.awsGreengrassCoreSdk.streamManagerDataMod.Status | Null],
    statusContext: js.UndefOr[typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusContext | Null],
    message: js.UndefOr[String | Null],
    timestampEpochMs: js.UndefOr[Double | Null]
  ) = this()
}
/* static members */
object StatusMessage {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusMessage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusMessage.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusMessageMap): typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusMessage]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusMessage.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusMessage.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
