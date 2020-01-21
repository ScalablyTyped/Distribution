package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SpecifierKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Specifier, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Specifier[P]} */ trait ExportDefaultSpecifier
  extends ASTNode
     with NodeKind
     with PrintableKind
     with SpecifierKind {
  var exported: IdentifierKind
  var `type`: typings.astTypes.astTypesStrings.ExportDefaultSpecifier
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ExportDefaultSpecifier")
@js.native
object ExportDefaultSpecifier extends TopLevel[Type[ExportDefaultSpecifier]]

