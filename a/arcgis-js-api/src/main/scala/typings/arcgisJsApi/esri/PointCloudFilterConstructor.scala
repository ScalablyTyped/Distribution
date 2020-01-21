package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudFilterConstructor
  extends /**
  * Point cloud filters are used to hide points that do not satisfy the filter criteria.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html)
  */
Instantiable0[PointCloudFilter]
     with Instantiable1[/* properties */ PointCloudFilterProperties, PointCloudFilter] {
  def fromJSON(json: js.Any): PointCloudFilter = js.native
}

