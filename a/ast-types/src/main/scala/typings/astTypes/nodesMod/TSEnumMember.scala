package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.StringLiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TSEnumMember extends ASTNode {
  var id: IdentifierKind | StringLiteralKind
  var initializer: ExpressionKind | Null
  var `type`: typings.astTypes.astTypesStrings.TSEnumMember
}

object TSEnumMember {
  @scala.inline
  def apply(
    id: IdentifierKind | StringLiteralKind,
    `type`: typings.astTypes.astTypesStrings.TSEnumMember,
    initializer: ExpressionKind = null
  ): TSEnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEnumMember]
  }
}

