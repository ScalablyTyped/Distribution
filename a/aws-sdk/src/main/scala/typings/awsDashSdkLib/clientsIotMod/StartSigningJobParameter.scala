package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSigningJobParameter extends js.Object {
  /**
    * The location to write the code-signed file.
    */
  var destination: js.UndefOr[Destination] = js.undefined
  /**
    * The code-signing profile name.
    */
  var signingProfileName: js.UndefOr[SigningProfileName] = js.undefined
  /**
    * Describes the code-signing profile.
    */
  var signingProfileParameter: js.UndefOr[SigningProfileParameter] = js.undefined
}

object StartSigningJobParameter {
  @scala.inline
  def apply(
    destination: Destination = null,
    signingProfileName: SigningProfileName = null,
    signingProfileParameter: SigningProfileParameter = null
  ): StartSigningJobParameter = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (signingProfileName != null) __obj.updateDynamic("signingProfileName")(signingProfileName)
    if (signingProfileParameter != null) __obj.updateDynamic("signingProfileParameter")(signingProfileParameter)
    __obj.asInstanceOf[StartSigningJobParameter]
  }
}

