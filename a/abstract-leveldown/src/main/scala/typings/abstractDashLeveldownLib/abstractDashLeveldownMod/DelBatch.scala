package typings
package abstractDashLeveldownLib.abstractDashLeveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelBatch[K, V] extends AbstractBatch[K, V] {
  val key: K
  val `type`: abstractDashLeveldownLib.abstractDashLeveldownLibStrings.del
}

object DelBatch {
  @scala.inline
  def apply[K, V](key: K, `type`: abstractDashLeveldownLib.abstractDashLeveldownLibStrings.del): DelBatch[K, V] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelBatch[K, V]]
  }
}

