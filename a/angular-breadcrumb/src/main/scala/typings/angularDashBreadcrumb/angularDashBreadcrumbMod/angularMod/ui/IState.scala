package typings.angularDashBreadcrumb.angularDashBreadcrumbMod.angularMod.ui

import typings.angularDashBreadcrumb.Anon_Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var ncyBreadcrumb: js.UndefOr[Anon_Label] = js.undefined
  var ncyBreadcrumbLabel: js.UndefOr[String] = js.undefined
  var ncyBreadcrumbLink: js.UndefOr[String] = js.undefined
}

object IState {
  @scala.inline
  def apply(
    ncyBreadcrumb: Anon_Label = null,
    ncyBreadcrumbLabel: String = null,
    ncyBreadcrumbLink: String = null
  ): IState = {
    val __obj = js.Dynamic.literal()
    if (ncyBreadcrumb != null) __obj.updateDynamic("ncyBreadcrumb")(ncyBreadcrumb)
    if (ncyBreadcrumbLabel != null) __obj.updateDynamic("ncyBreadcrumbLabel")(ncyBreadcrumbLabel)
    if (ncyBreadcrumbLink != null) __obj.updateDynamic("ncyBreadcrumbLink")(ncyBreadcrumbLink)
    __obj.asInstanceOf[IState]
  }
}

