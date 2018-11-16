package typings
package appDashRootDashDirLib.appDashRootDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AppRootDir extends js.Object {
  // Get the application's root directory
  def get(): java.lang.String
  /**
     * Set the application's root directory
     *    this will set a global so that no matter
     *    how many instances of app-root-dir module are installed,
     *    they will all return the same directory
     */
  def set(dirname: java.lang.String): scala.Unit
}

