package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MtfRenderer extends XMtfRenderer {
  def createWithBitmapCanvas(Canvas: XBitmapCanvas): scala.Unit
}

object MtfRenderer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createWithBitmapCanvas: js.Function1[XBitmapCanvas, scala.Unit],
    draw: js.Function2[scala.Double, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setMetafile: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit]
  ): MtfRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createWithBitmapCanvas")(createWithBitmapCanvas)
    __obj.updateDynamic("draw")(draw)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setMetafile")(setMetafile)
    __obj.asInstanceOf[MtfRenderer]
  }
}

