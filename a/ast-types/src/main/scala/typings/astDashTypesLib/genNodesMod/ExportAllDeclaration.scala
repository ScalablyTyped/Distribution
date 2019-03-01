package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ExportAllDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var exported: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
  var source: astDashTypesLib.genKindsMod.LiteralKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ExportAllDeclaration
}

object ExportAllDeclaration {
  @scala.inline
  def apply(
    source: astDashTypesLib.genKindsMod.LiteralKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ExportAllDeclaration,
    exported: astDashTypesLib.genKindsMod.IdentifierKind = null
  ): ExportAllDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("source")(source)
    if (exported != null) __obj.updateDynamic("exported")(exported)
    __obj.asInstanceOf[ExportAllDeclaration]
  }
}

