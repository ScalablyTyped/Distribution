package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface enables the object to handle list of ruby lines (aka Furigana lines). */
trait XRubySelection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a sequence of ruby elements.
    *
    * Each element contains at least a string that contains the selected text and the ruby text. Additional parameters can be the ruby adjustment, the name
    * of a character style.
    * @param Automatic if Automatic is set the selection is parsed for words and applied ruby attributes
    * @returns a sequence of ruby properties
    */
  def getRubyList(Automatic: scala.Boolean): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues]
  /**
    * applies the RubyList to the current selection. The number of elements must be equal to the number of elements that are returned by getRubyList.
    * Automatic must be set equally, too.
    */
  def setRubyList(
    RubyList: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues],
    Automatic: scala.Boolean
  ): scala.Unit
}

object XRubySelection {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getRubyList: scala.Boolean => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setRubyList: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues], scala.Boolean) => scala.Unit
  ): XRubySelection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getRubyList = js.Any.fromFunction1(getRubyList), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRubyList = js.Any.fromFunction2(setRubyList))
  
    __obj.asInstanceOf[XRubySelection]
  }
}

