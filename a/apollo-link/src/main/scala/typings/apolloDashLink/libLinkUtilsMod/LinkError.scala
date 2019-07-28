package typings.apolloDashLink.libLinkUtilsMod

import typings.apolloDashLink.libLinkMod.ApolloLink
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/linkUtils", "LinkError")
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

