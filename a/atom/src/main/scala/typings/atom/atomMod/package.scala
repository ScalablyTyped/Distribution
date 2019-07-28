package typings.atom

import typings.atom.Anon_Description
import typings.atom.atomStrings.created
import typings.atom.atomStrings.deleted
import typings.atom.atomStrings.modified
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atomMod {
  type CommandRegistryListener[TargetType /* <: EventTarget */] = Anon_Description[TargetType] | (js.Function1[/* event */ CommandEvent[TargetType], Unit | js.Promise[Unit]])
  type FilesystemChange = (FilesystemChangeBasic[created | modified | deleted]) | FilesystemChangeRename
  type FilesystemChangeEvent = js.Array[FilesystemChange]
  type PointCompatible = PointLike | (js.Tuple2[Double, Double])
  type RangeCompatible = RangeLike | (js.Tuple2[PointLike | (js.Tuple2[Double, Double]), PointLike | (js.Tuple2[Double, Double])])
  type TestRunner = js.Function1[/* params */ TestRunnerParams, js.Promise[Double]]
}
