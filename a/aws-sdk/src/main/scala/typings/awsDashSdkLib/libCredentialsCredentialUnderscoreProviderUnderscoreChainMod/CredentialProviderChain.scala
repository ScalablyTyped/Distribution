package typings
package awsDashSdkLib.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/credential_provider_chain", "CredentialProviderChain")
@js.native
class CredentialProviderChain () extends js.Object {
  /**
       * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
       */
  def this(providers: js.Array[provider]) = this()
  /**
       * Returns a list of credentials objects or functions that return credentials objects. If the provider is a function, the function will be executed lazily when the provider needs to be checked for valid credentials. By default, this object will be set to the defaultProviders.
       */
  var providers: js.Array[awsDashSdkLib.libCredentialsMod.Credentials] | js.Array[provider] = js.native
  /**
       * Resolves the provider chain by searching for the first set of credentials in providers.
       */
  def resolve(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* credentials */ awsDashSdkLib.libCredentialsMod.Credentials, 
      scala.Unit
    ]
  ): CredentialProviderChain = js.native
  /**
       * Return a Promise on resolve() function
       */
  def resolvePromise(): js.Promise[awsDashSdkLib.libCredentialsMod.Credentials] = js.native
}

@JSImport("aws-sdk/lib/credentials/credential_provider_chain", "CredentialProviderChain")
@js.native
object CredentialProviderChain extends js.Object {
  var defaultProviders: js.Array[
    awsDashSdkLib.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.provider
  ] = js.native
}

