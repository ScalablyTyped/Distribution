package typings
package adoneLib.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatVFS extends js.Object {
  /**
    * # free blocks for unprivileged users
    */
  var f_bavail: scala.Double
  /**
    * # free blocks
    */
  var f_bfree: scala.Double
  /**
    * Size of fs in f_frsize units
    */
  var f_blocks: scala.Double
  /**
    * File system block size
    */
  var f_bsize: scala.Double
  /**
    * # free inodes for unprivileged users
    */
  var f_favail: scala.Double
  /**
    * # free inodes
    */
  var f_ffree: scala.Double
  /**
    * # inodes
    */
  var f_files: scala.Double
  /**
    * Fragment size
    */
  var f_frsize: scala.Double
  /**
    * Maximum filename length
    */
  var f_namemax: scala.Double
}

object StatVFS {
  @scala.inline
  def apply(
    f_bavail: scala.Double,
    f_bfree: scala.Double,
    f_blocks: scala.Double,
    f_bsize: scala.Double,
    f_favail: scala.Double,
    f_ffree: scala.Double,
    f_files: scala.Double,
    f_frsize: scala.Double,
    f_namemax: scala.Double
  ): StatVFS = {
    val __obj = js.Dynamic.literal(f_bavail = f_bavail, f_bfree = f_bfree, f_blocks = f_blocks, f_bsize = f_bsize, f_favail = f_favail, f_ffree = f_ffree, f_files = f_files, f_frsize = f_frsize, f_namemax = f_namemax)
  
    __obj.asInstanceOf[StatVFS]
  }
}

