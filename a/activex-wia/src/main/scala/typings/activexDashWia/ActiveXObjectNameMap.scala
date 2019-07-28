package typings.activexDashWia

import typings.activexDashWia.WIANs.CommonDialog
import typings.activexDashWia.WIANs.DeviceManager
import typings.activexDashWia.WIANs.ImageFile
import typings.activexDashWia.WIANs.ImageProcess
import typings.activexDashWia.WIANs.Rational
import typings.activexDashWia.WIANs.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  var `WIA.CommonDialog`: CommonDialog = js.native
  var `WIA.DeviceManager`: DeviceManager = js.native
  var `WIA.ImageFile`: ImageFile = js.native
  var `WIA.ImageProcess`: ImageProcess = js.native
  var `WIA.Rational`: Rational = js.native
  @JSName("WIA.Vector")
  var `WIA.Vector_Original`: Vector[_] = js.native
  /** Returns the specified item in the vector by position */
  def `WIA.Vector`(Index: Double): js.Any = js.native
}

