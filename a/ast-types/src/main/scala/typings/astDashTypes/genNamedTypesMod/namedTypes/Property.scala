package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.astDashTypesStrings.get
import typings.astDashTypes.astDashTypesStrings.init
import typings.astDashTypes.astDashTypesStrings.set
import typings.astDashTypes.genKindsMod.DecoratorKind
import typings.astDashTypes.genKindsMod.ExpressionKind
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
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait Property
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var kind: init | get | set
  var method: js.UndefOr[Boolean] = js.undefined
  var shorthand: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.Property
  var value: ExpressionKind | PatternKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Property")
@js.native
object Property extends TopLevel[Type[Property]]

