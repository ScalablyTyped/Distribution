package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * interface for signing and verifying digital signatures in office documents
  *
  * This interface can be used to digitally sign different content in a office document. It can also be used to verify digital signatures.
  */
trait XDocumentDigitalSignatures
  extends StObject
     with XInterface {
  
  /** allows to get the default stream name for storing of the signature of the document content. */
  val DocumentContentSignatureDefaultStreamName: String
  
  /** allows to get the default stream name for storing of the signature of the package. */
  val PackageSignatureDefaultStreamName: String
  
  /** allows to get the default stream name for storing of the signature of the scripting content. */
  val ScriptingContentSignatureDefaultStreamName: String
  
  def addAuthorToTrustedSources(Author: XCertificate): Unit
  
  def addLocationToTrustedSources(Location: String): Unit
  
  /**
    * This method shows CertificateChooser dialog, used by document and PDF signing
    * @since LibreOffice 5.3
    */
  def chooseCertificate(Description: js.Array[String]): XCertificate
  
  /** allows to get the default stream name for storing of the signature of the document content. */
  def getDocumentContentSignatureDefaultStreamName(): String
  
  /** allows to get the default stream name for storing of the signature of the package. */
  def getPackageSignatureDefaultStreamName(): String
  
  /** allows to get the default stream name for storing of the signature of the scripting content. */
  def getScriptingContentSignatureDefaultStreamName(): String
  
  def isAuthorTrusted(Author: XCertificate): Boolean
  
  def isLocationTrusted(Location: String): Boolean
  
  /** manages trusted sources (Authors and paths ) */
  def manageTrustedSources(): Unit
  
  def showCertificate(Certificate: XCertificate): Unit
  
  /** shows the digital signatures of the document content */
  def showDocumentContentSignatures(xStorage: XStorage, xSignInStream: XInputStream): Unit
  
  /** shows the digital signatures of the package */
  def showPackageSignatures(xStorage: XStorage, xSignInStream: XInputStream): Unit
  
  /** shows the digital signatures of the scripting content */
  def showScriptingContentSignatures(xStorage: XStorage, xSignInStream: XInputStream): Unit
  
  /**
    * signs the content of the document including text and pictures.
    *
    * Macros will not be signed.
    */
  def signDocumentContent(xStorage: XStorage, xSignStream: XStream): Boolean
  
  /** signs the full Package, which means everything in the storage except the content of META-INF */
  def signPackage(Storage: XStorage, xSignStream: XStream): Boolean
  
  /**
    * signs the content of the Scripting including macros and basic dialogs
    *
    * The rest of document content will not be signed.
    */
  def signScriptingContent(xStorage: XStorage, xSignStream: XStream): Boolean
  
  /**
    * checks for digital signatures and their status.
    *
    * Only document content will be checked.
    */
  def verifyDocumentContentSignatures(xStorage: XStorage, xSignInStream: XInputStream): SafeArray[DocumentSignatureInformation]
  
  /**
    * checks for digital signatures and their status.
    *
    * Only Package content will be checked.
    */
  def verifyPackageSignatures(Storage: XStorage, xSignInStream: XInputStream): SafeArray[DocumentSignatureInformation]
  
  /**
    * checks for digital signatures and their status.
    *
    * Only Scripting content will be checked.
    */
  def verifyScriptingContentSignatures(xStorage: XStorage, xSignInStream: XInputStream): SafeArray[DocumentSignatureInformation]
}
object XDocumentDigitalSignatures {
  
  inline def apply(
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
    queryInterface: `type` => Any,
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
  implicit open class MutableBuilder[Self <: XDocumentDigitalSignatures] (val x: Self) extends AnyVal {
    
    inline def setAddAuthorToTrustedSources(value: XCertificate => Unit): Self = StObject.set(x, "addAuthorToTrustedSources", js.Any.fromFunction1(value))
    
    inline def setAddLocationToTrustedSources(value: String => Unit): Self = StObject.set(x, "addLocationToTrustedSources", js.Any.fromFunction1(value))
    
    inline def setChooseCertificate(value: js.Array[String] => XCertificate): Self = StObject.set(x, "chooseCertificate", js.Any.fromFunction1(value))
    
    inline def setDocumentContentSignatureDefaultStreamName(value: String): Self = StObject.set(x, "DocumentContentSignatureDefaultStreamName", value.asInstanceOf[js.Any])
    
    inline def setGetDocumentContentSignatureDefaultStreamName(value: () => String): Self = StObject.set(x, "getDocumentContentSignatureDefaultStreamName", js.Any.fromFunction0(value))
    
    inline def setGetPackageSignatureDefaultStreamName(value: () => String): Self = StObject.set(x, "getPackageSignatureDefaultStreamName", js.Any.fromFunction0(value))
    
    inline def setGetScriptingContentSignatureDefaultStreamName(value: () => String): Self = StObject.set(x, "getScriptingContentSignatureDefaultStreamName", js.Any.fromFunction0(value))
    
    inline def setIsAuthorTrusted(value: XCertificate => Boolean): Self = StObject.set(x, "isAuthorTrusted", js.Any.fromFunction1(value))
    
    inline def setIsLocationTrusted(value: String => Boolean): Self = StObject.set(x, "isLocationTrusted", js.Any.fromFunction1(value))
    
    inline def setManageTrustedSources(value: () => Unit): Self = StObject.set(x, "manageTrustedSources", js.Any.fromFunction0(value))
    
    inline def setPackageSignatureDefaultStreamName(value: String): Self = StObject.set(x, "PackageSignatureDefaultStreamName", value.asInstanceOf[js.Any])
    
    inline def setScriptingContentSignatureDefaultStreamName(value: String): Self = StObject.set(x, "ScriptingContentSignatureDefaultStreamName", value.asInstanceOf[js.Any])
    
    inline def setShowCertificate(value: XCertificate => Unit): Self = StObject.set(x, "showCertificate", js.Any.fromFunction1(value))
    
    inline def setShowDocumentContentSignatures(value: (XStorage, XInputStream) => Unit): Self = StObject.set(x, "showDocumentContentSignatures", js.Any.fromFunction2(value))
    
    inline def setShowPackageSignatures(value: (XStorage, XInputStream) => Unit): Self = StObject.set(x, "showPackageSignatures", js.Any.fromFunction2(value))
    
    inline def setShowScriptingContentSignatures(value: (XStorage, XInputStream) => Unit): Self = StObject.set(x, "showScriptingContentSignatures", js.Any.fromFunction2(value))
    
    inline def setSignDocumentContent(value: (XStorage, XStream) => Boolean): Self = StObject.set(x, "signDocumentContent", js.Any.fromFunction2(value))
    
    inline def setSignPackage(value: (XStorage, XStream) => Boolean): Self = StObject.set(x, "signPackage", js.Any.fromFunction2(value))
    
    inline def setSignScriptingContent(value: (XStorage, XStream) => Boolean): Self = StObject.set(x, "signScriptingContent", js.Any.fromFunction2(value))
    
    inline def setVerifyDocumentContentSignatures(value: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation]): Self = StObject.set(x, "verifyDocumentContentSignatures", js.Any.fromFunction2(value))
    
    inline def setVerifyPackageSignatures(value: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation]): Self = StObject.set(x, "verifyPackageSignatures", js.Any.fromFunction2(value))
    
    inline def setVerifyScriptingContentSignatures(value: (XStorage, XInputStream) => SafeArray[DocumentSignatureInformation]): Self = StObject.set(x, "verifyScriptingContentSignatures", js.Any.fromFunction2(value))
  }
}
