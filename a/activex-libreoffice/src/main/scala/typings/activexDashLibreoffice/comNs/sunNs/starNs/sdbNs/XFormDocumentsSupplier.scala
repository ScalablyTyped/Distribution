package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the access to a container of database forms.
  * @see Forms
  */
trait XFormDocumentsSupplier extends XInterface {
  /**
    * returns the container of forms.
    * @returns the form documents
    * @see Forms
    */
  val FormDocuments: XNameAccess
  /**
    * returns the container of forms.
    * @returns the form documents
    * @see Forms
    */
  def getFormDocuments(): XNameAccess
}

object XFormDocumentsSupplier {
  @scala.inline
  def apply(
    FormDocuments: XNameAccess,
    acquire: () => Unit,
    getFormDocuments: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFormDocumentsSupplier = {
    val __obj = js.Dynamic.literal(FormDocuments = FormDocuments, acquire = js.Any.fromFunction0(acquire), getFormDocuments = js.Any.fromFunction0(getFormDocuments), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFormDocumentsSupplier]
  }
}

