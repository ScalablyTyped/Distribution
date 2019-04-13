package typings
package awsDashSdkLib.libCredentialsChainableUnderscoreTemporaryUnderscoreCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/chainable_temporary_credentials", "ChainableTemporaryCredentials")
@js.native
/**
  * Creates a new temporary credentials object.
  */
class ChainableTemporaryCredentials ()
  extends awsDashSdkLib.libCredentialsMod.Credentials {
  def this(options: awsDashSdkLib.libCredentialsChainableUnderscoreTemporaryUnderscoreCredentialsMod.ChainableTemporaryCredentialsNs.ChainableTemporaryCredentialsOptions) = this()
  def this(options: awsDashSdkLib.libCredentialsChainableUnderscoreTemporaryUnderscoreCredentialsMod.ChainableTemporaryCredentialsNs.ChainableTemporaryCredentialsOptions, masterCredentials: awsDashSdkLib.libCredentialsMod.Credentials) = this()
  /**
    * The STS service instance used to get and refresh temporary credentials from AWS STS.
    */
  val service: awsDashSdkLib.clientsStsMod.^ = js.native
}

