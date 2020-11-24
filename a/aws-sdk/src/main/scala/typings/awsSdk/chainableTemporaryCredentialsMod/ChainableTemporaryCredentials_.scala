package typings.awsSdk.chainableTemporaryCredentialsMod

import typings.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions
import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.stsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/lib/credentials/chainable_temporary_credentials", "ChainableTemporaryCredentials")
@js.native
/**
  * Creates a new temporary credentials object.
  */
class ChainableTemporaryCredentials_ () extends Credentials {
  def this(options: ChainableTemporaryCredentialsOptions) = this()
  
  /**
    * The STS service instance used to get and refresh temporary credentials from AWS STS.
    */
  val service: ^ = js.native
}
