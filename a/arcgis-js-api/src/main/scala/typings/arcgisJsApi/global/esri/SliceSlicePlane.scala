package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SliceSlicePlaneProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.SliceSlicePlane")
@js.native
/**
  * Provides the shape definition of a slice plane for the [Slice](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html) widget.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html)
  */
open class SliceSlicePlane ()
  extends StObject
     with typings.arcgisJsApi.esri.SliceSlicePlane {
  def this(properties: SliceSlicePlaneProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object SliceSlicePlane {
  
  @JSGlobal("__esri.SliceSlicePlane")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.SliceSlicePlane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.SliceSlicePlane]
}
