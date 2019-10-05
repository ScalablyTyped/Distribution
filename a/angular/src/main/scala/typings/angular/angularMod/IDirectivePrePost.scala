package typings.angular.angularMod

import typings.angular.JQLite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectivePrePost[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends js.Object {
  var post: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.undefined
  var pre: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.undefined
}

object IDirectivePrePost {
  @scala.inline
  def apply[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](
    post: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit = null,
    pre: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit = null
  ): IDirectivePrePost[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction5(post))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction5(pre))
    __obj.asInstanceOf[IDirectivePrePost[TScope, TElement, TAttributes, TController]]
  }
}

