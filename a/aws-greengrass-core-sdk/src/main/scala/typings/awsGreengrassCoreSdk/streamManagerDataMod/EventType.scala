package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "EventType")
@js.native
open class EventType () extends StObject {
  def this(value: EventTypeValue) = this()
  
  def asMap(): EventTypeMap = js.native
}
/* static members */
object EventType {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "EventType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "EventType.S3Task")
  @js.native
  def S3Task: EventType = js.native
  inline def S3Task_=(x: EventType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S3Task")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: EventTypeMap): EventType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[EventType]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "EventType.options")
  @js.native
  def options: EventTypeOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "EventType.optionsFlipped")
  @js.native
  def optionsFlipped: EventTypeOptionsFlipped = js.native
  inline def optionsFlipped_=(x: EventTypeOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: EventTypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
