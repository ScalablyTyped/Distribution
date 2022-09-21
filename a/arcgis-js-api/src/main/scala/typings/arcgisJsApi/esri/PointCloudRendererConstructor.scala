package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudRendererConstructor
  extends StObject
     with /**
  * A PointCloudRenderer allows you to specify how points in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) are rendered.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html)
  */
Instantiable0[PointCloudRenderer]
     with Instantiable1[/* properties */ PointCloudRendererProperties, PointCloudRenderer] {
  
  def fromJSON(json: Any): PointCloudRenderer = js.native
}
