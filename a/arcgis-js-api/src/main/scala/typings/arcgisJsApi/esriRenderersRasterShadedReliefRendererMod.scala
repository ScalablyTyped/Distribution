package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RasterShadedReliefRenderer
import typings.arcgisJsApi.esri.RasterShadedReliefRendererConstructor
import typings.arcgisJsApi.esri.RasterShadedReliefRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersRasterShadedReliefRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/RasterShadedReliefRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RasterShadedReliefRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/RasterShadedReliefRenderer", JSImport.Namespace)
  @js.native
  /**
    * RasterShadedReliefRenderer produces a grayscale or colored 3D representation of the surface on an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), with the sun's relative position taken into account for shading the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html)
    */
  open class Class ()
    extends StObject
       with RasterShadedReliefRenderer {
    def this(properties: RasterShadedReliefRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & RasterShadedReliefRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersRasterShadedReliefRendererMod.foo` */
  override def _to: js.Object & RasterShadedReliefRendererConstructor = ^
}
