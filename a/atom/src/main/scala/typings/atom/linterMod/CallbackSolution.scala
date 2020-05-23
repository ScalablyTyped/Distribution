package typings.atom.linterMod

import typings.atom.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackSolution extends js.Object {
  var position: Range
  var priority: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  // tslint:disable-next-line:no-any
  @JSName("apply")
  def apply(): js.Any
}

object CallbackSolution {
  @scala.inline
  def apply(
    apply: () => js.Any,
    position: Range,
    priority: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): CallbackSolution = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), position = position.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackSolution]
  }
}

