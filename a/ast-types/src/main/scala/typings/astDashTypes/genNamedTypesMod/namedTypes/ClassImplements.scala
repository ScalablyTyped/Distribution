package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TypeParameterInstantiationKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.Node[P]} */ trait ClassImplements
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var id: IdentifierKind
  var superClass: js.UndefOr[ExpressionKind | Null] = js.undefined
  var `type`: typings.astDashTypes.astDashTypesStrings.ClassImplements
  var typeParameters: js.UndefOr[TypeParameterInstantiationKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassImplements")
@js.native
object ClassImplements extends TopLevel[Type[ClassImplements]]

