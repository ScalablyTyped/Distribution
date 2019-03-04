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
    acquire: js.Function0[scala.Unit],
    addAuthorToTrustedSources: js.Function1[XCertificate, scala.Unit],
    addLocationToTrustedSources: js.Function1[java.lang.String, scala.Unit],
    chooseCertificate: js.Function1[js.Array[java.lang.String], XCertificate],
    createDefault: js.Function0[scala.Unit],
    createWithVersion: js.Function1[java.lang.String, scala.Unit],
    createWithVersionAndValidSignature: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
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
  ): DocumentDigitalSignatures = {
    val __obj = js.Dynamic.literal(DocumentContentSignatureDefaultStreamName = DocumentContentSignatureDefaultStreamName, PackageSignatureDefaultStreamName = PackageSignatureDefaultStreamName, ScriptingContentSignatureDefaultStreamName = ScriptingContentSignatureDefaultStreamName, acquire = acquire, addAuthorToTrustedSources = addAuthorToTrustedSources, addLocationToTrustedSources = addLocationToTrustedSources, chooseCertificate = chooseCertificate, createDefault = createDefault, createWithVersion = createWithVersion, createWithVersionAndValidSignature = createWithVersionAndValidSignature, getDocumentContentSignatureDefaultStreamName = getDocumentContentSignatureDefaultStreamName, getPackageSignatureDefaultStreamName = getPackageSignatureDefaultStreamName, getScriptingContentSignatureDefaultStreamName = getScriptingContentSignatureDefaultStreamName, isAuthorTrusted = isAuthorTrusted, isLocationTrusted = isLocationTrusted, manageTrustedSources = manageTrustedSources, queryInterface = queryInterface, release = release, showCertificate = showCertificate, showDocumentContentSignatures = showDocumentContentSignatures, showPackageSignatures = showPackageSignatures, showScriptingContentSignatures = showScriptingContentSignatures, signDocumentContent = signDocumentContent, signPackage = signPackage, signScriptingContent = signScriptingContent, verifyDocumentContentSignatures = verifyDocumentContentSignatures, verifyPackageSignatures = verifyPackageSignatures, verifyScriptingContentSignatures = verifyScriptingContentSignatures)
  
    __obj.asInstanceOf[DocumentDigitalSignatures]
  }
}

