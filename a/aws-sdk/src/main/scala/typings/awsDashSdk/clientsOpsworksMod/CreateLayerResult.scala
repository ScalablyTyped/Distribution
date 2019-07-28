package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLayerResult extends js.Object {
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.undefined
}

object CreateLayerResult {
  @scala.inline
  def apply(LayerId: String = null): CreateLayerResult = {
    val __obj = js.Dynamic.literal()
    if (LayerId != null) __obj.updateDynamic("LayerId")(LayerId)
    __obj.asInstanceOf[CreateLayerResult]
  }
}

