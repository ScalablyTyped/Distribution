package typings.adone.adoneNs.compressorNs.INs

import typings.node.zlibMod.Deflate
import typings.node.zlibMod.DeflateRaw
import typings.node.zlibMod.Gzip
import typings.node.zlibMod.Inflate
import typings.node.zlibMod.InflateRaw
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zlibNs {
  type DecompressStreamOptions = CommonOptions
  type DeflateInfo = Info[Deflate]
  type DeflateRawInfo = Info[DeflateRaw]
  type GunzipInfo = Info[Gzip]
  type GzipInfo = Info[Gzip]
  type InflateInfo = Info[Inflate]
  type InflateRawInfo = Info[InflateRaw]
  type TypedArray = Int8Array | Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array
}
