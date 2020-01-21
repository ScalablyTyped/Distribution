package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait MetaProperty
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var meta: IdentifierKind
  var property: IdentifierKind
  var `type`: typings.astTypes.astTypesStrings.MetaProperty
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.MetaProperty")
@js.native
object MetaProperty extends TopLevel[Type[MetaProperty]]

