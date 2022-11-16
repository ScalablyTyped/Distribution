package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RasterFunction
import typings.arcgisJsApi.esri.RasterFunctionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportRasterFunctionMod {
  
  @JSImport("esri/layers/support/RasterFunction", JSImport.Namespace)
  @js.native
  /**
    * Raster functions specify processing to be done to the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html)
    */
  open class ^ ()
    extends StObject
       with RasterFunction {
    def this(properties: RasterFunctionProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/RasterFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): RasterFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RasterFunction]
}
