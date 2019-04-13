package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeSigning extends js.Object {
  /**
    * The ID of the AWSSignerJob which was created to sign the file.
    */
  var awsSignerJobId: js.UndefOr[SigningJobId] = js.undefined
  /**
    * A custom method for code signing a file.
    */
  var customCodeSigning: js.UndefOr[CustomCodeSigning] = js.undefined
  /**
    * Describes the code-signing job.
    */
  var startSigningJobParameter: js.UndefOr[StartSigningJobParameter] = js.undefined
}

object CodeSigning {
  @scala.inline
  def apply(
    awsSignerJobId: SigningJobId = null,
    customCodeSigning: CustomCodeSigning = null,
    startSigningJobParameter: StartSigningJobParameter = null
  ): CodeSigning = {
    val __obj = js.Dynamic.literal()
    if (awsSignerJobId != null) __obj.updateDynamic("awsSignerJobId")(awsSignerJobId)
    if (customCodeSigning != null) __obj.updateDynamic("customCodeSigning")(customCodeSigning)
    if (startSigningJobParameter != null) __obj.updateDynamic("startSigningJobParameter")(startSigningJobParameter)
    __obj.asInstanceOf[CodeSigning]
  }
}

