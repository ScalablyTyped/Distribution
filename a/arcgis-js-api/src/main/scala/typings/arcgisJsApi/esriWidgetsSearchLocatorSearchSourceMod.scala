package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LocatorSearchSource
import typings.arcgisJsApi.esri.LocatorSearchSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsSearchLocatorSearchSourceMod {
  
  @JSImport("esri/widgets/Search/LocatorSearchSource", JSImport.Namespace)
  @js.native
  /**
  		 * The following properties define a [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) pointing to a [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#url) that represents a locator service, which may be used to geocode locations with a [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget instance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html)
  		 */
  open class ^ ()
    extends StObject
       with LocatorSearchSource {
    def this(properties: LocatorSearchSourceProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/widgets/Search/LocatorSearchSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): LocatorSearchSource = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[LocatorSearchSource]
}
