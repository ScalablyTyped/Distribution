package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.OpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.IBaseObject {
  var removed: js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.Object]
  def added(): js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.Object]
}

object Relation {
  @scala.inline
  def apply(
    added: () => js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.Object],
    removed: js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.Object],
    toJSON: () => js.Any
  ): Relation = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), removed = removed, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Relation]
  }
}

