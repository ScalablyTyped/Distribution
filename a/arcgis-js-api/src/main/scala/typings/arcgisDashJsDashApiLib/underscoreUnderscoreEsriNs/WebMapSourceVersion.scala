package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebMapSourceVersion
  extends stdLib.Object {
  /**
    * The major version of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#sourceVersion)
    */
  var major: scala.Double
  /**
    * The minor version of the WebMap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#sourceVersion)
    */
  var minor: scala.Double
}

object WebMapSourceVersion {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    major: scala.Double,
    minor: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): WebMapSourceVersion = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, major = major, minor = minor, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[WebMapSourceVersion]
  }
}

