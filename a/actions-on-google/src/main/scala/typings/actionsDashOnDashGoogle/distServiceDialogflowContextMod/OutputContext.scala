package typings.actionsDashOnDashGoogle.distServiceDialogflowContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputContext[TParameters /* <: Parameters */] extends js.Object {
  /** @public */
  var lifespan: Double
  /** @public */
  var parameters: js.UndefOr[TParameters] = js.undefined
}

object OutputContext {
  @scala.inline
  def apply[TParameters /* <: Parameters */](lifespan: Double, parameters: TParameters = null): OutputContext[TParameters] = {
    val __obj = js.Dynamic.literal(lifespan = lifespan.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputContext[TParameters]]
  }
}

