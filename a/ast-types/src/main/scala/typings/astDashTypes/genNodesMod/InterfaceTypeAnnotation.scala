package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.InterfaceExtendsKind
import typings.astDashTypes.genKindsMod.ObjectTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait InterfaceTypeAnnotation extends ASTNode {
  var body: ObjectTypeAnnotationKind
  var `extends`: js.Array[InterfaceExtendsKind] | Null
  var `type`: typings.astDashTypes.astDashTypesStrings.InterfaceTypeAnnotation
}

object InterfaceTypeAnnotation {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotationKind,
    `type`: typings.astDashTypes.astDashTypesStrings.InterfaceTypeAnnotation,
    `extends`: js.Array[InterfaceExtendsKind] = null
  ): InterfaceTypeAnnotation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceTypeAnnotation]
  }
}

