package typings.antDesignPro.anon

import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Href extends js.Object {
  var href: js.UndefOr[LocationDescriptor[LocationState]] = js.undefined
  var innerRef: js.UndefOr[js.Function1[/* node */ HTMLAnchorElement | Null, Unit]] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var to: LocationDescriptor[LocationState]
}

object Href {
  @scala.inline
  def apply(
    to: LocationDescriptor[LocationState],
    href: LocationDescriptor[LocationState] = null,
    innerRef: /* node */ HTMLAnchorElement | Null => Unit = null,
    replace: js.UndefOr[Boolean] = js.undefined
  ): Href = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1(innerRef))
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
}

