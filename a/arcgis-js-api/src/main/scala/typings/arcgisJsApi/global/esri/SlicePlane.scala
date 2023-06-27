package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SlicePlaneProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.SlicePlane")
@js.native
/**
		 * Provides the shape definition of a slice plane for a [Slice](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html) widget or [SliceAnalysis](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SliceAnalysis.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html)
		 */
open class SlicePlane ()
  extends StObject
     with typings.arcgisJsApi.esri.SlicePlane {
  def this(properties: SlicePlaneProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object SlicePlane {
  
  @JSGlobal("__esri.SlicePlane")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.SlicePlane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.SlicePlane]
}
