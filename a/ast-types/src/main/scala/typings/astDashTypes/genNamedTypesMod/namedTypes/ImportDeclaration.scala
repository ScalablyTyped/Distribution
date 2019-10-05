package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.`type`
import typings.astDashTypes.astDashTypesStrings.value
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ImportDefaultSpecifierKind
import typings.astDashTypes.genKindsMod.ImportNamespaceSpecifierKind
import typings.astDashTypes.genKindsMod.ImportSpecifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait ImportDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var importKind: js.UndefOr[value | `type`] = js.undefined
  var source: LiteralKind
  var specifiers: js.UndefOr[
    js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
  ] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.ImportDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ImportDeclaration")
@js.native
object ImportDeclaration extends TopLevel[Type[ImportDeclaration]]

