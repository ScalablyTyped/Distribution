package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainsRequest extends StObject {
  
  /**
    * The names of the domains you want to include in the response.
    */
  var DomainNames: js.UndefOr[DomainNameList] = js.undefined
}
object DescribeDomainsRequest {
  
  inline def apply(): DescribeDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainsRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainNames(value: DomainNameList): Self = StObject.set(x, "DomainNames", value.asInstanceOf[js.Any])
    
    inline def setDomainNamesUndefined: Self = StObject.set(x, "DomainNames", js.undefined)
    
    inline def setDomainNamesVarargs(value: DomainName*): Self = StObject.set(x, "DomainNames", js.Array(value*))
  }
}
