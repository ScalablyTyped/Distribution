package typings.amapDashJsDashApi.AMap.LabelsLayer

import typings.amapDashJsDashApi.Anon_Icon
import typings.amapDashJsDashApi.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var data: Anon_Id
  var opts: Anon_Icon
}

object EventData {
  @scala.inline
  def apply(data: Anon_Id, opts: Anon_Icon): EventData = {
    val __obj = js.Dynamic.literal(data = data, opts = opts)
  
    __obj.asInstanceOf[EventData]
  }
}

