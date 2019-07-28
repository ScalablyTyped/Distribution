package typings.adone.adoneNs.archiveNs.tarNs.INs

import typings.adone.adoneNs.archiveNs.tarNs.RawUnpackStream
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnpackOptions extends CommonOptions {
  /**
    * Whether to change owner of the files
    */
  var chown: js.UndefOr[Boolean] = js.undefined
  /**
    * Copies a file if cannot create a link
    */
  var hardlinkAsFilesFallback: js.UndefOr[Boolean] = js.undefined
  /**
    * Input read stream modifier, called for each entry
    */
  var mapStream: js.UndefOr[js.Function2[/* stream */ UnpackSourceStream, /* header */ Header, Readable]] = js.undefined
  /**
    * A custom unpack stream
    */
  var unpack: js.UndefOr[RawUnpackStream] = js.undefined
  /**
    * Whether to change time properties of files
    */
  var utimes: js.UndefOr[Boolean] = js.undefined
}

object UnpackOptions {
  @scala.inline
  def apply(
    chown: js.UndefOr[Boolean] = js.undefined,
    dmode: Int | Double = null,
    fmode: Int | Double = null,
    hardlinkAsFilesFallback: js.UndefOr[Boolean] = js.undefined,
    ignore: /* name */ String => Boolean = null,
    map: /* header */ Header => js.UndefOr[Header] = null,
    mapStream: (/* stream */ UnpackSourceStream, /* header */ Header) => Readable = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    strip: Int | Double = null,
    umask: Int | Double = null,
    unpack: RawUnpackStream = null,
    utimes: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): UnpackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chown)) __obj.updateDynamic("chown")(chown)
    if (dmode != null) __obj.updateDynamic("dmode")(dmode.asInstanceOf[js.Any])
    if (fmode != null) __obj.updateDynamic("fmode")(fmode.asInstanceOf[js.Any])
    if (!js.isUndefined(hardlinkAsFilesFallback)) __obj.updateDynamic("hardlinkAsFilesFallback")(hardlinkAsFilesFallback)
    if (ignore != null) __obj.updateDynamic("ignore")(js.Any.fromFunction1(ignore))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (mapStream != null) __obj.updateDynamic("mapStream")(js.Any.fromFunction2(mapStream))
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (strip != null) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    if (umask != null) __obj.updateDynamic("umask")(umask.asInstanceOf[js.Any])
    if (unpack != null) __obj.updateDynamic("unpack")(unpack)
    if (!js.isUndefined(utimes)) __obj.updateDynamic("utimes")(utimes)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[UnpackOptions]
  }
}

