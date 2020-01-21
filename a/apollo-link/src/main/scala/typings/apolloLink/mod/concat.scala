package typings.apolloLink.mod

import typings.apolloLink.typesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "concat")
@js.native
object concat extends js.Object {
  def apply(first: typings.apolloLink.linkMod.ApolloLink, second: typings.apolloLink.linkMod.ApolloLink): typings.apolloLink.linkMod.ApolloLink = js.native
  def apply(first: typings.apolloLink.linkMod.ApolloLink, second: RequestHandler): typings.apolloLink.linkMod.ApolloLink = js.native
  def apply(first: RequestHandler, second: typings.apolloLink.linkMod.ApolloLink): typings.apolloLink.linkMod.ApolloLink = js.native
  def apply(first: RequestHandler, second: RequestHandler): typings.apolloLink.linkMod.ApolloLink = js.native
}

