package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TextSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TextSymbol3DLayer")
@js.native
/**
		 * TextSymbol3DLayer is used to draw text labels for features of any geometry type.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html)
		 */
open class TextSymbol3DLayer ()
  extends StObject
     with typings.arcgisJsApi.esri.TextSymbol3DLayer {
  def this(properties: TextSymbol3DLayerProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object TextSymbol3DLayer {
  
  @JSGlobal("__esri.TextSymbol3DLayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.TextSymbol3DLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.TextSymbol3DLayer]
}
