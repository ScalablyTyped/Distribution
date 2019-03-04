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
    added: js.Function0[js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object]],
    removed: js.Array[avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.Object],
    toJSON: js.Function0[js.Any]
  ): Relation = {
    val __obj = js.Dynamic.literal(added = added, removed = removed, toJSON = toJSON)
  
    __obj.asInstanceOf[Relation]
  }
}

