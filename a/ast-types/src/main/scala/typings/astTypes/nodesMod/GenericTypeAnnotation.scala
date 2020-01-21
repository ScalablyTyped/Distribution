package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typings.astTypes.kindsMod.TypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.FlowType, 'type'> ]: ast-types.ast-types/gen/nodes.FlowType[P]} */ trait GenericTypeAnnotation extends ASTNode {
  var id: IdentifierKind | QualifiedTypeIdentifierKind
  var `type`: typings.astTypes.astTypesStrings.GenericTypeAnnotation
  var typeParameters: TypeParameterInstantiationKind | Null
}

object GenericTypeAnnotation {
  @scala.inline
  def apply(
    id: IdentifierKind | QualifiedTypeIdentifierKind,
    `type`: typings.astTypes.astTypesStrings.GenericTypeAnnotation,
    typeParameters: TypeParameterInstantiationKind = null
  ): GenericTypeAnnotation = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericTypeAnnotation]
  }
}

