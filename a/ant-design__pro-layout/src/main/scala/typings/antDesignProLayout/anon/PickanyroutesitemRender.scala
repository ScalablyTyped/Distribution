package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any, 'routes' | 'itemRender'> */
trait PickanyroutesitemRender extends js.Object {
  var itemRender: js.UndefOr[js.Any] = js.undefined
  var routes: js.UndefOr[js.Any] = js.undefined
}

object PickanyroutesitemRender {
  @scala.inline
  def apply(itemRender: js.Any = null, routes: js.Any = null): PickanyroutesitemRender = {
    val __obj = js.Dynamic.literal()
    if (itemRender != null) __obj.updateDynamic("itemRender")(itemRender.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickanyroutesitemRender]
  }
}

