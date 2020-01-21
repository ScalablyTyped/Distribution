package typings.aframe.mod

import typings.aframe.AnonCheckHasPositionalTracking
import typings.aframe.AnonComponentNameDelimiter
import typings.aframe.AnonCoord
import typings.aframe.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils_ extends js.Object {
  var coordinates: AnonCoord = js.native
  var device: AnonCheckHasPositionalTracking = js.native
  var entity: AnonComponentNameDelimiter = js.native
  var styleParser: AnonData = js.native
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

