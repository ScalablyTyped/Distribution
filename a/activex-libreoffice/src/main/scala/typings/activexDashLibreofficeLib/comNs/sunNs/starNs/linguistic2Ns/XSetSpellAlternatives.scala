package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to modify the suggestion list returned by a spell checker.
  *
  * Basically this is needed to post-add further suggestions while keeping the originally returned reference from the spell checker. E.g. from the user
  * dictionaries.
  * @see com.sun.star.linguistic2.XSpellAlternatives
  */
trait XSetSpellAlternatives
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * set the list of suggestions to be returned.
    * @since OOo 3.0.1
    */
  def setAlternatives(aAlternatives: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): scala.Unit
  /**
    * set the type of error found.
    * @see com.sun.star.linguistic2.SpellFailure
    * @since OOo 3.0.1
    */
  def setFailureType(nFailureType: scala.Double): scala.Unit
}

