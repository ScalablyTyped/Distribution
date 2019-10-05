package typings.awsDashSdk

import typings.awsDashSdk.libCredentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/environment_credentials", JSImport.Namespace)
@js.native
object libCredentialsEnvironmentUnderscoreCredentialsMod extends js.Object {
  @js.native
  class EnvironmentCredentials protected () extends Credentials {
    /**
      * Creates a new EnvironmentCredentials class with a given variable prefix envPrefix.
      * @param {string} envPrefix - The prefix for the environment variable names excluding the separating underscore.
      */
    def this(envPrefix: String) = this()
  }
  
}

