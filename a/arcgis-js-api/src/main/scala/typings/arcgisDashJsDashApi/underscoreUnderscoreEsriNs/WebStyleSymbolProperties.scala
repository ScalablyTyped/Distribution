package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebStyleSymbolProperties extends SymbolProperties {
  /**
    * The name of the symbol within the web style. Each symbol in a web style is identified by a unique name. Only [Esri Web Style Symbols (2D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-2d/index.html) and [Esri Web Style Symbols (3D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-3d/index.html) can be referenced here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The portal that contains the web style this symbol refers to. Only required when [styleName](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName) is set.  Defaults to the value in [config.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) (e.g. https://www.arcgis.com).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  /**
    * A registered web style name. Only [Esri Web Style Symbols (2D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-2d/index.html) and [Esri Web Style Symbols (3D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-3d/index.html) can be referenced here. Note that the 2D web style symbols are only supported in 2D and 3D web style symbols are only supported in 3D with an exception of [`EsriIconsStyle`](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-3d/index.html#icons) which can be used in both 2D and 3D.  Requires [portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal) property to be set. Can not be used in conjunction with [styleUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleUrl).  See class description for example.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName)
    */
  var styleName: js.UndefOr[String] = js.undefined
  /**
    * URL that points to the web style definition. Cannot be used in conjunction with [styleName](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName) and [portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal).  See class description for example.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleUrl)
    */
  var styleUrl: js.UndefOr[String] = js.undefined
}

object WebStyleSymbolProperties {
  @scala.inline
  def apply(
    color: Color | js.Array[Double] | String = null,
    name: String = null,
    portal: PortalProperties = null,
    styleName: String = null,
    styleUrl: String = null
  ): WebStyleSymbolProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (portal != null) __obj.updateDynamic("portal")(portal)
    if (styleName != null) __obj.updateDynamic("styleName")(styleName)
    if (styleUrl != null) __obj.updateDynamic("styleUrl")(styleUrl)
    __obj.asInstanceOf[WebStyleSymbolProperties]
  }
}

