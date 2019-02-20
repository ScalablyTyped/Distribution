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

