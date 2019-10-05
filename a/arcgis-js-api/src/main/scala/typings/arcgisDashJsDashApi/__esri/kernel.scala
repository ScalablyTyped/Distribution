package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
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
  val version: String
}

@JSGlobal("__esri.kernel")
@js.native
object kernel extends TopLevel[kernel]

