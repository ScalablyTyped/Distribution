package typings.appDashRootDashPath.appDashRootDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootPath extends js.Object {
  /**
    * Application root directory absolute path
    * @type {string}
    */
  var path: String
  /**
    * Resolve module by relative addressing from root
    * @param {string} pathToModule
    * @returns {*}
    */
  def require(pathToModule: String): js.Any
  /**
    * Resolves relative path from root to absolute path
    * @param {string} pathToModule
    * @returns {string}
    */
  def resolve(pathToModule: String): String
  /**
    * Explicitly set root path
    * @param {string} explicitlySetPath
    */
  def setPath(explicitlySetPath: String): Unit
}

object RootPath {
  @scala.inline
  def apply(path: String, require: String => js.Any, resolve: String => String, setPath: String => Unit): RootPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], require = js.Any.fromFunction1(require), resolve = js.Any.fromFunction1(resolve), setPath = js.Any.fromFunction1(setPath))
  
    __obj.asInstanceOf[RootPath]
  }
}

