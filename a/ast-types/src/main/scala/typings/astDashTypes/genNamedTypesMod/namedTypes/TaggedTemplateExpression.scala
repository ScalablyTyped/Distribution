package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TemplateLiteralKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Expression[P]} */ trait TaggedTemplateExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var quasi: TemplateLiteralKind
  var tag: ExpressionKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TaggedTemplateExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TaggedTemplateExpression")
@js.native
object TaggedTemplateExpression extends TopLevel[Type[TaggedTemplateExpression]]

