package typings.apolloLink.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloLink.typesMod.FetchResult
import typings.apolloLink.typesMod.GraphQLRequest
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "execute")
@js.native
object execute extends js.Object {
  def apply(link: typings.apolloLink.linkMod.ApolloLink, operation: GraphQLRequest): typings.zenObservableTs.zenObservableMod.Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
}

