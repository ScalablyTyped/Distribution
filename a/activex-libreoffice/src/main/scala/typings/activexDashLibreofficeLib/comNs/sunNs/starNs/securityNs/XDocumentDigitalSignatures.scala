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

object XDocumentDigitalSignatures {
  @scala.inline
  def apply(
    DocumentContentSignatureDefaultStreamName: java.lang.String,
    PackageSignatureDefaultStreamName: java.lang.String,
    ScriptingContentSignatureDefaultStreamName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addAuthorToTrustedSources: js.Function1[XCertificate, scala.Unit],
    addLocationToTrustedSources: js.Function1[java.lang.String, scala.Unit],
    chooseCertificate: js.Function1[js.Array[java.lang.String], XCertificate],
    getDocumentContentSignatureDefaultStreamName: js.Function0[java.lang.String],
    getPackageSignatureDefaultStreamName: js.Function0[java.lang.String],
    getScriptingContentSignatureDefaultStreamName: js.Function0[java.lang.String],
    isAuthorTrusted: js.Function1[XCertificate, scala.Boolean],
    isLocationTrusted: js.Function1[java.lang.String, scala.Boolean],
    manageTrustedSources: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    showCertificate: js.Function1[XCertificate, scala.Unit],
    showDocumentContentSignatures: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Unit
    ],
    showPackageSignatures: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Unit
    ],
    showScriptingContentSignatures: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      scala.Unit
    ],
    signDocumentContent: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream, 
      scala.Boolean
    ],
    signPackage: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream, 
      scala.Boolean
    ],
    signScriptingContent: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XStream, 
      scala.Boolean
    ],
    verifyDocumentContentSignatures: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      activexDashInteropLib.SafeArray[DocumentSignatureInformation]
    ],
    verifyPackageSignatures: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      activexDashInteropLib.SafeArray[DocumentSignatureInformation]
    ],
    verifyScriptingContentSignatures: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream, 
      activexDashInteropLib.SafeArray[DocumentSignatureInformation]
    ]
  ): XDocumentDigitalSignatures = {
    val __obj = js.Dynamic.literal(DocumentContentSignatureDefaultStreamName = DocumentContentSignatureDefaultStreamName, PackageSignatureDefaultStreamName = PackageSignatureDefaultStreamName, ScriptingContentSignatureDefaultStreamName = ScriptingContentSignatureDefaultStreamName, acquire = acquire, addAuthorToTrustedSources = addAuthorToTrustedSources, addLocationToTrustedSources = addLocationToTrustedSources, chooseCertificate = chooseCertificate, getDocumentContentSignatureDefaultStreamName = getDocumentContentSignatureDefaultStreamName, getPackageSignatureDefaultStreamName = getPackageSignatureDefaultStreamName, getScriptingContentSignatureDefaultStreamName = getScriptingContentSignatureDefaultStreamName, isAuthorTrusted = isAuthorTrusted, isLocationTrusted = isLocationTrusted, manageTrustedSources = manageTrustedSources, queryInterface = queryInterface, release = release, showCertificate = showCertificate, showDocumentContentSignatures = showDocumentContentSignatures, showPackageSignatures = showPackageSignatures, showScriptingContentSignatures = showScriptingContentSignatures, signDocumentContent = signDocumentContent, signPackage = signPackage, signScriptingContent = signScriptingContent, verifyDocumentContentSignatures = verifyDocumentContentSignatures, verifyPackageSignatures = verifyPackageSignatures, verifyScriptingContentSignatures = verifyScriptingContentSignatures)
  
    __obj.asInstanceOf[XDocumentDigitalSignatures]
  }
}

