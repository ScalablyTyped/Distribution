package typings.adone.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatVFS extends js.Object {
  /**
    * # free blocks for unprivileged users
    */
  var f_bavail: Double
  /**
    * # free blocks
    */
  var f_bfree: Double
  /**
    * Size of fs in f_frsize units
    */
  var f_blocks: Double
  /**
    * File system block size
    */
  var f_bsize: Double
  /**
    * # free inodes for unprivileged users
    */
  var f_favail: Double
  /**
    * # free inodes
    */
  var f_ffree: Double
  /**
    * # inodes
    */
  var f_files: Double
  /**
    * Fragment size
    */
  var f_frsize: Double
  /**
    * Maximum filename length
    */
  var f_namemax: Double
}

object StatVFS {
  @scala.inline
  def apply(
    f_bavail: Double,
    f_bfree: Double,
    f_blocks: Double,
    f_bsize: Double,
    f_favail: Double,
    f_ffree: Double,
    f_files: Double,
    f_frsize: Double,
    f_namemax: Double
  ): StatVFS = {
    val __obj = js.Dynamic.literal(f_bavail = f_bavail, f_bfree = f_bfree, f_blocks = f_blocks, f_bsize = f_bsize, f_favail = f_favail, f_ffree = f_ffree, f_files = f_files, f_frsize = f_frsize, f_namemax = f_namemax)
  
    __obj.asInstanceOf[StatVFS]
  }
}

