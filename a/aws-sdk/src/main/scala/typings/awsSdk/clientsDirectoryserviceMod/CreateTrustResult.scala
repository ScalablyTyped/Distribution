package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrustResult extends StObject {
  
  /**
    * A unique identifier for the trust relationship that was created.
    */
  var TrustId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.TrustId] = js.undefined
}
object CreateTrustResult {
  
  inline def apply(): CreateTrustResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrustResult]
  }
  
  extension [Self <: CreateTrustResult](x: Self) {
    
    inline def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
    
    inline def setTrustIdUndefined: Self = StObject.set(x, "TrustId", js.undefined)
  }
}
