package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDetails extends StObject {
  
  /**
    * The domain information for the Amazon Web Services API call.
    */
  var Domain: js.UndefOr[String] = js.undefined
}
object DomainDetails {
  
  inline def apply(): DomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDetails]
  }
  
  extension [Self <: DomainDetails](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
  }
}
