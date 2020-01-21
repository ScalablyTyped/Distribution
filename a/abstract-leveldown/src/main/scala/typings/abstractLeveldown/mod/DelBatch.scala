package typings.abstractLeveldown.mod

import typings.abstractLeveldown.abstractLeveldownStrings.del
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelBatch[K, V] extends AbstractBatch[K, V] {
  val key: K
  val `type`: del
}

object DelBatch {
  @scala.inline
  def apply[K, V](key: K, `type`: del): DelBatch[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelBatch[K, V]]
  }
}

