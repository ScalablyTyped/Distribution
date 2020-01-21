package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Pattern, 'type'> ]: ast-types.ast-types/gen/nodes.Pattern[P]} */ trait RestElement extends ASTNode {
  var argument: PatternKind
  var `type`: typings.astTypes.astTypesStrings.RestElement
  var typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind | Null
}

object RestElement {
  @scala.inline
  def apply(
    argument: PatternKind,
    `type`: typings.astTypes.astTypesStrings.RestElement,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestElement]
  }
}

