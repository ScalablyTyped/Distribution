package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerDetails extends js.Object {
  /**
    * The identifier of the image related to a finding.
    */
  var ImageId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The name of the image related to a finding.
    */
  var ImageName: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The date and time when the container started.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The name of the container related to a finding.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}

object ContainerDetails {
  @scala.inline
  def apply(
    ImageId: NonEmptyString = null,
    ImageName: NonEmptyString = null,
    LaunchedAt: NonEmptyString = null,
    Name: NonEmptyString = null
  ): ContainerDetails = {
    val __obj = js.Dynamic.literal()
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    if (ImageName != null) __obj.updateDynamic("ImageName")(ImageName)
    if (LaunchedAt != null) __obj.updateDynamic("LaunchedAt")(LaunchedAt)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ContainerDetails]
  }
}

