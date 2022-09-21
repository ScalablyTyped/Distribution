package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMTSLayerConstructor
  extends StObject
     with /**
  * The WMTSLayer is used to create layers based on OGC Web Map Tile Services (WMTS).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html)
  */
Instantiable0[WMTSLayer]
     with Instantiable1[/* properties */ WMTSLayerProperties, WMTSLayer] {
  
  def fromJSON(json: Any): WMTSLayer = js.native
}
