package typings
package apolloDashLinkLib.libLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/link", JSImport.Namespace)
@js.native
object libLinkModMembers extends js.Object {
  def concat(first: ApolloLink, second: ApolloLink): ApolloLink = js.native
  def concat(first: ApolloLink, second: apolloDashLinkLib.libTypesMod.RequestHandler): ApolloLink = js.native
  def concat(first: apolloDashLinkLib.libTypesMod.RequestHandler, second: ApolloLink): ApolloLink = js.native
  def concat(
    first: apolloDashLinkLib.libTypesMod.RequestHandler,
    second: apolloDashLinkLib.libTypesMod.RequestHandler
  ): ApolloLink = js.native
  def empty(): ApolloLink = js.native
  def execute(link: ApolloLink, operation: apolloDashLinkLib.libTypesMod.GraphQLRequest): zenDashObservableDashTsLib.libZenObservableMod.Observable[
    apolloDashLinkLib.libTypesMod.FetchResult[
      org.scalablytyped.runtime.StringDictionary[_], 
      stdLib.Record[java.lang.String, _], 
      stdLib.Record[java.lang.String, _]
    ]
  ] = js.native
  def from(links: js.Array[ApolloLink]): ApolloLink = js.native
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

