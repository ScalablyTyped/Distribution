package typings.avoscloudDashSdk.avoscloudDashSdkMod.OpNs

import typings.avoscloudDashSdk.avoscloudDashSdkMod.IBaseObject
import typings.avoscloudDashSdk.avoscloudDashSdkMod.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relation extends IBaseObject {
  var removed: js.Array[Object]
  def added(): js.Array[Object]
}

object Relation {
  @scala.inline
  def apply(added: () => js.Array[Object], removed: js.Array[Object], toJSON: () => js.Any): Relation = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), removed = removed, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[Relation]
  }
}

