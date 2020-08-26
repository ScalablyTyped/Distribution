package typings.activexStdole.stdole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StdPicture extends js.Object {
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
    cySrc: Double,
    prcWBounds: js.UndefOr[scala.Nothing]
  ): Unit = js.native
}

object StdPicture {
  @scala.inline
  def apply(
    Handle: Double,
    Height: Double,
    Render: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.UndefOr[scala.Nothing]) => Unit,
    Type: Double,
    Width: Double,
    hPal: Double,
    stdoleDotStdPicture_typekey: StdPicture
  ): StdPicture = {
    val __obj = js.Dynamic.literal(Handle = Handle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Render = js.Any.fromFunction10(Render), Type = Type.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], hPal = hPal.asInstanceOf[js.Any])
    __obj.updateDynamic("stdole.StdPicture_typekey")(stdoleDotStdPicture_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StdPicture]
  }
  @scala.inline
  implicit class StdPictureOps[Self <: StdPicture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandle(value: Double): Self = this.set("Handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setRender(
      value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.UndefOr[scala.Nothing]) => Unit
    ): Self = this.set("Render", js.Any.fromFunction10(value))
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def setHPal(value: Double): Self = this.set("hPal", value.asInstanceOf[js.Any])
    @scala.inline
    def setStdoleDotStdPicture_typekey(value: StdPicture): Self = this.set("stdole.StdPicture_typekey", value.asInstanceOf[js.Any])
  }
  
}

