package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFeatureSetConstructor
  extends StObject
     with /**
  * A subclass of FeaureSet that can be used as an input in the Route, Closest Facility, and Service Area solvers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NetworkFeatureSet.html)
  */
Instantiable0[NetworkFeatureSet]
     with Instantiable1[/* properties */ NetworkFeatureSetProperties, NetworkFeatureSet] {
  
  def fromJSON(json: Any): NetworkFeatureSet = js.native
}
