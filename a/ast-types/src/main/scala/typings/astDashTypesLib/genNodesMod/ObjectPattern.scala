package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait ObjectPattern
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PatternKind
     with astDashTypesLib.genKindsMod.PrintableKind {
  var decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null
  var properties: js.Array[
    astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.PropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.RestPropertyKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ObjectPattern
  var typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
}

object ObjectPattern {
  @scala.inline
  def apply(
    properties: js.Array[
      astDashTypesLib.genKindsMod.PropertyKind | astDashTypesLib.genKindsMod.PropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyPatternKind | astDashTypesLib.genKindsMod.SpreadPropertyKind | astDashTypesLib.genKindsMod.ObjectPropertyKind | astDashTypesLib.genKindsMod.RestPropertyKind
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.ObjectPattern,
    decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] = null,
    typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("properties")(properties)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern]
  }
}

