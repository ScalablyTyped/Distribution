package typings.activexLibreoffice.com_.sun.star.security

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.io.XInputStream
import typings.activexLibreoffice.com_.sun.star.io.XStream
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Service of {@link DocumentDigitalSignatures} */
trait DocumentDigitalSignatures
  extends StObject
     with XDocumentDigitalSignatures {
  
  def createDefault(): Unit
  
  /** @param ODFVersion the version of the signature */
  def createWithVersion(ODFVersion: String): Unit
  
  /**
    * @param ODFVersion the version of the signature
    * @param HasValidDocumentSignature indicates if the document already contains a document signature.
    */
  def createWithVersionAndValidSignature(ODFVersion: String, HasValidDocumentSignature: Boolean): Unit
}
object DocumentDigitalSignatures {
  
  inline def apply(
    DocumentContentSignatureDefaultStreamName: String,
    PackageSignatureDefaultStreamName: String,
    ScriptingContentSignatureDefaultStreamName: String,
    acquire: () => Unit,
    addAuthorToTrustedSources: XCertificate => Unit,
    addLocationToTrustedSources: String => Unit,
    chooseCertificate: js.Array[String] => XCertificate,
    createDefault: () => Unit,
    createWithVersion: String => Unit,
    createWithVersionAndValidSignature: (String, Boolean) => Unit,
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
  ): DocumentDigitalSignatures = {
    val __obj = js.Dynamic.literal(DocumentContentSignatureDefaultStreamName = DocumentContentSignatureDefaultStreamName.asInstanceOf[js.Any], PackageSignatureDefaultStreamName = PackageSignatureDefaultStreamName.asInstanceOf[js.Any], ScriptingContentSignatureDefaultStreamName = ScriptingContentSignatureDefaultStreamName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAuthorToTrustedSources = js.Any.fromFunction1(addAuthorToTrustedSources), addLocationToTrustedSources = js.Any.fromFunction1(addLocationToTrustedSources), chooseCertificate = js.Any.fromFunction1(chooseCertificate), createDefault = js.Any.fromFunction0(createDefault), createWithVersion = js.Any.fromFunction1(createWithVersion), createWithVersionAndValidSignature = js.Any.fromFunction2(createWithVersionAndValidSignature), getDocumentContentSignatureDefaultStreamName = js.Any.fromFunction0(getDocumentContentSignatureDefaultStreamName), getPackageSignatureDefaultStreamName = js.Any.fromFunction0(getPackageSignatureDefaultStreamName), getScriptingContentSignatureDefaultStreamName = js.Any.fromFunction0(getScriptingContentSignatureDefaultStreamName), isAuthorTrusted = js.Any.fromFunction1(isAuthorTrusted), isLocationTrusted = js.Any.fromFunction1(isLocationTrusted), manageTrustedSources = js.Any.fromFunction0(manageTrustedSources), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), showCertificate = js.Any.fromFunction1(showCertificate), showDocumentContentSignatures = js.Any.fromFunction2(showDocumentContentSignatures), showPackageSignatures = js.Any.fromFunction2(showPackageSignatures), showScriptingContentSignatures = js.Any.fromFunction2(showScriptingContentSignatures), signDocumentContent = js.Any.fromFunction2(signDocumentContent), signPackage = js.Any.fromFunction2(signPackage), signScriptingContent = js.Any.fromFunction2(signScriptingContent), verifyDocumentContentSignatures = js.Any.fromFunction2(verifyDocumentContentSignatures), verifyPackageSignatures = js.Any.fromFunction2(verifyPackageSignatures), verifyScriptingContentSignatures = js.Any.fromFunction2(verifyScriptingContentSignatures))
    __obj.asInstanceOf[DocumentDigitalSignatures]
  }
  
  extension [Self <: DocumentDigitalSignatures](x: Self) {
    
    inline def setCreateDefault(value: () => Unit): Self = StObject.set(x, "createDefault", js.Any.fromFunction0(value))
    
    inline def setCreateWithVersion(value: String => Unit): Self = StObject.set(x, "createWithVersion", js.Any.fromFunction1(value))
    
    inline def setCreateWithVersionAndValidSignature(value: (String, Boolean) => Unit): Self = StObject.set(x, "createWithVersionAndValidSignature", js.Any.fromFunction2(value))
  }
}
