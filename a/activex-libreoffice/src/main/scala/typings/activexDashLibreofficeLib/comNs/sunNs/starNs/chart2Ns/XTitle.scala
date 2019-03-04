package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTitle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  var Text: activexDashInteropLib.SafeArray[XFormattedString]
  def getText(): activexDashInteropLib.SafeArray[XFormattedString]
  def setText(Strings: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XFormattedString]): scala.Unit
}

object XTitle {
  @scala.inline
  def apply(
    Text: activexDashInteropLib.SafeArray[XFormattedString],
    acquire: js.Function0[scala.Unit],
    getText: js.Function0[activexDashInteropLib.SafeArray[XFormattedString]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setText: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XFormattedString], scala.Unit]
  ): XTitle = {
    val __obj = js.Dynamic.literal(Text = Text, acquire = acquire, getText = getText, queryInterface = queryInterface, release = release, setText = setText)
  
    __obj.asInstanceOf[XTitle]
  }
}

