package typings.apolloDashLink.apolloDashLinkMod

import typings.apolloDashLink.libTypesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "concat")
@js.native
object concat extends js.Object {
  def apply(
    first: typings.apolloDashLink.libLinkMod.ApolloLink,
    second: typings.apolloDashLink.libLinkMod.ApolloLink
  ): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(first: typings.apolloDashLink.libLinkMod.ApolloLink, second: RequestHandler): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(first: RequestHandler, second: typings.apolloDashLink.libLinkMod.ApolloLink): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
  def apply(first: RequestHandler, second: RequestHandler): typings.apolloDashLink.libLinkMod.ApolloLink = js.native
}

