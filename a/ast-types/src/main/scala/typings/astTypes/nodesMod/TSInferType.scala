package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.TSTypeParameterKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSInferType extends ASTNode {
  var `type`: typings.astTypes.astTypesStrings.TSInferType
  var typeParameter: TSTypeParameterKind
}

object TSInferType {
  @scala.inline
  def apply(`type`: typings.astTypes.astTypesStrings.TSInferType, typeParameter: TSTypeParameterKind): TSInferType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSInferType]
  }
}

