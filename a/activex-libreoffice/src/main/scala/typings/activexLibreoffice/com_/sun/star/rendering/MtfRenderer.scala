package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MtfRenderer extends XMtfRenderer {
  def createWithBitmapCanvas(Canvas: XBitmapCanvas): Unit = js.native
}

object MtfRenderer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createWithBitmapCanvas: XBitmapCanvas => Unit,
    draw: (Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setMetafile: SeqEquiv[Double] => Unit
  ): MtfRenderer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createWithBitmapCanvas = js.Any.fromFunction1(createWithBitmapCanvas), draw = js.Any.fromFunction2(draw), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setMetafile = js.Any.fromFunction1(setMetafile))
    __obj.asInstanceOf[MtfRenderer]
  }
  @scala.inline
  implicit class MtfRendererOps[Self <: MtfRenderer] (val x: Self) extends AnyVal {
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
    def setCreateWithBitmapCanvas(value: XBitmapCanvas => Unit): Self = this.set("createWithBitmapCanvas", js.Any.fromFunction1(value))
  }
  
}

