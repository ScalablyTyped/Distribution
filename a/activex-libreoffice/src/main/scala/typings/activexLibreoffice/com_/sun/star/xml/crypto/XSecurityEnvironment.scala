package typings.activexLibreoffice.com_.sun.star.xml.crypto

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.security.XCertificate
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface of Security Environment */
trait XSecurityEnvironment extends XInterface {
  /** Get personal certificate from the environment */
  val PersonalCertificates: SafeArray[XCertificate]
  /** Get the Environment detail infos */
  val SecurityEnvironmentInformation: String
  /** build certificate path from a certain certificate */
  def buildCertificatePath(beginCert: XCertificate): SafeArray[XCertificate]
  /** Create certificate interface from a Base64 encoded certificate. */
  def createCertificateFromAscii(asciiCertificate: String): XCertificate
  /** Create certificate interface from raw DER encoded certificate */
  def createCertificateFromRaw(rawCertificate: SeqEquiv[Double]): XCertificate
  /** Get certificate from the environment by issuer name and serial number */
  def getCertificate(issuerName: String, serialNumber: SeqEquiv[Double]): XCertificate
  /**
    * Get a certificate characters.
    *
    * The method provides a way to get certificate characters like:  1. Whether or not the certificate have a private key in the user profile. 2. Whether or
    * not the certificate is a trusted certificate. 3. Whether or not the certificate is a self-signed certificate.
    *
    * The certificate characters is defined as bit-wise long, please refer to CertificateCharacters definition.
    */
  def getCertificateCharacters(xCertificate: XCertificate): Double
  /** Get personal certificate from the environment */
  def getPersonalCertificates(): SafeArray[XCertificate]
  /** Get the Environment detail infos */
  def getSecurityEnvironmentInformation(): String
  /**
    * Verify a certificate.
    *
    * The method provides a way to verify a certificate.
    * @param xEECertificate The certificate which is to be validated.
    * @param intermediateCertificates Additional certificates which can be used by the method in constructing the certificate chain. The root certificate may
    * @returns The validation status will returned as a bit-wise long, please refer to CertificateValidity definition.
    */
  def verifyCertificate(xEECertificate: XCertificate, intermediateCertificates: SeqEquiv[XCertificate]): Double
}

object XSecurityEnvironment {
  @scala.inline
  def apply(
    PersonalCertificates: SafeArray[XCertificate],
    SecurityEnvironmentInformation: String,
    acquire: () => Unit,
    buildCertificatePath: XCertificate => SafeArray[XCertificate],
    createCertificateFromAscii: String => XCertificate,
    createCertificateFromRaw: SeqEquiv[Double] => XCertificate,
    getCertificate: (String, SeqEquiv[Double]) => XCertificate,
    getCertificateCharacters: XCertificate => Double,
    getPersonalCertificates: () => SafeArray[XCertificate],
    getSecurityEnvironmentInformation: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    verifyCertificate: (XCertificate, SeqEquiv[XCertificate]) => Double
  ): XSecurityEnvironment = {
    val __obj = js.Dynamic.literal(PersonalCertificates = PersonalCertificates.asInstanceOf[js.Any], SecurityEnvironmentInformation = SecurityEnvironmentInformation.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), buildCertificatePath = js.Any.fromFunction1(buildCertificatePath), createCertificateFromAscii = js.Any.fromFunction1(createCertificateFromAscii), createCertificateFromRaw = js.Any.fromFunction1(createCertificateFromRaw), getCertificate = js.Any.fromFunction2(getCertificate), getCertificateCharacters = js.Any.fromFunction1(getCertificateCharacters), getPersonalCertificates = js.Any.fromFunction0(getPersonalCertificates), getSecurityEnvironmentInformation = js.Any.fromFunction0(getSecurityEnvironmentInformation), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), verifyCertificate = js.Any.fromFunction2(verifyCertificate))
    __obj.asInstanceOf[XSecurityEnvironment]
  }
}

