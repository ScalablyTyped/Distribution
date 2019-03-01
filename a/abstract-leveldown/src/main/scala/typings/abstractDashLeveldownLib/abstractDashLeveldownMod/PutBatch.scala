package typings
package abstractDashLeveldownLib.abstractDashLeveldownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBatch[K, V] extends AbstractBatch[K, V] {
  val key: K
  val `type`: abstractDashLeveldownLib.abstractDashLeveldownLibStrings.put
  val value: V
}

object PutBatch {
  @scala.inline
  def apply[K, V](key: K, `type`: abstractDashLeveldownLib.abstractDashLeveldownLibStrings.put, value: V): PutBatch[K, V] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBatch[K, V]]
  }
}

