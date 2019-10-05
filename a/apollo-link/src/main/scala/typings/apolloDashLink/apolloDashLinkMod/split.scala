package typings.apolloDashLink.apolloDashLinkMod

import typings.apolloDashLink.libTypesMod.Operation
import typings.apolloDashLink.libTypesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "split")
@js.native
object split extends js.Object {
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typings.apolloDashLink.libLinkMod.ApolloLink
  ): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typings.apolloDashLink.libLinkMod.ApolloLink,
    right: typings.apolloDashLink.libLinkMod.ApolloLink
  ): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typings.apolloDashLink.libLinkMod.ApolloLink,
    right: RequestHandler
  ): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: RequestHandler,
    right: typings.apolloDashLink.libLinkMod.ApolloLink
  ): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: RequestHandler): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
}

