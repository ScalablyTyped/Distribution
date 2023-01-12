package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceStatefulRulesHeaderDetails extends StObject {
  
  /**
    * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify ANY.
    */
  var Destination: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The destination port to inspect for. You can specify an individual port, such as 1994. You also can specify a port range, such as 1990:1994. To match with any port, specify ANY.
    */
  var DestinationPort: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The direction of traffic flow to inspect. If set to ANY, the inspection matches bidirectional traffic, both from the source to the destination and from the destination to the source. If set to FORWARD, the inspection only matches traffic going from the source to the destination.
    */
  var Direction: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The protocol to inspect for. To inspector for all protocols, use IP.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The source IP address or address range to inspect for, in CIDR notation. To match with any address, specify ANY.
    */
  var Source: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The source port to inspect for. You can specify an individual port, such as 1994. You also can specify a port range, such as 1990:1994. To match with any port, specify ANY.
    */
  var SourcePort: js.UndefOr[NonEmptyString] = js.undefined
}
object RuleGroupSourceStatefulRulesHeaderDetails {
  
  inline def apply(): RuleGroupSourceStatefulRulesHeaderDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceStatefulRulesHeaderDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleGroupSourceStatefulRulesHeaderDetails] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: NonEmptyString): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationPort(value: NonEmptyString): Self = StObject.set(x, "DestinationPort", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortUndefined: Self = StObject.set(x, "DestinationPort", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setDirection(value: NonEmptyString): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "Direction", js.undefined)
    
    inline def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setSource(value: NonEmptyString): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourcePort(value: NonEmptyString): Self = StObject.set(x, "SourcePort", value.asInstanceOf[js.Any])
    
    inline def setSourcePortUndefined: Self = StObject.set(x, "SourcePort", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
