package typings
package awsDashSdkLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/core", "CredentialProviderChain")
@js.native
/**
  * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
  */
class CredentialProviderChain ()
  extends awsDashSdkLib.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.CredentialProviderChain {
  def this(providers: js.Array[
      awsDashSdkLib.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.provider
    ]) = this()
}

@JSImport("aws-sdk/lib/core", "CredentialProviderChain")
@js.native
object CredentialProviderChain extends js.Object {
  var defaultProviders: js.Array[
    awsDashSdkLib.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.provider
  ] = js.native
}

