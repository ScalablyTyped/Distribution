package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewConstructor
  extends /**
  * A view provides the means of viewing and interacting with the components of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html). The [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) is merely a container, storing the geographic information contained in base layers and operational layers. The View renders the [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and its various [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers), making them visible to the user.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html)
  */
Instantiable0[View]
     with Instantiable1[/* properties */ ViewProperties, View] {
  /**
    * Contains the collection of active views on the page. Only views that are [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#ready) appear in the collection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#views)
    */
  val views: Collection[View] = js.native
}

