package typings
package appDashRootDashPathLib.appDashRootDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootPath extends js.Object {
  /**
    * Application root directory absolute path
    * @type {string}
    */
  var path: java.lang.String
  /**
    * Resolve module by relative addressing from root
    * @param {string} pathToModule
    * @returns {*}
    */
  def require(pathToModule: java.lang.String): js.Any
  /**
    * Resolves relative path from root to absolute path
    * @param {string} pathToModule
    * @returns {string}
    */
  def resolve(pathToModule: java.lang.String): java.lang.String
  /**
    * Explicitly set root path
    * @param {string} explicitlySetPath
    */
  def setPath(explicitlySetPath: java.lang.String): scala.Unit
}

object RootPath {
  @scala.inline
  def apply(
    path: java.lang.String,
    require: js.Function1[java.lang.String, js.Any],
    resolve: js.Function1[java.lang.String, java.lang.String],
    setPath: js.Function1[java.lang.String, scala.Unit],
    toString: js.Function0[java.lang.String]
  ): RootPath = {
    val __obj = js.Dynamic.literal(path = path, require = require, resolve = resolve, setPath = setPath, toString = toString)
  
    __obj.asInstanceOf[RootPath]
  }
}

