package typings.angular.mod

import typings.angular.JQLite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirectivePrePost[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends js.Object {
  var post: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.native
  var pre: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.native
}

object IDirectivePrePost {
  @scala.inline
  def apply[/* <: typings.angular.mod.IScope */ TScope, /* <: typings.angular.JQLite */ TElement, /* <: typings.angular.mod.IAttributes */ TAttributes, /* <: typings.angular.mod.IDirectiveController */ TController](): IDirectivePrePost[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectivePrePost[TScope, TElement, TAttributes, TController]]
  }
  @scala.inline
  implicit class IDirectivePrePostOps[Self <: IDirectivePrePost[_, _, _, _], /* <: typings.angular.mod.IScope */ TScope, /* <: typings.angular.JQLite */ TElement, /* <: typings.angular.mod.IAttributes */ TAttributes, /* <: typings.angular.mod.IDirectiveController */ TController] (val x: Self with (IDirectivePrePost[TScope, TElement, TAttributes, TController])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPost(
      value: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = this.set("post", js.Any.fromFunction5(value))
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    @scala.inline
    def setPre(
      value: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Unit
    ): Self = this.set("pre", js.Any.fromFunction5(value))
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
  }
  
}

