package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorFieldRendererConstructor
  extends StObject
     with /**
  * The VectorFieldRenderer allows you to display your raster data with vector symbols.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html)
  */
Instantiable0[VectorFieldRenderer]
     with Instantiable1[/* properties */ VectorFieldRendererProperties, VectorFieldRenderer] {
  
  def fromJSON(json: Any): VectorFieldRenderer = js.native
}
