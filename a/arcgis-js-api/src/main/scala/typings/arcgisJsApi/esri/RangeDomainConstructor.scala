package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeDomainConstructor
  extends StObject
     with /**
  * Range domains specify a valid [minimum](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#minValue) and [maximum](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#maxValue) valid value that can be stored in numeric and date [fields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html)
  */
Instantiable0[RangeDomain]
     with Instantiable1[/* properties */ RangeDomainProperties, RangeDomain] {
  
  def fromJSON(json: Any): RangeDomain = js.native
}
