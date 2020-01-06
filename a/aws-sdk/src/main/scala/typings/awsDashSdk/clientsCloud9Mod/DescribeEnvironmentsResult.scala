package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentsResult extends js.Object {
  /**
    * Information about the environments that are returned.
    */
  var environments: js.UndefOr[EnvironmentList] = js.native
}

object DescribeEnvironmentsResult {
  @scala.inline
  def apply(environments: EnvironmentList = null): DescribeEnvironmentsResult = {
    val __obj = js.Dynamic.literal()
    if (environments != null) __obj.updateDynamic("environments")(environments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentsResult]
  }
}

