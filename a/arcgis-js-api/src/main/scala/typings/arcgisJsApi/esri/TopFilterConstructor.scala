package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopFilterConstructor
  extends StObject
     with /**
  * This class defines the top filter parameters for executing top features queries for features from a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFilter.html)
  */
Instantiable0[TopFilter]
     with Instantiable1[/* properties */ TopFilterProperties, TopFilter] {
  
  def fromJSON(json: Any): TopFilter = js.native
}
