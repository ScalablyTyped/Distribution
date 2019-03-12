package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The document can provide access to CMIS properties and versions through this interface. */
trait XCmisDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val AllVersions: stdLib.SafeArray[CmisVersion]
  /** Contains the properties values named after their CMIS ID. */
  var CmisProperties: stdLib.SafeArray[CmisProperty]
  def canCancelCheckOut(): scala.Boolean
  def canCheckIn(): scala.Boolean
  def canCheckOut(): scala.Boolean
  /** Cancel checked out document, this will discard all changes since check-out. */
  def cancelCheckOut(): scala.Unit
  /** Creates a new version of the document from the private working copy. */
  def checkIn(isMajor: scala.Boolean, comment: java.lang.String): scala.Unit
  /** Check out the document into a private working copy on the server, and update the loaded document to reflect this change. */
  def checkOut(): scala.Unit
  def getAllVersions(): stdLib.SafeArray[CmisVersion]
  /** Tells whether a document can support versioning or not. */
  def isVersionable(): scala.Boolean
  def updateCmisProperties(cmisProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CmisProperty]): scala.Unit
}

object XCmisDocument {
  @scala.inline
  def apply(
    AllVersions: stdLib.SafeArray[CmisVersion],
    CmisProperties: stdLib.SafeArray[CmisProperty],
    acquire: () => scala.Unit,
    canCancelCheckOut: () => scala.Boolean,
    canCheckIn: () => scala.Boolean,
    canCheckOut: () => scala.Boolean,
    cancelCheckOut: () => scala.Unit,
    checkIn: (scala.Boolean, java.lang.String) => scala.Unit,
    checkOut: () => scala.Unit,
    getAllVersions: () => stdLib.SafeArray[CmisVersion],
    isVersionable: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    updateCmisProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CmisProperty] => scala.Unit
  ): XCmisDocument = {
    val __obj = js.Dynamic.literal(AllVersions = AllVersions, CmisProperties = CmisProperties, acquire = js.Any.fromFunction0(acquire), canCancelCheckOut = js.Any.fromFunction0(canCancelCheckOut), canCheckIn = js.Any.fromFunction0(canCheckIn), canCheckOut = js.Any.fromFunction0(canCheckOut), cancelCheckOut = js.Any.fromFunction0(cancelCheckOut), checkIn = js.Any.fromFunction2(checkIn), checkOut = js.Any.fromFunction0(checkOut), getAllVersions = js.Any.fromFunction0(getAllVersions), isVersionable = js.Any.fromFunction0(isVersionable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateCmisProperties = js.Any.fromFunction1(updateCmisProperties))
  
    __obj.asInstanceOf[XCmisDocument]
  }
}

