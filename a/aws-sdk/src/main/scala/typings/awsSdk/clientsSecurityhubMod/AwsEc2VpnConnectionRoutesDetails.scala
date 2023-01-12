package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VpnConnectionRoutesDetails extends StObject {
  
  /**
    * The CIDR block associated with the local subnet of the customer data center.
    */
  var DestinationCidrBlock: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current state of the static route.
    */
  var State: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VpnConnectionRoutesDetails {
  
  inline def apply(): AwsEc2VpnConnectionRoutesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpnConnectionRoutesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2VpnConnectionRoutesDetails] (val x: Self) extends AnyVal {
    
    inline def setDestinationCidrBlock(value: NonEmptyString): Self = StObject.set(x, "DestinationCidrBlock", value.asInstanceOf[js.Any])
    
    inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "DestinationCidrBlock", js.undefined)
    
    inline def setState(value: NonEmptyString): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
