package typings.apolloServerErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-errors", "ValidationError")
@js.native
class ValidationError protected () extends ApolloError {
  def this(message: String) = this()
}

