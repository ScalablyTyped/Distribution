package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ObjectSymbol3DLayer
import typings.arcgisJsApi.esri.ObjectSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriSymbolsObjectSymbol3DLayerMod {
  
  @JSImport("esri/symbols/ObjectSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
  		 * ObjectSymbol3DLayer is used to render [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries using a volumetric 3D shape (e.g., a sphere or cylinder) with a [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html)
  		 */
  open class ^ ()
    extends StObject
       with ObjectSymbol3DLayer {
    def this(properties: ObjectSymbol3DLayerProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/symbols/ObjectSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ObjectSymbol3DLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ObjectSymbol3DLayer]
}
