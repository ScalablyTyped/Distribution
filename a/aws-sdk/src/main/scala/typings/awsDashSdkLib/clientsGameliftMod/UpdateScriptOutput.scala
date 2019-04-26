package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateScriptOutput extends js.Object {
  /**
    * The newly created script record with a unique script ID. The new script's storage location reflects an Amazon S3 location: (1) If the script was uploaded from an S3 bucket under your account, the storage location reflects the information that was provided in the CreateScript request; (2) If the script file was uploaded from a local zip file, the storage location reflects an S3 location controls by the Amazon GameLift service.
    */
  var Script: js.UndefOr[Script] = js.undefined
}

object UpdateScriptOutput {
  @scala.inline
  def apply(Script: Script = null): UpdateScriptOutput = {
    val __obj = js.Dynamic.literal()
    if (Script != null) __obj.updateDynamic("Script")(Script)
    __obj.asInstanceOf[UpdateScriptOutput]
  }
}

