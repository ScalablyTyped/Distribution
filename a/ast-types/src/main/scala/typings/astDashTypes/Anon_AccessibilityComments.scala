package typings.astDashTypes

import typings.astDashTypes.astDashTypesStrings.`private`
import typings.astDashTypes.astDashTypesStrings.`protected`
import typings.astDashTypes.astDashTypesStrings.public
import typings.astDashTypes.genKindsMod.AssignmentPatternKind
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessibilityComments extends js.Object {
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var parameter: IdentifierKind | AssignmentPatternKind
  var readonly: js.UndefOr[Boolean] = js.undefined
}

object Anon_AccessibilityComments {
  @scala.inline
  def apply(
    parameter: IdentifierKind | AssignmentPatternKind,
    accessibility: public | `private` | `protected` = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    readonly: js.UndefOr[Boolean] = js.undefined
  ): Anon_AccessibilityComments = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly)
    __obj.asInstanceOf[Anon_AccessibilityComments]
  }
}

