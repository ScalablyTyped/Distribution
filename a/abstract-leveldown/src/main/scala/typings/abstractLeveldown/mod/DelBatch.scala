package typings.abstractLeveldown.mod

import typings.abstractLeveldown.abstractLeveldownStrings.del
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelBatch[K, V] extends AbstractBatch[K, V] {
  
  val key: K = js.native
  
  val `type`: del = js.native
}
object DelBatch {
  
  @scala.inline
  def apply[K, V](key: K, `type`: del): DelBatch[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelBatch[K, V]]
  }
  
  @scala.inline
  implicit class DelBatchOps[Self <: DelBatch[_, _], K, V] (val x: Self with (DelBatch[K, V])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: del): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
