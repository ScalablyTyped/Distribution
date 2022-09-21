package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RasterColormapRenderer
import typings.arcgisJsApi.esri.RasterColormapRendererConstructor
import typings.arcgisJsApi.esri.RasterColormapRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rasterColormapRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/RasterColormapRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RasterColormapRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/RasterColormapRenderer", JSImport.Namespace)
  @js.native
  /**
    * The RasterColormapRenderer defines the symbology to display raster data based on specific colors, aiding in visual analysis of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html)
    */
  open class Class ()
    extends StObject
       with RasterColormapRenderer {
    def this(properties: RasterColormapRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RasterColormapRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rasterColormapRendererMod.foo` */
  override def _to: js.Object & RasterColormapRendererConstructor = ^
}
