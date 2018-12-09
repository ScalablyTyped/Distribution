package typings
package adoneLib.adoneNs.compressorNs.deflateNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DecompressStreamOptions
  extends adoneLib.adoneNs.compressorNs.INs.zlibNs.CommonOptions {
  var dictionary: js.UndefOr[
    nodeLib.Buffer | stdLib.DataView | adoneLib.adoneNs.compressorNs.INs.zlibNs.TypedArray
  ] = js.undefined
}

