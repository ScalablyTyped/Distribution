package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMTSStyleConstructor
  extends StObject
     with /**
  * Contains information about the WMTS Style for [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html)
  */
Instantiable0[WMTSStyle]
     with Instantiable1[/* properties */ WMTSStyleProperties, WMTSStyle] {
  
  def fromJSON(json: Any): WMTSStyle = js.native
}
