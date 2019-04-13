package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainInfo extends js.Object {
  /**
    *  Specifies the DomainName.
    */
  var DomainName: js.UndefOr[DomainName] = js.undefined
}

object DomainInfo {
  @scala.inline
  def apply(DomainName: DomainName = null): DomainInfo = {
    val __obj = js.Dynamic.literal()
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    __obj.asInstanceOf[DomainInfo]
  }
}

