package typings.awsGreengrassCoreSdk.streamManagerMod

import typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusMap
import typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusOptions
import typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusOptionsFlipped
import typings.awsGreengrassCoreSdk.streamManagerDataMod.StatusValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-greengrass-core-sdk/stream-manager", "Status")
@js.native
open class Status ()
  extends typings.awsGreengrassCoreSdk.streamManagerClientMod.Status {
  def this(value: StatusValue) = this()
}
/* static members */
object Status {
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "Status")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "Status.Canceled")
  @js.native
  def Canceled: typings.awsGreengrassCoreSdk.streamManagerDataMod.Status = js.native
  inline def Canceled_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canceled")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "Status.Failure")
  @js.native
  def Failure: typings.awsGreengrassCoreSdk.streamManagerDataMod.Status = js.native
  inline def Failure_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Failure")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "Status.InProgress")
  @js.native
  def InProgress: typings.awsGreengrassCoreSdk.streamManagerDataMod.Status = js.native
  inline def InProgress_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InProgress")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "Status.Success")
  @js.native
  def Success: typings.awsGreengrassCoreSdk.streamManagerDataMod.Status = js.native
  inline def Success_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Success")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "Status.Warning")
  @js.native
  def Warning: typings.awsGreengrassCoreSdk.streamManagerDataMod.Status = js.native
  inline def Warning_=(x: typings.awsGreengrassCoreSdk.streamManagerDataMod.Status): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Warning")(x.asInstanceOf[js.Any])
  
  inline def fromMap(d: StatusMap): typings.awsGreengrassCoreSdk.streamManagerDataMod.Status = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMap")(d.asInstanceOf[js.Any]).asInstanceOf[typings.awsGreengrassCoreSdk.streamManagerDataMod.Status]
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "Status.options")
  @js.native
  def options: StatusOptions = js.native
  
  @JSImport("aws-greengrass-core-sdk/stream-manager", "Status.optionsFlipped")
  @js.native
  def optionsFlipped: StatusOptionsFlipped = js.native
  inline def optionsFlipped_=(x: StatusOptionsFlipped): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsFlipped")(x.asInstanceOf[js.Any])
  
  inline def options_=(x: StatusOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
}
