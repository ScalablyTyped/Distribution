package typings.angularBreadcrumb.mod.angularAugmentingMod.ui

import typings.angularBreadcrumb.AnonLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IState extends js.Object {
  var ncyBreadcrumb: js.UndefOr[AnonLabel] = js.undefined
  var ncyBreadcrumbLabel: js.UndefOr[String] = js.undefined
  var ncyBreadcrumbLink: js.UndefOr[String] = js.undefined
}

object IState {
  @scala.inline
  def apply(
    ncyBreadcrumb: AnonLabel = null,
    ncyBreadcrumbLabel: String = null,
    ncyBreadcrumbLink: String = null
  ): IState = {
    val __obj = js.Dynamic.literal()
    if (ncyBreadcrumb != null) __obj.updateDynamic("ncyBreadcrumb")(ncyBreadcrumb.asInstanceOf[js.Any])
    if (ncyBreadcrumbLabel != null) __obj.updateDynamic("ncyBreadcrumbLabel")(ncyBreadcrumbLabel.asInstanceOf[js.Any])
    if (ncyBreadcrumbLink != null) __obj.updateDynamic("ncyBreadcrumbLink")(ncyBreadcrumbLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[IState]
  }
}

