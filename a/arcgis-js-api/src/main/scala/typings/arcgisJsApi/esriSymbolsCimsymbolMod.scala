package typings.arcgisJsApi

import typings.arcgisJsApi.esri.CIMSymbol
import typings.arcgisJsApi.esri.CIMSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsCimsymbolMod {
  
  @JSImport("esri/symbols/CIMSymbol", JSImport.Namespace)
  @js.native
  /**
    * CIMSymbols are high quality, scalable, multi-layer vector symbols for features and graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html)
    */
  open class ^ ()
    extends StObject
       with CIMSymbol {
    def this(properties: CIMSymbolProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/CIMSymbol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): CIMSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[CIMSymbol]
}
