package typings.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astTypes.astTypesStrings.`private`
import typings.astTypes.astTypesStrings.`protected`
import typings.astTypes.astTypesStrings.constructor
import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.public
import typings.astTypes.astTypesStrings.set
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.DecoratorKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.NoopKind
import typings.astTypes.kindsMod.NumericLiteralKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.kindsMod.TSHasOptionalTypeParametersKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Declaration[P]} */ trait TSDeclareMethod
  extends TSHasOptionalTypeParameters
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TSHasOptionalTypeParametersKind {
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var generator: js.UndefOr[Boolean] = js.undefined
  var key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind
  var kind: js.UndefOr[get | set | method | constructor] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var params: js.Array[PatternKind]
  var returnType: js.UndefOr[TSTypeAnnotationKind | NoopKind | Null] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.astTypes.astTypesStrings.TSDeclareMethod
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSDeclareMethod")
@js.native
object TSDeclareMethod extends TopLevel[Type[TSDeclareMethod]]

