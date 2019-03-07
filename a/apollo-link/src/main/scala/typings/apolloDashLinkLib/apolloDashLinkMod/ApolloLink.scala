package typings
package apolloDashLinkLib.apolloDashLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "ApolloLink")
@js.native
class ApolloLink ()
  extends apolloDashLinkLib.libLinkMod.ApolloLink {
  def this(request: apolloDashLinkLib.libTypesMod.RequestHandler) = this()
}

/* static members */
@JSImport("apollo-link", "ApolloLink")
@js.native
object ApolloLink extends js.Object {
  @JSName("empty")
  var empty_Original: js.Function0[this.type] = js.native
  @JSName("execute")
  var execute_Original: js.Function2[
    /* link */ this.type, 
    /* operation */ apolloDashLinkLib.libTypesMod.GraphQLRequest, 
    zenDashObservableDashTsLib.libZenObservableMod.Observable[
      apolloDashLinkLib.libTypesMod.FetchResult[
        org.scalablytyped.runtime.StringDictionary[_], 
        stdLib.Record[java.lang.String, _], 
        stdLib.Record[java.lang.String, _]
      ]
    ]
  ] = js.native
  @JSName("from")
  var from_Original: js.Function1[/* links */ js.Array[this.type], this.type] = js.native
  @JSName("split")
  var split_Original: js.Function3[
    /* test */ js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean], 
    /* left */ this.type | apolloDashLinkLib.libTypesMod.RequestHandler, 
    /* right */ js.UndefOr[this.type | apolloDashLinkLib.libTypesMod.RequestHandler], 
    this.type
  ] = js.native
  def empty(): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
  def execute(
    link: apolloDashLinkLib.libLinkMod.ApolloLink,
    operation: apolloDashLinkLib.libTypesMod.GraphQLRequest
  ): zenDashObservableDashTsLib.libZenObservableMod.Observable[
    apolloDashLinkLib.libTypesMod.FetchResult[
      org.scalablytyped.runtime.StringDictionary[_], 
      stdLib.Record[java.lang.String, _], 
      stdLib.Record[java.lang.String, _]
    ]
  ] = js.native
  def from(links: js.Array[apolloDashLinkLib.libLinkMod.ApolloLink]): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: apolloDashLinkLib.libLinkMod.ApolloLink
  ): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: apolloDashLinkLib.libLinkMod.ApolloLink,
    right: apolloDashLinkLib.libLinkMod.ApolloLink
  ): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: apolloDashLinkLib.libLinkMod.ApolloLink,
    right: apolloDashLinkLib.libTypesMod.RequestHandler
  ): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: apolloDashLinkLib.libTypesMod.RequestHandler
  ): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: apolloDashLinkLib.libTypesMod.RequestHandler,
    right: apolloDashLinkLib.libLinkMod.ApolloLink
  ): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: apolloDashLinkLib.libTypesMod.RequestHandler,
    right: apolloDashLinkLib.libTypesMod.RequestHandler
  ): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
}

