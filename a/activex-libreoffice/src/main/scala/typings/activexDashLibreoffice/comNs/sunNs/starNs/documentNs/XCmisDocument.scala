package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The document can provide access to CMIS properties and versions through this interface. */
trait XCmisDocument extends XInterface {
  val AllVersions: SafeArray[CmisVersion]
  /** Contains the properties values named after their CMIS ID. */
  var CmisProperties: SafeArray[CmisProperty]
  def canCancelCheckOut(): Boolean
  def canCheckIn(): Boolean
  def canCheckOut(): Boolean
  /** Cancel checked out document, this will discard all changes since check-out. */
  def cancelCheckOut(): Unit
  /** Creates a new version of the document from the private working copy. */
  def checkIn(isMajor: Boolean, comment: String): Unit
  /** Check out the document into a private working copy on the server, and update the loaded document to reflect this change. */
  def checkOut(): Unit
  def getAllVersions(): SafeArray[CmisVersion]
  /** Tells whether a document can support versioning or not. */
  def isVersionable(): Boolean
  def updateCmisProperties(cmisProperties: SeqEquiv[CmisProperty]): Unit
}

object XCmisDocument {
  @scala.inline
  def apply(
    AllVersions: SafeArray[CmisVersion],
    CmisProperties: SafeArray[CmisProperty],
    acquire: () => Unit,
    canCancelCheckOut: () => Boolean,
    canCheckIn: () => Boolean,
    canCheckOut: () => Boolean,
    cancelCheckOut: () => Unit,
    checkIn: (Boolean, String) => Unit,
    checkOut: () => Unit,
    getAllVersions: () => SafeArray[CmisVersion],
    isVersionable: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateCmisProperties: SeqEquiv[CmisProperty] => Unit
  ): XCmisDocument = {
    val __obj = js.Dynamic.literal(AllVersions = AllVersions, CmisProperties = CmisProperties, acquire = js.Any.fromFunction0(acquire), canCancelCheckOut = js.Any.fromFunction0(canCancelCheckOut), canCheckIn = js.Any.fromFunction0(canCheckIn), canCheckOut = js.Any.fromFunction0(canCheckOut), cancelCheckOut = js.Any.fromFunction0(cancelCheckOut), checkIn = js.Any.fromFunction2(checkIn), checkOut = js.Any.fromFunction0(checkOut), getAllVersions = js.Any.fromFunction0(getAllVersions), isVersionable = js.Any.fromFunction0(isVersionable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateCmisProperties = js.Any.fromFunction1(updateCmisProperties))
  
    __obj.asInstanceOf[XCmisDocument]
  }
}

