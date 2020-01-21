package typings.apolloServerExpress.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "ApolloError")
@js.native
class ApolloError protected ()
  extends typings.apolloServerCore.mod.ApolloError {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: String, extensions: Record[String, _]) = this()
}

