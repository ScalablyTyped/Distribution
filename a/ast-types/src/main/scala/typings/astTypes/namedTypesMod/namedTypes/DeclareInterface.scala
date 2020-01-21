package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.InterfaceDeclarationKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration[P]} */ trait DeclareInterface
  extends ASTNode
     with DeclarationKind
     with InterfaceDeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var `type`: typings.astTypes.astTypesStrings.DeclareInterface
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareInterface")
@js.native
object DeclareInterface extends TopLevel[Type[DeclareInterface]]

