package typings.awsGreengrassCoreSdk.clientMod

import typings.awsGreengrassCoreSdk.dataMod.StatusMessageMap
import typings.awsGreengrassCoreSdk.dataMod.TypesMap
import typings.awsGreengrassCoreSdk.dataMod.ValidationsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/client", "StatusMessage")
@js.native
open class StatusMessage protected ()
  extends typings.awsGreengrassCoreSdk.dataMod.StatusMessage {
  /**
    * @param eventType
    * @param statusLevel
    * @param status
    * @param statusContext
    * @param message  String describing the status message.
    * @param timestampEpochMs  The time this status was added to the status-stream (in milliseconds since epoch).
    */
  def this(
    eventType: js.UndefOr[typings.awsGreengrassCoreSdk.dataMod.EventType | Null],
    statusLevel: js.UndefOr[typings.awsGreengrassCoreSdk.dataMod.StatusLevel | Null],
    status: js.UndefOr[typings.awsGreengrassCoreSdk.dataMod.Status | Null],
    statusContext: js.UndefOr[typings.awsGreengrassCoreSdk.dataMod.StatusContext | Null],
    message: js.UndefOr[String | Null],
    timestampEpochMs: js.UndefOr[Double | Null]
  ) = this()
}
/* static members */
object StatusMessage {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StatusMessage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StatusMessage.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusMessageMap): typings.awsGreengrassCoreSdk.dataMod.StatusMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.dataMod.StatusMessage]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StatusMessage.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StatusMessage.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
