package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.VectorFieldRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.VectorFieldRenderer")
@js.native
/**
		 * The VectorFieldRenderer allows you to display your raster data with vector symbols.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html)
		 */
open class VectorFieldRenderer ()
  extends StObject
     with typings.arcgisJsApi.esri.VectorFieldRenderer {
  def this(properties: VectorFieldRendererProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object VectorFieldRenderer {
  
  @JSGlobal("__esri.VectorFieldRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.VectorFieldRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.VectorFieldRenderer]
}
