package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait kernel extends js.Object {
  /**
    * Current version of the ArcGIS API for JavaScript.
    * ```js
    * require([
    *   "esri/kernel"
    * ], function(esriNS) {
    *   console.log(esriNS.version);
    * });
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-kernel.html#version)
    */
  val version: java.lang.String
}

object kernel {
  @scala.inline
  def apply(version: java.lang.String): kernel = {
    val __obj = js.Dynamic.literal(version = version)
  
    __obj.asInstanceOf[kernel]
  }
}

