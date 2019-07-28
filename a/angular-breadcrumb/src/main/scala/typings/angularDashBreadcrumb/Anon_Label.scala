package typings.angularDashBreadcrumb

import typings.angular.angularMod.Global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  /**
    * Contains the label for the step in the breadcrumb. The state name is used if not defined.
    **/
  var label: js.UndefOr[String] = js.undefined
  /**
    * Override the parent state (only for the breadcrumb)
    **/
  var parent: js.UndefOr[String | Function] = js.undefined
  /**
    * When defined to true, the state is never included in the chain of states and never appears in the breadcrumb
    **/
  var skip: js.UndefOr[Boolean] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(label: String = null, parent: String | Function = null, skip: js.UndefOr[Boolean] = js.undefined): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[Anon_Label]
  }
}

