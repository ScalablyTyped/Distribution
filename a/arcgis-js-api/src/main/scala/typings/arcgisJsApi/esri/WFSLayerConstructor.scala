package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WFSLayerConstructor
  extends StObject
     with Instantiable0[WFSLayer]
     with Instantiable1[/* properties */ WFSLayerProperties, WFSLayer] {
  
  def fromJSON(json: Any): WFSLayer = js.native
  
  /**
    * Creates a WFSLayer from an object created by [wfsUtils.getWFSLayerInfo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#getWFSLayerInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html#fromWFSLayerInfo)
    */
  def fromWFSLayerInfo(layerInfo: WFSLayerInfo): WFSLayer = js.native
}
