package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  var coordinates: aframeLib.Anon_IsCoordinate = js.native
  var device: aframeLib.Anon_IsMobile = js.native
  var entity: aframeLib.Anon_GetComponentProperty = js.native
  var styleParser: aframeLib.Anon_Stringify = js.native
  def deepEqual(a: js.Any, b: js.Any): scala.Boolean = js.native
  def diff(a: js.Object, b: js.Object): js.Object = js.native
  def extend(target: js.Object, source: js.Object*): js.Object = js.native
  def extendDeep(target: js.Object, source: js.Object*): js.Object = js.native
  def throttle(tickFunction: js.Function0[scala.Unit], minimumInterval: scala.Double): js.Function2[/* t */ scala.Double, /* dt */ scala.Double, scala.Unit] = js.native
  def throttle(tickFunction: js.Function0[scala.Unit], minimumInterval: scala.Double, optionalContext: js.Object): js.Function2[/* t */ scala.Double, /* dt */ scala.Double, scala.Unit] = js.native
  def throttleTick(
    tickFunction: js.Function2[/* t */ scala.Double, /* dt */ scala.Double, scala.Unit],
    minimumInterval: scala.Double
  ): js.Function2[/* t */ scala.Double, /* dt */ scala.Double, scala.Unit] = js.native
  def throttleTick(
    tickFunction: js.Function2[/* t */ scala.Double, /* dt */ scala.Double, scala.Unit],
    minimumInterval: scala.Double,
    optionalContext: js.Object
  ): js.Function2[/* t */ scala.Double, /* dt */ scala.Double, scala.Unit] = js.native
}

