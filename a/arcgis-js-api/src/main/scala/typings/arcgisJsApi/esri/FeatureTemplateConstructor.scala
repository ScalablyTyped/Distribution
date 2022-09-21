package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTemplateConstructor
  extends StObject
     with /**
  * Feature templates define all the information required to create a new feature in a [feature layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html)
  */
Instantiable0[FeatureTemplate]
     with Instantiable1[/* properties */ FeatureTemplateProperties, FeatureTemplate] {
  
  def fromJSON(json: Any): FeatureTemplate = js.native
}
