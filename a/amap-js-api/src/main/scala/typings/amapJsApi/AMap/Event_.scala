package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  type  :N} & V extends std.HTMLElement ? {  value  :V} : V extends object ? V : V extends undefined ? {} : {  value  :V} */
trait Event_[N /* <: String */, V] extends js.Object {
  var `type`: N
  var value: V
}

object Event_ {
  @scala.inline
  def apply[N /* <: String */, V](`type`: N, value: V): Event_[N, V] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event_[N, V]]
  }
}

