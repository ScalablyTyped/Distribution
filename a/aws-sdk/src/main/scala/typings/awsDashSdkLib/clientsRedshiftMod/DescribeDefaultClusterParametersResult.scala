package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDefaultClusterParametersResult extends js.Object {
  var DefaultClusterParameters: js.UndefOr[DefaultClusterParameters] = js.undefined
}

object DescribeDefaultClusterParametersResult {
  @scala.inline
  def apply(DefaultClusterParameters: DefaultClusterParameters = null): DescribeDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    if (DefaultClusterParameters != null) __obj.updateDynamic("DefaultClusterParameters")(DefaultClusterParameters)
    __obj.asInstanceOf[DescribeDefaultClusterParametersResult]
  }
}

