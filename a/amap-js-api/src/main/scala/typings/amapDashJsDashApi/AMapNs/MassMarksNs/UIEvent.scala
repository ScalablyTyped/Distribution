package typings.amapDashJsDashApi.AMapNs.MassMarksNs

import typings.amapDashJsDashApi.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined amap-js-api.AMap.Event<N, {  target  :I,   data  :I extends amap-js-api.AMap.MassMarks<infer D> ? D : amap-js-api.AMap.MassMarks.Data}> */
trait UIEvent[N /* <: String */, I] extends js.Object {
  var `type`: N
  var value: Anon_Data[I]
}

object UIEvent {
  @scala.inline
  def apply[N /* <: String */, I](`type`: N, value: Anon_Data[I]): UIEvent[N, I] = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIEvent[N, I]]
  }
}

