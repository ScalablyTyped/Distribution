package typings.awsDashSdk.libCredentialsEcsUnderscoreCredentialsMod

import typings.awsDashSdk.libCredentialsRemoteUnderscoreCredentialsMod.RemoteCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/ecs_credentials", "ECSCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
class ECSCredentials () extends RemoteCredentials {
  def this(options: ECSCredentialsOptions) = this()
}

