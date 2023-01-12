package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcPeeringConnectionsOutput extends StObject {
  
  /**
    * A collection of VPC peering connection records that match the request.
    */
  var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.undefined
}
object DescribeVpcPeeringConnectionsOutput {
  
  inline def apply(): DescribeVpcPeeringConnectionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVpcPeeringConnectionsOutput] (val x: Self) extends AnyVal {
    
    inline def setVpcPeeringConnections(value: VpcPeeringConnectionList): Self = StObject.set(x, "VpcPeeringConnections", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionsUndefined: Self = StObject.set(x, "VpcPeeringConnections", js.undefined)
    
    inline def setVpcPeeringConnectionsVarargs(value: VpcPeeringConnection*): Self = StObject.set(x, "VpcPeeringConnections", js.Array(value*))
  }
}
