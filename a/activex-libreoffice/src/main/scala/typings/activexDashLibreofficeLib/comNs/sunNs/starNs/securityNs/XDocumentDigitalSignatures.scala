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
  ): stdLib.SafeArray[DocumentSignatureInformation]
  /**
    * checks for digital signatures and their status.
    *
    * Only Package content will be checked.
    */
  def verifyPackageSignatures(
    Storage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xSignInStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  ): stdLib.SafeArray[DocumentSignatureInformation]
  /**
    * checks for digital signatures and their status.
    *
    * Only Scripting content will be checked.
    */
  def verifyScriptingContentSignatures(
    xStorage: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xSignInStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream
  ): stdLib.SafeArray[DocumentSignatureInformation]
}

object XDocumentDigitalSignatures {
  @scala.inline
  def apply(
    DocumentContentSignatureDefaultStreamName: java.lang.String,
    PackageSignatureDefaultStreamName: java.lang.String,
    ScriptingContentSignatureDefaultStreamName: java.lang.String,
    acquire: () => scala.Unit,
    addAuthorToTrustedSources: XCertificate => scala.Unit,
    addLocationToTrustedSources: java.lang.String => scala.Unit,
    chooseCertificate: js.Array[java.lang.String] => XCertificate,
    getDocumentContentSignatureDefaultStreamName: () => java.lang.String,
    getPackageSignatureDefaultStreamName: () => java.lang.String,
    getScriptingContentSignatureDefaultStreamName: () => java.lang.String,
    isAuthorTrusted: XCertificate => scala.Boolean,
    isLocationTrusted: java.lang.String => scala.Boolean,
    manageTrustedSources: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    showCertificate: XCertificate => scala.Unit,
    showDocumentContentSignatures: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream) => scala.Unit,
    showPackageSignatures: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream) => scala.Unit,
    showScriptingContentSignatures: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream) => scala.Unit,
    signDocumentContent: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream) => scala.Boolean,
    signPackage: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream) => scala.Boolean,
    signScriptingContent: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream) => scala.Boolean,
    verifyDocumentContentSignatures: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream) => stdLib.SafeArray[DocumentSignatureInformation],
    verifyPackageSignatures: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream) => stdLib.SafeArray[DocumentSignatureInformation],
    verifyScriptingContentSignatures: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream) => stdLib.SafeArray[DocumentSignatureInformation]
  ): XDocumentDigitalSignatures = {
    val __obj = js.Dynamic.literal(DocumentContentSignatureDefaultStreamName = DocumentContentSignatureDefaultStreamName, PackageSignatureDefaultStreamName = PackageSignatureDefaultStreamName, ScriptingContentSignatureDefaultStreamName = ScriptingContentSignatureDefaultStreamName, acquire = js.Any.fromFunction0(acquire), addAuthorToTrustedSources = js.Any.fromFunction1(addAuthorToTrustedSources), addLocationToTrustedSources = js.Any.fromFunction1(addLocationToTrustedSources), chooseCertificate = js.Any.fromFunction1(chooseCertificate), getDocumentContentSignatureDefaultStreamName = js.Any.fromFunction0(getDocumentContentSignatureDefaultStreamName), getPackageSignatureDefaultStreamName = js.Any.fromFunction0(getPackageSignatureDefaultStreamName), getScriptingContentSignatureDefaultStreamName = js.Any.fromFunction0(getScriptingContentSignatureDefaultStreamName), isAuthorTrusted = js.Any.fromFunction1(isAuthorTrusted), isLocationTrusted = js.Any.fromFunction1(isLocationTrusted), manageTrustedSources = js.Any.fromFunction0(manageTrustedSources), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), showCertificate = js.Any.fromFunction1(showCertificate), showDocumentContentSignatures = js.Any.fromFunction2(showDocumentContentSignatures), showPackageSignatures = js.Any.fromFunction2(showPackageSignatures), showScriptingContentSignatures = js.Any.fromFunction2(showScriptingContentSignatures), signDocumentContent = js.Any.fromFunction2(signDocumentContent), signPackage = js.Any.fromFunction2(signPackage), signScriptingContent = js.Any.fromFunction2(signScriptingContent), verifyDocumentContentSignatures = js.Any.fromFunction2(verifyDocumentContentSignatures), verifyPackageSignatures = js.Any.fromFunction2(verifyPackageSignatures), verifyScriptingContentSignatures = js.Any.fromFunction2(verifyScriptingContentSignatures))
  
    __obj.asInstanceOf[XDocumentDigitalSignatures]
  }
}

