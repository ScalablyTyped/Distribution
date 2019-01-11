package typings
package apolloDashLinkLib.libLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/link", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def concat(first: apolloDashLinkLib.libLinkMod.ApolloLink, second: apolloDashLinkLib.libLinkMod.ApolloLink): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
  def concat(
    first: apolloDashLinkLib.libLinkMod.ApolloLink,
    second: apolloDashLinkLib.libTypesMod.RequestHandler
  ): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
  def concat(
    first: apolloDashLinkLib.libTypesMod.RequestHandler,
    second: apolloDashLinkLib.libLinkMod.ApolloLink
  ): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
  def concat(
    first: apolloDashLinkLib.libTypesMod.RequestHandler,
    second: apolloDashLinkLib.libTypesMod.RequestHandler
  ): apolloDashLinkLib.libLinkMod.ApolloLink = js.native
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

