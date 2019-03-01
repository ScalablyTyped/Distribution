package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Declaration, 'type'> ]: ast-types.ast-types/gen/nodes.Declaration[P]} */ trait ImportDeclaration
  extends ASTNode
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var importKind: astDashTypesLib.astDashTypesLibStrings.value | astDashTypesLib.astDashTypesLibStrings.`type`
  var source: astDashTypesLib.genKindsMod.LiteralKind
  var specifiers: js.Array[
    astDashTypesLib.genKindsMod.ImportSpecifierKind | astDashTypesLib.genKindsMod.ImportNamespaceSpecifierKind | astDashTypesLib.genKindsMod.ImportDefaultSpecifierKind
  ]
  var `type`: astDashTypesLib.astDashTypesLibStrings.ImportDeclaration
}

object ImportDeclaration {
  @scala.inline
  def apply(
    importKind: astDashTypesLib.astDashTypesLibStrings.value | astDashTypesLib.astDashTypesLibStrings.`type`,
    source: astDashTypesLib.genKindsMod.LiteralKind,
    specifiers: js.Array[
      astDashTypesLib.genKindsMod.ImportSpecifierKind | astDashTypesLib.genKindsMod.ImportNamespaceSpecifierKind | astDashTypesLib.genKindsMod.ImportDefaultSpecifierKind
    ],
    `type`: astDashTypesLib.astDashTypesLibStrings.ImportDeclaration
  ): ImportDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("importKind")(importKind.asInstanceOf[js.Any])
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("specifiers")(specifiers)
    __obj.asInstanceOf[ImportDeclaration]
  }
}

