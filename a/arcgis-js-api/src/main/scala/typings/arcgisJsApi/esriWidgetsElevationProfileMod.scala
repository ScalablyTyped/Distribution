package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ElevationProfile
import typings.arcgisJsApi.esri.ElevationProfileProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsElevationProfileMod {
  
  @JSImport("esri/widgets/ElevationProfile", JSImport.Namespace)
  @js.native
  /**
    * The ElevationProfile widget is used to generate and display an elevation profile from an [input line graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#input).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html)
    */
  open class ^ ()
    extends StObject
       with ElevationProfile {
    def this(properties: ElevationProfileProperties) = this()
  }
}
