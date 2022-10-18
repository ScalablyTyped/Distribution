package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RasterFunction
import typings.arcgisJsApi.esri.RasterFunctionConstructor
import typings.arcgisJsApi.esri.RasterFunctionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportRasterFunctionMod extends Shortcut {
  
  @JSImport("esri/layers/support/RasterFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RasterFunctionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/RasterFunction", JSImport.Namespace)
  @js.native
  /**
    * Raster functions specify processing to be done to the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html)
    */
  open class Class ()
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
  
  type _To = js.Object & RasterFunctionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportRasterFunctionMod.foo` */
  override def _to: js.Object & RasterFunctionConstructor = ^
}
