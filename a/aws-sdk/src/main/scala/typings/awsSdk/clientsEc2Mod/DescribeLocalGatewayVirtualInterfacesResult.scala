package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocalGatewayVirtualInterfacesResult extends StObject {
  
  /**
    * Information about the virtual interfaces.
    */
  var LocalGatewayVirtualInterfaces: js.UndefOr[LocalGatewayVirtualInterfaceSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeLocalGatewayVirtualInterfacesResult {
  
  inline def apply(): DescribeLocalGatewayVirtualInterfacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfacesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLocalGatewayVirtualInterfacesResult] (val x: Self) extends AnyVal {
    
    inline def setLocalGatewayVirtualInterfaces(value: LocalGatewayVirtualInterfaceSet): Self = StObject.set(x, "LocalGatewayVirtualInterfaces", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayVirtualInterfacesUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaces", js.undefined)
    
    inline def setLocalGatewayVirtualInterfacesVarargs(value: LocalGatewayVirtualInterface*): Self = StObject.set(x, "LocalGatewayVirtualInterfaces", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
