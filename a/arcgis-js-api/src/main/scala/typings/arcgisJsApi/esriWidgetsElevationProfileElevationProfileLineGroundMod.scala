package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ElevationProfileLineGround
import typings.arcgisJsApi.esri.ElevationProfileLineGroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsElevationProfileElevationProfileLineGroundMod {
  
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLineGround", JSImport.Namespace)
  @js.native
  /**
    * Profile line which samples elevation from the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) of the [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) currently set in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineGround.html)
    */
  open class ^ ()
    extends StObject
       with ElevationProfileLineGround {
    def this(properties: ElevationProfileLineGroundProperties) = this()
  }
}
