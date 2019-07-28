package typings.apolloDashServerDashCore.apolloDashServerDashCoreMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core", "ApolloError")
@js.native
class ApolloError protected ()
  extends typings.apolloDashServerDashErrors.apolloDashServerDashErrorsMod.ApolloError {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: String, properties: Record[String, _]) = this()
}

