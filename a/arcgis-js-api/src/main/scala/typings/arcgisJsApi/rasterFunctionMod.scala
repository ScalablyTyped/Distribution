package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RasterFunction
import typings.arcgisJsApi.esri.RasterFunctionConstructor
import typings.arcgisJsApi.esri.RasterFunctionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rasterFunctionMod extends Shortcut {
  
  @JSImport("esri/layers/support/RasterFunction", JSImport.Namespace)
  @js.native
  val ^ : RasterFunctionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/RasterFunction", JSImport.Namespace)
  @js.native
  /**
    * Raster functions specify processing to be done to the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterFunction.html)
    */
  class Class () extends RasterFunction {
    def this(properties: RasterFunctionProperties) = this()
  }
  
  type _To = RasterFunctionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rasterFunctionMod.foo` */
  override def _to: RasterFunctionConstructor = ^
}
