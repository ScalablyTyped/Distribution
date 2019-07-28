package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lighting
  extends Accessor
     with corePromise {
  /**
    * The time and date for which the sun position and light direction is computed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#date)
    *
    * @default null
    */
  var date: Date = js.native
  /**
    * Indicates whether to show shadows cast by the sun. Shadows are only displayed for real world 3D objects. Terrain doesn't cast shadows. In local scenes at small zoom levels, shadows are not displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#directShadowsEnabled)
    *
    * @default false
    */
  var directShadowsEnabled: Boolean = js.native
  /**
    * The UTC time zone offset in hours that should be displayed in the UI to represent the date. This value does not have an impact on the actual lighting of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html#displayUTCOffset)
    *
    * @default null
    */
  var displayUTCOffset: Double = js.native
}

@JSGlobal("__esri.Lighting")
@js.native
class LightingCls () extends Lighting {
  def this(properties: LightingProperties) = this()
}

