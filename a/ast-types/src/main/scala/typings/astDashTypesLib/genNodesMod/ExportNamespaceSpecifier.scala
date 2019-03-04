package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Specifier, 'type'> ]: ast-types.ast-types/gen/nodes.Specifier[P]} */ trait ExportNamespaceSpecifier
  extends ASTNode
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.SpecifierKind {
  var exported: astDashTypesLib.genKindsMod.IdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ExportNamespaceSpecifier
}

object ExportNamespaceSpecifier {
  @scala.inline
  def apply(
    exported: astDashTypesLib.genKindsMod.IdentifierKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ExportNamespaceSpecifier
  ): ExportNamespaceSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExportNamespaceSpecifier]
  }
}

