package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about your get domain request.
    */
  var domain: js.UndefOr[Domain] = js.undefined
}
object GetDomainResult {
  
  inline def apply(): GetDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainResult]
  }
  
  extension [Self <: GetDomainResult](x: Self) {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
