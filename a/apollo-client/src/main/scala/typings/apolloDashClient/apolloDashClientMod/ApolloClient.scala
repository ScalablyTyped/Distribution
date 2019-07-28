package typings.apolloDashClient.apolloDashClientMod

import typings.apolloDashClient.apolloClientMod.ApolloClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client", "ApolloClient")
@js.native
class ApolloClient[TCacheShape] protected ()
  extends typings.apolloDashClient.apolloClientMod.default[TCacheShape] {
  def this(options: ApolloClientOptions[TCacheShape]) = this()
}

