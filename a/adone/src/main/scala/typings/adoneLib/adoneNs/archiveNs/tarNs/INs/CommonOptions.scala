package typings
package adoneLib.adoneNs.archiveNs.tarNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
    * Ensure that packed directories have the corresponding modes
    */
  var dmode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Ensure that packed files have the corresponding modes
    */
  var fmode: js.UndefOr[scala.Double] = js.undefined
  /**
    * Entries filter
    */
  var ignore: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Boolean]] = js.undefined
  /**
    * Header mapper, called for each each entry
    */
  var map: js.UndefOr[js.Function1[/* header */ Header, js.UndefOr[Header]]] = js.undefined
  /**
    * Set the dmode and fmode to writable
    */
  var readable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Strip the parts of paths of files
    */
  var strip: js.UndefOr[scala.Double] = js.undefined
  /**
    * A custom umask, process.umask() by default
    */
  var umask: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set the dmode and fmode to writable
    */
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    dmode: scala.Int | scala.Double = null,
    fmode: scala.Int | scala.Double = null,
    ignore: /* name */ java.lang.String => scala.Boolean = null,
    map: /* header */ Header => js.UndefOr[Header] = null,
    readable: js.UndefOr[scala.Boolean] = js.undefined,
    strip: scala.Int | scala.Double = null,
    umask: scala.Int | scala.Double = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (dmode != null) __obj.updateDynamic("dmode")(dmode.asInstanceOf[js.Any])
    if (fmode != null) __obj.updateDynamic("fmode")(fmode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(js.Any.fromFunction1(ignore))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (strip != null) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    if (umask != null) __obj.updateDynamic("umask")(umask.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[CommonOptions]
  }
}

