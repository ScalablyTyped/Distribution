package typings.awsGreengrassCoreSdk.mod.StreamManager

import typings.awsGreengrassCoreSdk.dataMod.ExportFormatMap
import typings.awsGreengrassCoreSdk.dataMod.ExportFormatOptions
import typings.awsGreengrassCoreSdk.dataMod.ExportFormatOptionsFlipped
import typings.awsGreengrassCoreSdk.dataMod.ExportFormatValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.ExportFormat")
@js.native
open class ExportFormat protected ()
  extends typings.awsGreengrassCoreSdk.streamManagerMod.ExportFormat {
  def this(value: ExportFormatValue) = this()
}
/* static members */
object ExportFormat {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.ExportFormat")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.ExportFormat.JSON_BATCHED")
  @js.native
  def JSON_BATCHED: typings.awsGreengrassCoreSdk.dataMod.ExportFormat = js.native
  inline def JSON_BATCHED_=(x: typings.awsGreengrassCoreSdk.dataMod.ExportFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSON_BATCHED")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.ExportFormat.RAW_NOT_BATCHED")
  @js.native
  def RAW_NOT_BATCHED: typings.awsGreengrassCoreSdk.dataMod.ExportFormat = js.native
  inline def RAW_NOT_BATCHED_=(x: typings.awsGreengrassCoreSdk.dataMod.ExportFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAW_NOT_BATCHED")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: ExportFormatMap): typings.awsGreengrassCoreSdk.dataMod.ExportFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.dataMod.ExportFormat]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.ExportFormat.options")
  @js.native
  def options: ExportFormatOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.ExportFormat.optionsFlipped")
  @js.native
  def optionsFlipped: ExportFormatOptionsFlipped = js.native
  inline def optionsFlipped_=(x: ExportFormatOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: ExportFormatOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
