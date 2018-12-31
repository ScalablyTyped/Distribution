package typings
package awsDashSdkLib.libPollyPresignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/polly/presigner", "Presigner")
@js.native
/**
  * Creates a presigner object with a set of configuration options.
  */
class Presigner () extends js.Object {
  def this(options: awsDashSdkLib.libPollyPresignerMod.PresignerNs.PresignerOptions) = this()
  /**
    * Generate a signed URL.
    */
  def getSynthesizeSpeechUrl(params: awsDashSdkLib.clientsPollyMod.PollyNs.SynthesizeSpeechInput): java.lang.String = js.native
  /**
    * Generate a signed URL.
    */
  def getSynthesizeSpeechUrl(
    params: awsDashSdkLib.clientsPollyMod.PollyNs.SynthesizeSpeechInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Generate a signed URL.
    */
  def getSynthesizeSpeechUrl(
    params: awsDashSdkLib.clientsPollyMod.PollyNs.SynthesizeSpeechInput,
    error: scala.Double,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def getSynthesizeSpeechUrl(params: awsDashSdkLib.clientsPollyMod.PollyNs.SynthesizeSpeechInput, expires: scala.Double): java.lang.String = js.native
}

