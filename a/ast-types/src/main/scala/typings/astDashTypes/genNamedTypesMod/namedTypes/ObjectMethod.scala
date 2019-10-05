package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.get
import typings.astDashTypes.astDashTypesStrings.method
import typings.astDashTypes.astDashTypesStrings.set
import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.DecoratorKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.FunctionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]}
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'params' | 'body' | 'generator' | 'async'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Function[P]} */ trait ObjectMethod
  extends ASTNode
     with FunctionKind
     with NodeKind
     with PrintableKind {
  var accessibility: js.UndefOr[LiteralKind | Null] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var body: BlockStatementKind
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var generator: js.UndefOr[Boolean] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var kind: method | get | set
  var params: js.Array[PatternKind]
  var `type`: typings.astDashTypes.astDashTypesStrings.ObjectMethod
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectMethod")
@js.native
object ObjectMethod extends TopLevel[Type[ObjectMethod]]

