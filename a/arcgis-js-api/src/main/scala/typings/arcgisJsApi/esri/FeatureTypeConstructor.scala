package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTypeConstructor
  extends StObject
     with /**
  * FeatureType is a subset of features defined in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) that share the same attributes.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureType.html)
  */
Instantiable0[FeatureType]
     with Instantiable1[/* properties */ FeatureTypeProperties, FeatureType] {
  
  def fromJSON(json: Any): FeatureType = js.native
}
