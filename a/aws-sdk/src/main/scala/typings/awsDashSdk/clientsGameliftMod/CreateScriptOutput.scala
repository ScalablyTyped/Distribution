package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScriptOutput extends js.Object {
  /**
    * The newly created script record with a unique script ID and ARN. The new script's storage location reflects an Amazon S3 location: (1) If the script was uploaded from an S3 bucket under your account, the storage location reflects the information that was provided in the CreateScript request; (2) If the script file was uploaded from a local zip file, the storage location reflects an S3 location controls by the Amazon GameLift service.
    */
  var Script: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.Script] = js.native
}

object CreateScriptOutput {
  @scala.inline
  def apply(Script: Script = null): CreateScriptOutput = {
    val __obj = js.Dynamic.literal()
    if (Script != null) __obj.updateDynamic("Script")(Script.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScriptOutput]
  }
}

