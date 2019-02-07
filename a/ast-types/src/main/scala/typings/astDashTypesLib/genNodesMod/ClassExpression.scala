package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.Expression, 'type'> ]: ast-types.ast-types/gen/nodes.Expression[P]} */ trait ClassExpression extends js.Object {
  var body: astDashTypesLib.genKindsMod.ClassBodyKind
  var id: astDashTypesLib.genKindsMod.IdentifierKind | scala.Null
  var implements: js.Array[astDashTypesLib.genKindsMod.ClassImplementsKind] | js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind]
  var superClass: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var superTypeParameters: astDashTypesLib.genKindsMod.TypeParameterInstantiationKind | astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind | scala.Null
  var `type`: astDashTypesLib.astDashTypesLibStrings.ClassExpression
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null
}

