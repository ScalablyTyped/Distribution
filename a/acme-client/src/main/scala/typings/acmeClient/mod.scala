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
import scala.scalajs.js.`|`
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
    @scala.inline
    def letsencrypt_=(x: Production): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letsencrypt")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("acme-client", "forge")
  @js.native
  val forge: CryptoInterface = js.native
  
  @js.native
  trait Authorization
    extends typings.acmeClient.rfc8555Mod.Authorization {
    
    var url: String = js.native
  }
  object Authorization {
    
    @scala.inline
    def apply(
      challenges: js.Array[Challenge],
      identifier: Identifier,
      status: pending | valid | invalid | deactivated | expired | revoked,
      url: String
    ): Authorization = {
      val __obj = js.Dynamic.literal(challenges = challenges.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authorization]
    }
    
    @scala.inline
    implicit class AuthorizationMutableBuilder[Self <: Authorization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type CertificateBuffer = Buffer
  
  @js.native
  trait CertificateDomains extends StObject {
    
    var altNames: js.Array[String] = js.native
    
    var commonName: String = js.native
  }
  object CertificateDomains {
    
    @scala.inline
    def apply(altNames: js.Array[String], commonName: String): CertificateDomains = {
      val __obj = js.Dynamic.literal(altNames = altNames.asInstanceOf[js.Any], commonName = commonName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateDomains]
    }
    
    @scala.inline
    implicit class CertificateDomainsMutableBuilder[Self <: CertificateDomains] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltNames(value: js.Array[String]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltNamesVarargs(value: String*): Self = StObject.set(x, "altNames", js.Array(value :_*))
      
      @scala.inline
      def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CertificateInfo extends StObject {
    
    var domains: CertificateDomains = js.native
    
    var issuer: CertificateIssuer = js.native
    
    var notAfter: Date = js.native
    
    var notBefore: Date = js.native
  }
  object CertificateInfo {
    
    @scala.inline
    def apply(domains: CertificateDomains, issuer: CertificateIssuer, notAfter: Date, notBefore: Date): CertificateInfo = {
      val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateInfo]
    }
    
    @scala.inline
    implicit class CertificateInfoMutableBuilder[Self <: CertificateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomains(value: CertificateDomains): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuer(value: CertificateIssuer): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotAfter(value: Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotBefore(value: Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CertificateIssuer extends StObject {
    
    var commonName: String = js.native
  }
  object CertificateIssuer {
    
    @scala.inline
    def apply(commonName: String): CertificateIssuer = {
      val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateIssuer]
    }
    
    @scala.inline
    implicit class CertificateIssuerMutableBuilder[Self <: CertificateIssuer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    }
  }
  
  type CertificateString = String
  
  @js.native
  trait ClientAutoOptions extends StObject {
    
    def challengeCreateFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[_] = js.native
    
    var challengePriority: js.UndefOr[js.Array[String]] = js.native
    
    def challengeRemoveFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[_] = js.native
    
    var csr: CsrBuffer | CsrString = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var preferredChain: js.UndefOr[String] = js.native
    
    var skipChallengeVerification: js.UndefOr[Boolean] = js.native
    
    var termsOfServiceAgreed: js.UndefOr[Boolean] = js.native
  }
  object ClientAutoOptions {
    
    @scala.inline
    def apply(
      challengeCreateFn: (Authorization, Challenge, String) => js.Promise[_],
      challengeRemoveFn: (Authorization, Challenge, String) => js.Promise[_],
      csr: CsrBuffer | CsrString
    ): ClientAutoOptions = {
      val __obj = js.Dynamic.literal(challengeCreateFn = js.Any.fromFunction3(challengeCreateFn), challengeRemoveFn = js.Any.fromFunction3(challengeRemoveFn), csr = csr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientAutoOptions]
    }
    
    @scala.inline
    implicit class ClientAutoOptionsMutableBuilder[Self <: ClientAutoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChallengeCreateFn(value: (Authorization, Challenge, String) => js.Promise[_]): Self = StObject.set(x, "challengeCreateFn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChallengePriority(value: js.Array[String]): Self = StObject.set(x, "challengePriority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChallengePriorityUndefined: Self = StObject.set(x, "challengePriority", js.undefined)
      
      @scala.inline
      def setChallengePriorityVarargs(value: String*): Self = StObject.set(x, "challengePriority", js.Array(value :_*))
      
      @scala.inline
      def setChallengeRemoveFn(value: (Authorization, Challenge, String) => js.Promise[_]): Self = StObject.set(x, "challengeRemoveFn", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCsr(value: CsrBuffer | CsrString): Self = StObject.set(x, "csr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setPreferredChain(value: String): Self = StObject.set(x, "preferredChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredChainUndefined: Self = StObject.set(x, "preferredChain", js.undefined)
      
      @scala.inline
      def setSkipChallengeVerification(value: Boolean): Self = StObject.set(x, "skipChallengeVerification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipChallengeVerificationUndefined: Self = StObject.set(x, "skipChallengeVerification", js.undefined)
      
      @scala.inline
      def setTermsOfServiceAgreed(value: Boolean): Self = StObject.set(x, "termsOfServiceAgreed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTermsOfServiceAgreedUndefined: Self = StObject.set(x, "termsOfServiceAgreed", js.undefined)
    }
  }
  
  @js.native
  trait ClientOptions extends StObject {
    
    var accountKey: PrivateKeyBuffer | PrivateKeyString = js.native
    
    var accountUrl: js.UndefOr[String] = js.native
    
    var backoffAttempts: js.UndefOr[Double] = js.native
    
    var backoffMax: js.UndefOr[Double] = js.native
    
    var backoffMin: js.UndefOr[Double] = js.native
    
    var directoryUrl: String = js.native
  }
  object ClientOptions {
    
    @scala.inline
    def apply(accountKey: PrivateKeyBuffer | PrivateKeyString, directoryUrl: String): ClientOptions = {
      val __obj = js.Dynamic.literal(accountKey = accountKey.asInstanceOf[js.Any], directoryUrl = directoryUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    @scala.inline
    implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountKey(value: PrivateKeyBuffer | PrivateKeyString): Self = StObject.set(x, "accountKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUrl(value: String): Self = StObject.set(x, "accountUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUrlUndefined: Self = StObject.set(x, "accountUrl", js.undefined)
      
      @scala.inline
      def setBackoffAttempts(value: Double): Self = StObject.set(x, "backoffAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffAttemptsUndefined: Self = StObject.set(x, "backoffAttempts", js.undefined)
      
      @scala.inline
      def setBackoffMax(value: Double): Self = StObject.set(x, "backoffMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffMaxUndefined: Self = StObject.set(x, "backoffMax", js.undefined)
      
      @scala.inline
      def setBackoffMin(value: Double): Self = StObject.set(x, "backoffMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackoffMinUndefined: Self = StObject.set(x, "backoffMin", js.undefined)
      
      @scala.inline
      def setDirectoryUrl(value: String): Self = StObject.set(x, "directoryUrl", value.asInstanceOf[js.Any])
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
    
    def getModulus(
      input: CertificateBuffer | CertificateString | CsrBuffer | CsrString | PrivateKeyBuffer | PrivateKeyString | PublicKeyBuffer | PublicKeyString
    ): js.Promise[Buffer] = js.native
    
    def getPemBody(str: String): String = js.native
    
    def getPublicExponent(
      input: CertificateBuffer | CertificateString | CsrBuffer | CsrString | PrivateKeyBuffer | PrivateKeyString | PublicKeyBuffer | PublicKeyString
    ): js.Promise[Buffer] = js.native
    
    def readCertificateInfo(cert: CertificateBuffer): js.Promise[CertificateInfo] = js.native
    def readCertificateInfo(cert: CertificateString): js.Promise[CertificateInfo] = js.native
    
    def readCsrDomains(csr: CsrBuffer): js.Promise[CertificateDomains] = js.native
    def readCsrDomains(csr: CsrString): js.Promise[CertificateDomains] = js.native
    
    def splitPemChain(str: String): js.Array[String] = js.native
  }
  
  type CsrBuffer = Buffer
  
  @js.native
  trait CsrOptions extends StObject {
    
    var altNames: js.UndefOr[js.Array[String]] = js.native
    
    var commonName: js.UndefOr[String] = js.native
    
    var country: js.UndefOr[String] = js.native
    
    var emailAddress: js.UndefOr[String] = js.native
    
    var keySize: js.UndefOr[Double] = js.native
    
    var locality: js.UndefOr[String] = js.native
    
    var organization: js.UndefOr[String] = js.native
    
    var organizationUnit: js.UndefOr[String] = js.native
    
    var state: js.UndefOr[String] = js.native
  }
  object CsrOptions {
    
    @scala.inline
    def apply(): CsrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CsrOptions]
    }
    
    @scala.inline
    implicit class CsrOptionsMutableBuilder[Self <: CsrOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltNames(value: js.Array[String]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltNamesUndefined: Self = StObject.set(x, "altNames", js.undefined)
      
      @scala.inline
      def setAltNamesVarargs(value: String*): Self = StObject.set(x, "altNames", js.Array(value :_*))
      
      @scala.inline
      def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
      
      @scala.inline
      def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeySizeUndefined: Self = StObject.set(x, "keySize", js.undefined)
      
      @scala.inline
      def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
      
      @scala.inline
      def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      @scala.inline
      def setOrganizationUnit(value: String): Self = StObject.set(x, "organizationUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationUnitUndefined: Self = StObject.set(x, "organizationUnit", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  type CsrString = String
  
  @js.native
  trait Order
    extends typings.acmeClient.rfc8555Mod.Order {
    
    var url: String = js.native
  }
  object Order {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class OrderMutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type PrivateKeyBuffer = Buffer
  
  type PrivateKeyString = String
  
  type PublicKeyBuffer = Buffer
  
  type PublicKeyString = String
}
