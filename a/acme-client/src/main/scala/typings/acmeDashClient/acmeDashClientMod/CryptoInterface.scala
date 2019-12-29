package typings.acmeDashClient.acmeDashClientMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CryptoInterface extends js.Object {
  def createCsr(data: CsrOptions): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
  def createCsr(data: CsrOptions, key: PrivateKeyBuffer): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
  def createCsr(data: CsrOptions, key: PrivateKeyString): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
  def createPrivateKey(): js.Promise[PrivateKeyBuffer] = js.native
  def createPrivateKey(size: Double): js.Promise[PrivateKeyBuffer] = js.native
  def createPublicKey(key: PrivateKeyBuffer): js.Promise[PublicKeyBuffer] = js.native
  def createPublicKey(key: PrivateKeyString): js.Promise[PublicKeyBuffer] = js.native
  def getModulus(
    input: CertificateBuffer | CertificateString | CsrBuffer | CsrString | PrivateKeyBuffer | PrivateKeyString | PublicKeyBuffer | PublicKeyString
  ): js.Promise[Buffer] = js.native
  def getPublicExponent(
    input: CertificateBuffer | CertificateString | CsrBuffer | CsrString | PrivateKeyBuffer | PrivateKeyString | PublicKeyBuffer | PublicKeyString
  ): js.Promise[Buffer] = js.native
  def readCertificateInfo(cert: CertificateBuffer): js.Promise[CertificateInfo] = js.native
  def readCertificateInfo(cert: CertificateString): js.Promise[CertificateInfo] = js.native
  def readCsrDomains(csr: CsrBuffer): js.Promise[CsrDomains] = js.native
  def readCsrDomains(csr: CsrString): js.Promise[CsrDomains] = js.native
}

