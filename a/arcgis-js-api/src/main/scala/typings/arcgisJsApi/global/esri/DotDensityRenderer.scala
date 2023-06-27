package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DotDensityRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DotDensityRenderer")
@js.native
/**
		 * DotDensityRenderer allows you to create dot density visualizations for polygon layers.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html)
		 */
open class DotDensityRenderer ()
  extends StObject
     with typings.arcgisJsApi.esri.DotDensityRenderer {
  def this(properties: DotDensityRendererProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object DotDensityRenderer {
  
  @JSGlobal("__esri.DotDensityRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.DotDensityRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DotDensityRenderer]
}
