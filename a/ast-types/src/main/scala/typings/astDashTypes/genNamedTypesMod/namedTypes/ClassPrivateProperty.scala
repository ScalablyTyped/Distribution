package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ClassPropertyKind
import typings.astDashTypes.genKindsMod.DeclarationKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.PrivateNameKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.libTypesMod.Type
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
  var `type`: typings.astDashTypes.astDashTypesStrings.ClassPrivateProperty
  var value: js.UndefOr[ExpressionKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassPrivateProperty")
@js.native
object ClassPrivateProperty extends TopLevel[Type[ClassPrivateProperty]]

