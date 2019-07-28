package typings.apolloDashServer.apolloDashServerMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "ApolloError")
@js.native
class ApolloError protected ()
  extends typings.apolloDashServer.distExportsMod.ApolloError {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: String, properties: Record[String, _]) = this()
}

