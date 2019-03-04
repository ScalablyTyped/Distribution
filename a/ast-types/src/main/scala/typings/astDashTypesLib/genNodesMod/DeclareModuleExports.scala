package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Statement, 'type'> ]: ast-types.ast-types/gen/nodes.Statement[P]} */ trait DeclareModuleExports
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var `type`: astDashTypesLib.astDashTypesLibStrings.DeclareModuleExports
  var typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind
}

object DeclareModuleExports {
  @scala.inline
  def apply(
    `type`: astDashTypesLib.astDashTypesLibStrings.DeclareModuleExports,
    typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind
  ): DeclareModuleExports = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeclareModuleExports]
  }
}

