package typings
package adoneLib.adoneNs.compressorNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lzmaNs {
  type Coder = adoneLib.adoneLibStrings.easyEncoder | adoneLib.adoneLibStrings.autoDecoder | adoneLib.adoneLibStrings.aloneEncoder | adoneLib.adoneLibStrings.aloneDecoder | adoneLib.adoneLibStrings.rawEncoder | adoneLib.adoneLibStrings.rawDecoder | adoneLib.adoneLibStrings.streamEncoder | adoneLib.adoneLibStrings.streamDecoder
  type Filters = js.Array[Filter | DeltaFilter | LZMAFilter]
}
