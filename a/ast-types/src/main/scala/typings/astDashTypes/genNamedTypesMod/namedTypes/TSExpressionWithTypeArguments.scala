package typings.astDashTypes.genNamedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.NodeKind
import typings.astDashTypes.genKindsMod.PrintableKind
import typings.astDashTypes.genKindsMod.TSHasOptionalTypeParameterInstantiationKind
import typings.astDashTypes.genKindsMod.TSQualifiedNameKind
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> ]: ast-types.ast-types/gen/namedTypes.namedTypes.TSType[P]} */ trait TSExpressionWithTypeArguments
  extends TSHasOptionalTypeParameterInstantiation
     with ASTNode
     with NodeKind
     with PrintableKind
     with TSHasOptionalTypeParameterInstantiationKind
     with TSTypeKind {
  var expression: IdentifierKind | TSQualifiedNameKind
  var `type`: typings.astDashTypes.astDashTypesStrings.TSExpressionWithTypeArguments
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSExpressionWithTypeArguments")
@js.native
object TSExpressionWithTypeArguments extends TopLevel[Type[TSExpressionWithTypeArguments]]

