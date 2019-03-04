package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The document can provide access to CMIS properties and versions through this interface. */
trait XCmisDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val AllVersions: activexDashInteropLib.SafeArray[CmisVersion]
  /** Contains the properties values named after their CMIS ID. */
  var CmisProperties: activexDashInteropLib.SafeArray[CmisProperty]
  def canCancelCheckOut(): scala.Boolean
  def canCheckIn(): scala.Boolean
  def canCheckOut(): scala.Boolean
  /** Cancel checked out document, this will discard all changes since check-out. */
  def cancelCheckOut(): scala.Unit
  /** Creates a new version of the document from the private working copy. */
  def checkIn(isMajor: scala.Boolean, comment: java.lang.String): scala.Unit
  /** Check out the document into a private working copy on the server, and update the loaded document to reflect this change. */
  def checkOut(): scala.Unit
  def getAllVersions(): activexDashInteropLib.SafeArray[CmisVersion]
  /** Tells whether a document can support versioning or not. */
  def isVersionable(): scala.Boolean
  def updateCmisProperties(cmisProperties: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CmisProperty]): scala.Unit
}

object XCmisDocument {
  @scala.inline
  def apply(
    AllVersions: activexDashInteropLib.SafeArray[CmisVersion],
    CmisProperties: activexDashInteropLib.SafeArray[CmisProperty],
    acquire: js.Function0[scala.Unit],
    canCancelCheckOut: js.Function0[scala.Boolean],
    canCheckIn: js.Function0[scala.Boolean],
    canCheckOut: js.Function0[scala.Boolean],
    cancelCheckOut: js.Function0[scala.Unit],
    checkIn: js.Function2[scala.Boolean, java.lang.String, scala.Unit],
    checkOut: js.Function0[scala.Unit],
    getAllVersions: js.Function0[activexDashInteropLib.SafeArray[CmisVersion]],
    isVersionable: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    updateCmisProperties: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CmisProperty], scala.Unit]
  ): XCmisDocument = {
    val __obj = js.Dynamic.literal(AllVersions = AllVersions, CmisProperties = CmisProperties, acquire = acquire, canCancelCheckOut = canCancelCheckOut, canCheckIn = canCheckIn, canCheckOut = canCheckOut, cancelCheckOut = cancelCheckOut, checkIn = checkIn, checkOut = checkOut, getAllVersions = getAllVersions, isVersionable = isVersionable, queryInterface = queryInterface, release = release, updateCmisProperties = updateCmisProperties)
  
    __obj.asInstanceOf[XCmisDocument]
  }
}

