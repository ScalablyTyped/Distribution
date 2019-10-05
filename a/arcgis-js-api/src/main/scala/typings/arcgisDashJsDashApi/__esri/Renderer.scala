package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer
  extends Accessor
     with JSONSupport {
  /**
    * Authoring metadata only included in renderers generated from one of the Smart Mapping creator methods, such as [sizeRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createContinuousRenderer) or [colorRendererCreator.createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createContinuousRenderer). This includes information from UI elements such as sliders and selected classification methods and themes. This allows the authoring clients to save specific overridable settings so that next time it is accessed via the UI, their selections can be remembered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html#authoringInfo)
    */
  var authoringInfo: AuthoringInfo = js.native
  /**
    * The renderer type.  **Possible values:** class-breaks | heatmap | simple | unique-value | raster-stretch
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html#type)
    */
  val `type`: String = js.native
}

@JSGlobal("__esri.Renderer")
@js.native
object Renderer extends TopLevel[RendererConstructor]

