package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atomMod {
  type CommandRegistryListener[TargetType /* <: stdLib.EventTarget */] = atomLib.Anon_HiddenInCommandPalette[TargetType] | (js.Function1[/* event */ CommandEvent[TargetType], scala.Unit | js.Promise[scala.Unit]])
  type ContextMenuOptions = ContextMenuItemOptions | atomLib.Anon_Type
  type FileEncoding = atomLib.atomLibStrings.iso88596 | atomLib.atomLibStrings.windows1256 | atomLib.atomLibStrings.iso88594 | atomLib.atomLibStrings.windows1257 | atomLib.atomLibStrings.iso885914 | atomLib.atomLibStrings.iso88592 | atomLib.atomLibStrings.windows1250 | atomLib.atomLibStrings.gb18030 | atomLib.atomLibStrings.gbk | atomLib.atomLibStrings.cp950 | atomLib.atomLibStrings.big5hkscs | atomLib.atomLibStrings.cp866 | atomLib.atomLibStrings.iso88595 | atomLib.atomLibStrings.koi8r | atomLib.atomLibStrings.koi8u | atomLib.atomLibStrings.windows1251 | atomLib.atomLibStrings.cp437 | atomLib.atomLibStrings.cp850 | atomLib.atomLibStrings.iso885913 | atomLib.atomLibStrings.iso88597 | atomLib.atomLibStrings.windows1253 | atomLib.atomLibStrings.iso88598 | atomLib.atomLibStrings.windows1255 | atomLib.atomLibStrings.cp932 | atomLib.atomLibStrings.eucjp | atomLib.atomLibStrings.shiftjis | atomLib.atomLibStrings.euckr | atomLib.atomLibStrings.iso885910 | atomLib.atomLibStrings.iso885916 | atomLib.atomLibStrings.iso88599 | atomLib.atomLibStrings.windows1254 | atomLib.atomLibStrings.utf8 | atomLib.atomLibStrings.utf16le | atomLib.atomLibStrings.utf16be | atomLib.atomLibStrings.windows1258 | atomLib.atomLibStrings.iso88591 | atomLib.atomLibStrings.iso88593 | atomLib.atomLibStrings.iso885915 | atomLib.atomLibStrings.macroman | atomLib.atomLibStrings.windows1252
  type FilesystemChange = (FilesystemChangeBasic[
    atomLib.atomLibStrings.created | atomLib.atomLibStrings.modified | atomLib.atomLibStrings.deleted
  ]) | FilesystemChangeRename
  type FilesystemChangeEvent = js.Array[FilesystemChange]
  type PointCompatible = PointLike | (js.Tuple2[scala.Double, scala.Double])
  type RangeCompatible = RangeLike | (js.Tuple2[PointLike, PointLike]) | (js.Tuple2[PointLike, js.Tuple2[scala.Double, scala.Double]]) | (js.Tuple2[js.Tuple2[scala.Double, scala.Double], PointLike]) | (js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]])
  type TestRunner = js.Function1[/* params */ TestRunnerParams, js.Promise[scala.Double]]
  type TooltipPlacement = atomLib.atomLibStrings.top | atomLib.atomLibStrings.bottom | atomLib.atomLibStrings.left | atomLib.atomLibStrings.right | atomLib.atomLibStrings.auto | (atomLib.atomLibStrings.`auto top`) | (atomLib.atomLibStrings.`auto bottom`) | (atomLib.atomLibStrings.`auto left`) | (atomLib.atomLibStrings.`auto right`)
}
