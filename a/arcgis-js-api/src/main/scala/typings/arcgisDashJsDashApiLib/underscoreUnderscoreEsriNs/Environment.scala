package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends Accessor {
  /**
    * Specifies whether the atmosphere should be displayed. Typically this consists of haze and sky.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#atmosphereEnabled)
    *
    * @default true
    */
  var atmosphereEnabled: scala.Boolean = js.native
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed. The default value of `null` displays a single, fully opaque, black color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#background)
    *
    * @default null
    */
  var background: Background = js.native
  /**
    * Settings for defining the lighting of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#lighting)
    */
  var lighting: Lighting = js.native
  /**
    * Specifies whether stars should be displayed in the sky.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html#starsEnabled)
    *
    * @default true
    */
  var starsEnabled: scala.Boolean = js.native
}

@JSGlobal("__esri.Environment")
@js.native
class EnvironmentCls () extends Environment {
  def this(properties: EnvironmentProperties) = this()
}

