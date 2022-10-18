package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EulaAcceptance extends StObject {
  
  /**
    * The Unix epoch timestamp in seconds for when the EULA was accepted.
    */
  var acceptedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the person who accepted the EULA.
    */
  var acceptedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the acceptee.
    */
  var accepteeId: js.UndefOr[String] = js.undefined
  
  /**
    * The EULA acceptance ID.
    */
  var eulaAcceptanceId: js.UndefOr[EulaAcceptanceId] = js.undefined
  
  /**
    * The EULA ID.
    */
  var eulaId: js.UndefOr[EulaId] = js.undefined
}
object EulaAcceptance {
  
  inline def apply(): EulaAcceptance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EulaAcceptance]
  }
  
  extension [Self <: EulaAcceptance](x: Self) {
    
    inline def setAcceptedAt(value: js.Date): Self = StObject.set(x, "acceptedAt", value.asInstanceOf[js.Any])
    
    inline def setAcceptedAtUndefined: Self = StObject.set(x, "acceptedAt", js.undefined)
    
    inline def setAcceptedBy(value: String): Self = StObject.set(x, "acceptedBy", value.asInstanceOf[js.Any])
    
    inline def setAcceptedByUndefined: Self = StObject.set(x, "acceptedBy", js.undefined)
    
    inline def setAccepteeId(value: String): Self = StObject.set(x, "accepteeId", value.asInstanceOf[js.Any])
    
    inline def setAccepteeIdUndefined: Self = StObject.set(x, "accepteeId", js.undefined)
    
    inline def setEulaAcceptanceId(value: EulaAcceptanceId): Self = StObject.set(x, "eulaAcceptanceId", value.asInstanceOf[js.Any])
    
    inline def setEulaAcceptanceIdUndefined: Self = StObject.set(x, "eulaAcceptanceId", js.undefined)
    
    inline def setEulaId(value: EulaId): Self = StObject.set(x, "eulaId", value.asInstanceOf[js.Any])
    
    inline def setEulaIdUndefined: Self = StObject.set(x, "eulaId", js.undefined)
  }
}
