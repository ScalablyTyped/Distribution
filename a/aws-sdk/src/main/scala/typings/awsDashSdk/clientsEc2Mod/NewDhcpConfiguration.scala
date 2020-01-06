package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewDhcpConfiguration extends js.Object {
  var Key: js.UndefOr[String] = js.native
  var Values: js.UndefOr[ValueStringList] = js.native
}

object NewDhcpConfiguration {
  @scala.inline
  def apply(Key: String = null, Values: ValueStringList = null): NewDhcpConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDhcpConfiguration]
  }
}

