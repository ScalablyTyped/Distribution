package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the access to a container of database forms.
  * @see Forms
  */
trait XFormDocumentsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the container of forms.
    * @returns the form documents
    * @see Forms
    */
  val FormDocuments: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * returns the container of forms.
    * @returns the form documents
    * @see Forms
    */
  def getFormDocuments(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XFormDocumentsSupplier {
  @scala.inline
  def apply(
    FormDocuments: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getFormDocuments: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFormDocumentsSupplier = {
    val __obj = js.Dynamic.literal(FormDocuments = FormDocuments, acquire = acquire, getFormDocuments = getFormDocuments, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFormDocumentsSupplier]
  }
}

