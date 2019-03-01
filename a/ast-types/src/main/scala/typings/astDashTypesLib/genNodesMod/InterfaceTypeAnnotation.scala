package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait InterfaceTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.FlowKind
     with astDashTypesLib.genKindsMod.FlowTypeKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var body: astDashTypesLib.genKindsMod.ObjectTypeAnnotationKind
  var `extends`: js.Array[astDashTypesLib.genKindsMod.InterfaceExtendsKind] | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.InterfaceTypeAnnotation
}

object InterfaceTypeAnnotation {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.ObjectTypeAnnotationKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.InterfaceTypeAnnotation,
    `extends`: js.Array[astDashTypesLib.genKindsMod.InterfaceExtendsKind] = null
  ): InterfaceTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    __obj.asInstanceOf[InterfaceTypeAnnotation]
  }
}

