package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElevationProfileLineQuery
  extends StObject
     with ElevationProfileLine {
  
  /**
    * Elevation source used to sample elevation when generating the profile, for example an [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineQuery.html#source)
    */
  var source: ElevationProfileLineQuerySource = js.native
  
  /**
    * The line type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineQuery.html#type)
    */
  @JSName("type")
  val type_ElevationProfileLineQuery: typings.arcgisJsApi.arcgisJsApiStrings.query = js.native
}
