package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcPeeringAuthorizationsOutput extends StObject {
  
  /**
    * A collection of objects that describe all valid VPC peering operations for the current Amazon Web Services account.
    */
  var VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList] = js.undefined
}
object DescribeVpcPeeringAuthorizationsOutput {
  
  inline def apply(): DescribeVpcPeeringAuthorizationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringAuthorizationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVpcPeeringAuthorizationsOutput] (val x: Self) extends AnyVal {
    
    inline def setVpcPeeringAuthorizations(value: VpcPeeringAuthorizationList): Self = StObject.set(x, "VpcPeeringAuthorizations", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringAuthorizationsUndefined: Self = StObject.set(x, "VpcPeeringAuthorizations", js.undefined)
    
    inline def setVpcPeeringAuthorizationsVarargs(value: VpcPeeringAuthorization*): Self = StObject.set(x, "VpcPeeringAuthorizations", js.Array(value*))
  }
}
