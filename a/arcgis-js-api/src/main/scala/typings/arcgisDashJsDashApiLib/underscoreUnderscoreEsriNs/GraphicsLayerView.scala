package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphicsLayerView extends LayerView {
  /**
    * Highlights the given feature(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GraphicsLayerView.html#highlight)
    *
    * @param target The feature(s) to highlight. When passing a graphic or array of graphics, each feature must have a valid `objectID`. You may alternatively pass one or more objectIDs as a single number or an array.
    *
    */
  def highlight(): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
  def highlight(target: js.Array[scala.Double | Graphic]): Handle = js.native
  def highlight(target: scala.Double): Handle = js.native
  /**
    * Returns all graphics available for drawing in the layer view as a [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GraphicsLayerView.html#queryGraphics)
    *
    *
    */
  def queryGraphics(): Collection[Graphic] = js.native
}

