package typings.activexDashStdole.stdole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("stdole.StdPicture")
@js.native
class StdPicture protected () extends js.Object {
  val Handle: Double = js.native
  val Height: Double = js.native
  val Type: Double = js.native
  val Width: Double = js.native
  val hPal: Double = js.native
  @JSName("stdole.StdPicture_typekey")
  var stdoleDotStdPicture_typekey: StdPicture = js.native
  def Render(
    hdc: Double,
    x: Double,
    y: Double,
    cx: Double,
    cy: Double,
    xSrc: Double,
    ySrc: Double,
    cxSrc: Double,
    cySrc: Double
  ): Unit = js.native
}

