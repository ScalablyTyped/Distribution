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
  def load(Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.RevisionTag]
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
    acquire: js.Function0[scala.Unit],
    load: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.RevisionTag]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    store: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.RevisionTag], 
      scala.Unit
    ]
  ): XDocumentRevisionListPersistence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[XDocumentRevisionListPersistence]
  }
}

