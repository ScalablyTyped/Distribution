package typings.apolloDashServer.apolloDashServerMod

import typings.graphql.languageAstMod.DocumentNode
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "gql")
@js.native
object gql extends js.Object {
  def apply(template: String, substitutions: js.Any*): DocumentNode = js.native
  def apply(template: TemplateStringsArray, substitutions: js.Any*): DocumentNode = js.native
}

