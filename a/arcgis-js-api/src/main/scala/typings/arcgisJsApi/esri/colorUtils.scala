package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dark
import typings.arcgisJsApi.arcgisJsApiStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Contains utilities for working with colors in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-support-colorUtils.html)
	 */
@js.native
trait colorUtils extends StObject {
  
  /**
  		 * Returns the average color of the view's background within the view's [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-support-colorUtils.html#getBackgroundColor)
  		 */
  def getBackgroundColor(view: MapView): js.Promise[Color_] = js.native
  def getBackgroundColor(view: SceneView): js.Promise[Color_] = js.native
  
  /**
  		 * This method inspects the basemap and background of a MapView and returns either `light` or `dark` as the theme of the background depending on if the average color of the basemap and the view's background is light or dark.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-support-colorUtils.html#getBackgroundColorTheme)
  		 */
  def getBackgroundColorTheme(view: MapView): js.Promise[light | dark] = js.native
  def getBackgroundColorTheme(view: SceneView): js.Promise[light | dark] = js.native
}
