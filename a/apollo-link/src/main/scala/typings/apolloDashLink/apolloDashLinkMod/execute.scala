package typings.apolloDashLink.apolloDashLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.libTypesMod.FetchResult
import typings.apolloDashLink.libTypesMod.GraphQLRequest
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "execute")
@js.native
object execute extends js.Object {
  def apply(link: typings.apolloDashLink.libLinkMod.ApolloLink, operation: GraphQLRequest): typings.zenDashObservableDashTs.libZenObservableMod.Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
}

