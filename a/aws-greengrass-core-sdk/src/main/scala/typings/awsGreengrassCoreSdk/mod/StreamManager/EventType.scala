package typings.awsGreengrassCoreSdk.mod.StreamManager

import typings.awsGreengrassCoreSdk.dataMod.EventTypeMap
import typings.awsGreengrassCoreSdk.dataMod.EventTypeOptions
import typings.awsGreengrassCoreSdk.dataMod.EventTypeOptionsFlipped
import typings.awsGreengrassCoreSdk.dataMod.EventTypeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.EventType")
@js.native
open class EventType ()
  extends typings.awsGreengrassCoreSdk.streamManagerMod.EventType {
  def this(value: EventTypeValue) = this()
}
/* static members */
object EventType {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.EventType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.EventType.S3Task")
  @js.native
  def S3Task: typings.awsGreengrassCoreSdk.dataMod.EventType = js.native
  inline def S3Task_=(x: typings.awsGreengrassCoreSdk.dataMod.EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S3Task")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: EventTypeMap): typings.awsGreengrassCoreSdk.dataMod.EventType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.dataMod.EventType]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.EventType.options")
  @js.native
  def options: EventTypeOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.EventType.optionsFlipped")
  @js.native
  def optionsFlipped: EventTypeOptionsFlipped = js.native
  inline def optionsFlipped_=(x: EventTypeOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: EventTypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
