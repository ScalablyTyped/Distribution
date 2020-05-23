package typings.apolloClient.anon

import typings.graphql.astMod.DefinitionNode
import typings.graphql.astMod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<graphql.graphql.DocumentNode> */
trait ReadonlyDocumentNode extends js.Object {
  val definitions: js.Array[DefinitionNode]
  val kind: typings.apolloClient.apolloClientStrings.Document
  val loc: js.UndefOr[Location] = js.undefined
}

object ReadonlyDocumentNode {
  @scala.inline
  def apply(
    definitions: js.Array[DefinitionNode],
    kind: typings.apolloClient.apolloClientStrings.Document,
    loc: Location = null
  ): ReadonlyDocumentNode = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyDocumentNode]
  }
}

