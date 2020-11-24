package typings.arcgisJsApi.rasterRenderersMod

import typings.arcgisJsApi.esri.RasterShadedReliefRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/rasterRenderers", "RasterShadedReliefRenderer")
@js.native
/**
  * RasterShadedReliefRenderer produces a grayscale or colored 3D representation of the surface on an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), with the sun's relative position taken into account for shading the image.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html)
  */
class RasterShadedReliefRendererCls ()
  extends typings.arcgisJsApi.esri.RasterShadedReliefRenderer {
  def this(properties: RasterShadedReliefRendererProperties) = this()
}
