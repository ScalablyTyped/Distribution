package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "ExportFormat")
@js.native
open class ExportFormat protected () extends StObject {
  def this(value: ExportFormatValue) = this()
  
  def asMap(): ExportFormatMap = js.native
}
/* static members */
object ExportFormat {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "ExportFormat")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "ExportFormat.JSON_BATCHED")
  @js.native
  def JSON_BATCHED: ExportFormat = js.native
  inline def JSON_BATCHED_=(x: ExportFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSON_BATCHED")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "ExportFormat.RAW_NOT_BATCHED")
  @js.native
  def RAW_NOT_BATCHED: ExportFormat = js.native
  inline def RAW_NOT_BATCHED_=(x: ExportFormat): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAW_NOT_BATCHED")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: ExportFormatMap): ExportFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[ExportFormat]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "ExportFormat.options")
  @js.native
  def options: ExportFormatOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "ExportFormat.optionsFlipped")
  @js.native
  def optionsFlipped: ExportFormatOptionsFlipped = js.native
  inline def optionsFlipped_=(x: ExportFormatOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: ExportFormatOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
