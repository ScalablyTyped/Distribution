package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcEndpointAccessRequest extends StObject {
  
  /**
    * The name of the OpenSearch Service domain to retrieve access information for.
    */
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEsMod.NextToken] = js.undefined
}
object ListVpcEndpointAccessRequest {
  
  inline def apply(DomainName: DomainName): ListVpcEndpointAccessRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVpcEndpointAccessRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVpcEndpointAccessRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
