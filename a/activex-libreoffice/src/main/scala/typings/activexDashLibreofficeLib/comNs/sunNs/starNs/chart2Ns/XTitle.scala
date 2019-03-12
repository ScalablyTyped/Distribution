package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTitle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  var Text: stdLib.SafeArray[XFormattedString]
  def getText(): stdLib.SafeArray[XFormattedString]
  def setText(Strings: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XFormattedString]): scala.Unit
}

object XTitle {
  @scala.inline
  def apply(
    Text: stdLib.SafeArray[XFormattedString],
    acquire: () => scala.Unit,
    getText: () => stdLib.SafeArray[XFormattedString],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setText: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XFormattedString] => scala.Unit
  ): XTitle = {
    val __obj = js.Dynamic.literal(Text = Text, acquire = js.Any.fromFunction0(acquire), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[XTitle]
  }
}

