package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer
import typings.arcgisJsApi.esri.PointCloudClassBreaksRendererConstructor
import typings.arcgisJsApi.esri.PointCloudClassBreaksRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersPointCloudClassBreaksRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/PointCloudClassBreaksRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PointCloudClassBreaksRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/PointCloudClassBreaksRenderer", JSImport.Namespace)
  @js.native
  /**
    * This class defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html)
    */
  open class Class ()
    extends StObject
       with PointCloudClassBreaksRenderer {
    def this(properties: PointCloudClassBreaksRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PointCloudClassBreaksRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersPointCloudClassBreaksRendererMod.foo` */
  override def _to: js.Object & PointCloudClassBreaksRendererConstructor = ^
}
