package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.QualifiedTypeIdentifierKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait QualifiedTypeIdentifier
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var id: IdentifierKind
  var qualification: IdentifierKind | QualifiedTypeIdentifierKind
  var `type`: typings.astDashTypes.astDashTypesStrings.QualifiedTypeIdentifier
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.QualifiedTypeIdentifier")
@js.native
object QualifiedTypeIdentifier extends TopLevel[Type[QualifiedTypeIdentifier]]

