package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Identifier, 'type' | 'name'> ]: ast-types.ast-types/gen/nodes.Identifier[P]} */ trait TSTypeParameter extends ASTNode {
  var constraint: js.UndefOr[TSTypeKind] = js.undefined
  var default: js.UndefOr[TSTypeKind] = js.undefined
  var name: String
  var `type`: typings.astTypes.astTypesStrings.TSTypeParameter
}

object TSTypeParameter {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.astTypes.astTypesStrings.TSTypeParameter,
    constraint: TSTypeKind = null,
    default: TSTypeKind = null
  ): TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameter]
  }
}

