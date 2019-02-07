package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.MemberExpression, 'type' | 'object' | 'property' | 'computed'> ]: ast-types.ast-types/gen/nodes.MemberExpression[P]} */ trait JSXMemberExpression extends js.Object {
  var computed: scala.Boolean
  var `object`: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind
  var property: astDashTypesLib.genKindsMod.JSXIdentifierKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.JSXMemberExpression
}

