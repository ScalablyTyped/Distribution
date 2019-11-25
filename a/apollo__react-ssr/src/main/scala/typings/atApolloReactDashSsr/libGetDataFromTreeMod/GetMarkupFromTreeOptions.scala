package typings.atApolloReactDashSsr.libGetDataFromTreeMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMarkupFromTreeOptions extends js.Object {
  var context: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var renderFunction: js.UndefOr[js.Function1[/* tree */ ReactElement, String]] = js.undefined
  var tree: ReactNode
}

object GetMarkupFromTreeOptions {
  @scala.inline
  def apply(
    context: StringDictionary[js.Any] = null,
    renderFunction: /* tree */ ReactElement => String = null,
    tree: ReactNode = null
  ): GetMarkupFromTreeOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (renderFunction != null) __obj.updateDynamic("renderFunction")(js.Any.fromFunction1(renderFunction))
    if (tree != null) __obj.updateDynamic("tree")(tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMarkupFromTreeOptions]
  }
}

