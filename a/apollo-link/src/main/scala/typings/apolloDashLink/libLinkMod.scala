package typings.apolloDashLink

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.libLinkMod.ApolloLink
import typings.apolloDashLink.libTypesMod.FetchResult
import typings.apolloDashLink.libTypesMod.GraphQLRequest
import typings.apolloDashLink.libTypesMod.NextLink
import typings.apolloDashLink.libTypesMod.Operation
import typings.apolloDashLink.libTypesMod.RequestHandler
import typings.std.Record
import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/link", JSImport.Namespace)
@js.native
object libLinkMod extends js.Object {
  @js.native
  class ApolloLink () extends js.Object {
    def this(request: RequestHandler) = this()
    def concat(next: ApolloLink): ApolloLink = js.native
    def concat(next: RequestHandler): ApolloLink = js.native
    def request(operation: Operation): (Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]]) | Null = js.native
    def request(operation: Operation, forward: NextLink): (Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]]) | Null = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: ApolloLink): ApolloLink = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: ApolloLink, right: ApolloLink): ApolloLink = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: ApolloLink, right: RequestHandler): ApolloLink = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler): ApolloLink = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: ApolloLink): ApolloLink = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: RequestHandler): ApolloLink = js.native
  }
  
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
  /* static members */
  @js.native
  object ApolloLink extends js.Object {
    @JSName("empty")
    var empty_Original: js.Function0[this.type] = js.native
    @JSName("execute")
    var execute_Original: js.Function2[
        /* link */ this.type, 
        /* operation */ GraphQLRequest, 
        Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]]
      ] = js.native
    @JSName("from")
    var from_Original: js.Function1[/* links */ js.Array[this.type], this.type] = js.native
    @JSName("split")
    var split_Original: js.Function3[
        /* test */ js.Function1[/* op */ Operation, Boolean], 
        /* left */ this.type | RequestHandler, 
        /* right */ js.UndefOr[this.type | RequestHandler], 
        this.type
      ] = js.native
    def empty(): this.type = js.native
    def execute(link: this.type, operation: GraphQLRequest): Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
    def from(links: js.Array[this.type]): this.type = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: this.type): this.type = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: this.type, right: this.type): this.type = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: this.type, right: RequestHandler): this.type = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler): this.type = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: this.type): this.type = js.native
    def split(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: RequestHandler): this.type = js.native
  }
  
}

