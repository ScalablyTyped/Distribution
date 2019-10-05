package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.SpecifierKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Specifier, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Specifier[P]} */ trait ExportBatchSpecifier
  extends ASTNode
     with NodeKind
     with PrintableKind
     with SpecifierKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.ExportBatchSpecifier
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ExportBatchSpecifier")
@js.native
object ExportBatchSpecifier extends TopLevel[Type[ExportBatchSpecifier]]

