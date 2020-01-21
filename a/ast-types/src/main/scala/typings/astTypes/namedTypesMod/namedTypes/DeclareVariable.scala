package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait DeclareVariable
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var id: IdentifierKind
  var `type`: typings.astTypes.astTypesStrings.DeclareVariable
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareVariable")
@js.native
object DeclareVariable extends TopLevel[Type[DeclareVariable]]

