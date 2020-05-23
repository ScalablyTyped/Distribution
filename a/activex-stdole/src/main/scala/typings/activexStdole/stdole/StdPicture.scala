package typings.activexStdole.stdole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StdPicture extends js.Object {
  val Handle: Double
  val Height: Double
  val Type: Double
  val Width: Double
  val hPal: Double
  @JSName("stdole.StdPicture_typekey")
  var stdoleDotStdPicture_typekey: StdPicture
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
  ): Unit
}

object StdPicture {
  @scala.inline
  def apply(
    Handle: Double,
    Height: Double,
    Render: (Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    Type: Double,
    Width: Double,
    hPal: Double,
    stdoleDotStdPicture_typekey: StdPicture
  ): StdPicture = {
    val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Render = js.Any.fromFunction9(Render), Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], hPal = hPal.asInstanceOf[js.Any])
    __obj.updateDynamic("stdole.StdPicture_typekey")(stdoleDotStdPicture_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StdPicture]
  }
}

