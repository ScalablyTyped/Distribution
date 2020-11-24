package typings.abstractLeveldown.mod

import typings.abstractLeveldown.abstractLeveldownStrings.del
import typings.abstractLeveldown.abstractLeveldownStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.abstractLeveldown.mod.PutBatch[K, V]
  - typings.abstractLeveldown.mod.DelBatch[K, V]
*/
trait AbstractBatch[K, V] extends js.Object
object AbstractBatch {
  
  @scala.inline
  def PutBatch[K, V](key: K, `type`: put, value: V): AbstractBatch[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractBatch[K, V]]
  }
  
  @scala.inline
  def DelBatch[K, V](key: K, `type`: del): AbstractBatch[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractBatch[K, V]]
  }
}
