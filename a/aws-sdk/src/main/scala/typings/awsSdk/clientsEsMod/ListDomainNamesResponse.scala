package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainNamesResponse extends StObject {
  
  /**
    * List of domain names and respective engine types.
    */
  var DomainNames: js.UndefOr[DomainInfoList] = js.undefined
}
object ListDomainNamesResponse {
  
  inline def apply(): ListDomainNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainNamesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDomainNamesResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainNames(value: DomainInfoList): Self = StObject.set(x, "DomainNames", value.asInstanceOf[js.Any])
    
    inline def setDomainNamesUndefined: Self = StObject.set(x, "DomainNames", js.undefined)
    
    inline def setDomainNamesVarargs(value: DomainInfo*): Self = StObject.set(x, "DomainNames", js.Array(value*))
  }
}
