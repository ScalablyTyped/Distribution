package typings
package atAngularCoreLib.srcZoneNgUnderscoreZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/zone/ng_zone", "NoopNgZone")
@js.native
class NoopNgZone () extends NgZone {
  def run(fn: js.Function0[_]): js.Any = js.native
  def runGuarded(fn: js.Function0[_]): js.Any = js.native
  def runOutsideAngular(fn: js.Function0[_]): js.Any = js.native
  def runTask[T](fn: js.Function0[_]): js.Any = js.native
}

