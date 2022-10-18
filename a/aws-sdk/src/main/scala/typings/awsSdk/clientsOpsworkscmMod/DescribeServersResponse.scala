package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServersResponse extends StObject {
  
  /**
    * This is not currently implemented for DescribeServers requests. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the response to a DescribeServers request.  For Chef Automate servers: If DescribeServersResponse$Servers$EngineAttributes includes CHEF_MAJOR_UPGRADE_AVAILABLE, you can upgrade the Chef Automate server to Chef Automate 2. To be eligible for upgrade, a server running Chef Automate 1 must have had at least one successful maintenance run after November 1, 2019.  For Puppet servers: DescribeServersResponse$Servers$EngineAttributes contains the following two responses:    PUPPET_API_CA_CERT, the PEM-encoded CA certificate that is used by the Puppet API over TCP port number 8140. The CA certificate is also used to sign node certificates.    PUPPET_API_CRL, a certificate revocation list. The certificate revocation list is for internal maintenance purposes only. For more information about the Puppet certificate revocation list, see Man Page: puppet certificate_revocation_list in the Puppet documentation.  
    */
  var Servers: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.Servers] = js.undefined
}
object DescribeServersResponse {
  
  inline def apply(): DescribeServersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServersResponse]
  }
  
  extension [Self <: DescribeServersResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServers(value: Servers): Self = StObject.set(x, "Servers", value.asInstanceOf[js.Any])
    
    inline def setServersUndefined: Self = StObject.set(x, "Servers", js.undefined)
    
    inline def setServersVarargs(value: Server*): Self = StObject.set(x, "Servers", js.Array(value*))
  }
}
