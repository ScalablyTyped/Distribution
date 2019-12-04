package typings.apolloDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilObservableToPromiseMod {
  import typings.apolloDashClient.coreTypesMod.ApolloQueryResult

  type ResultCallback = js.Function1[/* result */ ApolloQueryResult[js.Any], js.Any]
}
