package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewDhcpConfiguration extends js.Object {
  var Key: js.UndefOr[String] = js.undefined
  var Values: js.UndefOr[ValueStringList] = js.undefined
}

object NewDhcpConfiguration {
  @scala.inline
  def apply(Key: String = null, Values: ValueStringList = null): NewDhcpConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[NewDhcpConfiguration]
  }
}

