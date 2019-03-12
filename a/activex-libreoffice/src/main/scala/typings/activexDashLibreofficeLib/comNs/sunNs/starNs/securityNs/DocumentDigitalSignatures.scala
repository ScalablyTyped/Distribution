package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link DocumentDigitalSignatures} */
trait DocumentDigitalSignatures extends XDocumentDigitalSignatures {
  def createDefault(): scala.Unit
  /** @param ODFVersion the version of the signature */
  def createWithVersion(ODFVersion: java.lang.String): scala.Unit
  /**
    * @param ODFVersion the version of the signature
    * @param HasValidDocumentSignature indicates if the document already contains a document signature.
    */
  def createWithVersionAndValidSignature(ODFVersion: java.lang.String, HasValidDocumentSignature: scala.Boolean): scala.Unit
}

object DocumentDigitalSignatures {
  @scala.inline
  def apply(
    DocumentContentSignatureDefaultStreamName: java.lang.String,
    PackageSignatureDefaultStreamName: java.lang.String,
    ScriptingContentSignatureDefaultStreamName: java.lang.String,
    acquire: () => scala.Unit,
    addAuthorToTrustedSources: XCertificate => scala.Unit,
    addLocationToTrustedSources: java.lang.String => scala.Unit,
    chooseCertificate: js.Array[java.lang.String] => XCertificate,
    createDefault: () => scala.Unit,
    createWithVersion: java.lang.String => scala.Unit,
    createWithVersionAndValidSignature: (java.lang.String, scala.Boolean) => scala.Unit,
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
  ): DocumentDigitalSignatures = {
    val __obj = js.Dynamic.literal(DocumentContentSignatureDefaultStreamName = DocumentContentSignatureDefaultStreamName, PackageSignatureDefaultStreamName = PackageSignatureDefaultStreamName, ScriptingContentSignatureDefaultStreamName = ScriptingContentSignatureDefaultStreamName, acquire = js.Any.fromFunction0(acquire), addAuthorToTrustedSources = js.Any.fromFunction1(addAuthorToTrustedSources), addLocationToTrustedSources = js.Any.fromFunction1(addLocationToTrustedSources), chooseCertificate = js.Any.fromFunction1(chooseCertificate), createDefault = js.Any.fromFunction0(createDefault), createWithVersion = js.Any.fromFunction1(createWithVersion), createWithVersionAndValidSignature = js.Any.fromFunction2(createWithVersionAndValidSignature), getDocumentContentSignatureDefaultStreamName = js.Any.fromFunction0(getDocumentContentSignatureDefaultStreamName), getPackageSignatureDefaultStreamName = js.Any.fromFunction0(getPackageSignatureDefaultStreamName), getScriptingContentSignatureDefaultStreamName = js.Any.fromFunction0(getScriptingContentSignatureDefaultStreamName), isAuthorTrusted = js.Any.fromFunction1(isAuthorTrusted), isLocationTrusted = js.Any.fromFunction1(isLocationTrusted), manageTrustedSources = js.Any.fromFunction0(manageTrustedSources), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), showCertificate = js.Any.fromFunction1(showCertificate), showDocumentContentSignatures = js.Any.fromFunction2(showDocumentContentSignatures), showPackageSignatures = js.Any.fromFunction2(showPackageSignatures), showScriptingContentSignatures = js.Any.fromFunction2(showScriptingContentSignatures), signDocumentContent = js.Any.fromFunction2(signDocumentContent), signPackage = js.Any.fromFunction2(signPackage), signScriptingContent = js.Any.fromFunction2(signScriptingContent), verifyDocumentContentSignatures = js.Any.fromFunction2(verifyDocumentContentSignatures), verifyPackageSignatures = js.Any.fromFunction2(verifyPackageSignatures), verifyScriptingContentSignatures = js.Any.fromFunction2(verifyScriptingContentSignatures))
  
    __obj.asInstanceOf[DocumentDigitalSignatures]
  }
}

