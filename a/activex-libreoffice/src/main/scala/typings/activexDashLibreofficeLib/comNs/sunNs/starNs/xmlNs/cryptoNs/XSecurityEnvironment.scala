package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface of Security Environment */
trait XSecurityEnvironment
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Get personal certificate from the environment */
  val PersonalCertificates: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate]
  /** Get the Environment detail infos */
  val SecurityEnvironmentInformation: java.lang.String
  /** build certificate path from a certain certificate */
  def buildCertificatePath(beginCert: activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate]
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
  def getPersonalCertificates(): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate]
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
    PersonalCertificates: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate],
    SecurityEnvironmentInformation: java.lang.String,
    acquire: () => scala.Unit,
    buildCertificatePath: activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate],
    createCertificateFromAscii: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate,
    createCertificateFromRaw: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate,
    getCertificate: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]) => activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate,
    getCertificateCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate => scala.Double,
    getPersonalCertificates: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate],
    getSecurityEnvironmentInformation: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    verifyCertificate: (activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs.XCertificate]) => scala.Double
  ): XSecurityEnvironment = {
    val __obj = js.Dynamic.literal(PersonalCertificates = PersonalCertificates, SecurityEnvironmentInformation = SecurityEnvironmentInformation, acquire = js.Any.fromFunction0(acquire), buildCertificatePath = js.Any.fromFunction1(buildCertificatePath), createCertificateFromAscii = js.Any.fromFunction1(createCertificateFromAscii), createCertificateFromRaw = js.Any.fromFunction1(createCertificateFromRaw), getCertificate = js.Any.fromFunction2(getCertificate), getCertificateCharacters = js.Any.fromFunction1(getCertificateCharacters), getPersonalCertificates = js.Any.fromFunction0(getPersonalCertificates), getSecurityEnvironmentInformation = js.Any.fromFunction0(getSecurityEnvironmentInformation), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), verifyCertificate = js.Any.fromFunction2(verifyCertificate))
  
    __obj.asInstanceOf[XSecurityEnvironment]
  }
}

