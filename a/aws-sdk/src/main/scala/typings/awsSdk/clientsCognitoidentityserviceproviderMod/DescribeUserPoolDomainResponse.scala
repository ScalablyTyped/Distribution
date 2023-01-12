package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserPoolDomainResponse extends StObject {
  
  /**
    * A domain description object containing information about the domain.
    */
  var DomainDescription: js.UndefOr[DomainDescriptionType] = js.undefined
}
object DescribeUserPoolDomainResponse {
  
  inline def apply(): DescribeUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserPoolDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUserPoolDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainDescription(value: DomainDescriptionType): Self = StObject.set(x, "DomainDescription", value.asInstanceOf[js.Any])
    
    inline def setDomainDescriptionUndefined: Self = StObject.set(x, "DomainDescription", js.undefined)
  }
}
