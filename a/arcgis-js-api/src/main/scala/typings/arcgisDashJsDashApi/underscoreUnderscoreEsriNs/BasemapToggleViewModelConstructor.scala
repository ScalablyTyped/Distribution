package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapToggleViewModelConstructor
  extends Instantiable0[BasemapToggleViewModel]
     with Instantiable1[/* properties */ BasemapToggleViewModelProperties, BasemapToggleViewModel] {
  /**
    * Helper method to find a basemap's thumbnail URL.  If the basemap does not have a thumbnail URL defined, this utility will try to find a thumbnail URL from the best matching well-known basemap. If no match is found, a thumbnail URL from the basemap's base layers will be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#getThumbnailUrl)
    *
    * @param basemap The basemap used to retrieve the thumbnail URL.
    *
    */
  def getThumbnailUrl(basemap: Basemap): String = js.native
}

