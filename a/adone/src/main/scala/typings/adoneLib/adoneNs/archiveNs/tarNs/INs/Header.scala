package typings
package adoneLib.adoneNs.archiveNs.tarNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  /**
    * device minor versio, 0 by default
    */
  var devmajor: scala.Double
  /**
    * device minor version, 0 by default
    */
  var devminor: scala.Double
  /**
    * gid for entry owner, 9 by default
    */
  var gid: scala.Double
  /**
    * gname of entry owner, null by default
    */
  var gname: java.lang.String
  /**
    * Linked file name
    */
  var linkname: java.lang.String
  /**
    * Entry mode, 0755 for dirs and 0644 by default
    */
  var mode: scala.Double
  /**
    * Last modified date for entry, now by default
    */
  var mtime: scala.Double
  /**
    * File path
    */
  var name: java.lang.String
  /**
    * Entry size, 0 by default
    */
  var size: scala.Double
  /**
    * Type of entry, file by default
    */
  var `type`: adoneLib.adoneLibStrings.file | adoneLib.adoneLibStrings.directory | adoneLib.adoneLibStrings.link | adoneLib.adoneLibStrings.symlink | adoneLib.adoneLibStrings.`block-device` | adoneLib.adoneLibStrings.`character-device` | adoneLib.adoneLibStrings.fifo | adoneLib.adoneLibStrings.`contiguous-file`
  /**
    * uid for entry owner, 0 by default
    */
  var uid: scala.Double
  /**
    * uname of entry owner, null by default
    */
  var uname: java.lang.String
}

object Header {
  @scala.inline
  def apply(
    devmajor: scala.Double,
    devminor: scala.Double,
    gid: scala.Double,
    gname: java.lang.String,
    linkname: java.lang.String,
    mode: scala.Double,
    mtime: scala.Double,
    name: java.lang.String,
    size: scala.Double,
    `type`: adoneLib.adoneLibStrings.file | adoneLib.adoneLibStrings.directory | adoneLib.adoneLibStrings.link | adoneLib.adoneLibStrings.symlink | adoneLib.adoneLibStrings.`block-device` | adoneLib.adoneLibStrings.`character-device` | adoneLib.adoneLibStrings.fifo | adoneLib.adoneLibStrings.`contiguous-file`,
    uid: scala.Double,
    uname: java.lang.String
  ): Header = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("devmajor")(devmajor)
    __obj.updateDynamic("devminor")(devminor)
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("gname")(gname)
    __obj.updateDynamic("linkname")(linkname)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("mtime")(mtime)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uid")(uid)
    __obj.updateDynamic("uname")(uname)
    __obj.asInstanceOf[Header]
  }
}

