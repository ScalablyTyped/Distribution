package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskExceptionConfigurationType extends StObject {
  
  /**
    * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation, a compact representation of an IP address and its routing prefix.
    */
  var BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType] = js.undefined
  
  /**
    * Risk detection isn't performed on the IP addresses in this range list. The IP range is in CIDR notation.
    */
  var SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType] = js.undefined
}
object RiskExceptionConfigurationType {
  
  inline def apply(): RiskExceptionConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskExceptionConfigurationType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskExceptionConfigurationType] (val x: Self) extends AnyVal {
    
    inline def setBlockedIPRangeList(value: BlockedIPRangeListType): Self = StObject.set(x, "BlockedIPRangeList", value.asInstanceOf[js.Any])
    
    inline def setBlockedIPRangeListUndefined: Self = StObject.set(x, "BlockedIPRangeList", js.undefined)
    
    inline def setBlockedIPRangeListVarargs(value: StringType*): Self = StObject.set(x, "BlockedIPRangeList", js.Array(value*))
    
    inline def setSkippedIPRangeList(value: SkippedIPRangeListType): Self = StObject.set(x, "SkippedIPRangeList", value.asInstanceOf[js.Any])
    
    inline def setSkippedIPRangeListUndefined: Self = StObject.set(x, "SkippedIPRangeList", js.undefined)
    
    inline def setSkippedIPRangeListVarargs(value: StringType*): Self = StObject.set(x, "SkippedIPRangeList", js.Array(value*))
  }
}
