package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PointCloudClassBreaksRendererConstructor
import typings.arcgisJsApi.esri.PointCloudClassBreaksRendererProperties
import typings.arcgisJsApi.esri.PointCloudRGBRendererConstructor
import typings.arcgisJsApi.esri.PointCloudRGBRendererProperties
import typings.arcgisJsApi.esri.PointCloudStretchRendererConstructor
import typings.arcgisJsApi.esri.PointCloudStretchRendererProperties
import typings.arcgisJsApi.esri.PointCloudUniqueValueRendererConstructor
import typings.arcgisJsApi.esri.PointCloudUniqueValueRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointCloudRenderersMod {
  
  @JSImport("esri/pointCloudRenderers", "PointCloudClassBreaksRenderer")
  @js.native
  val PointCloudClassBreaksRenderer: PointCloudClassBreaksRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/pointCloudRenderers", "PointCloudClassBreaksRenderer")
  @js.native
  /**
    * This class defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html)
    */
  class PointCloudClassBreaksRendererCls ()
    extends typings.arcgisJsApi.esri.PointCloudClassBreaksRenderer {
    def this(properties: PointCloudClassBreaksRendererProperties) = this()
  }
  
  @JSImport("esri/pointCloudRenderers", "PointCloudRGBRenderer")
  @js.native
  val PointCloudRGBRenderer: PointCloudRGBRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/pointCloudRenderers", "PointCloudRGBRenderer")
  @js.native
  /**
    * PointCloudRGBRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a color attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html)
    */
  class PointCloudRGBRendererCls ()
    extends typings.arcgisJsApi.esri.PointCloudRGBRenderer {
    def this(properties: PointCloudRGBRendererProperties) = this()
  }
  
  @JSImport("esri/pointCloudRenderers", "PointCloudStretchRenderer")
  @js.native
  val PointCloudStretchRenderer: PointCloudStretchRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/pointCloudRenderers", "PointCloudStretchRenderer")
  @js.native
  /**
    * PointCloudStretchRenderer defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html)
    */
  class PointCloudStretchRendererCls ()
    extends typings.arcgisJsApi.esri.PointCloudStretchRenderer {
    def this(properties: PointCloudStretchRendererProperties) = this()
  }
  
  @JSImport("esri/pointCloudRenderers", "PointCloudUniqueValueRenderer")
  @js.native
  val PointCloudUniqueValueRenderer: PointCloudUniqueValueRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/pointCloudRenderers", "PointCloudUniqueValueRenderer")
  @js.native
  /**
    * PointCloudUniqueValueRenderer allows you to colorize points in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on an attribute value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html)
    */
  class PointCloudUniqueValueRendererCls ()
    extends typings.arcgisJsApi.esri.PointCloudUniqueValueRenderer {
    def this(properties: PointCloudUniqueValueRendererProperties) = this()
  }
}
