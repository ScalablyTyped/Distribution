package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Salesforce resource. 
    */
  var instanceUrl: js.UndefOr[InstanceUrl] = js.undefined
  
  /**
    *  Indicates whether the connector profile applies to a sandbox or production environment. 
    */
  var isSandboxEnvironment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the connection mode for the connector profile is private, this parameter sets whether Amazon AppFlow uses the private network to send metadata and authorization calls to Salesforce. Amazon AppFlow sends private calls through Amazon Web Services PrivateLink. These calls travel through Amazon Web Services infrastructure without being exposed to the public internet. Set either of the following values:  true  Amazon AppFlow sends all calls to Salesforce over the private network. These private calls are:   Calls to get metadata about your Salesforce records. This metadata describes your Salesforce objects and their fields.   Calls to get or refresh access tokens that allow Amazon AppFlow to access your Salesforce records.   Calls to transfer your Salesforce records as part of a flow run.    false  The default value. Amazon AppFlow sends some calls to Salesforce privately and other calls over the public internet. The public calls are:    Calls to get metadata about your Salesforce records.   Calls to get or refresh access tokens.   The private calls are:   Calls to transfer your Salesforce records as part of a flow run.    
    */
  var usePrivateLinkForMetadataAndAuthorization: js.UndefOr[Boolean] = js.undefined
}
object SalesforceConnectorProfileProperties {
  
  inline def apply(): SalesforceConnectorProfileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SalesforceConnectorProfileProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SalesforceConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
    
    inline def setInstanceUrlUndefined: Self = StObject.set(x, "instanceUrl", js.undefined)
    
    inline def setIsSandboxEnvironment(value: Boolean): Self = StObject.set(x, "isSandboxEnvironment", value.asInstanceOf[js.Any])
    
    inline def setIsSandboxEnvironmentUndefined: Self = StObject.set(x, "isSandboxEnvironment", js.undefined)
    
    inline def setUsePrivateLinkForMetadataAndAuthorization(value: Boolean): Self = StObject.set(x, "usePrivateLinkForMetadataAndAuthorization", value.asInstanceOf[js.Any])
    
    inline def setUsePrivateLinkForMetadataAndAuthorizationUndefined: Self = StObject.set(x, "usePrivateLinkForMetadataAndAuthorization", js.undefined)
  }
}
