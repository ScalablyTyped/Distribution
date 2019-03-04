package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the DDE link results.
  * @see com.sun.star.sheet.DDELink
  * @since OOo 3.0
  */
trait XDDELinkResults
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the DDE link results.
    * @returns the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row.
    */
  val Results: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]
  /**
    * returns the DDE link results.
    * @returns the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row.
    */
  def getResults(): activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]
  /**
    * sets the DDE link results.
    * @param aResults the DDE link results. The outer sequence contains the value rows. The inner sequences contain the result values for one row. If the oute
    */
  def setResults(
    aResults: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]
  ): scala.Unit
}

object XDDELinkResults {
  @scala.inline
  def apply(
    Results: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]],
    acquire: js.Function0[scala.Unit],
    getResults: js.Function0[activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setResults: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      scala.Unit
    ]
  ): XDDELinkResults = {
    val __obj = js.Dynamic.literal(Results = Results, acquire = acquire, getResults = getResults, queryInterface = queryInterface, release = release, setResults = setResults)
  
    __obj.asInstanceOf[XDDELinkResults]
  }
}

