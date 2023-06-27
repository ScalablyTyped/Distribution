package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.IconSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.IconSymbol3DLayer")
@js.native
/**
		 * IconSymbol3DLayer is used to render [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries using a flat 2D icon (e.g.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)
		 */
open class IconSymbol3DLayer ()
  extends StObject
     with typings.arcgisJsApi.esri.IconSymbol3DLayer {
  def this(properties: IconSymbol3DLayerProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object IconSymbol3DLayer {
  
  @JSGlobal("__esri.IconSymbol3DLayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.IconSymbol3DLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.IconSymbol3DLayer]
}
