package typings
package adoneLib.adoneNs.fsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object INs {
  type Encoding = adoneLib.adoneLibStrings.ascii | adoneLib.adoneLibStrings.utf8 | adoneLib.adoneLibStrings.utf16le | adoneLib.adoneLibStrings.usc2 | adoneLib.adoneLibStrings.base64 | adoneLib.adoneLibStrings.latin1 | adoneLib.adoneLibStrings.binary | adoneLib.adoneLibStrings.hex
  type FD = scala.Double
  type Flag = adoneLib.adoneLibStrings.r | adoneLib.adoneLibStrings.`r+` | adoneLib.adoneLibStrings.`rs+` | adoneLib.adoneLibStrings.w | adoneLib.adoneLibStrings.wx | adoneLib.adoneLibStrings.`w+` | adoneLib.adoneLibStrings.`wx+` | adoneLib.adoneLibStrings.a | adoneLib.adoneLibStrings.ax | adoneLib.adoneLibStrings.`a+` | adoneLib.adoneLibStrings.`ax+`
  type ReadStream = nodeLib.fsMod.ReadStream
  type ReaddirpFilter = java.lang.String | (js.Function1[/* entry */ ReaddirpEntry, scala.Boolean])
  type Stats = nodeLib.fsMod.Stats
  type SymlinkType = adoneLib.adoneLibStrings.dir | adoneLib.adoneLibStrings.file | adoneLib.adoneLibStrings.junction
  type URL = nodeLib.urlMod.URL
  type WriteStream = nodeLib.fsMod.WriteStream
}
