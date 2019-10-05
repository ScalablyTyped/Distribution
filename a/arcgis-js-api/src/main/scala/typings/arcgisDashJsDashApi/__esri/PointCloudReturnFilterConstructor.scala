package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudReturnFilterConstructor
  extends /**
  * Laser pulses emitted from a lidar system can have several returns depending on the surfaces that they encounter. The return number is stored within each point in the `RETURNS` field. For example, the first return is associated with the highest point in the landscape. In some cases the laser pulse returns only one point representing the ground.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html)
  */
Instantiable0[PointCloudReturnFilter]
     with Instantiable1[/* properties */ PointCloudReturnFilterProperties, PointCloudReturnFilter] {
  def fromJSON(json: js.Any): PointCloudReturnFilter = js.native
}

