package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.XStorage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * through this interface documents can provide access to their substorages
  *
  * A temporary interface to get access to documents substorages.
  */
trait XDocumentSubStorageSupplier extends XInterface {
  /**
    * provides the list of substorages
    * @returns sequence of substorages names
    */
  val DocumentSubStoragesNames: SafeArray[String]
  /**
    * provides the access to a substorage with specified name
    * @param StorageName the name of requested substorage
    * @param nMode a mode the storage should be opened in can take value from {@link com.sun.star.embed.ElementModes}
    * @returns XStorage implementation that refers to specified substorage
    */
  def getDocumentSubStorage(StorageName: String, nMode: Double): XStorage
  /**
    * provides the list of substorages
    * @returns sequence of substorages names
    */
  def getDocumentSubStoragesNames(): SafeArray[String]
}

object XDocumentSubStorageSupplier {
  @scala.inline
  def apply(
    DocumentSubStoragesNames: SafeArray[String],
    acquire: () => Unit,
    getDocumentSubStorage: (String, Double) => XStorage,
    getDocumentSubStoragesNames: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentSubStorageSupplier = {
    val __obj = js.Dynamic.literal(DocumentSubStoragesNames = DocumentSubStoragesNames, acquire = js.Any.fromFunction0(acquire), getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = js.Any.fromFunction0(getDocumentSubStoragesNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDocumentSubStorageSupplier]
  }
}

