package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteLayerInfoConstructor
  extends StObject
     with /**
  * The SiteLayerInfo class describes the boundaries of managed sites and is used for visualizing groups of facilities.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html)
  */
Instantiable0[SiteLayerInfo]
     with Instantiable1[/* properties */ SiteLayerInfoProperties, SiteLayerInfo] {
  
  def fromJSON(json: Any): SiteLayerInfo = js.native
}
