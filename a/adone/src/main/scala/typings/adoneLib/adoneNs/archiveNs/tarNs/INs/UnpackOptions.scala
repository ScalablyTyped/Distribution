package typings
package adoneLib.adoneNs.archiveNs.tarNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UnpackOptions extends CommonOptions {
  /**
                       * Whether to change owner of the files
                       */
  var chown: js.UndefOr[scala.Boolean] = js.undefined
  /**
                       * Copies a file if cannot create a link
                       */
  var hardlinkAsFilesFallback: js.UndefOr[scala.Boolean] = js.undefined
  /**
                       * Input read stream modifier, called for each entry
                       */
  var mapStream: js.UndefOr[
    js.Function2[/* stream */ UnpackSourceStream, /* header */ Header, nodeLib.streamMod.Readable]
  ] = js.undefined
  /**
                       * A custom unpack stream
                       */
  var unpack: js.UndefOr[adoneLib.adoneNs.archiveNs.tarNs.RawUnpackStream] = js.undefined
  /**
                       * Whether to change time properties of files
                       */
  var utimes: js.UndefOr[scala.Boolean] = js.undefined
}

