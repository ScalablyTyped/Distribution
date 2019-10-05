package typings.activexDashWia

import typings.activexDashWia.WIA.CommonDialog
import typings.activexDashWia.WIA.DeviceManager
import typings.activexDashWia.WIA.ImageFile
import typings.activexDashWia.WIA.ImageProcess
import typings.activexDashWia.WIA.Rational
import typings.activexDashWia.WIA.Vector
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

