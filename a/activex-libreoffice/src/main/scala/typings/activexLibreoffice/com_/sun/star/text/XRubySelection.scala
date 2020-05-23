package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface enables the object to handle list of ruby lines (aka Furigana lines). */
trait XRubySelection extends XInterface {
  /**
    * returns a sequence of ruby elements.
    *
    * Each element contains at least a string that contains the selected text and the ruby text. Additional parameters can be the ruby adjustment, the name
    * of a character style.
    * @param Automatic if Automatic is set the selection is parsed for words and applied ruby attributes
    * @returns a sequence of ruby properties
    */
  def getRubyList(Automatic: Boolean): SafeArray[PropertyValues]
  /**
    * applies the RubyList to the current selection. The number of elements must be equal to the number of elements that are returned by getRubyList.
    * Automatic must be set equally, too.
    */
  def setRubyList(RubyList: SeqEquiv[PropertyValues], Automatic: Boolean): Unit
}

object XRubySelection {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getRubyList: Boolean => SafeArray[PropertyValues],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setRubyList: (SeqEquiv[PropertyValues], Boolean) => Unit
  ): XRubySelection = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getRubyList = js.Any.fromFunction1(getRubyList), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRubyList = js.Any.fromFunction2(setRubyList))
    __obj.asInstanceOf[XRubySelection]
  }
}

