package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait colorUtils extends StObject {
  
  /**
    * Returns the average color of the view's background within the view's [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-support-colorUtils.html#getBackgroundColor)
    */
  def getBackgroundColor(view: MapView): js.Promise[Color_]
  
  /**
    * This method inspects the basemap and background of a MapView and returns either `light` or `dark` as the theme of the background depending on if the average color of the basemap and the view's background is light or dark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-support-colorUtils.html#getBackgroundColorTheme)
    */
  def getBackgroundColorTheme(view: MapView): js.Promise[String]
}
object colorUtils {
  
  inline def apply(
    getBackgroundColor: MapView => js.Promise[Color_],
    getBackgroundColorTheme: MapView => js.Promise[String]
  ): colorUtils = {
    val __obj = js.Dynamic.literal(getBackgroundColor = js.Any.fromFunction1(getBackgroundColor), getBackgroundColorTheme = js.Any.fromFunction1(getBackgroundColorTheme))
    __obj.asInstanceOf[colorUtils]
  }
  
  extension [Self <: colorUtils](x: Self) {
    
    inline def setGetBackgroundColor(value: MapView => js.Promise[Color_]): Self = StObject.set(x, "getBackgroundColor", js.Any.fromFunction1(value))
    
    inline def setGetBackgroundColorTheme(value: MapView => js.Promise[String]): Self = StObject.set(x, "getBackgroundColorTheme", js.Any.fromFunction1(value))
  }
}
