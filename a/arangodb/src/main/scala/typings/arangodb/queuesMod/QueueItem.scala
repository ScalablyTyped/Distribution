package typings.arangodb.queuesMod

import typings.arangodb.Foxx.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueItem extends js.Object {
  
  var backOff: js.UndefOr[(js.Function1[/* failureCount */ Double, Double]) | Double] = js.native
  
  var maxFailures: js.UndefOr[Double] = js.native
  
  var mount: String = js.native
  
  var name: String = js.native
  
  var preprocess: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  
  var schema: js.UndefOr[Schema] = js.native
}
object QueueItem {
  
  @scala.inline
  def apply(mount: String, name: String): QueueItem = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
  
  @scala.inline
  implicit class QueueItemOps[Self <: QueueItem] (val x: Self) extends AnyVal {
    
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
    def setMount(value: String): Self = this.set("mount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackOffFunction1(value: /* failureCount */ Double => Double): Self = this.set("backOff", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBackOff(value: (js.Function1[/* failureCount */ Double, Double]) | Double): Self = this.set("backOff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackOff: Self = this.set("backOff", js.undefined)
    
    @scala.inline
    def setMaxFailures(value: Double): Self = this.set("maxFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFailures: Self = this.set("maxFailures", js.undefined)
    
    @scala.inline
    def setPreprocess(value: /* data */ js.Any => _): Self = this.set("preprocess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreprocess: Self = this.set("preprocess", js.undefined)
    
    @scala.inline
    def setSchema(value: Schema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
