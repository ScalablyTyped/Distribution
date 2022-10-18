package typings.awsGreengrassCoreSdk.mod.StreamManager

import typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusConfigMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.TypesMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.ValidationsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.StatusConfig")
@js.native
/**
  * @param statusLevel Defines the verbosity of status messages in a status-stream.
  * @param statusStreamName The name of the stream to which status messages are appended.
  * The status-stream should be created before associating it with another stream.
  */
open class StatusConfig ()
  extends typings.awsGreengrassCoreSdk.streamManagerMod.StatusConfig {
  def this(statusLevel: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel) = this()
  def this(statusLevel: Null, statusStreamName: String) = this()
  def this(statusLevel: Unit, statusStreamName: String) = this()
  def this(
    statusLevel: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel,
    statusStreamName: String
  ) = this()
}
/* static members */
object StatusConfig {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusConfig")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusConfig.formatsMap")
  @js.native
  def formatsMap: Record[String, scala.Nothing] = js.native
  inline def formatsMap_=(x: Record[String, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatsMap")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusConfigMap): typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusConfig]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusConfig.typesMap")
  @js.native
  def typesMap: TypesMap = js.native
  inline def typesMap_=(x: TypesMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typesMap")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.StatusConfig.validationsMap")
  @js.native
  def validationsMap: ValidationsMap = js.native
  inline def validationsMap_=(x: ValidationsMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validationsMap")(x.asInstanceOf[js.Any])
}
