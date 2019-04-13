package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectivePrePost[TScope /* <: IScope */, TElement /* <: angularLib.JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends js.Object {
  var post: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.undefined
  var pre: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.undefined
}

object IDirectivePrePost {
  @scala.inline
  def apply[TScope /* <: IScope */, TElement /* <: angularLib.JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](
    post: IDirectiveLinkFn[TScope, TElement, TAttributes, TController] = null,
    pre: IDirectiveLinkFn[TScope, TElement, TAttributes, TController] = null
  ): IDirectivePrePost[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    if (post != null) __obj.updateDynamic("post")(post)
    if (pre != null) __obj.updateDynamic("pre")(pre)
    __obj.asInstanceOf[IDirectivePrePost[TScope, TElement, TAttributes, TController]]
  }
}

