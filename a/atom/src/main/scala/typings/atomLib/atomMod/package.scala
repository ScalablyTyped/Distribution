package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atomMod {
  type CommandRegistryListener[TargetType /* <: stdLib.EventTarget */] = atomLib.Anon_Description[TargetType] | (js.Function1[/* event */ CommandEvent[TargetType], scala.Unit | js.Promise[scala.Unit]])
  type FilesystemChange = (FilesystemChangeBasic[
    atomLib.atomLibStrings.created | atomLib.atomLibStrings.modified | atomLib.atomLibStrings.deleted
  ]) | FilesystemChangeRename
  type FilesystemChangeEvent = js.Array[FilesystemChange]
  type PointCompatible = PointLike | (js.Tuple2[scala.Double, scala.Double])
  type RangeCompatible = RangeLike | (js.Tuple2[PointLike, PointLike]) | (js.Tuple2[PointLike, js.Tuple2[scala.Double, scala.Double]]) | (js.Tuple2[js.Tuple2[scala.Double, scala.Double], PointLike]) | (js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]])
  type TestRunner = js.Function1[/* params */ TestRunnerParams, js.Promise[scala.Double]]
}
