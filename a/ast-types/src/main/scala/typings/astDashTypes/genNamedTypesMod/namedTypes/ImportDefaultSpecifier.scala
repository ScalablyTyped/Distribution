package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ModuleSpecifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.SpecifierKind
import typings.astDashTypes.libTypesMod.Type
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
  var `type`: typings.astDashTypes.astDashTypesStrings.ImportDefaultSpecifier
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ImportDefaultSpecifier")
@js.native
object ImportDefaultSpecifier extends TopLevel[Type[ImportDefaultSpecifier]]

