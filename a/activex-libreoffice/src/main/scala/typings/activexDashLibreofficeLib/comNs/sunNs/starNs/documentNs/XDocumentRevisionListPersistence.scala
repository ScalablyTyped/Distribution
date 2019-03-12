package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** interface to load or store a list of document revisions from or to a document using the packed XML file format */
trait XDocumentRevisionListPersistence
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Loads a list of available revisions from a storage
    *
    * This method does not load any revision itself
    */
  def load(Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.RevisionTag]
  /**
    * Stores a list of available revisions to a storage
    *
    * This method does not store revisions themselves
    */
  def store(
    Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    List: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.RevisionTag]
  ): scala.Unit
}

object XDocumentRevisionListPersistence {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    load: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.RevisionTag],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    store: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.RevisionTag]) => scala.Unit
  ): XDocumentRevisionListPersistence = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), load = js.Any.fromFunction1(load), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), store = js.Any.fromFunction2(store))
  
    __obj.asInstanceOf[XDocumentRevisionListPersistence]
  }
}

