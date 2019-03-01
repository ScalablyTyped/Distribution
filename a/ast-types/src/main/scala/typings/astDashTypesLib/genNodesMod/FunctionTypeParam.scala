package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait FunctionTypeParam
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var name: astDashTypesLib.genKindsMod.IdentifierKind
  var optional: scala.Boolean
  var `type`: astDashTypesLib.astDashTypesLibStrings.FunctionTypeParam
  var typeAnnotation: astDashTypesLib.genKindsMod.FlowTypeKind
}

object FunctionTypeParam {
  @scala.inline
  def apply(
    name: astDashTypesLib.genKindsMod.IdentifierKind,
    optional: scala.Boolean,
    `type`: astDashTypesLib.astDashTypesLibStrings.FunctionTypeParam,
    typeAnnotation: astDashTypesLib.genKindsMod.FlowTypeKind
  ): FunctionTypeParam = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[FunctionTypeParam]
  }
}

