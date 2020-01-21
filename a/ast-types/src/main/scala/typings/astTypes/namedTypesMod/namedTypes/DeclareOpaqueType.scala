package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.TypeAliasKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TypeAlias, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TypeAlias[P]} */ trait DeclareOpaqueType
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TypeAliasKind {
  var `type`: typings.astTypes.astTypesStrings.DeclareOpaqueType
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareOpaqueType")
@js.native
object DeclareOpaqueType extends TopLevel[Type[DeclareOpaqueType]]

