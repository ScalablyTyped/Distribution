package typings
package adoneLib.adoneNs.compressorNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zlibNs {
  type DecompressStreamOptions = CommonOptions
  type DeflateInfo = Info[nodeLib.zlibMod.Deflate]
  type DeflateRawInfo = Info[nodeLib.zlibMod.DeflateRaw]
  type GunzipInfo = Info[nodeLib.zlibMod.Gzip]
  type GzipInfo = Info[nodeLib.zlibMod.Gzip]
  type InflateInfo = Info[nodeLib.zlibMod.Inflate]
  type InflateRawInfo = Info[nodeLib.zlibMod.InflateRaw]
  type TypedArray = stdLib.Int8Array | stdLib.Uint8Array | stdLib.Uint8ClampedArray | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array | stdLib.Float32Array | stdLib.Float64Array
}
