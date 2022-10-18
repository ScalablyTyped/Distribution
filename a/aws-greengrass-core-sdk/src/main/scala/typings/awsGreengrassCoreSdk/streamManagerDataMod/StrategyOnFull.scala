package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "StrategyOnFull")
@js.native
open class StrategyOnFull () extends StObject {
  def this(value: StrategyOnFullValue) = this()
  
  def asMap(): StrategyOnFullMap = js.native
}
/* static members */
object StrategyOnFull {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StrategyOnFull")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StrategyOnFull.OverwriteOldestData")
  @js.native
  val OverwriteOldestData: StrategyOnFull = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StrategyOnFull.RejectNewData")
  @js.native
  val RejectNewData: StrategyOnFull = js.native
  
  inline def fromMap(d: StrategyOnFullMap): StrategyOnFull = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[StrategyOnFull]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StrategyOnFull.options")
  @js.native
  def options: StrategyOnFullOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "StrategyOnFull.optionsFlipped")
  @js.native
  def optionsFlipped: StrategyOnFullOptionsFlipped = js.native
  inline def optionsFlipped_=(x: StrategyOnFullOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: StrategyOnFullOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
