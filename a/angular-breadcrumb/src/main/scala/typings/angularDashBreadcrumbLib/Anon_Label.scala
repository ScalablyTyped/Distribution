package typings
package angularDashBreadcrumbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  /**
    * Contains the label for the step in the breadcrumb. The state name is used if not defined.
    **/
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Override the parent state (only for the breadcrumb)
    **/
  var parent: js.UndefOr[java.lang.String | angularLib.angularMod.Global.Function] = js.undefined
  /**
    * When defined to true, the state is never included in the chain of states and never appears in the breadcrumb
    **/
  var skip: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(
    label: java.lang.String = null,
    parent: java.lang.String | angularLib.angularMod.Global.Function = null,
    skip: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    __obj.asInstanceOf[Anon_Label]
  }
}

