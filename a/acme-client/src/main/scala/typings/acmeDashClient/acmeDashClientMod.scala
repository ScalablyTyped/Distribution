package typings.acmeDashClient

import typings.acmeDashClient.clientMod.Options
import typings.acmeDashClient.clientMod.default
import typings.acmeDashClient.cryptoForgeMod.Csr
import typings.acmeDashClient.cryptoForgeMod.CsrOptions
import typings.acmeDashClient.cryptoForgeMod.PrivateKey
import typings.axios.axiosMod.AxiosInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acme-client", JSImport.Namespace)
@js.native
object acmeDashClientMod extends js.Object {
  @js.native
  class Client protected () extends default {
    def this(opts: Options) = this()
  }
  
  val axios: AxiosInstance = js.native
  @js.native
  object RevocationReason extends js.Object {
    /* 10 */ val AACompromise: typings.acmeDashClient.clientMod.RevocationReason.AACompromise with Double = js.native
    /* 3 */ val AffiliationChanged: typings.acmeDashClient.clientMod.RevocationReason.AffiliationChanged with Double = js.native
    /* 2 */ val CACompromise: typings.acmeDashClient.clientMod.RevocationReason.CACompromise with Double = js.native
    /* 6 */ val CertificateHold: typings.acmeDashClient.clientMod.RevocationReason.CertificateHold with Double = js.native
    /* 5 */ val CessationOfOperation: typings.acmeDashClient.clientMod.RevocationReason.CessationOfOperation with Double = js.native
    /* 1 */ val KeyCompromise: typings.acmeDashClient.clientMod.RevocationReason.KeyCompromise with Double = js.native
    /* 9 */ val PrivilegeWithdrawn: typings.acmeDashClient.clientMod.RevocationReason.PrivilegeWithdrawn with Double = js.native
    /* 8 */ val RemoveFromCRL: typings.acmeDashClient.clientMod.RevocationReason.RemoveFromCRL with Double = js.native
    /* 4 */ val Supersedeed: typings.acmeDashClient.clientMod.RevocationReason.Supersedeed with Double = js.native
    /* 0 */ val Unspecified: typings.acmeDashClient.clientMod.RevocationReason.Unspecified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.acmeDashClient.clientMod.RevocationReason with Double] = js.native
  }
  
  @js.native
  object directory extends js.Object {
    var letsencrypt: Anon_Production = js.native
  }
  
  @js.native
  object forge extends js.Object {
    def createCsr(data: CsrOptions): js.Promise[js.Tuple2[PrivateKey, Csr]] = js.native
    def createCsr(data: CsrOptions, key: PrivateKey): js.Promise[js.Tuple2[PrivateKey, Csr]] = js.native
    def createPrivateKey(): js.Promise[PrivateKey] = js.native
    def createPrivateKey(size: Double): js.Promise[PrivateKey] = js.native
  }
  
}

