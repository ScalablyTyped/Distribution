package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureSetConstructor
  extends StObject
     with /**
  * A collection of features returned from ArcGIS Server or used as input to methods.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html)
  */
Instantiable0[FeatureSet]
     with Instantiable1[/* properties */ FeatureSetProperties, FeatureSet] {
  
  def fromJSON(json: Any): FeatureSet = js.native
}
