package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.kindsMod.ClassPropertyKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.PrivateNameKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.ClassProperty, 'type' | 'key' | 'value'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.ClassProperty[P]} */ trait ClassPrivateProperty
  extends ASTNode
     with ClassPropertyKind
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var key: PrivateNameKind
  var `type`: typings.astTypes.astTypesStrings.ClassPrivateProperty
  var value: js.UndefOr[ExpressionKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassPrivateProperty")
@js.native
object ClassPrivateProperty extends TopLevel[Type[ClassPrivateProperty]]

