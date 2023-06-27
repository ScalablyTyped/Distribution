package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterColormapRendererConstructor
  extends StObject
     with Instantiable0[RasterColormapRenderer]
     with Instantiable1[/* properties */ RasterColormapRendererProperties, RasterColormapRenderer] {
  
  /**
  		 * Creates a new instance [RasterColormapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html) from an array of color maps where pixel values with its corresponding RGB color values specified.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html#createFromColormap)
  		 */
  def createFromColormap(colormap: js.Array[js.Array[Double]]): RasterColormapRenderer = js.native
  
  def fromJSON(json: Any): RasterColormapRenderer = js.native
}
