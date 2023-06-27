package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Object containing helper methods for generating optimal settings for [FlowRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-FlowRenderer.html).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html)
	 */
@js.native
trait symbologyFlow extends StObject {
  
  /**
  		 * Clones a flow scheme object.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#cloneScheme)
  		 */
  def cloneScheme(scheme: FlowScheme): FlowScheme = js.native
  
  /**
  		 * Returns the flow scheme with the given name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#getSchemeByName)
  		 */
  def getSchemeByName(params: flowGetSchemeByNameParams): FlowScheme = js.native
  
  /**
  		 * Returns a primary scheme and secondary schemes defining properties for flow visualizations in a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) and [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#getSchemes)
  		 */
  def getSchemes(params: flowGetSchemesParams): FlowSchemes = js.native
  
  /**
  		 * Returns the flow schemes filtered by tags included and excluded from the paramters.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#getSchemesByTag)
  		 */
  def getSchemesByTag(params: flowGetSchemesByTagParams): js.Array[FlowScheme] = js.native
  
  /**
  		 * Returns metadata for the available themes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#getThemes)
  		 */
  def getThemes(): js.Array[flowTheme] = js.native
  def getThemes(basemap: String): js.Array[flowTheme] = js.native
  def getThemes(basemap: Basemap): js.Array[flowTheme] = js.native
}
