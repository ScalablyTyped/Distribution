package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOfferingResponse extends StObject {
  
  var Offering: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Offering] = js.undefined
}
object DescribeOfferingResponse {
  
  inline def apply(): DescribeOfferingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOfferingResponse]
  }
  
  extension [Self <: DescribeOfferingResponse](x: Self) {
    
    inline def setOffering(value: Offering): Self = StObject.set(x, "Offering", value.asInstanceOf[js.Any])
    
    inline def setOfferingUndefined: Self = StObject.set(x, "Offering", js.undefined)
  }
}
