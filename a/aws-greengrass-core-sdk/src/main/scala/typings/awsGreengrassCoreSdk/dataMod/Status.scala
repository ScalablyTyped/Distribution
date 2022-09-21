package typings.awsGreengrassCoreSdk.dataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager/data", "Status")
@js.native
open class Status () extends StObject {
  def this(value: StatusValue) = this()
  
  def asMap(): StatusMap = js.native
}
/* static members */
object Status {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Status")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Status.Canceled")
  @js.native
  def Canceled: Status = js.native
  inline def Canceled_=(x: Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canceled")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Status.Failure")
  @js.native
  def Failure: Status = js.native
  inline def Failure_=(x: Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Failure")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Status.InProgress")
  @js.native
  def InProgress: Status = js.native
  inline def InProgress_=(x: Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InProgress")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Status.Success")
  @js.native
  def Success: Status = js.native
  inline def Success_=(x: Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Status.Warning")
  @js.native
  def Warning: Status = js.native
  inline def Warning_=(x: Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Warning")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusMap): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[Status]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Status.options")
  @js.native
  def options: StatusOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager/data", "Status.optionsFlipped")
  @js.native
  def optionsFlipped: StatusOptionsFlipped = js.native
  inline def optionsFlipped_=(x: StatusOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: StatusOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
