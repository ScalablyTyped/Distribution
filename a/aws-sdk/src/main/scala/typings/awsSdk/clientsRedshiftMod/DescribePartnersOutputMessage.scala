package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePartnersOutputMessage extends StObject {
  
  /**
    * A list of partner integrations.
    */
  var PartnerIntegrationInfoList: js.UndefOr[typings.awsSdk.clientsRedshiftMod.PartnerIntegrationInfoList] = js.undefined
}
object DescribePartnersOutputMessage {
  
  inline def apply(): DescribePartnersOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePartnersOutputMessage]
  }
  
  extension [Self <: DescribePartnersOutputMessage](x: Self) {
    
    inline def setPartnerIntegrationInfoList(value: PartnerIntegrationInfoList): Self = StObject.set(x, "PartnerIntegrationInfoList", value.asInstanceOf[js.Any])
    
    inline def setPartnerIntegrationInfoListUndefined: Self = StObject.set(x, "PartnerIntegrationInfoList", js.undefined)
    
    inline def setPartnerIntegrationInfoListVarargs(value: PartnerIntegrationInfo*): Self = StObject.set(x, "PartnerIntegrationInfoList", js.Array(value*))
  }
}
