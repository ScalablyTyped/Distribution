package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Identifier, 'type' | 'name'> ]: ast-types.ast-types/gen/nodes.Identifier[P]} */ trait TSTypeParameter
  extends ASTNode
     with astDashTypesLib.genKindsMod.ExpressionKind
     with astDashTypesLib.genKindsMod.IdentifierKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var constraint: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeKind] = js.undefined
  var default: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeKind] = js.undefined
  var name: java.lang.String
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeParameter
}

object TSTypeParameter {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeParameter,
    constraint: astDashTypesLib.genKindsMod.TSTypeKind = null,
    default: astDashTypesLib.genKindsMod.TSTypeKind = null
  ): TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[TSTypeParameter]
  }
}

