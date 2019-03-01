package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[
    js.Array[
      astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
    ]
  ] = js.undefined
  var closingElement: astDashTypesLib.genKindsMod.JSXClosingFragmentKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var openingElement: astDashTypesLib.genKindsMod.JSXOpeningFragmentKind
}

object Anon_Children {
  @scala.inline
  def apply(
    closingElement: astDashTypesLib.genKindsMod.JSXClosingFragmentKind,
    openingElement: astDashTypesLib.genKindsMod.JSXOpeningFragmentKind,
    children: js.Array[
      astDashTypesLib.genKindsMod.JSXElementKind | astDashTypesLib.genKindsMod.JSXExpressionContainerKind | astDashTypesLib.genKindsMod.JSXFragmentKind | astDashTypesLib.genKindsMod.JSXTextKind | astDashTypesLib.genKindsMod.LiteralKind
    ] = null,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closingElement")(closingElement)
    __obj.updateDynamic("openingElement")(openingElement)
    if (children != null) __obj.updateDynamic("children")(children)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_Children]
  }
}

