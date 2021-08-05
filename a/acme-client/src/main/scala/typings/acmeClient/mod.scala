package typings.acmeClient

import typings.acmeClient.acmeClientStrings.deactivated
import typings.acmeClient.acmeClientStrings.expired
import typings.acmeClient.acmeClientStrings.invalid
import typings.acmeClient.acmeClientStrings.pending
import typings.acmeClient.acmeClientStrings.processing
import typings.acmeClient.acmeClientStrings.ready
import typings.acmeClient.acmeClientStrings.revoked
import typings.acmeClient.acmeClientStrings.valid
import typings.acmeClient.anon.Production
import typings.acmeClient.rfc8555Mod.Account
import typings.acmeClient.rfc8555Mod.AccountCreateRequest
import typings.acmeClient.rfc8555Mod.AccountUpdateRequest
import typings.acmeClient.rfc8555Mod.CertificateRevocationRequest
import typings.acmeClient.rfc8555Mod.Challenge
import typings.acmeClient.rfc8555Mod.Identifier
import typings.acmeClient.rfc8555Mod.OrderCreateRequest
import typings.axios.mod.AxiosInstance
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("acme-client", "Client")
  @js.native
  class Client protected () extends StObject {
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
  
  object directory {
    
    @JSImport("acme-client", "directory")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("acme-client", "directory.letsencrypt")
    @js.native
    def letsencrypt: Production = js.native
    inline def letsencrypt_=(x: Production): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letsencrypt")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("acme-client", "forge")
  @js.native
  val forge: CryptoInterface = js.native
  
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
      
      inline def setAltNamesVarargs(value: String*): Self = StObject.set(x, "altNames", js.Array(value :_*))
      
      inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateInfo extends StObject {
    
    var domains: CertificateDomains
    
    var issuer: CertificateIssuer
    
    var notAfter: Date
    
    var notBefore: Date
  }
  object CertificateInfo {
    
    inline def apply(domains: CertificateDomains, issuer: CertificateIssuer, notAfter: Date, notBefore: Date): CertificateInfo = {
      val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateInfo]
    }
    
    extension [Self <: CertificateInfo](x: Self) {
      
      inline def setDomains(value: CertificateDomains): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setIssuer(value: CertificateIssuer): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setNotAfter(value: Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
      
      inline def setNotBefore(value: Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
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
    
    def challengeCreateFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[js.Any]
    
    var challengePriority: js.UndefOr[js.Array[String]] = js.undefined
    
    def challengeRemoveFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[js.Any]
    
    var csr: CsrBuffer | CsrString
    
    var email: js.UndefOr[String] = js.undefined
    
    var preferredChain: js.UndefOr[String] = js.undefined
    
    var skipChallengeVerification: js.UndefOr[Boolean] = js.undefined
    
    var termsOfServiceAgreed: js.UndefOr[Boolean] = js.undefined
  }
  object ClientAutoOptions {
    
    inline def apply(
      challengeCreateFn: (Authorization, Challenge, String) => js.Promise[js.Any],
      challengeRemoveFn: (Authorization, Challenge, String) => js.Promise[js.Any],
      csr: CsrBuffer | CsrString
    ): ClientAutoOptions = {
      val __obj = js.Dynamic.literal(challengeCreateFn = js.Any.fromFunction3(challengeCreateFn), challengeRemoveFn = js.Any.fromFunction3(challengeRemoveFn), csr = csr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientAutoOptions]
    }
    
    extension [Self <: ClientAutoOptions](x: Self) {
      
      inline def setChallengeCreateFn(value: (Authorization, Challenge, String) => js.Promise[js.Any]): Self = StObject.set(x, "challengeCreateFn", js.Any.fromFunction3(value))
      
      inline def setChallengePriority(value: js.Array[String]): Self = StObject.set(x, "challengePriority", value.asInstanceOf[js.Any])
      
      inline def setChallengePriorityUndefined: Self = StObject.set(x, "challengePriority", js.undefined)
      
      inline def setChallengePriorityVarargs(value: String*): Self = StObject.set(x, "challengePriority", js.Array(value :_*))
      
      inline def setChallengeRemoveFn(value: (Authorization, Challenge, String) => js.Promise[js.Any]): Self = StObject.set(x, "challengeRemoveFn", js.Any.fromFunction3(value))
      
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
  
  trait ClientOptions extends StObject {
    
    var accountKey: PrivateKeyBuffer | PrivateKeyString
    
    var accountUrl: js.UndefOr[String] = js.undefined
    
    var backoffAttempts: js.UndefOr[Double] = js.undefined
    
    var backoffMax: js.UndefOr[Double] = js.undefined
    
    var backoffMin: js.UndefOr[Double] = js.undefined
    
    var directoryUrl: String
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
    }
  }
  
  @js.native
  trait CryptoInterface extends StObject {
    
    def createCsr(data: CsrOptions): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
    def createCsr(data: CsrOptions, key: PrivateKeyBuffer): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
    def createCsr(data: CsrOptions, key: PrivateKeyString): js.Promise[js.Tuple2[PrivateKeyBuffer, CsrBuffer]] = js.native
    
    def createPrivateKey(): js.Promise[PrivateKeyBuffer] = js.native
    def createPrivateKey(size: Double): js.Promise[PrivateKeyBuffer] = js.native
    
    def createPublicKey(key: PrivateKeyBuffer): js.Promise[PublicKeyBuffer] = js.native
    def createPublicKey(key: PrivateKeyString): js.Promise[PublicKeyBuffer] = js.native
    
    def getModulus(input: CertificateBuffer | CsrBuffer | PrivateKeyBuffer | PublicKeyBuffer): js.Promise[Buffer] = js.native
    def getModulus(input: CertificateString | CsrString | PrivateKeyString | PublicKeyString): js.Promise[Buffer] = js.native
    
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
      
      inline def setAltNamesVarargs(value: String*): Self = StObject.set(x, "altNames", js.Array(value :_*))
      
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
}
