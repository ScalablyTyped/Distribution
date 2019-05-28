package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffutimes extends js.Object {
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
    * @param fd A file descriptor.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def __promisify__(fd: scala.Double, atime: java.lang.String, mtime: java.lang.String): js.Promise[scala.Unit] = js.native
  def __promisify__(fd: scala.Double, atime: java.lang.String, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  def __promisify__(fd: scala.Double, atime: java.lang.String, mtime: stdLib.Date): js.Promise[scala.Unit] = js.native
  def __promisify__(fd: scala.Double, atime: scala.Double, mtime: java.lang.String): js.Promise[scala.Unit] = js.native
  def __promisify__(fd: scala.Double, atime: scala.Double, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  def __promisify__(fd: scala.Double, atime: scala.Double, mtime: stdLib.Date): js.Promise[scala.Unit] = js.native
  def __promisify__(fd: scala.Double, atime: stdLib.Date, mtime: java.lang.String): js.Promise[scala.Unit] = js.native
  def __promisify__(fd: scala.Double, atime: stdLib.Date, mtime: scala.Double): js.Promise[scala.Unit] = js.native
  def __promisify__(fd: scala.Double, atime: stdLib.Date, mtime: stdLib.Date): js.Promise[scala.Unit] = js.native
}

