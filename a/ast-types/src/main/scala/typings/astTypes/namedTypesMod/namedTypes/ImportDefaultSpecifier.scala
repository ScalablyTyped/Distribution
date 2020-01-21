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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier[P]} */ trait ImportDefaultSpecifier
  extends ASTNode
     with ModuleSpecifierKind
     with NodeKind
     with PrintableKind
     with SpecifierKind {
  var `type`: typings.astTypes.astTypesStrings.ImportDefaultSpecifier
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ImportDefaultSpecifier")
@js.native
object ImportDefaultSpecifier extends TopLevel[Type[ImportDefaultSpecifier]]

