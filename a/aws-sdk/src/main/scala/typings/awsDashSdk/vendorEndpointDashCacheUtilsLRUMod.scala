package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/vendor/endpoint-cache/utils/LRU", JSImport.Namespace)
@js.native
object vendorEndpointDashCacheUtilsLRUMod extends js.Object {
  @js.native
  class LRUCache[T] protected () extends js.Object {
    def this(size: Double) = this()
    var detachFromList: js.Any = js.native
    var headerNode: js.Any = js.native
    val length: Double = js.native
    var nodeMap: js.Any = js.native
    var prependToList: js.Any = js.native
    var removeFromTail: js.Any = js.native
    var size: js.Any = js.native
    val sizeLimit: js.Any = js.native
    var tailNode: js.Any = js.native
    def empty(): Unit = js.native
    def get(key: String): js.UndefOr[T] = js.native
    def put(key: String, value: T): Unit = js.native
    def remove(key: String): Unit = js.native
  }
  
}

