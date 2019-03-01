package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Node, 'type'> ]: ast-types.ast-types/gen/nodes.Node[P]} */ trait TSTypeAnnotation
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.TSTypeAnnotationKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeAnnotation
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind
}

object TSTypeAnnotation {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.TSTypeAnnotation,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind | astDashTypesLib.genKindsMod.TSTypeAnnotationKind
  ): TSTypeAnnotation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeAnnotation]
  }
}

