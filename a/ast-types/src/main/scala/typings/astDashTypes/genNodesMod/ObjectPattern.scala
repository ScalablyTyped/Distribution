package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.DecoratorKind
import typings.astDashTypes.genKindsMod.ObjectPropertyKind
import typings.astDashTypes.genKindsMod.PropertyKind
import typings.astDashTypes.genKindsMod.PropertyPatternKind
import typings.astDashTypes.genKindsMod.RestPropertyKind
import typings.astDashTypes.genKindsMod.SpreadPropertyKind
import typings.astDashTypes.genKindsMod.SpreadPropertyPatternKind
import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait ObjectPattern extends ASTNode {
  var decorators: js.Array[DecoratorKind] | Null
  var properties: js.Array[
    PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
  ]
  var `type`: typings.astDashTypes.astDashTypesStrings.ObjectPattern
  var typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind | Null
}

object ObjectPattern {
  @scala.inline
  def apply(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ],
    `type`: typings.astDashTypes.astDashTypesStrings.ObjectPattern,
    decorators: js.Array[DecoratorKind] = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern]
  }
}

