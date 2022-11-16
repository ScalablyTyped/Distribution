package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SearchSource
import typings.arcgisJsApi.esri.SearchSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsSearchSearchSourceMod {
  
  @JSImport("esri/widgets/Search/SearchSource", JSImport.Namespace)
  @js.native
  /**
    * The following properties define generic [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) properties for use in the [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html)
    */
  open class ^ ()
    extends StObject
       with SearchSource {
    def this(properties: SearchSourceProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/widgets/Search/SearchSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): SearchSource = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SearchSource]
}
