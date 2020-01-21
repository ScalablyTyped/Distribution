package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.astTypesStrings.`private`
import typings.astTypes.astTypesStrings.`protected`
import typings.astTypes.astTypesStrings.constructor
import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.public
import typings.astTypes.astTypesStrings.set
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.DecoratorKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.FunctionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'body'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]} */ trait ClassMethod
  extends ASTNode
     with DeclarationKind
     with FunctionKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var `abstract`: js.UndefOr[Boolean | Null] = js.undefined
  var access: js.UndefOr[public | `private` | `protected` | Null] = js.undefined
  var accessibility: js.UndefOr[public | `private` | `protected` | Null] = js.undefined
  var body: BlockStatementKind
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var kind: js.UndefOr[get | set | method | constructor] = js.undefined
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  var static: js.UndefOr[Boolean | Null] = js.undefined
  var `type`: typings.astTypes.astTypesStrings.ClassMethod
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassMethod")
@js.native
object ClassMethod extends TopLevel[Type[ClassMethod]]

