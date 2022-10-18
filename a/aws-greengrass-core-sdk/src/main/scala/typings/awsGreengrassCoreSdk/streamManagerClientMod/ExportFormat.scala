package typings.awsGreengrassCoreSdk.streamManagerClientMod

import typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormatMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormatOptions
import typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormatOptionsFlipped
import typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormatValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/client", "ExportFormat")
@js.native
open class ExportFormat protected ()
  extends typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat {
  def this(value: ExportFormatValue) = this()
}
/* static members */
object ExportFormat {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "ExportFormat")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "ExportFormat.JSON_BATCHED")
  @js.native
  def JSON_BATCHED: typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat = js.native
  inline def JSON_BATCHED_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSON_BATCHED")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "ExportFormat.RAW_NOT_BATCHED")
  @js.native
  def RAW_NOT_BATCHED: typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat = js.native
  inline def RAW_NOT_BATCHED_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAW_NOT_BATCHED")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: ExportFormatMap): typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.streamManagerDataMod.ExportFormat]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "ExportFormat.options")
  @js.native
  def options: ExportFormatOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "ExportFormat.optionsFlipped")
  @js.native
  def optionsFlipped: ExportFormatOptionsFlipped = js.native
  inline def optionsFlipped_=(x: ExportFormatOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: ExportFormatOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
