package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for the [WFSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html)
  */
@js.native
trait wfsUtils extends StObject {
  
  /**
    * Fetches the GetCapabilities document of a WFS service which contains information about the list of layers in the service and the available operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#getCapabilities)
    */
  def getCapabilities(url: String): js.Promise[WFSCapabilities] = js.native
  def getCapabilities(url: String, options: wfsUtilsGetCapabilitiesOptions): js.Promise[WFSCapabilities] = js.native
  
  /**
    * Returns the [WFSLayerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSLayerInfo) from the capabilities of the WFS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#getWFSLayerInfo)
    */
  def getWFSLayerInfo(capabilities: WFSCapabilities): js.Promise[WFSLayerInfo] = js.native
  def getWFSLayerInfo(capabilities: WFSCapabilities, name: String): js.Promise[WFSLayerInfo] = js.native
  def getWFSLayerInfo(capabilities: WFSCapabilities, name: String, namespaceUri: String): js.Promise[WFSLayerInfo] = js.native
  def getWFSLayerInfo(
    capabilities: WFSCapabilities,
    name: String,
    namespaceUri: String,
    options: wfsUtilsGetWFSLayerInfoOptions
  ): js.Promise[WFSLayerInfo] = js.native
  def getWFSLayerInfo(
    capabilities: WFSCapabilities,
    name: String,
    namespaceUri: scala.Unit,
    options: wfsUtilsGetWFSLayerInfoOptions
  ): js.Promise[WFSLayerInfo] = js.native
  def getWFSLayerInfo(capabilities: WFSCapabilities, name: scala.Unit, namespaceUri: String): js.Promise[WFSLayerInfo] = js.native
  def getWFSLayerInfo(
    capabilities: WFSCapabilities,
    name: scala.Unit,
    namespaceUri: String,
    options: wfsUtilsGetWFSLayerInfoOptions
  ): js.Promise[WFSLayerInfo] = js.native
  def getWFSLayerInfo(
    capabilities: WFSCapabilities,
    name: scala.Unit,
    namespaceUri: scala.Unit,
    options: wfsUtilsGetWFSLayerInfoOptions
  ): js.Promise[WFSLayerInfo] = js.native
}
