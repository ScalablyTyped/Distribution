package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTitle extends XInterface {
  var Text: SafeArray[XFormattedString]
  def getText(): SafeArray[XFormattedString]
  def setText(Strings: SeqEquiv[XFormattedString]): Unit
}

object XTitle {
  @scala.inline
  def apply(
    Text: SafeArray[XFormattedString],
    acquire: () => Unit,
    getText: () => SafeArray[XFormattedString],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setText: SeqEquiv[XFormattedString] => Unit
  ): XTitle = {
    val __obj = js.Dynamic.literal(Text = Text, acquire = js.Any.fromFunction0(acquire), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[XTitle]
  }
}

