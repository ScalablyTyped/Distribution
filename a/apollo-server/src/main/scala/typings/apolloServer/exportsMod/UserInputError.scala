package typings.apolloServer.exportsMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "UserInputError")
@js.native
class UserInputError protected ()
  extends typings.apolloServerCore.mod.UserInputError {
  def this(message: String) = this()
  def this(message: String, properties: Record[String, _]) = this()
}

