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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DocumentContentSignatureDefaultStreamName")(DocumentContentSignatureDefaultStreamName)
    __obj.updateDynamic("PackageSignatureDefaultStreamName")(PackageSignatureDefaultStreamName)
    __obj.updateDynamic("ScriptingContentSignatureDefaultStreamName")(ScriptingContentSignatureDefaultStreamName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addAuthorToTrustedSources")(addAuthorToTrustedSources)
    __obj.updateDynamic("addLocationToTrustedSources")(addLocationToTrustedSources)
    __obj.updateDynamic("chooseCertificate")(chooseCertificate)
    __obj.updateDynamic("createDefault")(createDefault)
    __obj.updateDynamic("createWithVersion")(createWithVersion)
    __obj.updateDynamic("createWithVersionAndValidSignature")(createWithVersionAndValidSignature)
    __obj.updateDynamic("getDocumentContentSignatureDefaultStreamName")(getDocumentContentSignatureDefaultStreamName)
    __obj.updateDynamic("getPackageSignatureDefaultStreamName")(getPackageSignatureDefaultStreamName)
    __obj.updateDynamic("getScriptingContentSignatureDefaultStreamName")(getScriptingContentSignatureDefaultStreamName)
    __obj.updateDynamic("isAuthorTrusted")(isAuthorTrusted)
    __obj.updateDynamic("isLocationTrusted")(isLocationTrusted)
    __obj.updateDynamic("manageTrustedSources")(manageTrustedSources)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("showCertificate")(showCertificate)
    __obj.updateDynamic("showDocumentContentSignatures")(showDocumentContentSignatures)
    __obj.updateDynamic("showPackageSignatures")(showPackageSignatures)
    __obj.updateDynamic("showScriptingContentSignatures")(showScriptingContentSignatures)
    __obj.updateDynamic("signDocumentContent")(signDocumentContent)
    __obj.updateDynamic("signPackage")(signPackage)
    __obj.updateDynamic("signScriptingContent")(signScriptingContent)
    __obj.updateDynamic("verifyDocumentContentSignatures")(verifyDocumentContentSignatures)
    __obj.updateDynamic("verifyPackageSignatures")(verifyPackageSignatures)
    __obj.updateDynamic("verifyScriptingContentSignatures")(verifyScriptingContentSignatures)
    __obj.asInstanceOf[DocumentDigitalSignatures]
  }
}

