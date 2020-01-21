package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorUtils extends js.Object {
  /**
    * Returns the average color of the view's background within the view's [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent). The view's background includes the non-reference [base layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#baseLayers) of the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#map)'s basemap, the [background color](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html#background) of the web map (if applicable), and the background color of the view's [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#container).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-support-colorUtils.html#getBackgroundColor)
    *
    * @param view The MapView instance from which to calculate the average color of the background.
    *
    */
  def getBackgroundColor(view: MapView): js.Promise[Color_]
  /**
    * This method inspects the basemap and background of a MapView and returns either `light` or `dark` as the theme of the background depending on if the average color of the basemap and the view's background is light or dark.  The background theme is determined by taking the average color of the view's background and basemap and determining its brightness based on [this algorithm for determining color visibility](https://www.w3.org/TR/AERT/#color-contrast).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-support-colorUtils.html#getBackgroundColorTheme)
    *
    * @param view The MapView instance from which to get the background color theme.
    *
    */
  def getBackgroundColorTheme(view: MapView): js.Promise[String]
}

@JSGlobal("__esri.colorUtils")
@js.native
object colorUtils extends TopLevel[colorUtils]

