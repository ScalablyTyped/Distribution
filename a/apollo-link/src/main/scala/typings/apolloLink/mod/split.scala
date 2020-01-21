package typings.apolloLink.mod

import typings.apolloLink.typesMod.Operation
import typings.apolloLink.typesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "split")
@js.native
object split extends js.Object {
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: typings.apolloLink.linkMod.ApolloLink): typings.apolloLink.linkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typings.apolloLink.linkMod.ApolloLink,
    right: typings.apolloLink.linkMod.ApolloLink
  ): typings.apolloLink.linkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typings.apolloLink.linkMod.ApolloLink,
    right: RequestHandler
  ): typings.apolloLink.linkMod.ApolloLink = js.native
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler): typings.apolloLink.linkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: RequestHandler,
    right: typings.apolloLink.linkMod.ApolloLink
  ): typings.apolloLink.linkMod.ApolloLink = js.native
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: RequestHandler): typings.apolloLink.linkMod.ApolloLink = js.native
}

