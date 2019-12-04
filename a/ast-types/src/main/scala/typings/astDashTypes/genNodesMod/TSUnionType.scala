package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSUnionType extends ASTNode {
  var `type`: typings.astDashTypes.astDashTypesStrings.TSUnionType
  var types: js.Array[TSTypeKind]
}

object TSUnionType {
  @scala.inline
  def apply(`type`: typings.astDashTypes.astDashTypesStrings.TSUnionType, types: js.Array[TSTypeKind]): TSUnionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSUnionType]
  }
}

