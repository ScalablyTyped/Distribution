package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TcpTimeout extends js.Object {
  var idle: js.UndefOr[Duration] = js.native
}

object TcpTimeout {
  @scala.inline
  def apply(idle: Duration = null): TcpTimeout = {
    val __obj = js.Dynamic.literal()
    if (idle != null) __obj.updateDynamic("idle")(idle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpTimeout]
  }
}

