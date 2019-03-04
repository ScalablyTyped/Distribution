package typings
package atAngularCommonLib.srcPipesKeyvalueUnderscorePipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValue[K, V] extends js.Object {
  var key: K
  var value: V
}

object KeyValue {
  @scala.inline
  def apply[K, V](key: K, value: V): KeyValue[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyValue[K, V]]
  }
}

