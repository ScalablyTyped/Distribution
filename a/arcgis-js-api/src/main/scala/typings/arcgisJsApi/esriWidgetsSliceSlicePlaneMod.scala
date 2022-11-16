package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SliceSlicePlane
import typings.arcgisJsApi.esri.SliceSlicePlaneProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriWidgetsSliceSlicePlaneMod {
  
  @JSImport("esri/widgets/Slice/SlicePlane", JSImport.Namespace)
  @js.native
  /**
    * Provides the shape definition of a slice plane for the [Slice](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html)
    */
  open class ^ ()
    extends StObject
       with SliceSlicePlane {
    def this(properties: SliceSlicePlaneProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/widgets/Slice/SlicePlane", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): SliceSlicePlane = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SliceSlicePlane]
}
