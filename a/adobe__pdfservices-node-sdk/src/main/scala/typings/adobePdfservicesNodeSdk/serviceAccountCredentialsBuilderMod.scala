package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.serviceAccountCredentialsMod.ServiceAccountCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceAccountCredentialsBuilderMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/auth/service-account-credentials-builder", "ServiceAccountCredentialsBuilder")
  @js.native
  open class ServiceAccountCredentialsBuilder () extends StObject {
    
    var accountId: Any = js.native
    
    /**
      * Returns a new {@link ServiceAccountCredentials} instance built from the current state of this builder.
      */
    def build(): ServiceAccountCredentials = js.native
    
    var claim: Any = js.native
    
    var clientId: Any = js.native
    
    var clientSecret: Any = js.native
    
    /**
      * Sets Service Account Credentials using the JSON credentials file path. All the keys in the JSON
      * structure are optional.
      * <p>
      * JSON structure:
      * <pre>
      * {
      *   "client_credentials": {
      *     "client_id": "CLIENT_ID",
      *     "client_secret": "CLIENT_SECRET"
      *   },
      *   "service_account_credentials": {
      *     "organization_id": "org_ident@AdobeOrg",
      *     "account_id": "id@techacct.adobe.com",
      *     "private_key_file": "private.key"
      *   }
      * }
      * </pre>
      * private_key_file is the path of private key file. It will be looked up in the classpath and the
      * directory of JSON credentials file.
      */
    def fromFile(credentialsFilePath: String): ServiceAccountCredentialsBuilder = js.native
    
    var imsBaseUri: Any = js.native
    
    var opsCreateUri: Any = js.native
    
    var organizationId: Any = js.native
    
    var privateKey: String = js.native
    
    /**
      * Set Account Id (format: id@techacct.adobe.com)
      */
    def withAccountId(accountId: String): ServiceAccountCredentialsBuilder = js.native
    
    /**
      * Set Client ID (API Key)
      */
    def withClientId(clientId: String): ServiceAccountCredentialsBuilder = js.native
    
    /**
      * Set Client Secret
      */
    def withClientSecret(clientSecret: String): ServiceAccountCredentialsBuilder = js.native
    
    /**
      * Set Organization Id (format: org_ident@AdobeOrg) that has been configured for access to PDF Services API
      */
    def withOrganizationId(organizationId: String): ServiceAccountCredentialsBuilder = js.native
    
    /**
      * Set private key
      */
    def withPrivateKey(privateKey: String): ServiceAccountCredentialsBuilder = js.native
  }
}
