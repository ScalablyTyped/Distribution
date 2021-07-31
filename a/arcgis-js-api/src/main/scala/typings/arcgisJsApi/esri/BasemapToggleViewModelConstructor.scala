package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasemapToggleViewModelConstructor
  extends StObject
     with Instantiable0[BasemapToggleViewModel]
     with Instantiable1[/* properties */ BasemapToggleViewModelProperties, BasemapToggleViewModel] {
  
  /**
    * Helper method to find a basemap's thumbnail URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle-BasemapToggleViewModel.html#getThumbnailUrl)
    */
  def getThumbnailUrl(basemap: Basemap): String = js.native
}
