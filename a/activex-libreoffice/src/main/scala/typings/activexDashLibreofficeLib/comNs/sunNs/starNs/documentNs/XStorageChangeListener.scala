package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to be notified when a document is switched to a new storage. */
trait XStorageChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called when document switches to another storage.
    * @param xDocument the document that has changed the storage it is based on
    * @param xStorage the new storage the document is based on
    */
  def notifyStorageChange(
    xDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage
  ): scala.Unit
}

object XStorageChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    notifyStorageChange: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XStorageChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, notifyStorageChange = notifyStorageChange, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XStorageChangeListener]
  }
}

