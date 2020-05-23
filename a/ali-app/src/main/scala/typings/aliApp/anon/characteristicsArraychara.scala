package typings.aliApp.anon

import typings.aliApp.aliAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  characteristics  :std.Array<{  characteristicId  :string,   serviceId  :string,   value  :std.ArrayBuffer,   properties  :std.Array<{  read  :boolean,   write  :boolean,   notify  :boolean,   indicate  :boolean}>}>} & ali-app.my.ErrMsgResponse */
trait characteristicsArraychara extends js.Object {
  var characteristics: js.Array[Properties]
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
}

object characteristicsArraychara {
  @scala.inline
  def apply(characteristics: js.Array[Properties], errMsg: ok | String): characteristicsArraychara = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristicsArraychara]
  }
}

