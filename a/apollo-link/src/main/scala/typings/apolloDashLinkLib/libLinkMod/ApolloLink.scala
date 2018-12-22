package typings
package apolloDashLinkLib.libLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/link", "ApolloLink")
@js.native
class ApolloLink () extends js.Object {
  def this(request: apolloDashLinkLib.libTypesMod.RequestHandler) = this()
  def concat(next: ApolloLink): ApolloLink = js.native
  def concat(next: apolloDashLinkLib.libTypesMod.RequestHandler): ApolloLink = js.native
  def request(operation: apolloDashLinkLib.libTypesMod.Operation): (zenDashObservableDashTsLib.libZenObservableMod.Observable[
    apolloDashLinkLib.libTypesMod.FetchResult[
      org.scalablytyped.runtime.StringDictionary[_], 
      stdLib.Record[java.lang.String, _], 
      stdLib.Record[java.lang.String, _]
    ]
  ]) | scala.Null = js.native
  def request(
    operation: apolloDashLinkLib.libTypesMod.Operation,
    forward: apolloDashLinkLib.libTypesMod.NextLink
  ): (zenDashObservableDashTsLib.libZenObservableMod.Observable[
    apolloDashLinkLib.libTypesMod.FetchResult[
      org.scalablytyped.runtime.StringDictionary[_], 
      stdLib.Record[java.lang.String, _], 
      stdLib.Record[java.lang.String, _]
    ]
  ]) | scala.Null = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: ApolloLink
  ): ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: ApolloLink,
    right: ApolloLink
  ): ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: ApolloLink,
    right: apolloDashLinkLib.libTypesMod.RequestHandler
  ): ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: apolloDashLinkLib.libTypesMod.RequestHandler
  ): ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: apolloDashLinkLib.libTypesMod.RequestHandler,
    right: ApolloLink
  ): ApolloLink = js.native
  def split(
    test: js.Function1[/* op */ apolloDashLinkLib.libTypesMod.Operation, scala.Boolean],
    left: apolloDashLinkLib.libTypesMod.RequestHandler,
    right: apolloDashLinkLib.libTypesMod.RequestHandler
  ): ApolloLink = js.native
}

@JSImport("apollo-link/lib/link", "ApolloLink")
@js.native
object ApolloLink extends js.Object {
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

