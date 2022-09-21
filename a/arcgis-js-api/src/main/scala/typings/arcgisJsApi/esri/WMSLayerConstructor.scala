package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMSLayerConstructor
  extends StObject
     with /**
  * The WMSLayer is used to create layers based on OGC Web Map Services (WMS).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html)
  */
Instantiable0[WMSLayer]
     with Instantiable1[/* properties */ WMSLayerProperties, WMSLayer] {
  
  def fromJSON(json: Any): WMSLayer = js.native
}
