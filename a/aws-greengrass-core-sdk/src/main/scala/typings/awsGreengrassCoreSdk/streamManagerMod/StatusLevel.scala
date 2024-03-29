package typings.awsGreengrassCoreSdk.streamManagerMod

import typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevelMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevelOptions
import typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevelOptionsFlipped
import typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevelValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager", "StatusLevel")
@js.native
open class StatusLevel ()
  extends typings.awsGreengrassCoreSdk.streamManagerClientMod.StatusLevel {
  def this(value: StatusLevelValue) = this()
}
/* static members */
object StatusLevel {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusLevel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusLevel.DEBUG")
  @js.native
  def DEBUG: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = js.native
  inline def DEBUG_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusLevel.ERROR")
  @js.native
  def ERROR: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = js.native
  inline def ERROR_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusLevel.INFO")
  @js.native
  def INFO: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = js.native
  inline def INFO_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusLevel.TRACE")
  @js.native
  def TRACE: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = js.native
  inline def TRACE_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRACE")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusLevel.WARN")
  @js.native
  def WARN: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = js.native
  inline def WARN_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARN")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusLevelMap): typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusLevel]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusLevel.options")
  @js.native
  def options: StatusLevelOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "StatusLevel.optionsFlipped")
  @js.native
  def optionsFlipped: StatusLevelOptionsFlipped = js.native
  inline def optionsFlipped_=(x: StatusLevelOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: StatusLevelOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
