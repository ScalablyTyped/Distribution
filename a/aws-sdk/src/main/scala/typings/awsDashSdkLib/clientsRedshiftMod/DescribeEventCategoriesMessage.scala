package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventCategoriesMessage extends js.Object {
  /**
    * The source type, such as cluster or parameter group, to which the described event categories apply. Valid values: cluster, cluster-snapshot, cluster-parameter-group, and cluster-security-group.
    */
  var SourceType: js.UndefOr[String] = js.undefined
}

object DescribeEventCategoriesMessage {
  @scala.inline
  def apply(SourceType: String = null): DescribeEventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType)
    __obj.asInstanceOf[DescribeEventCategoriesMessage]
  }
}

