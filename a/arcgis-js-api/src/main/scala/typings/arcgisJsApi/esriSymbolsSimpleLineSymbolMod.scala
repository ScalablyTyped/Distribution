package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SimpleLineSymbol
import typings.arcgisJsApi.esri.SimpleLineSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsSimpleLineSymbolMod {
  
  @JSImport("esri/symbols/SimpleLineSymbol", JSImport.Namespace)
  @js.native
  /**
    * SimpleLineSymbol is used for rendering 2D [polyline geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html)
    */
  open class ^ ()
    extends StObject
       with SimpleLineSymbol {
    def this(properties: SimpleLineSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/SimpleLineSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): SimpleLineSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SimpleLineSymbol]
}
