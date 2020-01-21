package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.TSEnumMemberKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait TSEnumDeclaration extends ASTNode {
  var const: Boolean
  var declare: Boolean
  var id: IdentifierKind
  var initializer: ExpressionKind | Null
  var members: js.Array[TSEnumMemberKind]
  var `type`: typings.astTypes.astTypesStrings.TSEnumDeclaration
}

object TSEnumDeclaration {
  @scala.inline
  def apply(
    const: Boolean,
    declare: Boolean,
    id: IdentifierKind,
    members: js.Array[TSEnumMemberKind],
    `type`: typings.astTypes.astTypesStrings.TSEnumDeclaration,
    initializer: ExpressionKind = null
  ): TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(const = const.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initializer != null) __obj.updateDynamic("initializer")(initializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEnumDeclaration]
  }
}

