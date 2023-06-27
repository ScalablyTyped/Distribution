package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PointCloudClassBreaksRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PointCloudClassBreaksRenderer")
@js.native
/**
		 * This class defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html)
		 */
open class PointCloudClassBreaksRenderer ()
  extends StObject
     with typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer {
  def this(properties: PointCloudClassBreaksRendererProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object PointCloudClassBreaksRenderer {
  
  @JSGlobal("__esri.PointCloudClassBreaksRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer]
}
