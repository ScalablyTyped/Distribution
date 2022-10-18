package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainResult extends StObject {
  
  /**
    *  Contains information about the created domain after processing the request. 
    */
  var domain: js.UndefOr[DomainDescription] = js.undefined
}
object CreateDomainResult {
  
  inline def apply(): CreateDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainResult]
  }
  
  extension [Self <: CreateDomainResult](x: Self) {
    
    inline def setDomain(value: DomainDescription): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
