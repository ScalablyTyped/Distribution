package typings.awsGreengrassCoreSdk.clientMod

import typings.awsGreengrassCoreSdk.dataMod.StrategyOnFullMap
import typings.awsGreengrassCoreSdk.dataMod.StrategyOnFullOptions
import typings.awsGreengrassCoreSdk.dataMod.StrategyOnFullOptionsFlipped
import typings.awsGreengrassCoreSdk.dataMod.StrategyOnFullValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull")
@js.native
open class StrategyOnFull ()
  extends typings.awsGreengrassCoreSdk.dataMod.StrategyOnFull {
  def this(value: StrategyOnFullValue) = this()
}
/* static members */
object StrategyOnFull {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull.OverwriteOldestData")
  @js.native
  val OverwriteOldestData: typings.awsGreengrassCoreSdk.dataMod.StrategyOnFull = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull.RejectNewData")
  @js.native
  val RejectNewData: typings.awsGreengrassCoreSdk.dataMod.StrategyOnFull = js.native
  
  inline def fromMap(d: StrategyOnFullMap): typings.awsGreengrassCoreSdk.dataMod.StrategyOnFull = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.dataMod.StrategyOnFull]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull.options")
  @js.native
  def options: StrategyOnFullOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/client", "StrategyOnFull.optionsFlipped")
  @js.native
  def optionsFlipped: StrategyOnFullOptionsFlipped = js.native
  inline def optionsFlipped_=(x: StrategyOnFullOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: StrategyOnFullOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
