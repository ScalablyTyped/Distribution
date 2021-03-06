package typings.apolloServer.exportsMod

import typings.graphql.astMod.DocumentNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "processImport")
@js.native
object processImport extends js.Object {
  def apply(filePath: String): DocumentNode = js.native
  def apply(filePath: String, cwd: js.UndefOr[scala.Nothing], predefinedImports: Record[String, String]): DocumentNode = js.native
  def apply(filePath: String, cwd: String): DocumentNode = js.native
  def apply(filePath: String, cwd: String, predefinedImports: Record[String, String]): DocumentNode = js.native
}

