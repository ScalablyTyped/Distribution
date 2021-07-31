package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsFeatureSetConstructor
  extends StObject
     with /**
  * A [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) that has properties specific to routing.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html)
  */
Instantiable0[DirectionsFeatureSet]
     with Instantiable1[/* properties */ DirectionsFeatureSetProperties, DirectionsFeatureSet] {
  
  def fromJSON(json: js.Any): DirectionsFeatureSet = js.native
}
