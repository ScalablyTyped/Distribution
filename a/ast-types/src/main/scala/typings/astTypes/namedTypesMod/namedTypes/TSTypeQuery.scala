package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.TSImportTypeKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSTypeQuery
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  var exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind
  var `type`: typings.astTypes.astTypesStrings.TSTypeQuery
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeQuery")
@js.native
object TSTypeQuery extends TopLevel[Type[TSTypeQuery]]

