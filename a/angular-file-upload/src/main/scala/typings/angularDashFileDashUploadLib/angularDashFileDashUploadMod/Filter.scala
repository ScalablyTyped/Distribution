package typings
package angularDashFileDashUploadLib.angularDashFileDashUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var fn: SyncFilter | AsyncFilter
  var name: java.lang.String
}

object Filter {
  @scala.inline
  def apply(fn: SyncFilter | AsyncFilter, name: java.lang.String): Filter = {
    val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[Filter]
  }
}

