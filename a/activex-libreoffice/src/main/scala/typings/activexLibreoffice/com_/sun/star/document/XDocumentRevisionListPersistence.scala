package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.RevisionTag
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** interface to load or store a list of document revisions from or to a document using the packed XML file format */
trait XDocumentRevisionListPersistence extends XInterface {
  /**
    * Loads a list of available revisions from a storage
    *
    * This method does not load any revision itself
    */
  def load(Storage: XStorage): SafeArray[RevisionTag]
  /**
    * Stores a list of available revisions to a storage
    *
    * This method does not store revisions themselves
    */
  def store(Storage: XStorage, List: SeqEquiv[RevisionTag]): Unit
}

object XDocumentRevisionListPersistence {
  @scala.inline
  def apply(
    acquire: () => Unit,
    load: XStorage => SafeArray[RevisionTag],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    store: (XStorage, SeqEquiv[RevisionTag]) => Unit
  ): XDocumentRevisionListPersistence = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), load = js.Any.fromFunction1(load), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), store = js.Any.fromFunction2(store))
    __obj.asInstanceOf[XDocumentRevisionListPersistence]
  }
}

