package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface for signing and verifying digital signatures in office documents
  *
  * This interface can be used to digitally sign different content in a office document. It can also be used to verify digital signatures.
  */
trait XDocumentDigitalSignatures
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** allows to get the default stream name for storing of the signature of the document content. */
  val DocumentContentSignatureDefaultStreamName: java.lang.String
  /** allows to get the default stream name for storing of the signature of the package. */
  val PackageSignatureDefaultStreamName: java.lang.String
  /** allows to get the default stream name for storing of the signature of the scripting content. */
  val ScriptingContentSignatureDefaultStreamName: java.lang.String
  def addAuthorToTrustedSources(Author: XCertificate): scala.Unit
  def addLocationToTrustedSources(Location: java.lang.String): scala.Unit
  /**
    * This method shows CertificateChooser dialog, used by document and PDF signing
    * @since LibreOffice 5.3
    */
  def chooseCertificate(Description: js.Array[java.lang.String]): XCertificate
  /** allows to get the default stream name for storing of the signature of the document content. */
  def getDocumentContentSignatureDefaultStreamName(): java.lang.String
  /** allows to get the default stream name for storing of the signature of the package. */
  def getPackageSignatureDefaultStreamName(): java.lang.String
  /** allows to get the default stream name for storing of the signature of the scripting content. */
  def getScriptingContentSignatureDefaultStreamName(): java.lang.String
  def isAuthorTrusted(Author: XCertificate): scala.Boolean
  def isLocationTrusted(Location: java.lang.String): scala.Boolean
  /** manages trusted sources (Authors and paths ) */
  def manageTrustedSources(): scala.Unit
  def showCertificate(Certificate: XCertificate): scala.Unit
  /** shows the digital signatures of the document content */
  def showDocumentContentSignatures(
    xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xSignInStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  ): scala.Unit
  /** shows the digital signatures of the package */
  def showPackageSignatures(
    xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xSignInStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  ): scala.Unit
  /** shows the digital signatures of the scripting content */
  def showScriptingContentSignatures(
    xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xSignInStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  ): scala.Unit
  /**
    * signs the content of the document including text and pictures.
    *
    * Macros will not be signed.
    */
  def signDocumentContent(
    xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xSignStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
  ): scala.Boolean
  /** signs the full Package, which means everything in the storage except the content of META-INF */
  def signPackage(
    Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xSignStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
  ): scala.Boolean
  /**
    * signs the content of the Scripting including macros and basic dialogs
    *
    * The rest of document content will not be signed.
    */
  def signScriptingContent(
    xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xSignStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream
  ): scala.Boolean
  /**
    * checks for digital signatures and their status.
    *
    * Only document content will be checked.
    */
  def verifyDocumentContentSignatures(
    xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xSignInStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  ): activexDashInteropLib.SafeArray[DocumentSignatureInformation]
  /**
    * checks for digital signatures and their status.
    *
    * Only Package content will be checked.
    */
  def verifyPackageSignatures(
    Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xSignInStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  ): activexDashInteropLib.SafeArray[DocumentSignatureInformation]
  /**
    * checks for digital signatures and their status.
    *
    * Only Scripting content will be checked.
    */
  def verifyScriptingContentSignatures(
    xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xSignInStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  ): activexDashInteropLib.SafeArray[DocumentSignatureInformation]
}

