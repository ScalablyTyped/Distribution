package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the DDE link results.
  * @see com.sun.star.sheet.DDELink
  * @since OOo 3.0
  */
trait XDDELinkResults extends XInterface {
  /**
    * returns the DDE link results.
    * @returns the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row.
    */
  val Results: SafeArray[SafeArray[_]]
  /**
    * returns the DDE link results.
    * @returns the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row.
    */
  def getResults(): SafeArray[SafeArray[_]]
  /**
    * sets the DDE link results.
    * @param aResults the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row. If the oute
    */
  def setResults(aResults: SeqEquiv[SeqEquiv[_]]): Unit
}

object XDDELinkResults {
  @scala.inline
  def apply(
    Results: SafeArray[SafeArray[_]],
    acquire: () => Unit,
    getResults: () => SafeArray[SafeArray[_]],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setResults: SeqEquiv[SeqEquiv[_]] => Unit
  ): XDDELinkResults = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getResults = js.Any.fromFunction0(getResults), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setResults = js.Any.fromFunction1(setResults))
    __obj.asInstanceOf[XDDELinkResults]
  }
}

