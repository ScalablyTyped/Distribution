package typings.apolloDashServer.apolloDashServerMod

import typings.apolloDashServerDashErrors.Anon_Extensions
import typings.apolloDashServerDashErrors.Anon_ExtensionsAny
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "toApolloError")
@js.native
object toApolloError extends js.Object {
  def apply(error: Error with Anon_Extensions): Error with Anon_ExtensionsAny = js.native
  def apply(error: Error with Anon_Extensions, code: String): Error with Anon_ExtensionsAny = js.native
}

