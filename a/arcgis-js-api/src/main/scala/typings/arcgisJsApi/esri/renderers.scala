package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A convenience module for importing [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html). For example, rather than importing renderers one at a time like this:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers.html)
  */
@JSGlobal("__esri.renderers")
@js.native
object renderers extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.arcgisJsApi.esri.HeatmapRenderer
    - typings.arcgisJsApi.esri.RendererWithVisualVariables
  */
  trait Renderer extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.arcgisJsApi.esri.SimpleRenderer
    - typings.arcgisJsApi.esri.ClassBreaksRenderer
    - typings.arcgisJsApi.esri.UniqueValueRenderer
    - typings.arcgisJsApi.esri.DotDensityRenderer
  */
  trait RendererWithVisualVariables extends js.Object
  
  type ClassBreaksRenderer = typings.arcgisJsApi.esri.ClassBreaksRenderer
  type DotDensityRenderer = typings.arcgisJsApi.esri.DotDensityRenderer
  type HeatmapRenderer = typings.arcgisJsApi.esri.HeatmapRenderer
  type SimpleRenderer = typings.arcgisJsApi.esri.SimpleRenderer
  type UniqueValueRenderer = typings.arcgisJsApi.esri.UniqueValueRenderer
}

