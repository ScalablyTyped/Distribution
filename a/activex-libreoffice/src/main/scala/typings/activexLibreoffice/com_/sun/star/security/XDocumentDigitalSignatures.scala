package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface for signing and verifying digital signatures in office documents
  *
  * This interface can be used to digitally sign different content in a office document. It can also be used to verify digital signatures.
  */
@js.native
trait XDocumentDigitalSignatures extends XInterface {
  /** allows to get the default stream name for storing of the signature of the document content. */
  val DocumentContentSignatureDefaultStreamName: String = js.native
  /** allows to get the default stream name for storing of the signature of the package. */
  val PackageSignatureDefaultStreamName: String = js.native
  /** allows to get the default stream name for storing of the signature of the scripting content. */
  val ScriptingContentSignatureDefaultStreamName: String = js.native
  def addAuthorToTrustedSources(Author: XCertificate): Unit = js.native
  def addLocationToTrustedSources(Location: String): Unit = js.native
  /**
    * This method shows CertificateChooser dialog, used by document and PDF signing
    * @since LibreOffice 5.3
    */
  def chooseCertificate(Description: js.Array[String]): XCertificate = js.native
  /** allows to get the default stream name for storing of the signature of the document content. */
  def getDocumentContentSignatureDefaultStreamName(): String = js.native
  /** allows to get the default stream name for storing of the signature of the package. */
  def getPackageSignatureDefaultStreamName(): String = js.native
  /** allows to get the default stream name for storing of the signature of the scripting content. */
  def getScriptingContentSignatureDefaultStreamName(): String = js.native
  def isAuthorTrusted(Author: XCertificate): Boolean = js.native
  def isLocationTrusted(Location: String): Boolean = js.native
  /** manages trusted sources (Authors and paths ) */
  def manageTrustedSources(): Unit = js.native
  def showCertificate(Certificate: XCertificate): Unit = js.native
  /** shows the digital signatures of the document content */
  def showDocumentContentSignatures(xStorage: XStorage, xSignInStream: XInputStream): Unit = js.native
  /** shows the digital signatures of the package */
  def showPackageSignatures(xStorage: XStorage, xSignInStream: XInputStream): Unit = js.native
  /** shows the digital signatures of the scripting content */
  def showScriptingContentSignatures(xStorage: XStorage, xSignInStream: XInputStream): Unit = js.native
  /**
    * signs the content of the document including text and pictures.
    *
    * Macros will not be signed.
    */
  def signDocumentContent(xStorage: XStorage, xSignStream: XStream): Boolean = js.native
  /** signs the full Package, which means everything in the storage except the content of META-INF */
  def signPackage(Storage: XStorage, xSignStream: XStream): Boolean = js.native
  /**
    * signs the content of the Scripting including macros and basic dialogs
    *
    * The rest of document content will not be signed.
    */
  def signScriptingContent(xStorage: XStorage, xSignStream: XStream): Boolean = js.native
  /**
    * checks for digital signatures and their status.
    *
    * Only document content will be checked.
    */
  def verifyDocumentContentSignatures(xStorage: XStorage, xSignInStream: XInputStream): SafeArray[DocumentSignatureInformation] = js.native
  /**
    * checks for digital signatures and their status.
    *
    * Only Package content will be checked.
    */
  def verifyPackageSignatures(Storage: XStorage, xSignInStream: XInputStream): SafeArray[DocumentSignatureInformation] = js.native
  /**
    * checks for digital signatures and their status.
    *
    * Only Scripting content will be checked.
    */
  def verifyScriptingContentSignatures(xStorage: XStorage, xSignInStream: XInputStream): SafeArray[DocumentSignatureInformation] = js.native
}

object XDocumentDigitalSignatures {
  @scala.inline
  def apply(
    DocumentContentSignatureDefaultStreamName: String,
    PackageSignatureDefaultStreamName: String,
    ScriptingContentSignatureDefaultStreamName: String,
    acquire: () => Unit,
    addAuthorToTrustedSources: XCertificate => Unit,
    addLocationToTrustedSources: String => Unit,
    chooseCertificate: js.Array[String] => XCertificate,
    getDocumentContentSignatureDefaultStreamName: () => String,
    getPackageSignatureDefaultStreamName: () => String,
    getScriptingContentSignatureDefaultStreamName: () => String,
    isAuthorTrusted: XCertificate => Boolean,
    isLocationTrusted: String => Boolean,
    manageTrustedSources: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    showCertificate: XCertificate => Unit,
    showDocumentContentSignatures: (XStorage, XInputStream) => Unit,
    showPackageSignatures: (XStorage, XInputStream) => Unit,
    showScriptingContentSignatures: (XStorage, XInputStream) => Unit,
    signDocumentContent: (XStorage, XStream) => Boolean,
    signPackage: (XStorage, XStream) => Boolean,
    signScriptingContent: (XStorage, XStream) => Boolean,
    verifyDocumentContentSignatures: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation],
    verifyPackageSignatures: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation],
    verifyScriptingContentSignatures: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation]
  ): XDocumentDigitalSignatures = {
    val __obj = js.Dynamic.literal(DocumentContentSignatureDefaultStreamName = DocumentContentSignatureDefaultStreamName.asInstanceOf[js.Any], PackageSignatureDefaultStreamName = PackageSignatureDefaultStreamName.asInstanceOf[js.Any], ScriptingContentSignatureDefaultStreamName = ScriptingContentSignatureDefaultStreamName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAuthorToTrustedSources = js.Any.fromFunction1(addAuthorToTrustedSources), addLocationToTrustedSources = js.Any.fromFunction1(addLocationToTrustedSources), chooseCertificate = js.Any.fromFunction1(chooseCertificate), getDocumentContentSignatureDefaultStreamName = js.Any.fromFunction0(getDocumentContentSignatureDefaultStreamName), getPackageSignatureDefaultStreamName = js.Any.fromFunction0(getPackageSignatureDefaultStreamName), getScriptingContentSignatureDefaultStreamName = js.Any.fromFunction0(getScriptingContentSignatureDefaultStreamName), isAuthorTrusted = js.Any.fromFunction1(isAuthorTrusted), isLocationTrusted = js.Any.fromFunction1(isLocationTrusted), manageTrustedSources = js.Any.fromFunction0(manageTrustedSources), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), showCertificate = js.Any.fromFunction1(showCertificate), showDocumentContentSignatures = js.Any.fromFunction2(showDocumentContentSignatures), showPackageSignatures = js.Any.fromFunction2(showPackageSignatures), showScriptingContentSignatures = js.Any.fromFunction2(showScriptingContentSignatures), signDocumentContent = js.Any.fromFunction2(signDocumentContent), signPackage = js.Any.fromFunction2(signPackage), signScriptingContent = js.Any.fromFunction2(signScriptingContent), verifyDocumentContentSignatures = js.Any.fromFunction2(verifyDocumentContentSignatures), verifyPackageSignatures = js.Any.fromFunction2(verifyPackageSignatures), verifyScriptingContentSignatures = js.Any.fromFunction2(verifyScriptingContentSignatures))
    __obj.asInstanceOf[XDocumentDigitalSignatures]
  }
  @scala.inline
  implicit class XDocumentDigitalSignaturesOps[Self <: XDocumentDigitalSignatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocumentContentSignatureDefaultStreamName(value: String): Self = this.set("DocumentContentSignatureDefaultStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageSignatureDefaultStreamName(value: String): Self = this.set("PackageSignatureDefaultStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptingContentSignatureDefaultStreamName(value: String): Self = this.set("ScriptingContentSignatureDefaultStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddAuthorToTrustedSources(value: XCertificate => Unit): Self = this.set("addAuthorToTrustedSources", js.Any.fromFunction1(value))
    @scala.inline
    def setAddLocationToTrustedSources(value: String => Unit): Self = this.set("addLocationToTrustedSources", js.Any.fromFunction1(value))
    @scala.inline
    def setChooseCertificate(value: js.Array[String] => XCertificate): Self = this.set("chooseCertificate", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDocumentContentSignatureDefaultStreamName(value: () => String): Self = this.set("getDocumentContentSignatureDefaultStreamName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPackageSignatureDefaultStreamName(value: () => String): Self = this.set("getPackageSignatureDefaultStreamName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScriptingContentSignatureDefaultStreamName(value: () => String): Self = this.set("getScriptingContentSignatureDefaultStreamName", js.Any.fromFunction0(value))
    @scala.inline
    def setIsAuthorTrusted(value: XCertificate => Boolean): Self = this.set("isAuthorTrusted", js.Any.fromFunction1(value))
    @scala.inline
    def setIsLocationTrusted(value: String => Boolean): Self = this.set("isLocationTrusted", js.Any.fromFunction1(value))
    @scala.inline
    def setManageTrustedSources(value: () => Unit): Self = this.set("manageTrustedSources", js.Any.fromFunction0(value))
    @scala.inline
    def setShowCertificate(value: XCertificate => Unit): Self = this.set("showCertificate", js.Any.fromFunction1(value))
    @scala.inline
    def setShowDocumentContentSignatures(value: (XStorage, XInputStream) => Unit): Self = this.set("showDocumentContentSignatures", js.Any.fromFunction2(value))
    @scala.inline
    def setShowPackageSignatures(value: (XStorage, XInputStream) => Unit): Self = this.set("showPackageSignatures", js.Any.fromFunction2(value))
    @scala.inline
    def setShowScriptingContentSignatures(value: (XStorage, XInputStream) => Unit): Self = this.set("showScriptingContentSignatures", js.Any.fromFunction2(value))
    @scala.inline
    def setSignDocumentContent(value: (XStorage, XStream) => Boolean): Self = this.set("signDocumentContent", js.Any.fromFunction2(value))
    @scala.inline
    def setSignPackage(value: (XStorage, XStream) => Boolean): Self = this.set("signPackage", js.Any.fromFunction2(value))
    @scala.inline
    def setSignScriptingContent(value: (XStorage, XStream) => Boolean): Self = this.set("signScriptingContent", js.Any.fromFunction2(value))
    @scala.inline
    def setVerifyDocumentContentSignatures(value: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation]): Self = this.set("verifyDocumentContentSignatures", js.Any.fromFunction2(value))
    @scala.inline
    def setVerifyPackageSignatures(value: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation]): Self = this.set("verifyPackageSignatures", js.Any.fromFunction2(value))
    @scala.inline
    def setVerifyScriptingContentSignatures(value: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation]): Self = this.set("verifyScriptingContentSignatures", js.Any.fromFunction2(value))
  }
  
}

