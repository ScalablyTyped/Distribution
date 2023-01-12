package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointAuthorization extends StObject {
  
  /**
    * Indicates whether all VPCs in the grantee account are allowed access to the cluster.
    */
  var AllowedAllVPCs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The VPCs allowed access to the cluster.
    */
  var AllowedVPCs: js.UndefOr[VpcIdentifierList] = js.undefined
  
  /**
    * The time (UTC) when the authorization was created.
    */
  var AuthorizeTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The cluster identifier.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the cluster.
    */
  var ClusterStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The number of Redshift-managed VPC endpoints created for the authorization.
    */
  var EndpointCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the grantee of the cluster.
    */
  var Grantee: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the cluster owner.
    */
  var Grantor: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the authorization action.
    */
  var Status: js.UndefOr[AuthorizationStatus] = js.undefined
}
object EndpointAuthorization {
  
  inline def apply(): EndpointAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointAuthorization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointAuthorization] (val x: Self) extends AnyVal {
    
    inline def setAllowedAllVPCs(value: Boolean): Self = StObject.set(x, "AllowedAllVPCs", value.asInstanceOf[js.Any])
    
    inline def setAllowedAllVPCsUndefined: Self = StObject.set(x, "AllowedAllVPCs", js.undefined)
    
    inline def setAllowedVPCs(value: VpcIdentifierList): Self = StObject.set(x, "AllowedVPCs", value.asInstanceOf[js.Any])
    
    inline def setAllowedVPCsUndefined: Self = StObject.set(x, "AllowedVPCs", js.undefined)
    
    inline def setAllowedVPCsVarargs(value: String*): Self = StObject.set(x, "AllowedVPCs", js.Array(value*))
    
    inline def setAuthorizeTime(value: js.Date): Self = StObject.set(x, "AuthorizeTime", value.asInstanceOf[js.Any])
    
    inline def setAuthorizeTimeUndefined: Self = StObject.set(x, "AuthorizeTime", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setClusterStatus(value: String): Self = StObject.set(x, "ClusterStatus", value.asInstanceOf[js.Any])
    
    inline def setClusterStatusUndefined: Self = StObject.set(x, "ClusterStatus", js.undefined)
    
    inline def setEndpointCount(value: Integer): Self = StObject.set(x, "EndpointCount", value.asInstanceOf[js.Any])
    
    inline def setEndpointCountUndefined: Self = StObject.set(x, "EndpointCount", js.undefined)
    
    inline def setGrantee(value: String): Self = StObject.set(x, "Grantee", value.asInstanceOf[js.Any])
    
    inline def setGranteeUndefined: Self = StObject.set(x, "Grantee", js.undefined)
    
    inline def setGrantor(value: String): Self = StObject.set(x, "Grantor", value.asInstanceOf[js.Any])
    
    inline def setGrantorUndefined: Self = StObject.set(x, "Grantor", js.undefined)
    
    inline def setStatus(value: AuthorizationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
