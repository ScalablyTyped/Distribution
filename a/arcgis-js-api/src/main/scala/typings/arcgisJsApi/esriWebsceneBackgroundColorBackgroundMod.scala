package typings.arcgisJsApi

import typings.arcgisJsApi.esri.backgroundColorBackground
import typings.arcgisJsApi.esri.backgroundColorBackgroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWebsceneBackgroundColorBackgroundMod {
  
  @JSImport("esri/webscene/background/ColorBackground", JSImport.Namespace)
  @js.native
  /**
  		 * This type of [Background](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-Background.html) allows to set a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) as the background of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html)
  		 */
  open class ^ ()
    extends StObject
       with backgroundColorBackground {
    def this(properties: backgroundColorBackgroundProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/webscene/background/ColorBackground", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): backgroundColorBackground = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[backgroundColorBackground]
}
