package typings.awsDashSdk.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeContainerInput extends js.Object {
  /**
    * The name of the container to query.
    */
  var ContainerName: js.UndefOr[typings.awsDashSdk.clientsMediastoreMod.ContainerName] = js.undefined
}

object DescribeContainerInput {
  @scala.inline
  def apply(ContainerName: ContainerName = null): DescribeContainerInput = {
    val __obj = js.Dynamic.literal()
    if (ContainerName != null) __obj.updateDynamic("ContainerName")(ContainerName)
    __obj.asInstanceOf[DescribeContainerInput]
  }
}

