package typings.apolloDashLink.libLinkUtilsMod

import typings.apolloDashLink.libLinkMod.ApolloLink
import typings.apolloDashLink.libTypesMod.GraphQLRequest
import typings.apolloDashLink.libTypesMod.Operation
import typings.graphql.languageAstMod.DocumentNode
import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/linkUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createOperation(starting: js.Any, operation: GraphQLRequest): Operation = js.native
  def fromError[T](errorValue: js.Any): Observable[T] = js.native
  def fromPromise[T](promise: js.Promise[T]): Observable[T] = js.native
  def getKey(operation: GraphQLRequest): String = js.native
  def getOperationName(doc: DocumentNode): String | Null = js.native
  def isTerminating(link: ApolloLink): Boolean = js.native
  def toPromise[R](observable: Observable[R]): js.Promise[R] = js.native
  def transformOperation(operation: GraphQLRequest): GraphQLRequest = js.native
  def validateOperation(operation: GraphQLRequest): GraphQLRequest = js.native
}

