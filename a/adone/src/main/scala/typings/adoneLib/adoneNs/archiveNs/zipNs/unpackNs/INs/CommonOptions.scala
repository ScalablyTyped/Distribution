package typings
package adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
    * Causes unpacker to decode strings with CP437 or UTF-8 as required by the spec.
    *
    * When turned off zipfile.comment, entry.fileName, and entry.fileComment will be Buffer,
    * any Info-ZIP Unicode Path Extra Field will be ignored, automatic file name validation will not be performed
    */
  var decodeStrings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates that entries should be read only when readEntry() is called.
    * If lazyEntries is false, entry events will be emitted as fast as possible
    * to allow pipe()-ing file data from all entries in parallel.
    *
    * Default is false
    */
  var lazyEntries: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ensures that an entry's reported uncompressed size matches its actual uncompressed size
    */
  var validateEntrySizes: js.UndefOr[scala.Boolean] = js.undefined
}

