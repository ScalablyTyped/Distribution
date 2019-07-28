package typings.activexDashLibreoffice.comNs.sunNs.starNs.renderingNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MtfRenderer extends XMtfRenderer {
  def createWithBitmapCanvas(Canvas: XBitmapCanvas): Unit
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
}

