package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusLevel")
@js.native
open class StatusLevel () extends StObject {
  def this(value: StatusLevelValue) = this()
  
  def asMap(): StatusLevelMap = js.native
}
/* static members */
object StatusLevel {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusLevel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusLevel.DEBUG")
  @js.native
  def DEBUG: StatusLevel = js.native
  inline def DEBUG_=(x: StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusLevel.ERROR")
  @js.native
  def ERROR: StatusLevel = js.native
  inline def ERROR_=(x: StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusLevel.INFO")
  @js.native
  def INFO: StatusLevel = js.native
  inline def INFO_=(x: StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusLevel.TRACE")
  @js.native
  def TRACE: StatusLevel = js.native
  inline def TRACE_=(x: StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusLevel.WARN")
  @js.native
  def WARN: StatusLevel = js.native
  inline def WARN_=(x: StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARN")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusLevelMap): StatusLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[StatusLevel]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusLevel.options")
  @js.native
  def options: StatusLevelOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StatusLevel.optionsFlipped")
  @js.native
  def optionsFlipped: StatusLevelOptionsFlipped = js.native
  inline def optionsFlipped_=(x: StatusLevelOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: StatusLevelOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
