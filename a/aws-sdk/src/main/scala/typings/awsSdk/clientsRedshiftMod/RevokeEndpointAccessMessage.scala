package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeEndpointAccessMessage extends StObject {
  
  /**
    * The Amazon Web Services account ID whose access is to be revoked.
    */
  var Account: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster to revoke access from.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to force the revoke action. If true, the Redshift-managed VPC endpoints associated with the endpoint authorization are also deleted.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The virtual private cloud (VPC) identifiers for which access is to be revoked.
    */
  var VpcIds: js.UndefOr[VpcIdentifierList] = js.undefined
}
object RevokeEndpointAccessMessage {
  
  inline def apply(): RevokeEndpointAccessMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeEndpointAccessMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevokeEndpointAccessMessage] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    inline def setVpcIds(value: VpcIdentifierList): Self = StObject.set(x, "VpcIds", value.asInstanceOf[js.Any])
    
    inline def setVpcIdsUndefined: Self = StObject.set(x, "VpcIds", js.undefined)
    
    inline def setVpcIdsVarargs(value: String*): Self = StObject.set(x, "VpcIds", js.Array(value*))
  }
}
