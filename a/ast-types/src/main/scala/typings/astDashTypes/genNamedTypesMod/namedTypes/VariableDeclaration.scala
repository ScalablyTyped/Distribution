package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.`var`
import typings.astDashTypes.astDashTypesStrings.const
import typings.astDashTypes.astDashTypesStrings.let
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.VariableDeclaratorKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait VariableDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var declarations: js.Array[VariableDeclaratorKind | IdentifierKind]
  var kind: `var` | let | const
  var `type`: typings.astDashTypes.astDashTypesStrings.VariableDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.VariableDeclaration")
@js.native
object VariableDeclaration extends TopLevel[Type[VariableDeclaration]]

