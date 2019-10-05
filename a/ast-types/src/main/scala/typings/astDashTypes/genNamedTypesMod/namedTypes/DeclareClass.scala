package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.InterfaceDeclarationKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration[P]} */ trait DeclareClass
  extends ASTNode
     with DeclarationKind
     with InterfaceDeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var `type`: typings.astDashTypes.astDashTypesStrings.DeclareClass
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareClass")
@js.native
object DeclareClass extends TopLevel[Type[DeclareClass]]

