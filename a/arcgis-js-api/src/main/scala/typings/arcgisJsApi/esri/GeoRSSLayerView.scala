package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoRSSLayerView extends LayerView {
  
  /**
    * Highlights the given feature(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoRSSLayerView.html#highlight)
    */
  def highlight(): Handle = js.native
  def highlight(target: js.Array[Graphic]): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
}
