package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPRange extends js.Object {
  /**
    * The IP range in Classless Inter-Domain Routing (CIDR) notation.
    */
  var CIDRIP: js.UndefOr[String] = js.undefined
  /**
    * The status of the IP range, for example, "authorized".
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The list of tags for the IP range.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object IPRange {
  @scala.inline
  def apply(CIDRIP: String = null, Status: String = null, Tags: TagList = null): IPRange = {
    val __obj = js.Dynamic.literal()
    if (CIDRIP != null) __obj.updateDynamic("CIDRIP")(CIDRIP)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[IPRange]
  }
}

