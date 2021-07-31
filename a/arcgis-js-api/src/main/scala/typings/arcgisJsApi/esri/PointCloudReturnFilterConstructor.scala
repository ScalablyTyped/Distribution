package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudReturnFilterConstructor
  extends StObject
     with /**
  * Laser pulses emitted from a lidar system can have several returns depending on the surfaces that they encounter.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html)
  */
Instantiable0[PointCloudReturnFilter]
     with Instantiable1[/* properties */ PointCloudReturnFilterProperties, PointCloudReturnFilter] {
  
  def fromJSON(json: js.Any): PointCloudReturnFilter = js.native
}
