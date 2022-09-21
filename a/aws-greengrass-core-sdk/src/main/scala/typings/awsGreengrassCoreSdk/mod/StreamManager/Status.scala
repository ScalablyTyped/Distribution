package typings.awsGreengrassCoreSdk.mod.StreamManager

import typings.awsGreengrassCoreSdk.dataMod.StatusMap
import typings.awsGreengrassCoreSdk.dataMod.StatusOptions
import typings.awsGreengrassCoreSdk.dataMod.StatusOptionsFlipped
import typings.awsGreengrassCoreSdk.dataMod.StatusValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk", "StreamManager.Status")
@js.native
open class Status ()
  extends typings.awsGreengrassCoreSdk.streamManagerMod.Status {
  def this(value: StatusValue) = this()
}
/* static members */
object Status {
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Status")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Status.Canceled")
  @js.native
  def Canceled: typings.awsGreengrassCoreSdk.dataMod.Status = js.native
  inline def Canceled_=(x: typings.awsGreengrassCoreSdk.dataMod.Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canceled")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Status.Failure")
  @js.native
  def Failure: typings.awsGreengrassCoreSdk.dataMod.Status = js.native
  inline def Failure_=(x: typings.awsGreengrassCoreSdk.dataMod.Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Failure")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Status.InProgress")
  @js.native
  def InProgress: typings.awsGreengrassCoreSdk.dataMod.Status = js.native
  inline def InProgress_=(x: typings.awsGreengrassCoreSdk.dataMod.Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InProgress")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Status.Success")
  @js.native
  def Success: typings.awsGreengrassCoreSdk.dataMod.Status = js.native
  inline def Success_=(x: typings.awsGreengrassCoreSdk.dataMod.Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Status.Warning")
  @js.native
  def Warning: typings.awsGreengrassCoreSdk.dataMod.Status = js.native
  inline def Warning_=(x: typings.awsGreengrassCoreSdk.dataMod.Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Warning")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusMap): typings.awsGreengrassCoreSdk.dataMod.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.dataMod.Status]
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Status.options")
  @js.native
  def options: StatusOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk", "StreamManager.Status.optionsFlipped")
  @js.native
  def optionsFlipped: StatusOptionsFlipped = js.native
  inline def optionsFlipped_=(x: StatusOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: StatusOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
