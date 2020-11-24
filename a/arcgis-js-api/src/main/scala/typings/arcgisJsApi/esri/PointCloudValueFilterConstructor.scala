package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudValueFilterConstructor
  extends /**
  * Every lidar point can have a classification that defines the type of surface that reflected the laser pulse.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html)
  */
Instantiable0[PointCloudValueFilter]
     with Instantiable1[/* properties */ PointCloudValueFilterProperties, PointCloudValueFilter] {
  
  def fromJSON(json: js.Any): PointCloudValueFilter = js.native
}
