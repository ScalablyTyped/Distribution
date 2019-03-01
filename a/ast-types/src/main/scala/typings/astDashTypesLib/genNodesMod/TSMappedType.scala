package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSMappedType
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var optional: scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-`
  var readonly: scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-`
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSMappedType
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind | scala.Null
  var typeParameter: astDashTypesLib.genKindsMod.TSTypeParameterKind
}

object TSMappedType {
  @scala.inline
  def apply(
    optional: scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-`,
    readonly: scala.Boolean | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-`,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSMappedType,
    typeParameter: astDashTypesLib.genKindsMod.TSTypeParameterKind,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind = null
  ): TSMappedType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("typeParameter")(typeParameter)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSMappedType]
  }
}

