package typings
package activexDashWiaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  var `WIA.CommonDialog`: activexDashWiaLib.WIANs.CommonDialog = js.native
  var `WIA.DeviceManager`: activexDashWiaLib.WIANs.DeviceManager = js.native
  var `WIA.ImageFile`: activexDashWiaLib.WIANs.ImageFile = js.native
  var `WIA.ImageProcess`: activexDashWiaLib.WIANs.ImageProcess = js.native
  var `WIA.Rational`: activexDashWiaLib.WIANs.Rational = js.native
  @JSName("WIA.Vector")
  var `WIA.Vector_Original`: activexDashWiaLib.WIANs.Vector[_] = js.native
  /** Returns the specified item in the vector by position */
  def `WIA.Vector`(Index: scala.Double): js.Any = js.native
}

