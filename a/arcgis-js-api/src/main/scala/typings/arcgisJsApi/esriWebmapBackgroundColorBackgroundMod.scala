package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ColorBackground
import typings.arcgisJsApi.esri.ColorBackgroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWebmapBackgroundColorBackgroundMod {
  
  @JSImport("esri/webmap/background/ColorBackground", JSImport.Namespace)
  @js.native
  /**
  		 * Represents the background color of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) when displayed in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-background-ColorBackground.html)
  		 */
  open class ^ ()
    extends StObject
       with ColorBackground {
    def this(properties: ColorBackgroundProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/webmap/background/ColorBackground", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ColorBackground = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ColorBackground]
}
