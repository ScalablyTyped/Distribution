package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeContainerOutput extends js.Object {
  /**
    * The name of the queried container.
    */
  var Container: js.UndefOr[typings.awsDashSdk.clientsMediastoreMod.Container] = js.undefined
}

object DescribeContainerOutput {
  @scala.inline
  def apply(Container: Container = null): DescribeContainerOutput = {
    val __obj = js.Dynamic.literal()
    if (Container != null) __obj.updateDynamic("Container")(Container)
    __obj.asInstanceOf[DescribeContainerOutput]
  }
}

