package typings.adone.adoneNs.archiveNs.tarNs.INs

import typings.adone.adoneNs.archiveNs.tarNs.RawPackStream
import typings.adone.adoneNs.fsNs.INs.ReadStream
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackOptions extends CommonOptions {
  /**
    * Pack the contents of the symlink instead of the link itself, false by default
    */
  var dereference: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies which entries to pack, all by default
    */
  var entries: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Input read stream modifier, called for each entry
    */
  var mapStream: js.UndefOr[js.Function2[/* stream */ ReadStream, /* header */ Header, Readable]] = js.undefined
  /**
    * A custom initial pack stream
    */
  var pack: js.UndefOr[RawPackStream] = js.undefined
  /**
    * Whether to sort entries before packing
    */
  var sort: js.UndefOr[Boolean] = js.undefined
  /**
    * set false to ignore errors due to unsupported entry types (like device files), true by default
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}

object PackOptions {
  @scala.inline
  def apply(
    dereference: js.UndefOr[Boolean] = js.undefined,
    dmode: Int | Double = null,
    entries: js.Array[String] = null,
    fmode: Int | Double = null,
    ignore: /* name */ String => Boolean = null,
    map: /* header */ Header => js.UndefOr[Header] = null,
    mapStream: (/* stream */ ReadStream, /* header */ Header) => Readable = null,
    pack: RawPackStream = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    strip: Int | Double = null,
    umask: Int | Double = null,
    writable: js.UndefOr[Boolean] = js.undefined
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

