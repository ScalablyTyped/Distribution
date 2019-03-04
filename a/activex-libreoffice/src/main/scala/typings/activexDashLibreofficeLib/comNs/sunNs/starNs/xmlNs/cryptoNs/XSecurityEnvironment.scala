package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface of Security Environment */
trait XSecurityEnvironment
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Get personal certificate from the environment */
  val PersonalCertificates: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate]
  /** Get the Environment detail infos */
  val SecurityEnvironmentInformation: java.lang.String
  /** build certificate path from a certain certificate */
  def buildCertificatePath(beginCert: activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate]
  /** Create certificate interface from a Base64 encoded certificate. */
  def createCertificateFromAscii(asciiCertificate: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate
  /** Create certificate interface from raw DER encoded certificate */
  def createCertificateFromRaw(rawCertificate: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate
  /** Get certificate from the environment by issuer name and serial number */
  def getCertificate(
    issuerName: java.lang.String,
    serialNumber: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate
  /**
    * Get a certificate characters.
    *
    * The method provides a way to get certificate characters like:  1. Whether or not the certificate have a private key in the user profile. 2. Whether or
    * not the certificate is a trusted certificate. 3. Whether or not the certificate is a self-signed certificate.
    *
    * The certificate characters is defined as bit-wise long, please refer to CertificateCharacters definition.
    */
  def getCertificateCharacters(xCertificate: activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate): scala.Double
  /** Get personal certificate from the environment */
  def getPersonalCertificates(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate]
  /** Get the Environment detail infos */
  def getSecurityEnvironmentInformation(): java.lang.String
  /**
    * Verify a certificate.
    *
    * The method provides a way to verify a certificate.
    * @param xEECertificate The certificate which is to be validated.
    * @param intermediateCertificates Additional certificates which can be used by the method in constructing the certificate chain. The root certificate may
    * @returns The validation status will returned as a bit-wise long, please refer to CertificateValidity definition.
    */
  def verifyCertificate(
    xEECertificate: activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate,
    intermediateCertificates: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate]
  ): scala.Double
}

object XSecurityEnvironment {
  @scala.inline
  def apply(
    PersonalCertificates: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate],
    SecurityEnvironmentInformation: java.lang.String,
    acquire: js.Function0[scala.Unit],
    buildCertificatePath: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate]
    ],
    createCertificateFromAscii: js.Function1[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate
    ],
    createCertificateFromRaw: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate
    ],
    getCertificate: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate
    ],
    getCertificateCharacters: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate, scala.Double],
    getPersonalCertificates: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate]
    ],
    getSecurityEnvironmentInformation: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    verifyCertificate: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate], 
      scala.Double
    ]
  ): XSecurityEnvironment = {
    val __obj = js.Dynamic.literal(PersonalCertificates = PersonalCertificates, SecurityEnvironmentInformation = SecurityEnvironmentInformation, acquire = acquire, buildCertificatePath = buildCertificatePath, createCertificateFromAscii = createCertificateFromAscii, createCertificateFromRaw = createCertificateFromRaw, getCertificate = getCertificate, getCertificateCharacters = getCertificateCharacters, getPersonalCertificates = getPersonalCertificates, getSecurityEnvironmentInformation = getSecurityEnvironmentInformation, queryInterface = queryInterface, release = release, verifyCertificate = verifyCertificate)
  
    __obj.asInstanceOf[XSecurityEnvironment]
  }
}

