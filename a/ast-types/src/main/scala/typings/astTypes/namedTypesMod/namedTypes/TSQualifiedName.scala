package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait TSQualifiedName
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var left: IdentifierKind | TSQualifiedNameKind
  var right: IdentifierKind | TSQualifiedNameKind
  var `type`: typings.astTypes.astTypesStrings.TSQualifiedName
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSQualifiedName")
@js.native
object TSQualifiedName extends TopLevel[Type[TSQualifiedName]]

