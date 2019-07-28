package typings.adone.adoneNs.archiveNs.tarNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
    * Ensure that packed directories have the corresponding modes
    */
  var dmode: js.UndefOr[Double] = js.undefined
  /**
    * Ensure that packed files have the corresponding modes
    */
  var fmode: js.UndefOr[Double] = js.undefined
  /**
    * Entries filter
    */
  var ignore: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
  /**
    * Header mapper, called for each each entry
    */
  var map: js.UndefOr[js.Function1[/* header */ Header, js.UndefOr[Header]]] = js.undefined
  /**
    * Set the dmode and fmode to writable
    */
  var readable: js.UndefOr[Boolean] = js.undefined
  /**
    * Strip the parts of paths of files
    */
  var strip: js.UndefOr[Double] = js.undefined
  /**
    * A custom umask, process.umask() by default
    */
  var umask: js.UndefOr[Double] = js.undefined
  /**
    * Set the dmode and fmode to writable
    */
  var writable: js.UndefOr[Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    dmode: Int | Double = null,
    fmode: Int | Double = null,
    ignore: /* name */ String => Boolean = null,
    map: /* header */ Header => js.UndefOr[Header] = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    strip: Int | Double = null,
    umask: Int | Double = null,
    writable: js.UndefOr[Boolean] = js.undefined
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

