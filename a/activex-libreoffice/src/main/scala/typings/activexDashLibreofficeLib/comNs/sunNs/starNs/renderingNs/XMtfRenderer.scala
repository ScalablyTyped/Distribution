package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMtfRenderer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def draw(fScaleX: scala.Double, fScaleY: scala.Double): scala.Unit
  def setMetafile(aMtf: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
}

object XMtfRenderer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    draw: js.Function2[scala.Double, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setMetafile: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit]
  ): XMtfRenderer = {
    val __obj = js.Dynamic.literal(acquire = acquire, draw = draw, queryInterface = queryInterface, release = release, setMetafile = setMetafile)
  
    __obj.asInstanceOf[XMtfRenderer]
  }
}

