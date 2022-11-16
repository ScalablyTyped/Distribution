package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ExtrudeSymbol3DLayer
import typings.arcgisJsApi.esri.ExtrudeSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsExtrudeSymbol3DLayerMod {
  
  @JSImport("esri/symbols/ExtrudeSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
    * ExtrudeSymbol3DLayer is used to render [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries by extruding them upward from the ground, creating a 3D volumetric object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html)
    */
  open class ^ ()
    extends StObject
       with ExtrudeSymbol3DLayer {
    def this(properties: ExtrudeSymbol3DLayerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/ExtrudeSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ExtrudeSymbol3DLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ExtrudeSymbol3DLayer]
}
