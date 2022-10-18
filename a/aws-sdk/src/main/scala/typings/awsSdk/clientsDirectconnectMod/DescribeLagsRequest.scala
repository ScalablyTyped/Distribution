package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLagsRequest extends StObject {
  
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.undefined
}
object DescribeLagsRequest {
  
  inline def apply(): DescribeLagsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLagsRequest]
  }
  
  extension [Self <: DescribeLagsRequest](x: Self) {
    
    inline def setLagId(value: LagId): Self = StObject.set(x, "lagId", value.asInstanceOf[js.Any])
    
    inline def setLagIdUndefined: Self = StObject.set(x, "lagId", js.undefined)
  }
}
