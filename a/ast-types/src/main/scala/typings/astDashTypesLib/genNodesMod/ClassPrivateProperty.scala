package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ast-types.ast-types/gen/nodes.ClassProperty, 'type' | 'key' | 'value'> ]: ast-types.ast-types/gen/nodes.ClassProperty[P]} */ trait ClassPrivateProperty
  extends ASTNode
     with astDashTypesLib.genKindsMod.ClassPropertyKind
     with astDashTypesLib.genKindsMod.DeclarationKind
     with astDashTypesLib.genKindsMod.NodeKind
     with astDashTypesLib.genKindsMod.PrintableKind
     with astDashTypesLib.genKindsMod.StatementKind {
  var key: astDashTypesLib.genKindsMod.PrivateNameKind
  var `type`: astDashTypesLib.astDashTypesLibStrings.ClassPrivateProperty
  var value: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
}

object ClassPrivateProperty {
  @scala.inline
  def apply(
    key: astDashTypesLib.genKindsMod.PrivateNameKind,
    `type`: astDashTypesLib.astDashTypesLibStrings.ClassPrivateProperty,
    value: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): ClassPrivateProperty = {
    val __obj = js.Dynamic.literal(key = key)
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ClassPrivateProperty]
  }
}

