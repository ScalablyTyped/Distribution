package typings
package adoneLib.adoneNs.archiveNs.tarNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackOptions extends CommonOptions {
  /**
    * Pack the contents of the symlink instead of the link itself, false by default
    */
  var dereference: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies which entries to pack, all by default
    */
  var entries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Input read stream modifier, called for each entry
    */
  var mapStream: js.UndefOr[
    js.Function2[
      /* stream */ adoneLib.adoneNs.fsNs.INs.ReadStream, 
      /* header */ Header, 
      nodeLib.streamMod.Readable
    ]
  ] = js.undefined
  /**
    * A custom initial pack stream
    */
  var pack: js.UndefOr[adoneLib.adoneNs.archiveNs.tarNs.RawPackStream] = js.undefined
  /**
    * Whether to sort entries before packing
    */
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * set false to ignore errors due to unsupported entry types (like device files), true by default
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object PackOptions {
  @scala.inline
  def apply(
    dereference: js.UndefOr[scala.Boolean] = js.undefined,
    dmode: scala.Int | scala.Double = null,
    entries: js.Array[java.lang.String] = null,
    fmode: scala.Int | scala.Double = null,
    ignore: /* name */ java.lang.String => scala.Boolean = null,
    map: /* header */ Header => js.UndefOr[Header] = null,
    mapStream: (/* stream */ adoneLib.adoneNs.fsNs.INs.ReadStream, /* header */ Header) => nodeLib.streamMod.Readable = null,
    pack: adoneLib.adoneNs.archiveNs.tarNs.RawPackStream = null,
    readable: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    strip: scala.Int | scala.Double = null,
    umask: scala.Int | scala.Double = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): PackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dereference)) __obj.updateDynamic("dereference")(dereference)
    if (dmode != null) __obj.updateDynamic("dmode")(dmode.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (fmode != null) __obj.updateDynamic("fmode")(fmode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(js.Any.fromFunction1(ignore))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (mapStream != null) __obj.updateDynamic("mapStream")(js.Any.fromFunction2(mapStream))
    if (pack != null) __obj.updateDynamic("pack")(pack)
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (strip != null) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    if (umask != null) __obj.updateDynamic("umask")(umask.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[PackOptions]
  }
}

