package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefixList extends js.Object {
  /**
    * The IP address range of the AWS service.
    */
  var Cidrs: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The ID of the prefix.
    */
  var PrefixListId: js.UndefOr[String] = js.undefined
  /**
    * The name of the prefix.
    */
  var PrefixListName: js.UndefOr[String] = js.undefined
}

object PrefixList {
  @scala.inline
  def apply(Cidrs: ValueStringList = null, PrefixListId: String = null, PrefixListName: String = null): PrefixList = {
    val __obj = js.Dynamic.literal()
    if (Cidrs != null) __obj.updateDynamic("Cidrs")(Cidrs)
    if (PrefixListId != null) __obj.updateDynamic("PrefixListId")(PrefixListId)
    if (PrefixListName != null) __obj.updateDynamic("PrefixListName")(PrefixListName)
    __obj.asInstanceOf[PrefixList]
  }
}

