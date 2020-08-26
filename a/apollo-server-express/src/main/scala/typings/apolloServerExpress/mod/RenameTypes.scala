package typings.apolloServerExpress.mod

import typings.graphqlToolsUtils.interfacesMod.RenameTypesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "RenameTypes")
@js.native
class RenameTypes protected ()
  extends typings.graphqlTools.mod.RenameTypes {
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameTypesOptions) = this()
}

