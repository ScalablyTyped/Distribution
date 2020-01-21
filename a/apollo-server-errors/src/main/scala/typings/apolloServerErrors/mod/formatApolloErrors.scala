package typings.apolloServerErrors.mod

import typings.apolloServerErrors.AnonDebug
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-errors", "formatApolloErrors")
@js.native
object formatApolloErrors extends js.Object {
  def apply(errors: js.Array[Error]): js.Array[ApolloError] = js.native
  def apply(errors: js.Array[Error], options: AnonDebug): js.Array[ApolloError] = js.native
}

