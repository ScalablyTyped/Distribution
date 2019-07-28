package typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-errors", "UserInputError")
@js.native
class UserInputError protected () extends ApolloError {
  def this(message: String) = this()
  def this(message: String, properties: Record[String, _]) = this()
}

