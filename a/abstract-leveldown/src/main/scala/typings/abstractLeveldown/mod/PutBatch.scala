package typings.abstractLeveldown.mod

import typings.abstractLeveldown.abstractLeveldownStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBatch[K, V] extends AbstractBatch[K, V] {
  val key: K
  val `type`: put
  val value: V
}

object PutBatch {
  @scala.inline
  def apply[K, V](key: K, `type`: put, value: V): PutBatch[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBatch[K, V]]
  }
}

