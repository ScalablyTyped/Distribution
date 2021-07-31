package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudClassBreaksRendererConstructor
  extends StObject
     with /**
  * This class defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html)
  */
Instantiable0[PointCloudClassBreaksRenderer]
     with Instantiable1[
      /* properties */ PointCloudClassBreaksRendererProperties, 
      PointCloudClassBreaksRenderer
    ] {
  
  def fromJSON(json: js.Any): PointCloudClassBreaksRenderer = js.native
}
