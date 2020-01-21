package typings.asana.mod.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var opt_expand: js.UndefOr[String] = js.undefined
  var opt_fields: js.UndefOr[String] = js.undefined
}

object Params {
  @scala.inline
  def apply(opt_expand: String = null, opt_fields: String = null): Params = {
    val __obj = js.Dynamic.literal()
    if (opt_expand != null) __obj.updateDynamic("opt_expand")(opt_expand.asInstanceOf[js.Any])
    if (opt_fields != null) __obj.updateDynamic("opt_fields")(opt_fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

