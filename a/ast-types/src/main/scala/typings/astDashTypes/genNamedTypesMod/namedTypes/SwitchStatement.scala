package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.SwitchCaseKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Statement[P]} */ trait SwitchStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var cases: js.Array[SwitchCaseKind]
  var discriminant: ExpressionKind
  var lexical: js.UndefOr[Boolean] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.SwitchStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.SwitchStatement")
@js.native
object SwitchStatement extends TopLevel[Type[SwitchStatement]]

