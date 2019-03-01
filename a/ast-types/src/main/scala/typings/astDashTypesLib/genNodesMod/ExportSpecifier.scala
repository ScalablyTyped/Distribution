package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/nodes.ModuleSpecifier[P]} */ trait ExportSpecifier
  extends ASTNode
     with astDashTypesLib.genKindsMod.ModuleSpecifierKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.SpecifierKind {
  var exported: astDashTypesLib.genKindsMod.IdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ExportSpecifier
}

object ExportSpecifier {
  @scala.inline
  def apply(
    exported: astDashTypesLib.genKindsMod.IdentifierKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ExportSpecifier
  ): ExportSpecifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("exported")(exported)
    __obj.asInstanceOf[ExportSpecifier]
  }
}

