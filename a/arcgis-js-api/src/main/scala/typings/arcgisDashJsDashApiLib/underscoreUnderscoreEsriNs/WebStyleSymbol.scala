package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebStyleSymbol
  extends Symbol
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.Symbol
     with symbolsSymbol {
  /**
    * The name of the symbol within the web style. Each symbol in a web style is identified by a unique name. Only [Esri-provided web style symbol names](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols/index.html) can be referenced here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#name)
    */
  var name: java.lang.String = js.native
  /**
    * The portal that contains the web style this symbol refers to. Only required when [styleName](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName) is set.  Defaults to the value in [config.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) (e.g. https://www.arcgis.com).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal)
    */
  var portal: Portal = js.native
  /**
    * A registered web style name. Only [Esri-provided web style names](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols/index.html) can be referenced here. Requires [portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal) property to be set. Can not be used in conjunction with [styleUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleUrl).  See class description for example.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName)
    */
  var styleName: java.lang.String = js.native
  /**
    * URL that points to the web style definition. Cannot be used in conjunction with [styleName](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName) and [portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal).  See class description for example.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleUrl)
    */
  var styleUrl: java.lang.String = js.native
  /**
    * For WebStyleSymbol the type is always `web-style`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#type)
    */
  @JSName("type")
  val type_WebStyleSymbol: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`web-style` = js.native
  /**
    * Downloads and returns the [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) instance the WebStyleSymbol refers to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#fetchSymbol)
    *
    *
    */
  def fetchSymbol(): arcgisDashJsDashApiLib.IPromise[PointSymbol3D] = js.native
}

