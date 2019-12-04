package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait Identifier extends ASTNode {
  var name: String
  var optional: Boolean
  var `type`: typings.astDashTypes.astDashTypesStrings.Identifier
  var typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind | Null
}

object Identifier {
  @scala.inline
  def apply(
    name: String,
    optional: Boolean,
    `type`: typings.astDashTypes.astDashTypesStrings.Identifier,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

