package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessibilityComments extends js.Object {
  var accessibility: js.UndefOr[
    astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected`
  ] = js.undefined
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var parameter: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.AssignmentPatternKind
  var readonly: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AccessibilityComments {
  @scala.inline
  def apply(
    parameter: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.AssignmentPatternKind,
    accessibility: astDashTypesLib.astDashTypesLibStrings.public | astDashTypesLib.astDashTypesLibStrings.`private` | astDashTypesLib.astDashTypesLibStrings.`protected` = null,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    readonly: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AccessibilityComments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    __obj.asInstanceOf[Anon_AccessibilityComments]
  }
}

