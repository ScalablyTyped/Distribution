package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.OpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.IBaseObject {
  var removed: js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object]
  def added(): js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object]
}

object Relation {
  @scala.inline
  def apply(
    added: () => js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object],
    removed: js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object],
    toJSON: () => js.Any
  ): Relation = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), removed = removed, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Relation]
  }
}

