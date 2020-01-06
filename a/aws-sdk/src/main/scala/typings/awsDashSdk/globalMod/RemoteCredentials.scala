package typings.awsDashSdk.globalMod

import typings.awsDashSdk.libCredentialsRemoteUnderscoreCredentialsMod.RemoteCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/global", "RemoteCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class RemoteCredentials ()
  extends typings.awsDashSdk.libCoreMod.RemoteCredentials {
  def this(options: RemoteCredentialsOptions) = this()
}

