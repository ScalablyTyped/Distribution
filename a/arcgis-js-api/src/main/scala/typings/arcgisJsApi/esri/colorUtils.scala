package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait colorUtils extends js.Object {
  
  /**
    * Returns the average color of the view's background within the view's [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-support-colorUtils.html#getBackgroundColor)
    */
  def getBackgroundColor(view: MapView): js.Promise[Color_] = js.native
  
  /**
    * This method inspects the basemap and background of a MapView and returns either `light` or `dark` as the theme of the background depending on if the average color of the basemap and the view's background is light or dark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-support-colorUtils.html#getBackgroundColorTheme)
    */
  def getBackgroundColorTheme(view: MapView): js.Promise[String] = js.native
}
object colorUtils {
  
  @scala.inline
  def apply(
    getBackgroundColor: MapView => js.Promise[Color_],
    getBackgroundColorTheme: MapView => js.Promise[String]
  ): colorUtils = {
    val __obj = js.Dynamic.literal(getBackgroundColor = js.Any.fromFunction1(getBackgroundColor), getBackgroundColorTheme = js.Any.fromFunction1(getBackgroundColorTheme))
    __obj.asInstanceOf[colorUtils]
  }
  
  @scala.inline
  implicit class colorUtilsOps[Self <: colorUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetBackgroundColor(value: MapView => js.Promise[Color_]): Self = this.set("getBackgroundColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBackgroundColorTheme(value: MapView => js.Promise[String]): Self = this.set("getBackgroundColorTheme", js.Any.fromFunction1(value))
  }
}
