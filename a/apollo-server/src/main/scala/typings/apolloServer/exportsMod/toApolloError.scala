package typings.apolloServer.exportsMod

import typings.apolloServerErrors.AnonExtensions
import typings.apolloServerErrors.AnonExtensionsAny
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "toApolloError")
@js.native
object toApolloError extends js.Object {
  def apply(error: Error with AnonExtensions): Error with AnonExtensionsAny = js.native
  def apply(error: Error with AnonExtensions, code: String): Error with AnonExtensionsAny = js.native
}

