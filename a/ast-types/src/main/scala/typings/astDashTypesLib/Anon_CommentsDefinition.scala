package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsDefinition extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var definition: astDashTypesLib.genKindsMod.MethodDefinitionKind | astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.ClassPropertyDefinitionKind | astDashTypesLib.genKindsMod.ClassPropertyKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_CommentsDefinition {
  @scala.inline
  def apply(
    definition: astDashTypesLib.genKindsMod.MethodDefinitionKind | astDashTypesLib.genKindsMod.VariableDeclaratorKind | astDashTypesLib.genKindsMod.ClassPropertyDefinitionKind | astDashTypesLib.genKindsMod.ClassPropertyKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsDefinition]
  }
}

