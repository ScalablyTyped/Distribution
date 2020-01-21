package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.GenericTypeAnnotationKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.MemberTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait MemberTypeAnnotation extends ASTNode {
  var `object`: IdentifierKind
  var property: MemberTypeAnnotationKind | GenericTypeAnnotationKind
  var `type`: typings.astTypes.astTypesStrings.MemberTypeAnnotation
}

object MemberTypeAnnotation {
  @scala.inline
  def apply(
    `object`: IdentifierKind,
    property: MemberTypeAnnotationKind | GenericTypeAnnotationKind,
    `type`: typings.astTypes.astTypesStrings.MemberTypeAnnotation
  ): MemberTypeAnnotation = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberTypeAnnotation]
  }
}

