package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2ActionBlockDetails extends StObject {
  
  /**
    *  Defines a custom response for the web request. For information, see Customizing web requests and responses in WAF in the WAF Developer Guide.. 
    */
  var CustomResponse: js.UndefOr[AwsWafv2CustomResponseDetails] = js.undefined
}
object AwsWafv2ActionBlockDetails {
  
  inline def apply(): AwsWafv2ActionBlockDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2ActionBlockDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2ActionBlockDetails] (val x: Self) extends AnyVal {
    
    inline def setCustomResponse(value: AwsWafv2CustomResponseDetails): Self = StObject.set(x, "CustomResponse", value.asInstanceOf[js.Any])
    
    inline def setCustomResponseUndefined: Self = StObject.set(x, "CustomResponse", js.undefined)
  }
}
