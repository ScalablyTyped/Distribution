package typings.awsDashSdk.awsDashSdkMod

import typings.awsDashSdk.libCredentialsEcsUnderscoreCredentialsMod.ECSCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "ECSCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class ECSCredentials ()
  extends typings.awsDashSdk.libCoreMod.ECSCredentials {
  def this(options: ECSCredentialsOptions) = this()
}

