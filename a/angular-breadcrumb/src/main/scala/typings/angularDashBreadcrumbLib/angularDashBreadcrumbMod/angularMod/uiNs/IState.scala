package typings
package angularDashBreadcrumbLib.angularDashBreadcrumbMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var ncyBreadcrumb: js.UndefOr[angularDashBreadcrumbLib.Anon_Label] = js.undefined
  var ncyBreadcrumbLabel: js.UndefOr[java.lang.String] = js.undefined
  var ncyBreadcrumbLink: js.UndefOr[java.lang.String] = js.undefined
}

object IState {
  @scala.inline
  def apply(
    ncyBreadcrumb: angularDashBreadcrumbLib.Anon_Label = null,
    ncyBreadcrumbLabel: java.lang.String = null,
    ncyBreadcrumbLink: java.lang.String = null
  ): IState = {
    val __obj = js.Dynamic.literal()
    if (ncyBreadcrumb != null) __obj.updateDynamic("ncyBreadcrumb")(ncyBreadcrumb)
    if (ncyBreadcrumbLabel != null) __obj.updateDynamic("ncyBreadcrumbLabel")(ncyBreadcrumbLabel)
    if (ncyBreadcrumbLink != null) __obj.updateDynamic("ncyBreadcrumbLink")(ncyBreadcrumbLink)
    __obj.asInstanceOf[IState]
  }
}

