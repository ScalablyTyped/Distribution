package typings.apolloDashLink.libLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.libTypesMod.FetchResult
import typings.apolloDashLink.libTypesMod.GraphQLRequest
import typings.apolloDashLink.libTypesMod.Operation
import typings.apolloDashLink.libTypesMod.RequestHandler
import typings.std.Record
import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/link", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def concat(first: ApolloLink, second: ApolloLink): ApolloLink = js.native
  def concat(first: ApolloLink, second: RequestHandler): ApolloLink = js.native
  def concat(first: RequestHandler, second: ApolloLink): ApolloLink = js.native
  def concat(first: RequestHandler, second: RequestHandler): ApolloLink = js.native
  def empty(): ApolloLink = js.native
  def execute(link: ApolloLink, operation: GraphQLRequest): Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
  def from(links: js.Array[ApolloLink]): ApolloLink = js.native
  def split(test: js.Function1[/* op */ Operation, Boolean], left: ApolloLink): ApolloLink = js.native
  def split(test: js.Function1[/* op */ Operation, Boolean], left: ApolloLink, right: ApolloLink): ApolloLink = js.native
  def split(test: js.Function1[/* op */ Operation, Boolean], left: ApolloLink, right: RequestHandler): ApolloLink = js.native
  def split(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler): ApolloLink = js.native
  def split(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: ApolloLink): ApolloLink = js.native
  def split(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: RequestHandler): ApolloLink = js.native
}

