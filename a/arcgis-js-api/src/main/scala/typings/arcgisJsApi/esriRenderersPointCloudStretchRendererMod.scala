package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PointCloudStretchRenderer
import typings.arcgisJsApi.esri.PointCloudStretchRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersPointCloudStretchRendererMod {
  
  @JSImport("esri/renderers/PointCloudStretchRenderer", JSImport.Namespace)
  @js.native
  /**
  		 * PointCloudStretchRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html)
  		 */
  open class ^ ()
    extends StObject
       with PointCloudStretchRenderer {
    def this(properties: PointCloudStretchRendererProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/PointCloudStretchRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): PointCloudStretchRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PointCloudStretchRenderer]
}
