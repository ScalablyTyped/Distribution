package typings.apolloDashServer.apolloDashServerMod

import typings.graphqlDashTools.distTransformsRenameTypesMod.RenameOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "RenameTypes")
@js.native
class RenameTypes protected ()
  extends typings.apolloDashServer.distExportsMod.RenameTypes {
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
  def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
}

