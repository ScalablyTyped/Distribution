package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typings.astTypes.typesMod.Type
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
  var `type`: typings.astTypes.astTypesStrings.QualifiedTypeIdentifier
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.QualifiedTypeIdentifier")
@js.native
object QualifiedTypeIdentifier extends TopLevel[Type[QualifiedTypeIdentifier]]

