package typings.adobePdfservicesNodeSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceAccountCredentialsMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/auth/service-account-credentials", "ServiceAccountCredentials")
  @js.native
  open class ServiceAccountCredentials protected () extends StObject {
    def this(client_id: Any, client_secret: Any, private_key: Any, organization_id: Any, account_id: Any) = this()
    
    var accountId: Any = js.native
    
    var clientId: Any = js.native
    
    var clientSecret: Any = js.native
    
    /**
      * Account ID(format: id@techacct.adobe.com)
      */
    def getAccountId(): Any = js.native
    
    /**
      * Client Id (API Key)
      */
    def getClientId(): Any = js.native
    
    /**
      * Client Secret
      */
    def getClientSecret(): Any = js.native
    
    /**
      * Identifies the organization(format: org_ident@AdobeOrg) that has been configured for access to PDF Services API.
      */
    def getOrganizationId(): Any = js.native
    
    /**
      * Content of the Private Key (PEM format)
      */
    def getPrivateKey(): Any = js.native
    
    var organizationId: Any = js.native
    
    var privateKey: Any = js.native
    
    def validate(): Unit = js.native
  }
}
