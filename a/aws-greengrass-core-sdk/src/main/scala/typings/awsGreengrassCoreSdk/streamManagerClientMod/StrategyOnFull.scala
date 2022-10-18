package typings.awsGreengrassCoreSdk.streamManagerClientMod

import typings.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFullMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFullOptions
import typings.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFullOptionsFlipped
import typings.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFullValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull")
@js.native
open class StrategyOnFull ()
  extends typings.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFull {
  def this(value: StrategyOnFullValue) = this()
}
/* static members */
object StrategyOnFull {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull.OverwriteOldestData")
  @js.native
  val OverwriteOldestData: typings.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFull = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull.RejectNewData")
  @js.native
  val RejectNewData: typings.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFull = js.native
  
  inline def fromMap(d: StrategyOnFullMap): typings.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFull = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.streamManagerDataMod.StrategyOnFull]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull.options")
  @js.native
  def options: StrategyOnFullOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull.optionsFlipped")
  @js.native
  def optionsFlipped: StrategyOnFullOptionsFlipped = js.native
  inline def optionsFlipped_=(x: StrategyOnFullOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: StrategyOnFullOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
