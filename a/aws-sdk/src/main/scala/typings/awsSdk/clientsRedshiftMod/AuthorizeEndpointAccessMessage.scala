package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeEndpointAccessMessage extends StObject {
  
  /**
    * The Amazon Web Services account ID to grant access to.
    */
  var Account: String
  
  /**
    * The cluster identifier of the cluster to grant access to.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The virtual private cloud (VPC) identifiers to grant access to.
    */
  var VpcIds: js.UndefOr[VpcIdentifierList] = js.undefined
}
object AuthorizeEndpointAccessMessage {
  
  inline def apply(Account: String): AuthorizeEndpointAccessMessage = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeEndpointAccessMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeEndpointAccessMessage] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setVpcIds(value: VpcIdentifierList): Self = StObject.set(x, "VpcIds", value.asInstanceOf[js.Any])
    
    inline def setVpcIdsUndefined: Self = StObject.set(x, "VpcIds", js.undefined)
    
    inline def setVpcIdsVarargs(value: String*): Self = StObject.set(x, "VpcIds", js.Array(value*))
  }
}
