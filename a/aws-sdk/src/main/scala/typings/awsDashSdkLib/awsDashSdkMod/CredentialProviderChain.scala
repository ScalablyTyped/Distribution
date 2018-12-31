package typings
package awsDashSdkLib.awsDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "CredentialProviderChain")
@js.native
/**
  * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
  */
class CredentialProviderChain ()
  extends awsDashSdkLib.libCoreMod.CredentialProviderChain {
  def this(providers: js.Array[
      awsDashSdkLib.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.provider
    ]) = this()
}

@JSImport("aws-sdk", "CredentialProviderChain")
@js.native
object CredentialProviderChain extends js.Object {
  var defaultProviders: js.Array[
    awsDashSdkLib.libCredentialsCredentialUnderscoreProviderUnderscoreChainMod.provider
  ] = js.native
}

