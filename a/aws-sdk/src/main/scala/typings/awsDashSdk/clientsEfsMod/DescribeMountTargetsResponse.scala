package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMountTargetsResponse extends js.Object {
  /**
    * If the request included the Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEfsMod.Marker] = js.undefined
  /**
    * Returns the file system's mount targets as an array of MountTargetDescription objects.
    */
  var MountTargets: js.UndefOr[MountTargetDescriptions] = js.undefined
  /**
    * If a value is present, there are more mount targets to return. In a subsequent request, you can provide Marker in your request with this value to retrieve the next set of mount targets.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}

object DescribeMountTargetsResponse {
  @scala.inline
  def apply(Marker: Marker = null, MountTargets: MountTargetDescriptions = null, NextMarker: Marker = null): DescribeMountTargetsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MountTargets != null) __obj.updateDynamic("MountTargets")(MountTargets)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[DescribeMountTargetsResponse]
  }
}

