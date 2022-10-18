package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PointCloudUniqueValueRenderer
import typings.arcgisJsApi.esri.PointCloudUniqueValueRendererConstructor
import typings.arcgisJsApi.esri.PointCloudUniqueValueRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRenderersPointCloudUniqueValueRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/PointCloudUniqueValueRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PointCloudUniqueValueRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/PointCloudUniqueValueRenderer", JSImport.Namespace)
  @js.native
  /**
    * PointCloudUniqueValueRenderer allows you to colorize points in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on an attribute value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html)
    */
  open class Class ()
    extends StObject
       with PointCloudUniqueValueRenderer {
    def this(properties: PointCloudUniqueValueRendererProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & PointCloudUniqueValueRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRenderersPointCloudUniqueValueRendererMod.foo` */
  override def _to: js.Object & PointCloudUniqueValueRendererConstructor = ^
}
