package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryFieldsInfoConstructor
  extends StObject
     with /**
  * The `GeometryFieldsInfo` class returns information about the system maintained geometry information associated with a specific feature in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-GeometryFieldsInfo.html)
  */
Instantiable0[GeometryFieldsInfo]
     with Instantiable1[/* properties */ GeometryFieldsInfoProperties, GeometryFieldsInfo] {
  
  def fromJSON(json: Any): GeometryFieldsInfo = js.native
}
