package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFenceParametersConstructor
  extends StObject
     with /**
  * Fence parameters for a Geotrigger that uses feature data from an online feature service.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FeatureFenceParameters.html)
  */
Instantiable0[FeatureFenceParameters]
     with Instantiable1[/* properties */ FeatureFenceParametersProperties, FeatureFenceParameters] {
  
  def fromJSON(json: Any): FeatureFenceParameters = js.native
}
