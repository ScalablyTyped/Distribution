package typings.apolloLink

import typings.apolloLink.linkMod.ApolloLink
import typings.apolloLink.typesMod.GraphQLRequest
import typings.apolloLink.typesMod.Operation
import typings.graphql.astMod.DocumentNode
import typings.std.Error
import typings.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/linkUtils", JSImport.Namespace)
@js.native
object linkUtilsMod extends js.Object {
  @js.native
  class LinkError () extends Error {
    def this(message: String) = this()
    def this(message: String, link: ApolloLink) = this()
    var link: ApolloLink = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  def createOperation(starting: js.Any, operation: GraphQLRequest): Operation = js.native
  def fromError[T](errorValue: js.Any): Observable[T] = js.native
  def fromPromise[T](promise: js.Promise[T]): Observable[T] = js.native
  def getKey(operation: GraphQLRequest): String = js.native
  def getOperationName(doc: DocumentNode): String | Null = js.native
  def isTerminating(link: ApolloLink): Boolean = js.native
  def toPromise[R](observable: Observable[R]): js.Promise[R] = js.native
  def transformOperation(operation: GraphQLRequest): GraphQLRequest = js.native
  def validateOperation(operation: GraphQLRequest): GraphQLRequest = js.native
  @js.native
  object makePromise extends js.Object {
    def apply[R](observable: Observable[R]): js.Promise[R] = js.native
  }
  
}

