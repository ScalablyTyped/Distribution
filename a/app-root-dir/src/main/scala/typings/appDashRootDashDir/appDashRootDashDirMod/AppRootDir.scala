package typings.appDashRootDashDir.appDashRootDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppRootDir extends js.Object {
  // Get the application's root directory
  def get(): String
  /**
    * Set the application's root directory
    *    this will set a global so that no matter
    *    how many instances of app-root-dir module are installed,
    *    they will all return the same directory
    */
  def set(dirname: String): Unit
}

object AppRootDir {
  @scala.inline
  def apply(get: () => String, set: String => Unit): AppRootDir = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[AppRootDir]
  }
}

