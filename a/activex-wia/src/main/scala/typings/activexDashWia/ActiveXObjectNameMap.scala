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
  @JSName("WIA.CommonDialog")
  var WIADotCommonDialog: CommonDialog = js.native
  @JSName("WIA.DeviceManager")
  var WIADotDeviceManager: DeviceManager = js.native
  @JSName("WIA.ImageFile")
  var WIADotImageFile: ImageFile = js.native
  @JSName("WIA.ImageProcess")
  var WIADotImageProcess: ImageProcess = js.native
  @JSName("WIA.Rational")
  var WIADotRational: Rational = js.native
  @JSName("WIA.Vector")
  var WIADotVector_Original: Vector[_] = js.native
  /** Returns the specified item in the vector by position */
  @JSName("WIA.Vector")
  def WIADotVector(Index: Double): js.Any = js.native
}

