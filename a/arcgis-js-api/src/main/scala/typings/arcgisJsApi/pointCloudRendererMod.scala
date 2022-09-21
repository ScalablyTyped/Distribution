package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudRenderer
import typings.arcgisJsApi.esri.PointCloudRendererConstructor
import typings.arcgisJsApi.esri.PointCloudRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointCloudRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/PointCloudRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PointCloudRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/PointCloudRenderer", JSImport.Namespace)
  @js.native
  /**
    * A PointCloudRenderer allows you to specify how points in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) are rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html)
    */
  open class Class ()
    extends StObject
       with PointCloudRenderer {
    def this(properties: PointCloudRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PointCloudRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `pointCloudRendererMod.foo` */
  override def _to: js.Object & PointCloudRendererConstructor = ^
}
