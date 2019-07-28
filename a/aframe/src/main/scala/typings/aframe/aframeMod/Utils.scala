package typings.aframe.aframeMod

import typings.aframe.Anon_CheckHasPositionalTracking
import typings.aframe.Anon_ComponentNameDelimiter
import typings.aframe.Anon_Coord
import typings.aframe.Anon_Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  var coordinates: Anon_Coord = js.native
  var device: Anon_CheckHasPositionalTracking = js.native
  var entity: Anon_ComponentNameDelimiter = js.native
  var styleParser: Anon_Data = js.native
  def deepEqual(a: js.Any, b: js.Any): Boolean = js.native
  def diff(a: js.Object, b: js.Object): js.Object = js.native
  def extend(target: js.Object, source: js.Object*): js.Object = js.native
  def extendDeep(target: js.Object, source: js.Object*): js.Object = js.native
  def throttle(tickFunction: js.Function0[Unit], minimumInterval: Double): js.Function2[/* t */ Double, /* dt */ Double, Unit] = js.native
  def throttle(tickFunction: js.Function0[Unit], minimumInterval: Double, optionalContext: js.Object): js.Function2[/* t */ Double, /* dt */ Double, Unit] = js.native
  def throttleTick(tickFunction: js.Function2[/* t */ Double, /* dt */ Double, Unit], minimumInterval: Double): js.Function2[/* t */ Double, /* dt */ Double, Unit] = js.native
  def throttleTick(
    tickFunction: js.Function2[/* t */ Double, /* dt */ Double, Unit],
    minimumInterval: Double,
    optionalContext: js.Object
  ): js.Function2[/* t */ Double, /* dt */ Double, Unit] = js.native
}

