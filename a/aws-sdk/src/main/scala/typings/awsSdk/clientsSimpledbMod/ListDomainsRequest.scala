package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsRequest extends StObject {
  
  /**
    * The maximum number of domain names you want returned. The range is 1 to 100. The default setting is 100.
    */
  var MaxNumberOfDomains: js.UndefOr[Integer] = js.undefined
  
  /**
    * A string informing Amazon SimpleDB where to start the next list of domain names.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDomainsRequest {
  
  inline def apply(): ListDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDomainsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxNumberOfDomains(value: Integer): Self = StObject.set(x, "MaxNumberOfDomains", value.asInstanceOf[js.Any])
    
    inline def setMaxNumberOfDomainsUndefined: Self = StObject.set(x, "MaxNumberOfDomains", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
