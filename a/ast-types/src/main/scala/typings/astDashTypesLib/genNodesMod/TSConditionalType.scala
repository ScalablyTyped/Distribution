package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.TSType, 'type'> ]: ast-types.ast-types/gen/nodes.TSType[P]} */ trait TSConditionalType
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeKind {
  var checkType: astDashTypesLib.genKindsMod.TSTypeKind
  var extendsType: astDashTypesLib.genKindsMod.TSTypeKind
  var falseType: astDashTypesLib.genKindsMod.TSTypeKind
  var trueType: astDashTypesLib.genKindsMod.TSTypeKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSConditionalType
}

object TSConditionalType {
  @scala.inline
  def apply(
    checkType: astDashTypesLib.genKindsMod.TSTypeKind,
    extendsType: astDashTypesLib.genKindsMod.TSTypeKind,
    falseType: astDashTypesLib.genKindsMod.TSTypeKind,
    trueType: astDashTypesLib.genKindsMod.TSTypeKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.TSConditionalType
  ): TSConditionalType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("checkType")(checkType)
    __obj.updateDynamic("extendsType")(extendsType)
    __obj.updateDynamic("falseType")(falseType)
    __obj.updateDynamic("trueType")(trueType)
    __obj.asInstanceOf[TSConditionalType]
  }
}

