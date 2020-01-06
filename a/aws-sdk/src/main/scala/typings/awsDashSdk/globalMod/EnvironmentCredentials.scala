package typings.awsDashSdk.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/global", "EnvironmentCredentials")
@js.native
class EnvironmentCredentials protected ()
  extends typings.awsDashSdk.libCoreMod.EnvironmentCredentials {
  /**
    * Creates a new EnvironmentCredentials class with a given variable prefix envPrefix.
    * @param {string} envPrefix - The prefix for the environment variable names excluding the separating underscore.
    */
  def this(envPrefix: String) = this()
}

