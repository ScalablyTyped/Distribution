package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait DeclareModuleExports extends ASTNode {
  var `type`: typings.astDashTypes.astDashTypesStrings.DeclareModuleExports
  var typeAnnotation: TypeAnnotationKind
}

object DeclareModuleExports {
  @scala.inline
  def apply(
    `type`: typings.astDashTypes.astDashTypesStrings.DeclareModuleExports,
    typeAnnotation: TypeAnnotationKind
  ): DeclareModuleExports = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareModuleExports]
  }
}

