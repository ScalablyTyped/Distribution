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

