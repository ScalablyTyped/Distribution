package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XBrowseHistoryRegistry
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @deprecated Deprecated */
  def createNewEntry(
    URL: java.lang.String,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Title: java.lang.String
  ): scala.Unit
  /** @deprecated Deprecated */
  def updateViewData(Value: js.Any): scala.Unit
}

object XBrowseHistoryRegistry {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createNewEntry: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      java.lang.String, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    updateViewData: js.Function1[js.Any, scala.Unit]
  ): XBrowseHistoryRegistry = {
    val __obj = js.Dynamic.literal(acquire = acquire, createNewEntry = createNewEntry, queryInterface = queryInterface, release = release, updateViewData = updateViewData)
  
    __obj.asInstanceOf[XBrowseHistoryRegistry]
  }
}

