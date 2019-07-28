package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEnvironmentsResult extends js.Object {
  /**
    * Information about the environments that are returned.
    */
  var environments: js.UndefOr[EnvironmentList] = js.undefined
}

object DescribeEnvironmentsResult {
  @scala.inline
  def apply(environments: EnvironmentList = null): DescribeEnvironmentsResult = {
    val __obj = js.Dynamic.literal()
    if (environments != null) __obj.updateDynamic("environments")(environments)
    __obj.asInstanceOf[DescribeEnvironmentsResult]
  }
}

