package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudRGBRenderer
import typings.arcgisJsApi.esri.PointCloudRGBRendererConstructor
import typings.arcgisJsApi.esri.PointCloudRGBRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointCloudRGBRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/PointCloudRGBRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PointCloudRGBRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/PointCloudRGBRenderer", JSImport.Namespace)
  @js.native
  /**
    * PointCloudRGBRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a color attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html)
    */
  class Class ()
    extends StObject
       with PointCloudRGBRenderer {
    def this(properties: PointCloudRGBRendererProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & PointCloudRGBRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointCloudRGBRendererMod.foo` */
  override def _to: js.Object & PointCloudRGBRendererConstructor = ^
}
