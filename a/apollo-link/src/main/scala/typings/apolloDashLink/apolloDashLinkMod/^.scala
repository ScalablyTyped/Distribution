package typings.apolloDashLink.apolloDashLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.libTypesMod.FetchResult
import typings.apolloDashLink.libTypesMod.GraphQLRequest
import typings.apolloDashLink.libTypesMod.Operation
import typings.apolloDashLink.libTypesMod.RequestHandler
import typings.graphql.languageAstMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def concat(
    first: typings.apolloDashLink.libLinkMod.ApolloLink,
    second: typings.apolloDashLink.libLinkMod.ApolloLink
  ): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def concat(first: typings.apolloDashLink.libLinkMod.ApolloLink, second: RequestHandler): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def concat(first: RequestHandler, second: typings.apolloDashLink.libLinkMod.ApolloLink): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def concat(first: RequestHandler, second: RequestHandler): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def createOperation(starting: js.Any, operation: GraphQLRequest): Operation = js.native
  def empty(): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def execute(link: typings.apolloDashLink.libLinkMod.ApolloLink, operation: GraphQLRequest): typings.zenDashObservableDashTs.libZenObservableMod.Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
  def from(links: js.Array[typings.apolloDashLink.libLinkMod.ApolloLink]): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def fromError[T](errorValue: js.Any): typings.zenDashObservableDashTs.libZenObservableMod.Observable[T] = js.native
  def fromPromise[T](promise: js.Promise[T]): typings.zenDashObservableDashTs.libZenObservableMod.Observable[T] = js.native
  def getOperationName(doc: DocumentNode): String | Null = js.native
  def split(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typings.apolloDashLink.libLinkMod.ApolloLink
  ): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typings.apolloDashLink.libLinkMod.ApolloLink,
    right: typings.apolloDashLink.libLinkMod.ApolloLink
  ): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typings.apolloDashLink.libLinkMod.ApolloLink,
    right: RequestHandler
  ): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def split(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ Operation, Boolean],
    left: RequestHandler,
    right: typings.apolloDashLink.libLinkMod.ApolloLink
  ): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def split(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: RequestHandler): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def toPromise[R](observable: typings.zenDashObservableDashTs.libZenObservableMod.Observable[R]): js.Promise[R] = js.native
}

