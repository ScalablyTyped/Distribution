package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchLayer extends Accessor {
  /**
    * The field to use for search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-SearchLayer.html#field)
    */
  var field: SearchLayerField = js.native
  /**
    * The id of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-SearchLayer.html#id)
    */
  var id: java.lang.String = js.native
  /**
    * The sub layer index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-applicationProperties-SearchLayer.html#subLayer)
    */
  var subLayer: scala.Double = js.native
}

@JSGlobal("__esri.SearchLayer")
@js.native
class SearchLayerCls () extends SearchLayer {
  def this(properties: SearchLayerProperties) = this()
}

