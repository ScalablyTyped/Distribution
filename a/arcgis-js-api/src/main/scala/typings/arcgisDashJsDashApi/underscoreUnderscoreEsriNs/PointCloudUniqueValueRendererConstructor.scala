package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudUniqueValueRendererConstructor
  extends /**
  * PointCloudUniqueValueRenderer allows you to colorize points in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on an attribute value. This is done by assigning unique colors to represent points with equal attribute values. This renderer is used to visualize points of the same type, not interpolate colors along a continuous ramp mapped to numbers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html)
  */
Instantiable0[PointCloudUniqueValueRenderer]
     with Instantiable1[
      /* properties */ PointCloudUniqueValueRendererProperties, 
      PointCloudUniqueValueRenderer
    ] {
  def fromJSON(json: js.Any): PointCloudUniqueValueRenderer = js.native
}

