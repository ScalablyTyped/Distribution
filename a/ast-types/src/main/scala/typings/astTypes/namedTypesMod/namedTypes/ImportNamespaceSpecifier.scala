package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ModuleSpecifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SpecifierKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier[P]} */ trait ImportNamespaceSpecifier
  extends ASTNode
     with ModuleSpecifierKind
     with NodeKind
     with PrintableKind
     with SpecifierKind {
  var `type`: typings.astTypes.astTypesStrings.ImportNamespaceSpecifier
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ImportNamespaceSpecifier")
@js.native
object ImportNamespaceSpecifier extends TopLevel[Type[ImportNamespaceSpecifier]]

