package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.CIMSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.CIMSymbol")
@js.native
/**
  * CIMSymbols are high quality, scalable, multi-layer vector symbols for features and graphics.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html)
  */
open class CIMSymbol ()
  extends StObject
     with typings.arcgisJsApi.esri.CIMSymbol {
  def this(properties: CIMSymbolProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object CIMSymbol {
  
  @JSGlobal("__esri.CIMSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.CIMSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.CIMSymbol]
}
