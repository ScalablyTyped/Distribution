package typings.acmeClient

import typings.acmeClient.acmeClientStrings.`P-256`
import typings.acmeClient.acmeClientStrings.`P-384`
import typings.acmeClient.acmeClientStrings.`P-521`
import typings.acmeClient.acmeClientStrings.deactivated
import typings.acmeClient.acmeClientStrings.expired
import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.processing
import typings.acmeClient.acmeClientStrings.ready
import typings.acmeClient.acmeClientStrings.revoked
import typings.acmeClient.acmeClientStrings.valid
import typings.acmeClient.anon.Production
import typings.acmeClient.anon.ProductionString
import typings.acmeClient.rfc8555Mod.Account
import typings.acmeClient.rfc8555Mod.AccountCreateRequest
import typings.acmeClient.rfc8555Mod.AccountUpdateRequest
import typings.acmeClient.rfc8555Mod.CertificateRevocationRequest
import typings.acmeClient.rfc8555Mod.Challenge
import typings.acmeClient.rfc8555Mod.Identifier
import typings.acmeClient.rfc8555Mod.OrderCreateRequest
import typings.axios.mod.AxiosInstance
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("acme-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("acme-client", "Client")
  @js.native
  open class Client protected () extends StObject {
    def this(opts: ClientOptions) = this()
    
    def auto(opts: ClientAutoOptions): js.Promise[String] = js.native
    
    def completeChallenge(challenge: Challenge): js.Promise[Challenge] = js.native
    
    def createAccount(): js.Promise[Account] = js.native
    def createAccount(data: AccountCreateRequest): js.Promise[Account] = js.native
    
    def createOrder(data: OrderCreateRequest): js.Promise[Order] = js.native
    
    def deactivateAuthorization(authz: Authorization): js.Promise[Authorization] = js.native
    
    def finalizeOrder(order: Order, csr: CsrBuffer): js.Promise[Order] = js.native
    def finalizeOrder(order: Order, csr: CsrString): js.Promise[Order] = js.native
    
    def getAccountUrl(): String = js.native
    
    def getAuthorizations(order: Order): js.Promise[js.Array[Authorization]] = js.native
    
    def getCertificate(order: Order): js.Promise[String] = js.native
    def getCertificate(order: Order, preferredChain: String): js.Promise[String] = js.native
    
    def getChallengeKeyAuthorization(challenge: Challenge): js.Promise[String] = js.native
    
    def getOrder(order: Order): js.Promise[Order] = js.native
    
    def getTermsOfServiceUrl(): js.Promise[String] = js.native
    
    def revokeCertificate(cert: CertificateBuffer): js.Promise[Unit] = js.native
    def revokeCertificate(cert: CertificateBuffer, data: CertificateRevocationRequest): js.Promise[Unit] = js.native
    def revokeCertificate(cert: CertificateString): js.Promise[Unit] = js.native
    def revokeCertificate(cert: CertificateString, data: CertificateRevocationRequest): js.Promise[Unit] = js.native
    
    def updateAccount(): js.Promise[Account] = js.native
    def updateAccount(data: AccountUpdateRequest): js.Promise[Account] = js.native
    
    def updateAccountKey(newAccountKey: PrivateKeyBuffer): js.Promise[Account] = js.native
    def updateAccountKey(newAccountKey: PrivateKeyBuffer, data: js.Object): js.Promise[Account] = js.native
    def updateAccountKey(newAccountKey: PrivateKeyString): js.Promise[Account] = js.native
    def updateAccountKey(newAccountKey: PrivateKeyString, data: js.Object): js.Promise[Account] = js.native
    
    def verifyChallenge(authz: Authorization, challenge: Challenge): js.Promise[Boolean] = js.native
    
    def waitForValidStatus[T](item: T): js.Promise[T] = js.native
  }
  
  @JSImport("acme-client", "axios")
  @js.native
  val axios: AxiosInstance = js.native
  
  @JSImport("acme-client", "crypto")
  @js.native
  val crypto: CryptoInterface = js.native
  
  object directory {
    
    @JSImport("acme-client", "directory")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("acme-client", "directory.buypass")
    @js.native
    def buypass: Production = js.native
    inline def buypass_=(x: Production): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buypass")(x.asInstanceOf[js.Any])
    
    @JSImport("acme-client", "directory.letsencrypt")
    @js.native
    def letsencrypt: Production = js.native
    inline def letsencrypt_=(x: Production): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letsencrypt")(x.asInstanceOf[js.Any])
    
    @JSImport("acme-client", "directory.zerossl")
    @js.native
    def zerossl: ProductionString = js.native
    inline def zerossl_=(x: ProductionString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zerossl")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("acme-client", "forge")
  @js.native
  val forge: CryptoLegacyInterface = js.native
  
  inline def setLogger(fn: js.Function1[/* msg */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Authorization
    extends StObject
       with typings.acmeClient.rfc8555Mod.Authorization {
    
    var url: String
  }
  object Authorization {
    
    inline def apply(
      challenges: js.Array[Challenge],
      identifier: Identifier,
      status: pending | valid | invalid | deactivated | expired | revoked,
      url: String
    ): Authorization = {
      val __obj = js.Dynamic.literal(challenges = challenges.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authorization]
    }
    
    extension [Self <: Authorization](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type CertificateBuffer = Buffer
  
  trait CertificateDomains extends StObject {
    
    var altNames: js.Array[String]
    
    var commonName: String
  }
  object CertificateDomains {
    
    inline def apply(altNames: js.Array[String], commonName: String): CertificateDomains = {
      val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any], commonName = commonName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateDomains]
    }
    
    extension [Self <: CertificateDomains](x: Self) {
      
      inline def setAltNames(value: js.Array[String]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
      
      inline def setAltNamesVarargs(value: String*): Self = StObject.set(x, "altNames", js.Array(value*))
      
      inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateInfo extends StObject {
    
    var domains: CertificateDomains
    
    var issuer: CertificateIssuer
    
    var notAfter: js.Date
    
    var notBefore: js.Date
  }
  object CertificateInfo {
    
    inline def apply(domains: CertificateDomains, issuer: CertificateIssuer, notAfter: js.Date, notBefore: js.Date): CertificateInfo = {
      val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateInfo]
    }
    
    extension [Self <: CertificateInfo](x: Self) {
      
      inline def setDomains(value: CertificateDomains): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setIssuer(value: CertificateIssuer): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setNotAfter(value: js.Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
      
      inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateIssuer extends StObject {
    
    var commonName: String
  }
  object CertificateIssuer {
    
    inline def apply(commonName: String): CertificateIssuer = {
      val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateIssuer]
    }
    
    extension [Self <: CertificateIssuer](x: Self) {
      
      inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    }
  }
  
  type CertificateString = String
  
  trait ClientAutoOptions extends StObject {
    
    def challengeCreateFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[Any]
    
    var challengePriority: js.UndefOr[js.Array[String]] = js.undefined
    
    def challengeRemoveFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[Any]
    
    var csr: CsrBuffer | CsrString
    
    var email: js.UndefOr[String] = js.undefined
    
    var preferredChain: js.UndefOr[String] = js.undefined
    
    var skipChallengeVerification: js.UndefOr[Boolean] = js.undefined
    
    var termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
  }
  object ClientAutoOptions {
    
    inline def apply(
      challengeCreateFn: (Authorization, Challenge, String) => js.Promise[Any],
      challengeRemoveFn: (Authorization, Challenge, String) => js.Promise[Any],
      csr: CsrBuffer | CsrString
    ): ClientAutoOptions = {
      val __obj = js.Dynamic.literal(challengeCreateFn = js.Any.fromFunction3(challengeCreateFn), challengeRemoveFn = js.Any.fromFunction3(challengeRemoveFn), csr = csr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientAutoOptions]
    }
    
    extension [Self <: ClientAutoOptions](x: Self) {
      
      inline def setChallengeCreateFn(value: (Authorization, Challenge, String) => js.Promise[Any]): Self = StObject.set(x, "challengeCreateFn", js.Any.fromFunction3(value))
      
      inline def setChallengePriority(value: js.Array[String]): Self = StObject.set(x, "challengePriority", value.asInstanceOf[js.Any])
      
      inline def setChallengePriorityUndefined: Self = StObject.set(x, "challengePriority", js.undefined)
      
      inline def setChallengePriorityVarargs(value: String*): Self = StObject.set(x, "challengePriority", js.Array(value*))
      
      inline def setChallengeRemoveFn(value: (Authorization, Challenge, String) => js.Promise[Any]): Self = StObject.set(x, "challengeRemoveFn", js.Any.fromFunction3(value))
      
      inline def setCsr(value: CsrBuffer | CsrString): Self = StObject.set(x, "csr", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPreferredChain(value: String): Self = StObject.set(x, "preferredChain", value.asInstanceOf[js.Any])
      
      inline def setPreferredChainUndefined: Self = StObject.set(x, "preferredChain", js.undefined)
      
      inline def setSkipChallengeVerification(value: Boolean): Self = StObject.set(x, "skipChallengeVerification", value.asInstanceOf[js.Any])
      
      inline def setSkipChallengeVerificationUndefined: Self = StObject.set(x, "skipChallengeVerification", js.undefined)
      
      inline def setTermsOfServiceAgreed(value: Boolean): Self = StObject.set(x, "termsOfServiceAgreed", value.asInstanceOf[js.Any])
      
      inline def setTermsOfServiceAgreedUndefined: Self = StObject.set(x, "termsOfServiceAgreed", js.undefined)
    }
  }
  
  trait ClientExternalAccountBindingOptions extends StObject {
    
    var hmacKey: String
    
    var kid: String
  }
  object ClientExternalAccountBindingOptions {
    
    inline def apply(hmacKey: String, kid: String): ClientExternalAccountBindingOptions = {
      val __obj = js.Dynamic.literal(hmacKey = hmacKey.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientExternalAccountBindingOptions]
    }
    
    extension [Self <: ClientExternalAccountBindingOptions](x: Self) {
      
      inline def setHmacKey(value: String): Self = StObject.set(x, "hmacKey", value.asInstanceOf[js.Any])
      
      inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientOptions extends StObject {
    
    var accountKey: PrivateKeyBuffer | PrivateKeyString
    
    var accountUrl: js.UndefOr[String] = js.undefined
    
    var backoffAttempts: js.UndefOr[Double] = js.undefined
    
    var backoffMax: js.UndefOr[Double] = js.undefined
    
    var backoffMin: js.UndefOr[Double] = js.undefined
    
    var directoryUrl: String
    
    var externalAccountBinding: js.UndefOr[ClientExternalAccountBindingOptions] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(accountKey: PrivateKeyBuffer | PrivateKeyString, directoryUrl: String): ClientOptions = {
      val __obj = js.Dynamic.literal(accountKey = accountKey.asInstanceOf[js.Any], directoryUrl = directoryUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setAccountKey(value: PrivateKeyBuffer | PrivateKeyString): Self = StObject.set(x, "accountKey", value.asInstanceOf[js.Any])
      
      inline def setAccountUrl(value: String): Self = StObject.set(x, "accountUrl", value.asInstanceOf[js.Any])
      
      inline def setAccountUrlUndefined: Self = StObject.set(x, "accountUrl", js.undefined)
      
      inline def setBackoffAttempts(value: Double): Self = StObject.set(x, "backoffAttempts", value.asInstanceOf[js.Any])
      
      inline def setBackoffAttemptsUndefined: Self = StObject.set(x, "backoffAttempts", js.undefined)
      
      inline def setBackoffMax(value: Double): Self = StObject.set(x, "backoffMax", value.asInstanceOf[js.Any])
      
      inline def setBackoffMaxUndefined: Self = StObject.set(x, "backoffMax", js.undefined)
      
      inline def setBackoffMin(value: Double): Self = StObject.set(x, "backoffMin", value.asInstanceOf[js.Any])
      
      inline def setBackoffMinUndefined: Self = StObject.set(x, "backoffMin", js.undefined)
      
      inline def setDirectoryUrl(value: String): Self = StObject.set(x, "directoryUrl", value.asInstanceOf[js.Any])
      
      inline def setExternalAccountBinding(value: ClientExternalAccountBindingOptions): Self = StObject.set(x, "externalAccountBinding", value.asInstanceOf[js.Any])
      
      inline def setExternalAccountBindingUndefined: Self = StObject.set(x, "externalAccountBinding", js.undefined)
    }
  }
  
  @js.native
  trait CryptoInterface extends StObject {
    
    def createCsr(data: CsrOptions): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
    def createCsr(data: CsrOptions, keyPem: PrivateKeyBuffer): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
    def createCsr(data: CsrOptions, keyPem: PrivateKeyString): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
    
    def createPrivateEcdsaKey(): js.Promise[PrivateKeyBuffer] = js.native
    def createPrivateEcdsaKey(namedCurve: `P-256` | `P-384` | `P-521`): js.Promise[PrivateKeyBuffer] = js.native
    
    def createPrivateKey(): js.Promise[PrivateKeyBuffer] = js.native
    def createPrivateKey(keySize: Double): js.Promise[PrivateKeyBuffer] = js.native
    
    def createPrivateRsaKey(): js.Promise[PrivateKeyBuffer] = js.native
    def createPrivateRsaKey(keySize: Double): js.Promise[PrivateKeyBuffer] = js.native
    
    def getJwk(keyPem: PrivateKeyBuffer | PublicKeyBuffer): RsaPublicJwk | EcdsaPublicJwk = js.native
    def getJwk(keyPem: PrivateKeyString | PublicKeyString): RsaPublicJwk | EcdsaPublicJwk = js.native
    
    def getPemBodyAsB64u(pem: CertificateBuffer): String = js.native
    def getPemBodyAsB64u(pem: CertificateString): String = js.native
    
    def getPublicKey(keyPem: PrivateKeyBuffer | PublicKeyBuffer): PublicKeyBuffer = js.native
    def getPublicKey(keyPem: PrivateKeyString | PublicKeyString): PublicKeyBuffer = js.native
    
    def readCertificateInfo(certPem: CertificateBuffer): CertificateInfo = js.native
    def readCertificateInfo(certPem: CertificateString): CertificateInfo = js.native
    
    def readCsrDomains(csrPem: CsrBuffer): CertificateDomains = js.native
    def readCsrDomains(csrPem: CsrString): CertificateDomains = js.native
    
    def splitPemChain(chainPem: CertificateBuffer): js.Array[String] = js.native
    def splitPemChain(chainPem: CertificateString): js.Array[String] = js.native
  }
  
  @js.native
  trait CryptoLegacyInterface extends StObject {
    
    def createCsr(data: CsrOptions): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
    def createCsr(data: CsrOptions, key: PrivateKeyBuffer): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
    def createCsr(data: CsrOptions, key: PrivateKeyString): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
    
    def createPrivateKey(): js.Promise[PrivateKeyBuffer] = js.native
    def createPrivateKey(size: Double): js.Promise[PrivateKeyBuffer] = js.native
    
    def createPublicKey(key: PrivateKeyBuffer): js.Promise[PublicKeyBuffer] = js.native
    def createPublicKey(key: PrivateKeyString): js.Promise[PublicKeyBuffer] = js.native
    
    def getModulus(input: CertificateString | CsrString | PrivateKeyString | PublicKeyString): js.Promise[Buffer] = js.native
    def getModulus(input: CertificateBuffer | CsrBuffer | PrivateKeyBuffer | PublicKeyBuffer): js.Promise[Buffer] = js.native
    
    def getPemBody(str: String): String = js.native
    
    def getPublicExponent(input: CertificateString | CsrString | PrivateKeyString | PublicKeyString): js.Promise[Buffer] = js.native
    def getPublicExponent(input: CertificateBuffer | CsrBuffer | PrivateKeyBuffer | PublicKeyBuffer): js.Promise[Buffer] = js.native
    
    def readCertificateInfo(cert: CertificateBuffer): js.Promise[CertificateInfo] = js.native
    def readCertificateInfo(cert: CertificateString): js.Promise[CertificateInfo] = js.native
    
    def readCsrDomains(csr: CsrBuffer): js.Promise[CertificateDomains] = js.native
    def readCsrDomains(csr: CsrString): js.Promise[CertificateDomains] = js.native
    
    def splitPemChain(str: String): js.Array[String] = js.native
  }
  
  type CsrBuffer = Buffer
  
  trait CsrOptions extends StObject {
    
    var altNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var commonName: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String] = js.undefined
    
    var emailAddress: js.UndefOr[String] = js.undefined
    
    var keySize: js.UndefOr[Double] = js.undefined
    
    var locality: js.UndefOr[String] = js.undefined
    
    var organization: js.UndefOr[String] = js.undefined
    
    var organizationUnit: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object CsrOptions {
    
    inline def apply(): CsrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsrOptions]
    }
    
    extension [Self <: CsrOptions](x: Self) {
      
      inline def setAltNames(value: js.Array[String]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
      
      inline def setAltNamesUndefined: Self = StObject.set(x, "altNames", js.undefined)
      
      inline def setAltNamesVarargs(value: String*): Self = StObject.set(x, "altNames", js.Array(value*))
      
      inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      inline def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
      
      inline def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
      
      inline def setKeySizeUndefined: Self = StObject.set(x, "keySize", js.undefined)
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      inline def setOrganizationUnit(value: String): Self = StObject.set(x, "organizationUnit", value.asInstanceOf[js.Any])
      
      inline def setOrganizationUnitUndefined: Self = StObject.set(x, "organizationUnit", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  type CsrString = String
  
  trait EcdsaPublicJwk extends StObject {
    
    var crv: String
    
    var kty: String
    
    var x: String
    
    var y: String
  }
  object EcdsaPublicJwk {
    
    inline def apply(crv: String, kty: String, x: String, y: String): EcdsaPublicJwk = {
      val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[EcdsaPublicJwk]
    }
    
    extension [Self <: EcdsaPublicJwk](x: Self) {
      
      inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
      
      inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Order
    extends StObject
       with typings.acmeClient.rfc8555Mod.Order {
    
    var url: String
  }
  object Order {
    
    inline def apply(
      authorizations: js.Array[String],
      finalize_ : String,
      identifiers: js.Array[Identifier],
      status: pending | ready | processing | valid | invalid,
      url: String
    ): Order = {
      val __obj = js.Dynamic.literal(authorizations = authorizations.asInstanceOf[js.Any], identifiers = identifiers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("finalize")(finalize_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Order]
    }
    
    extension [Self <: Order](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type PrivateKeyBuffer = Buffer
  
  type PrivateKeyString = String
  
  type PublicKeyBuffer = Buffer
  
  type PublicKeyString = String
  
  trait RsaPublicJwk extends StObject {
    
    var e: String
    
    var kty: String
    
    var n: String
  }
  object RsaPublicJwk {
    
    inline def apply(e: String, kty: String, n: String): RsaPublicJwk = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
      __obj.asInstanceOf[RsaPublicJwk]
    }
    
    extension [Self <: RsaPublicJwk](x: Self) {
      
      inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    }
  }
}
