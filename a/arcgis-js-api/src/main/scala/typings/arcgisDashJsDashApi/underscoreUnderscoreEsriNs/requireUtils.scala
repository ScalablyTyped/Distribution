package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait requireUtils extends js.Object {
  def when(moduleRequire: js.Any, moduleNames: String): IPromise[_] = js.native
  /**
    * **Deprecated in favor of [promiseUtils.create()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#create).** Dynamically requires one or more modules and returns a promise that resolves when all the specified modules have loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-requireUtils.html#when)
    *
    * @param moduleRequire The `require` function used to load the modules. This is the AMD alias (e.g. the `moduleRequire` reference in the snippets below) used to reference the `require` module.
    * @param moduleNames The names of the modules to load.
    *
    */
  def when(moduleRequire: js.Any, moduleNames: js.Array[String]): IPromise[_] = js.native
}

