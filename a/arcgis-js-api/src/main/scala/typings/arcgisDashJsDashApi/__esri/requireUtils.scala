package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait requireUtils extends js.Object {
  def when(moduleRequire: js.Any, moduleNames: String): js.Promise[_] = js.native
  /**
    * Dynamically requires one or more modules and returns a promise that resolves when all the specified modules have loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-requireUtils.html#when)
    *
    * @param moduleRequire The `require` function used to load the modules. This is the AMD alias (e.g. the `moduleRequire` reference in the snippets below) used to reference the `require` module.
    * @param moduleNames The names of the modules to load.
    *
    */
  def when(moduleRequire: js.Any, moduleNames: js.Array[String]): js.Promise[_] = js.native
}

@JSGlobal("__esri.requireUtils")
@js.native
object requireUtils extends TopLevel[requireUtils]

