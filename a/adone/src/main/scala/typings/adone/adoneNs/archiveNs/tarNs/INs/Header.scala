package typings.adone.adoneNs.archiveNs.tarNs.INs

import typings.adone.adoneStrings.`block-device`
import typings.adone.adoneStrings.`character-device`
import typings.adone.adoneStrings.`contiguous-file`
import typings.adone.adoneStrings.directory
import typings.adone.adoneStrings.fifo
import typings.adone.adoneStrings.file
import typings.adone.adoneStrings.link
import typings.adone.adoneStrings.symlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  /**
    * device minor versio, 0 by default
    */
  var devmajor: Double
  /**
    * device minor version, 0 by default
    */
  var devminor: Double
  /**
    * gid for entry owner, 9 by default
    */
  var gid: Double
  /**
    * gname of entry owner, null by default
    */
  var gname: String
  /**
    * Linked file name
    */
  var linkname: String
  /**
    * Entry mode, 0755 for dirs and 0644 by default
    */
  var mode: Double
  /**
    * Last modified date for entry, now by default
    */
  var mtime: Double
  /**
    * File path
    */
  var name: String
  /**
    * Entry size, 0 by default
    */
  var size: Double
  /**
    * Type of entry, file by default
    */
  var `type`: file | directory | link | symlink | `block-device` | `character-device` | fifo | `contiguous-file`
  /**
    * uid for entry owner, 0 by default
    */
  var uid: Double
  /**
    * uname of entry owner, null by default
    */
  var uname: String
}

object Header {
  @scala.inline
  def apply(
    devmajor: Double,
    devminor: Double,
    gid: Double,
    gname: String,
    linkname: String,
    mode: Double,
    mtime: Double,
    name: String,
    size: Double,
    `type`: file | directory | link | symlink | `block-device` | `character-device` | fifo | `contiguous-file`,
    uid: Double,
    uname: String
  ): Header = {
    val __obj = js.Dynamic.literal(devmajor = devmajor, devminor = devminor, gid = gid, gname = gname, linkname = linkname, mode = mode, mtime = mtime, name = name, size = size, uid = uid, uname = uname)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

