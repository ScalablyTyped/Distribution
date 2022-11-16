package typings.arcgisJsApi

import typings.arcgisJsApi.esri.WebStyleSymbol
import typings.arcgisJsApi.esri.WebStyleSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsWebStyleSymbolMod {
  
  @JSImport("esri/symbols/WebStyleSymbol", JSImport.Namespace)
  @js.native
  /**
    * WebStyleSymbol is a class used to conveniently create vector 2D symbols and realistic and thematic 3D symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html)
    */
  open class ^ ()
    extends StObject
       with WebStyleSymbol {
    def this(properties: WebStyleSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/WebStyleSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): WebStyleSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[WebStyleSymbol]
}
